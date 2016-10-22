package com.edricchan.firstmod.letter_blocks;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockLetter extends Block {
	public BlockLetter() {
		super(Material.WOOD);
		setUnlocalizedName(Reference.FirstLetterColourBlocks.BlOCK_LETTER.getUnlocalizedName());
		setRegistryName(Reference.FirstLetterColourBlocks.BlOCK_LETTER.getRegistryName());
		setHardness(1.0F);
		setCreativeTab(FirstMod.LETTER_COLOUR_BLOCKS_TAB);
		setHarvestLevel("pickaxe", 2);
	}
}
