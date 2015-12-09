package com.teamdman_9201.factoriograb;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = FactorioGrab.MODID, version = FactorioGrab.VERSION)
public class FactorioGrab
{
    public static final String MODID = "factoriograb";
    public static final String VERSION = "1.0";

    @EventHandler
    public void init(FMLInitializationEvent event) {
        //init handler shit
        MinecraftForge.EVENT_BUS.register(new MainEventHandler());
        FMLCommonHandler.instance().bus().register(new MainEventHandler());
//        GameRegistry.registerFuelHandler(new NOVAFuelHandler());
//        GameRegistry.registerWorldGenerator(new WorldGenerator(), 1);
//        NetworkRegistry.INSTANCE.registerGuiHandler(this, new NOVAGuiHandler());
//        MinecraftForge.EVENT_BUS.register(new NOVAEventHandler());
//        FMLCommonHandler.instance().bus().register(new NOVAEventHandler());

    }
    @EventHandler
    public void load(FMLInitializationEvent event) {
        //init shit
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        //init config
    }
}
