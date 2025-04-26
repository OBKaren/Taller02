package utils;

import models.User;
import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;
import java.io.File;

public class ConfigLoader {
    private static Configuration config;

    static {
        try {
            Configurations configs = new Configurations();
            config = configs.properties(new File("src/main/resources/config.properties"));
        } catch (ConfigurationException e) {
            throw new RuntimeException("Error loading configuration file", e);
        }
    }

    public static String getBaseUrl() { return config.getString("base.url"); }
    public static String getBrowser() { return config.getString("browser", "chrome"); }
    public static int getTimeout() { return config.getInt("timeout.seconds", 10); }
    public static boolean isHeadless() { return config.getBoolean("headless", false); }

    // Método para credenciales de prueba
    public static User getTestUser() {
        return new User(
                config.getString("test.user.email"),
                config.getString("test.user.password"),
                "Test User"
        );
    }
}