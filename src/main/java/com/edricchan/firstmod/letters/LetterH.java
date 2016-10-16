package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class LetterH extends Item {

	public LetterH() {
		setUnlocalizedName(Reference.FirstLetters.LETTER_H.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.LETTER_H.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
