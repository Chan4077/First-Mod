package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class LetterI extends Item {

	public LetterI() {
		setUnlocalizedName(Reference.FirstLetters.LETTER_I.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.LETTER_I.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
