package com.rusefi.core;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.concurrent.atomic.AtomicReference;

public interface rusEFIVersion {
    /**
     * @see com.rusefi.autoupdate.Autoupdate#VERSION
     */
    int CONSOLE_VERSION = 20240808;
    AtomicReference<String> firmwareVersion = new AtomicReference<>("N/A");

    static long classBuildTimeMillis() {
        Class<?> clazz = rusEFIVersion.class;
        URL resource = clazz.getResource(clazz.getSimpleName() + ".class");
        if (resource == null) {
            throw new IllegalStateException("Failed to find class file for class: " +
                    clazz.getName());
        }

        if (resource.getProtocol().equals("file")) {
            try {
                return new File(resource.toURI()).lastModified();
            } catch (URISyntaxException e) {
                return 0;
            }
        } else if (resource.getProtocol().equals("jar")) {
            String path = resource.getPath();
            return new File(path.substring(5, path.indexOf("!"))).lastModified();
        } else {
            throw new IllegalArgumentException("Unhandled url protocol: " +
                    resource.getProtocol() + " for class: " +
                    clazz.getName() + " resource: " + resource);
        }
    }
}
