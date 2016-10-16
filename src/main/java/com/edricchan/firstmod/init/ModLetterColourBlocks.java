package com.edricchan.firstmod.init;

import com.edricchan.firstmod.letter_blocks.LetterAOrange;
import com.edricchan.firstmod.letter_blocks.LetterBOrange;
import com.edricchan.firstmod.letter_blocks.LetterCOrange;
import com.edricchan.firstmod.letter_blocks.LetterDOrange;
import com.edricchan.firstmod.letter_blocks.LetterEOrange;
import com.edricchan.firstmod.letter_blocks.LetterFOrange;
import com.edricchan.firstmod.letter_blocks.LetterGOrange;
import com.edricchan.firstmod.letter_blocks.LetterHOrange;
import com.edricchan.firstmod.letter_blocks.LetterOrange;
import com.edricchan.firstmod.letter_blocks.LetterTOrange;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModLetterColourBlocks {
	// Letter colours
	public static Block letter_orange;
	
	public static void init() {
		// Default colours
		letter_orange = new LetterOrange();
	}
	
	public static void register() {
		// Default colours
		registerBlock(letter_orange);
	}
	
	private static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders() {
		// Default colours
		registerBlock(letter_orange);
	}
	
	private static void registerRender(Block block) {

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
