package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    //1. We need to use to use methonds coming from class like load(), getProperty();
    private static Properties properties = new Properties();

    // We want to open the properties file and load to properties object only once before reading
    //having static block because static runs first
    static {
        try {
            //2. Create the object of FileInputStream
            //we need this object to open file as a stream in Java memory

            FileInputStream file = new FileInputStream("config.properties");


            //3 load properties object using file input stream
            properties.load(file);
            file.close();
        } catch (IOException e) {

        }
    }

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }

}
