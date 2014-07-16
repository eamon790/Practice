package com.eamon790.practice;
import com.eamon790.practice.configuration.ConfigurationHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import com.eamon790.practice.proxy.*;
import com.eamon790.practice.reference.*;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Practice
{
    @Mod.Instance(Reference.MOD_ID)
    public static Practice practice;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent preInitEvent)
    {
        ConfigurationHandler.init(preInitEvent.getSuggestedConfigurationFile());
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent initEvent)
    {

    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent postInitEvent)
    {

    }
}
