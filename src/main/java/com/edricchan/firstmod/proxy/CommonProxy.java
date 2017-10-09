package com.edricchan.firstmod.proxy;

import com.edricchan.firstmod.blocks.SimpleBlock;
import com.edricchan.firstmod.handlers.ModBlocks;
import com.edricchan.firstmod.items.*;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
    }

    public void init(FMLInitializationEvent e) {
    }

    public void postInit(FMLPostInitializationEvent e) {
    }
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().register(new SimpleBlock());
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().register(new ItemBlock(ModBlocks.simpleBlock).setRegistryName(ModBlocks.simpleBlock.getRegistryName()));
		event.getRegistry().register(new FoodCheese());
		event.getRegistry().register(new FoodCheeseCookie());
		event.getRegistry().register(new FoodCracker());
		event.getRegistry().register(new RubyItem());
	}
}
