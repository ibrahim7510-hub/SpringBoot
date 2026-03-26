package com.jdbc.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesConfig {
    private static PropertiesConfig instance= new PropertiesConfig();
    private static final Properties prop = new Properties();

    private PropertiesConfig(){
        String fileToLoad="//resources//database.properties";
        InputStream inputStream =getClass().
                                getClassLoader().
                                getResourceAsStream(fileToLoad);
        try{
            prop.load(inputStream);
        }catch(RuntimeException | IOException e){
            System.out.println("Error loading properties file");
        }
    }
    public static PropertiesConfig getInstance(){
        return instance;
    }
    public static String getProp(String key){
        return prop.getProperty(key);
    }
}
