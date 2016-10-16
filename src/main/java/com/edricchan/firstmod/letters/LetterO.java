package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class LetterO extends Item {

	public LetterO() {
		setUnlocalizedName(Reference.FirstLetters.LETTER_O.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.LETTER_O.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
