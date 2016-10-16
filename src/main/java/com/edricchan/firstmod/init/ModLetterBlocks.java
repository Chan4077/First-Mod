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
	public static Block letter_a_orange;
	public static Block letter_b_orange;
	public static Block letter_c_orange;
	public static Block letter_d_orange;
	public static Block letter_e_orange;
	public static Block letter_f_orange;
	public static Block letter_g_orange;
	public static Block letter_h_orange;
	public static Block letter_i_orange;
	public static Block letter_j_orange;
	public static Block letter_k_orange;
	public static Block letter_l_orange;
	public static Block letter_m_orange;
	public static Block letter_n_orange;
	public static Block letter_o_orange;
	public static Block letter_p_orange;
	public static Block letter_q_orange;
	public static Block letter_r_orange;
	public static Block letter_s_orange;
	public static Block letter_t_orange;
	public static Block letter_u_orange;
	public static Block letter_v_orange;
	public static Block letter_w_orange;
	public static Block letter_x_orange;
	public static Block letter_y_orange;
	public static Block letter_z_orange;
	
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
		letter_i_orange = new LetterIOrange();
		letter_j_orange = new LetterJOrange();
		letter_k_orange = new LetterKOrange();
		letter_l_orange = new LetterLOrange();
		letter_m_orange = new LetterMOrange();
		letter_n_orange = new LetterNOrange();
		letter_o_orange = new LetterOOrange();
		letter_p_orange = new LetterPOrange();
		letter_q_orange = new LetterQOrange();
		letter_r_orange = new LetterROrange();
		letter_s_orange = new LetterSOrange();
		letter_t_orange = new LetterTOrange();
		letter_u_orange = new LetterUOrange();
		letter_v_orange = new LetterVOrange();
		letter_w_orange = new LetterWOrange();
		letter_x_orange = new LetterXOrange();
		letter_y_orange = new LetterYOrange();
		letter_z_orange = new LetterZOrange();
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
		registerBlock(letter_i_orange);
		registerBlock(letter_j_orange);
		registerBlock(letter_k_orange);
		registerBlock(letter_l_orange);
		registerBlock(letter_m_orange);
		registerBlock(letter_n_orange);
		registerBlock(letter_o_orange);
		registerBlock(letter_p_orange);
		registerBlock(letter_q_orange);
		registerBlock(letter_r_orange);
		registerBlock(letter_s_orange);
		registerBlock(letter_t_orange);
		registerBlock(letter_u_orange);
		registerBlock(letter_v_orange);
		registerBlock(letter_w_orange);
		registerBlock(letter_x_orange);
		registerBlock(letter_y_orange);
		registerBlock(letter_z_orange);
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
		registerRender(letter_i_orange);
		registerRender(letter_j_orange);
		registerRender(letter_k_orange);
		registerRender(letter_l_orange);
		registerRender(letter_m_orange);
		registerRender(letter_n_orange);
		registerRender(letter_o_orange);
		registerRender(letter_p_orange);
		registerRender(letter_q_orange);
		registerRender(letter_r_orange);
		registerRender(letter_s_orange);
		registerRender(letter_t_orange);
		registerRender(letter_u_orange);
		registerRender(letter_v_orange);
		registerRender(letter_w_orange);
		registerRender(letter_x_orange);
		registerRender(letter_y_orange);
		registerRender(letter_z_orange);
		
		// Default colours
		registerBlock(letter_orange);
	}
	
	private static void registerRender(Block block) {

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
