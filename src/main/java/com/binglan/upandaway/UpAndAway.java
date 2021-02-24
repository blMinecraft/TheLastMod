package com.binglan.upandaway;


import com.binglan.upandaway.proxy.CommonProxy;
import com.binglan.upandaway.tabs.FuckTab;
import com.binglan.upandaway.util.UpAndAwayInfo;
import com.binglan.upandaway.world.ModWorldGen;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = UpAndAwayInfo.MOD_ID, name = UpAndAwayInfo.NAME, version = UpAndAwayInfo.VERSION)

public class UpAndAway {
	
	@Instance
	public static UpAndAway instance;
	
	@SidedProxy(clientSide = UpAndAwayInfo.CLIENT_PROXY_CLASS, serverSide = UpAndAwayInfo.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
		
	}

	@EventHandler
	public static void Init(FMLInitializationEvent event) {
		
	}

	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {
		
	}
	
	public static CreativeTabs UPANDAWAY_TAB = new FuckTab();




}
