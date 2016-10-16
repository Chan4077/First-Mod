package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class LetterS extends Item {

	public LetterS() {
		setUnlocalizedName(Reference.FirstLetters.LETTER_S.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.LETTER_S.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
