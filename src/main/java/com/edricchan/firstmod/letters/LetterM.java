package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class LetterM extends Item {

	public LetterM() {
		setUnlocalizedName(Reference.FirstLetters.LETTER_M.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.LETTER_M.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
