package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class LetterG extends Block {

	public LetterG() {
		super(Material.WOOD);
		setUnlocalizedName(Reference.FirstLetters.LETTER_G.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.LETTER_G.getRegistryName());
		setHardness(1.0F);
		setCreativeTab(FirstMod.LETTER_TAB);
		setHarvestLevel("pickaxe", 2);
	}

}
