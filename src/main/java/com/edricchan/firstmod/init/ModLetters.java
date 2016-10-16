package com.edricchan.firstmod.init;

import com.edricchan.firstmod.letters.LetterA;
import com.edricchan.firstmod.letters.LetterB;
import com.edricchan.firstmod.letters.LetterC;
import com.edricchan.firstmod.letters.LetterD;
import com.edricchan.firstmod.letters.LetterE;
import com.edricchan.firstmod.letters.LetterF;
import com.edricchan.firstmod.letters.LetterG;
import com.edricchan.firstmod.letters.LetterT;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModLetters {
	// Letters
	public static Block letter_a;
	public static Block letter_b;
	public static Block letter_c;
	public static Block letter_d;
	public static Block letter_e;
	public static Block letter_f;
	public static Block letter_g;
	public static Block letter_t;
	
	public static void init() {
		// Letters
		letter_a = new LetterA();
		letter_b = new LetterB();
		letter_c = new LetterC();
		letter_d = new LetterD();
		letter_e = new LetterE();
		letter_f = new LetterF();
		letter_g = new LetterG();
		letter_t = new LetterT();
	}
	
	public static void register() {
		registerBlock(letter_a);
		registerBlock(letter_b);
		registerBlock(letter_c);
		registerBlock(letter_d);
		registerBlock(letter_e);
		registerBlock(letter_f);
		registerBlock(letter_g);
		registerBlock(letter_t);
	}
	
	private static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders() {
		registerRender(letter_a);
		registerRender(letter_b);
		registerRender(letter_c);
		registerRender(letter_d);
		registerRender(letter_e);
		registerRender(letter_f);
		registerRender(letter_g);
		registerRender(letter_t);
	}
	
	private static void registerRender(Block block) {

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
