package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class LetterE extends Item {

	public LetterE() {
		setUnlocalizedName(Reference.FirstLetters.LETTER_E.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.LETTER_E.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
