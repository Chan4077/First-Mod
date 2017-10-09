package com.edricchan.firstmod;
import com.edricchan.firstmod.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name= Reference.MODNAME, version = Reference.MODVERSION, acceptedMinecraftVersions = Reference.MODACCEPTEDVERSIONS, useMetadata = true)
public class FirstMod {
	// Create a new instance
	@Mod.Instance
	public static FirstMod instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	// Initialize
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e)
	{
		System.out.println("Pre Init");
		proxy.preInit(e);
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent e)
	{
		System.out.println("Init");
		proxy.init(e);
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e)
	{
		System.out.println("Post Init");
		proxy.postInit(e);
	}
}
