package com.edricchan.firstmod;

import com.edricchan.firstmod.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;

@Mod(modid = Reference.MODID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, acceptedMinecraftVersions = Reference.MOD_ACCEPTED_VERSIONS, useMetadata = true)
public class FirstMod {
	// Create a new instance
	@Mod.Instance
	public static FirstMod instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	public static SimpleNetworkWrapper network;

	// Initialize
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		// TODO: Remove print line
		System.out.println("Pre Init");
		proxy.preInit(e);
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent e) {
		// TODO: Remove print line
		System.out.println("Init");
		proxy.init(e);
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		// TODO: Remove print line
		System.out.println("Post Init");
		proxy.postInit(e);
	}
}
