 package com.edricchan.firstmod.letter_blocks;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockLetterOrange extends Block {

	public BlockLetterOrange() {
		super(Material.WOOD);
		setUnlocalizedName(Reference.FirstLetterColourBlocks.BLOCK_LETTER_ORANGE.getUnlocalizedName());
		setRegistryName(Reference.FirstLetterColourBlocks.BLOCK_LETTER_ORANGE.getRegistryName());
		setHardness(1.0F);
		setCreativeTab(FirstMod.LETTER_COLOUR_BLOCKS_TAB);
		setHarvestLevel("pickaxe", 2);
	}

}
