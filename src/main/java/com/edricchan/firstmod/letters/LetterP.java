package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class LetterP extends Item {

	public LetterP() {
		setUnlocalizedName(Reference.FirstLetters.LETTER_P.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.LETTER_P.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
