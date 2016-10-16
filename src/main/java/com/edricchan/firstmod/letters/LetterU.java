package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class LetterU extends Item {

	public LetterU() {
		setUnlocalizedName(Reference.FirstLetters.LETTER_U.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.LETTER_U.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
