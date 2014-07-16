package com.eamon790.practice;
import com.eamon790.practice.handler.ConfigurationHandler;
import com.eamon790.practice.init.ModItems;
import com.eamon790.practice.util.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import com.eamon790.practice.proxy.*;
import com.eamon790.practice.reference.*;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
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
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItems.init();
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent initEvent)
    {
        LogHelper.info("Init complete");
    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent postInitEvent)
    {
        LogHelper.info("PostInit complete");
        if(ConfigurationHandler.isModInTestingPhase) LogHelper.info("Mod is in testing phase");
    }
}
