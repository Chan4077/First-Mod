package com.edricchan.firstmod.init;

import com.edricchan.firstmod.blocks.BlockChair;
import com.edricchan.firstmod.blocks.BlockCheese;
import com.edricchan.firstmod.blocks.BlockGreenstone;
import com.edricchan.firstmod.blocks.BlockRuby;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	// Blocks
	public static Block cheese_block;
	public static Block ruby_block;
	public static Block chair;
	public static Block greenstone_block;
	
	public static void init() {
		cheese_block = new BlockCheese();
		ruby_block = new BlockRuby();
		chair = new BlockChair();
		greenstone_block = new BlockGreenstone();
	}
	
	public static void register() {
		registerBlock(cheese_block);
		registerBlock(ruby_block);
		registerBlock(chair);
		registerBlock(greenstone_block);
	}
	
	private static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders() {
		registerRender(cheese_block);
		registerRender(ruby_block);
		registerRender(chair);
		registerRender(greenstone_block);
	}
	
	private static void registerRender(Block block) {

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
