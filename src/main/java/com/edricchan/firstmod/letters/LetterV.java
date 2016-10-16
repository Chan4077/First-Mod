package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class LetterV extends Item {

	public LetterV() {
		setUnlocalizedName(Reference.FirstLetters.LETTER_V.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.LETTER_V.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
