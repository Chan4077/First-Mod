package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class LetterT extends Item {

	public LetterT() {
		setUnlocalizedName(Reference.FirstLetters.LETTER_T.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.LETTER_T.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
