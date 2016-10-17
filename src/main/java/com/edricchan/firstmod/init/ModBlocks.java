package com.edricchan.firstmod.init;

import com.edricchan.firstmod.blocks.BlockChair;
import com.edricchan.firstmod.blocks.BlockCheese;
// import com.edricchan.firstmod.blocks.BlockGreenstone;
import com.edricchan.firstmod.blocks.BlockRuby;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	// Blocks
	public static Block CHEESE_BLOCK;
	public static Block RUBY_BLOCK;
	public static Block CHAIR;
	// public static Block GREENSTONE_BLOCK;
	
	public static void init() {
		CHEESE_BLOCK = new BlockCheese();
		RUBY_BLOCK = new BlockRuby();
		CHAIR = new BlockChair();
		// GREENSTONE_BLOCK = new BlockGreenstone();
	}
	
	public static void register() {
		registerBlock(CHEESE_BLOCK);
		registerBlock(RUBY_BLOCK);
		registerBlock(CHAIR);
		// registerBlock(GREENSTONE_BLOCK);
	}
	
	private static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders() {
		registerRender(CHEESE_BLOCK);
		registerRender(RUBY_BLOCK);
		registerRender(CHAIR);
		// registerRender(GREENSTONE_BLOCK);
	}
	
	private static void registerRender(Block block) {

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
