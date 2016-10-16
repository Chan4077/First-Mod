package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class LetterJ extends Item {

	public LetterJ() {
		setUnlocalizedName(Reference.FirstLetters.LETTER_J.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.LETTER_J.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
