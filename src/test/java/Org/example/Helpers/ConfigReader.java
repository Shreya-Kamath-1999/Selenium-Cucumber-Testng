package Org.example.Helpers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static String URL;
    public static String USERNAME;
    public static String PASSWORD;
    static{
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("Config.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Properties prop = new Properties();
        try {
            prop.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        USERNAME = prop.getProperty("username");
        PASSWORD = prop.getProperty("password");
        URL = prop.getProperty("url");
    }
}
