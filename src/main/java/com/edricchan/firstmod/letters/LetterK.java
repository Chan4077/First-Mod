package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class LetterK extends Item {

	public LetterK() {
		setUnlocalizedName(Reference.FirstLetters.LETTER_K.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.LETTER_K.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
