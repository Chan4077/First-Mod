package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class LetterB extends Block {

	public LetterB() {
		super(Material.WOOD);
		setUnlocalizedName(Reference.FirstLetters.LETTER_B.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.LETTER_B.getRegistryName());
		setHardness(1.0F);
		setCreativeTab(FirstMod.LETTER_TAB);
		setHarvestLevel("pickaxe", 2);
	}

}
