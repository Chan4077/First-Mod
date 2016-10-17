package com.edricchan.firstmod.init;

import com.edricchan.firstmod.letter_blocks.LetterAOrange;
import com.edricchan.firstmod.letter_blocks.LetterBOrange;
import com.edricchan.firstmod.letter_blocks.LetterCOrange;
import com.edricchan.firstmod.letter_blocks.LetterDOrange;
import com.edricchan.firstmod.letter_blocks.LetterEOrange;
import com.edricchan.firstmod.letter_blocks.LetterFOrange;
import com.edricchan.firstmod.letter_blocks.LetterGOrange;
import com.edricchan.firstmod.letter_blocks.LetterHOrange;
import com.edricchan.firstmod.letter_blocks.LetterIOrange;
import com.edricchan.firstmod.letter_blocks.LetterJOrange;
import com.edricchan.firstmod.letter_blocks.LetterKOrange;
import com.edricchan.firstmod.letter_blocks.LetterLOrange;
import com.edricchan.firstmod.letter_blocks.LetterMOrange;
import com.edricchan.firstmod.letter_blocks.LetterNOrange;
import com.edricchan.firstmod.letter_blocks.LetterOOrange;
import com.edricchan.firstmod.letter_blocks.LetterPOrange;
import com.edricchan.firstmod.letter_blocks.LetterQOrange;
import com.edricchan.firstmod.letter_blocks.LetterROrange;
import com.edricchan.firstmod.letter_blocks.LetterSOrange;
import com.edricchan.firstmod.letter_blocks.LetterTOrange;
import com.edricchan.firstmod.letter_blocks.LetterUOrange;
import com.edricchan.firstmod.letter_blocks.LetterVOrange;
import com.edricchan.firstmod.letter_blocks.LetterWOrange;
import com.edricchan.firstmod.letter_blocks.LetterXOrange;
import com.edricchan.firstmod.letter_blocks.LetterYOrange;
import com.edricchan.firstmod.letter_blocks.LetterZOrange;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModLetterBlocks {
	// Letters
	public static Block LETTER_A_ORANGE;
	public static Block LETTER_B_ORANGE;
	public static Block LETTER_C_ORANGE;
	public static Block LETTER_D_ORANGE;
	public static Block LETTER_E_ORANGE;
	public static Block LETTER_F_ORANGE;
	public static Block LETTER_G_ORANGE;
	public static Block LETTER_H_ORANGE;
	public static Block LETTER_I_ORANGE;
	public static Block LETTER_J_ORANGE;
	public static Block LETTER_K_ORANGE;
	public static Block LETTER_L_ORANGE;
	public static Block LETTER_M_ORANGE;
	public static Block LETTER_N_ORANGE;
	public static Block LETTER_O_ORANGE;
	public static Block LETTER_P_ORANGE;
	public static Block LETTER_Q_ORANGE;
	public static Block LETTER_R_ORANGE;
	public static Block LETTER_S_ORANGE;
	public static Block LETTER_T_ORANGE;
	public static Block LETTER_U_ORANGE;
	public static Block LETTER_V_ORANGE;
	public static Block LETTER_W_ORANGE;
	public static Block LETTER_X_ORANGE;
	public static Block LETTER_Y_ORANGE;
	public static Block LETTER_Z_ORANGE;
	
	public static void init() {
		// Letters
		LETTER_A_ORANGE = new LetterAOrange();
		LETTER_B_ORANGE = new LetterBOrange();
		LETTER_C_ORANGE = new LetterCOrange();
		LETTER_D_ORANGE = new LetterDOrange();
		LETTER_E_ORANGE = new LetterEOrange();
		LETTER_F_ORANGE = new LetterFOrange();
		LETTER_G_ORANGE = new LetterGOrange();
		LETTER_H_ORANGE = new LetterHOrange();
		LETTER_I_ORANGE = new LetterIOrange();
		LETTER_J_ORANGE = new LetterJOrange();
		LETTER_K_ORANGE = new LetterKOrange();
		LETTER_L_ORANGE = new LetterLOrange();
		LETTER_M_ORANGE = new LetterMOrange();
		LETTER_N_ORANGE = new LetterNOrange();
		LETTER_O_ORANGE = new LetterOOrange();
		LETTER_P_ORANGE = new LetterPOrange();
		LETTER_Q_ORANGE = new LetterQOrange();
		LETTER_R_ORANGE = new LetterROrange();
		LETTER_S_ORANGE = new LetterSOrange();
		LETTER_T_ORANGE = new LetterTOrange();
		LETTER_U_ORANGE = new LetterUOrange();
		LETTER_V_ORANGE = new LetterVOrange();
		LETTER_W_ORANGE = new LetterWOrange();
		LETTER_X_ORANGE = new LetterXOrange();
		LETTER_Y_ORANGE = new LetterYOrange();
		LETTER_Z_ORANGE = new LetterZOrange();
	}
	
	public static void register() {
		registerBlock(LETTER_A_ORANGE);
		registerBlock(LETTER_B_ORANGE);
		registerBlock(LETTER_C_ORANGE);
		registerBlock(LETTER_D_ORANGE);
		registerBlock(LETTER_E_ORANGE);
		registerBlock(LETTER_F_ORANGE);
		registerBlock(LETTER_G_ORANGE);
		registerBlock(LETTER_H_ORANGE);
		registerBlock(LETTER_I_ORANGE);
		registerBlock(LETTER_J_ORANGE);
		registerBlock(LETTER_K_ORANGE);
		registerBlock(LETTER_L_ORANGE);
		registerBlock(LETTER_M_ORANGE);
		registerBlock(LETTER_N_ORANGE);
		registerBlock(LETTER_O_ORANGE);
		registerBlock(LETTER_P_ORANGE);
		registerBlock(LETTER_Q_ORANGE);
		registerBlock(LETTER_R_ORANGE);
		registerBlock(LETTER_S_ORANGE);
		registerBlock(LETTER_T_ORANGE);
		registerBlock(LETTER_U_ORANGE);
		registerBlock(LETTER_V_ORANGE);
		registerBlock(LETTER_W_ORANGE);
		registerBlock(LETTER_X_ORANGE);
		registerBlock(LETTER_Y_ORANGE);
		registerBlock(LETTER_Z_ORANGE);
	}
	
	private static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders() {
		registerRender(LETTER_A_ORANGE);
		registerRender(LETTER_B_ORANGE);
		registerRender(LETTER_C_ORANGE);
		registerRender(LETTER_D_ORANGE);
		registerRender(LETTER_E_ORANGE);
		registerRender(LETTER_F_ORANGE);
		registerRender(LETTER_G_ORANGE);
		registerRender(LETTER_H_ORANGE);
		registerRender(LETTER_I_ORANGE);
		registerRender(LETTER_J_ORANGE);
		registerRender(LETTER_K_ORANGE);
		registerRender(LETTER_L_ORANGE);
		registerRender(LETTER_M_ORANGE);
		registerRender(LETTER_N_ORANGE);
		registerRender(LETTER_O_ORANGE);
		registerRender(LETTER_P_ORANGE);
		registerRender(LETTER_Q_ORANGE);
		registerRender(LETTER_R_ORANGE);
		registerRender(LETTER_S_ORANGE);
		registerRender(LETTER_T_ORANGE);
		registerRender(LETTER_U_ORANGE);
		registerRender(LETTER_V_ORANGE);
		registerRender(LETTER_W_ORANGE);
		registerRender(LETTER_X_ORANGE);
		registerRender(LETTER_Y_ORANGE);
		registerRender(LETTER_Z_ORANGE);
	}
	
	private static void registerRender(Block block) {

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
