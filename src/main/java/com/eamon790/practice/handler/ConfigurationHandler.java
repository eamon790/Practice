package com.eamon790.practice.handler;

import com.eamon790.practice.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import java.io.File;

public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean testValue = false;
    public static boolean isModInTestingPhase;
    public static void init(File configFile)
    {
        if(configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.modID.equalsIgnoreCase(Reference.MOD_ID))
              loadConfiguration();
    }
    private static void loadConfiguration()
    {
        isModInTestingPhase = configuration.getBoolean("Testing",Configuration.CATEGORY_GENERAL, false, "True if testing mod");
        testValue =  configuration.getBoolean("testValue",Configuration.CATEGORY_GENERAL, false, "configTest");
        if(configuration.hasChanged())
            configuration.save();
    }
}

