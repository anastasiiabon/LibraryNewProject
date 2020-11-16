package com.cybertek.library.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

   // I created properties object
    private static Properties properties = new Properties();


    static {
        //I get the path and store in String, or directly pass into fileInputStream obj
        String path = "configuration.properties";

        try {
            //I  need to open the file
            FileInputStream file = new FileInputStream(path);
            //I need to load the file to properties object
            properties.load(file);

            // close file
            file.close();

        } catch (IOException e) {
            System.out.println("Properties file not found.");
        }
    }
    public static String getProperty(String keyWord){
        return properties.getProperty(keyWord);
    }




}

