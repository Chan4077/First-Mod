package com.edricchan.firstmod.init;

 import com.edricchan.firstmod.letter_blocks.BlockLetterOrange;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModLetterColourBlocks {
	// Letter colours
	 public static Block BLOCK_LETTER_ORANGE;
	
	public static void init() {
		// Default colours
		BLOCK_LETTER_ORANGE = new BlockLetterOrange();
	}
	
	public static void register() {
		// Default colours
		registerBlock(BLOCK_LETTER_ORANGE);
	}
	
	private static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders() {
		// Default colours
	 	registerRender(BLOCK_LETTER_ORANGE);
	}
	
	private static void registerRender(Block block) {

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
