package com.edricchan.firstmod.init;

import com.edricchan.firstmod.letter_blocks.LetterAOrange;
import com.edricchan.firstmod.letter_blocks.LetterBOrange;
import com.edricchan.firstmod.letter_blocks.LetterCOrange;
import com.edricchan.firstmod.letter_blocks.LetterDOrange;
import com.edricchan.firstmod.letter_blocks.LetterEOrange;
import com.edricchan.firstmod.letter_blocks.LetterFOrange;
import com.edricchan.firstmod.letter_blocks.LetterGOrange;
import com.edricchan.firstmod.letter_blocks.LetterHOrange;
import com.edricchan.firstmod.letter_blocks.LetterTOrange;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModLetterBlocks {
	// Letters
	public static Block letter_a_orange;
	public static Block letter_b_orange;
	public static Block letter_c_orange;
	public static Block letter_d_orange;
	public static Block letter_e_orange;
	public static Block letter_f_orange;
	public static Block letter_g_orange;
	public static Block letter_h_orange;
	public static Block letter_t_orange;
	
	// Default colours
	public static Block letter_orange;
	
	public static void init() {
		// Letters
		letter_a_orange = new LetterAOrange();
		letter_b_orange = new LetterBOrange();
		letter_c_orange = new LetterCOrange();
		letter_d_orange = new LetterDOrange();
		letter_e_orange = new LetterEOrange();
		letter_f_orange = new LetterFOrange();
		letter_g_orange = new LetterGOrange();
		letter_h_orange = new LetterHOrange();
		letter_t_orange = new LetterTOrange();
	}
	
	public static void register() {
		registerBlock(letter_a_orange);
		registerBlock(letter_b_orange);
		registerBlock(letter_c_orange);
		registerBlock(letter_d_orange);
		registerBlock(letter_e_orange);
		registerBlock(letter_f_orange);
		registerBlock(letter_g_orange);
		registerBlock(letter_h_orange);
		registerBlock(letter_t_orange);
	}
	
	private static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders() {
		registerRender(letter_a_orange);
		registerRender(letter_b_orange);
		registerRender(letter_c_orange);
		registerRender(letter_d_orange);
		registerRender(letter_e_orange);
		registerRender(letter_f_orange);
		registerRender(letter_g_orange);
		registerRender(letter_h_orange);
		registerRender(letter_t_orange);
		
		// Default colours
		registerBlock(letter_orange);
	}
	
	private static void registerRender(Block block) {

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
