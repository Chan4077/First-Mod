package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class LetterL extends Item {

	public LetterL() {
		setUnlocalizedName(Reference.FirstLetters.LETTER_L.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.LETTER_L.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
