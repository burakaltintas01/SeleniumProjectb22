package com.cybertek.tests.day9_properties_browser_utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
We will create a re-usable method that will be reading from configuration.reader file
 */


public class ConfigurationReader {

    private static Properties properties = new Properties();

    static {
        try {
            FileInputStream file = new FileInputStream("configuration.properties");

            properties.load(file);


            file.close();

        } catch (IOException e) {


            System.out.println("File not found in Configuration Properties");
        }
    }

    public static String getProperty(String keyWord){
        return properties.getProperty(keyWord);
    }
}
