package com.edricchan.firstmod.letter_blocks;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class LetterUOrange extends Block {

	public LetterUOrange() {
		super(Material.WOOD);
		setUnlocalizedName(Reference.FirstLetterBlocks.LETTER_U_ORANGE.getUnlocalizedName());
		setRegistryName(Reference.FirstLetterBlocks.LETTER_U_ORANGE.getRegistryName());
		setHardness(1.0F);
		setCreativeTab(FirstMod.LETTER_BLOCKS_TAB);
		setHarvestLevel("pickaxe", 2);
	}

}
