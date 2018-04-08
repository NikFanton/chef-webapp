package ua.training.model.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationUtil {
    private static Properties properties = new Properties();

    public static String getProperty(String propertyName) {
        System.out.println(System.getProperty("user.dir"));
        try {
            properties.load(new FileInputStream("config\\config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(propertyName);
    }
}
