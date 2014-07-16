package com.eamon790.practice.configuration;

import net.minecraftforge.common.config.Configuration;
import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        Configuration configuration = new Configuration(configFile);

        try
        {
            //load configuration file
            configuration.load();

            //read in properties from configuration file

        }
        catch(Exception e)
        {
            //log exception
        }
        finally
        {
            //save configuration
            configuration.save();
        }
    }
}

