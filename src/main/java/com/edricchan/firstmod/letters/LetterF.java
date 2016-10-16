package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class LetterF extends Item {

	public LetterF() {
		setUnlocalizedName(Reference.FirstLetters.LETTER_F.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.LETTER_F.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
