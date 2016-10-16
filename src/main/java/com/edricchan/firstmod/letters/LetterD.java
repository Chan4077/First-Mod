package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class LetterD extends Item {

	public LetterD() {
		setUnlocalizedName(Reference.FirstLetters.LETTER_D.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.LETTER_D.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
