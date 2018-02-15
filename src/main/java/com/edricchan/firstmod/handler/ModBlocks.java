package com.edricchan.firstmod.handler;

import com.edricchan.firstmod.block.BlockLetterMaker;
import com.edricchan.firstmod.block.BlockSimple;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {
	@GameRegistry.ObjectHolder("first:simple_block")
	public static BlockSimple blockSimple;

	@GameRegistry.ObjectHolder("first:letter_maker_block")
	public static BlockLetterMaker blockLetterMaker;
	/**
	 * Initializes all item models
	 */
	@SideOnly(Side.CLIENT)
	public static void initModels() {
		blockSimple.initModel();
		blockLetterMaker.initModel();
	}
}
