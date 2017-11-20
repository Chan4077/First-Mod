package com.edricchan.firstmod.proxy;

import com.edricchan.firstmod.Reference;
import com.edricchan.firstmod.blocks.LetterMakerContainerBlock;
import com.edricchan.firstmod.blocks.SimpleBlock;
import com.edricchan.firstmod.handlers.GuiHandler;
import com.edricchan.firstmod.handlers.ModBlocks;
import com.edricchan.firstmod.items.*;

import com.edricchan.firstmod.tileentity.LetterMakerContainerTileEntity;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static com.edricchan.firstmod.FirstMod.instance;

@Mod.EventBusSubscriber
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
    }

    public void init(FMLInitializationEvent e) {
	    NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
    }

    public void postInit(FMLPostInitializationEvent e) {
    }

	/**
	 * Registers all the mod blocks
	 * @param event The registry event
	 */
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().register(new SimpleBlock());
		event.getRegistry().register(new LetterMakerContainerBlock());
		GameRegistry.registerTileEntity(LetterMakerContainerTileEntity.class, Reference.MODID + "_lettermakercontainerblock");
	}

	/**
	 * Registers all the mod items
	 * @param event The registry event
	 */
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().register(new ItemBlock(ModBlocks.simpleBlock).setRegistryName(ModBlocks.simpleBlock.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.letterMakerContainerBlock).setRegistryName(ModBlocks.letterMakerContainerBlock.getRegistryName()));
		event.getRegistry().register(new FoodCheese());
		event.getRegistry().register(new FoodCheeseCookie());
		event.getRegistry().register(new FoodCracker());
		event.getRegistry().register(new RubyItem());
	}
}
