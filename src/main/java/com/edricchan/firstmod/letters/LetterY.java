package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class LetterY extends Item {

	public LetterY() {
		setUnlocalizedName(Reference.FirstLetters.LETTER_Y.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.LETTER_Y.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
