package com.rusefi.tools.online;

import com.opensr5.Logger;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class HttpUtil {
    // todo: migrate proxy http json API server to TLS
    public static final String RUSEFI_PROXY_JSON_PROTOCOL = "http://";
    public static final int PROXY_JSON_API_HTTP_PORT = 8001;
    /**
     * hostname of PROXY server, not primary rusEFI web server - those are two separate hosts at the moment
     */
    public static String RUSEFI_PROXY_HOSTNAME = System.getProperty("RUSEFI_PROXY_URL", "proxy.rusefi.com");

    public static String RUSEFI_ONLINE_JSON_API_PREFIX = "https://rusefi.com/online/api.php?method=";

    public static <T> T getJsonResponse(String responseString) throws ParseException {

        JSONParser parser = new JSONParser();
        return (T) parser.parse(responseString);
    }

    public static String getResponse(HttpResponse response) throws IOException {
        HttpEntity entity = response.getEntity();
        String responseString = EntityUtils.toString(entity, "UTF-8");
        Logger.CONSOLE.info("responseString=" + responseString);
        return responseString;
    }

    public static String executeGet(Logger logger, String url) throws IOException {
        HttpClient httpclient = new DefaultHttpClient();
        HttpParams httpParameters = httpclient.getParams();
//        HttpConnectionParams.setConnectionTimeout(httpParameters, CONNECTION_TIMEOUT);
//        HttpConnectionParams.setSoTimeout(httpParameters, WAIT_RESPONSE_TIMEOUT);
        // without this magic http response is pretty slow
        HttpConnectionParams.setTcpNoDelay(httpParameters, true);
        logger.info("GET " + url);
        HttpGet httpget = new HttpGet(url);

        // in case of emergency
        //  -Dorg.apache.commons.logging.Log=org.apache.commons.logging.impl.SimpleLog -Dorg.apache.commons.logging.simplelog.showdatetime=true -Dorg.apache.commons.logging.simplelog.log.org.apache.http=DEBUG -Dorg.apache.commons.logging.simplelog.log.org.apache.http.wire=ERROR
        try {
            HttpResponse httpResponse = httpclient.execute(httpget);
            return HttpUtil.getResponse(httpResponse);
        } finally {
            httpget.releaseConnection();
        }
    }

    public static JSONObject parse(String jsonString) {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject;
        try {
            jsonObject = (JSONObject) parser.parse(jsonString);
        } catch (ParseException e) {
            throw new IllegalStateException(e);
        }
        return jsonObject;
    }
}
