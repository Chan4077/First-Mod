package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class LetterC extends Block {

	public LetterC() {
		super(Material.WOOD);
		setUnlocalizedName(Reference.FirstLetters.LETTER_C.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.LETTER_C.getRegistryName());
		setHardness(1.0F);
		setCreativeTab(FirstMod.LETTER_TAB);
		setHarvestLevel("pickaxe", 2);
	}

}
