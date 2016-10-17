package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class ItemLetterR extends Item {

	public ItemLetterR() {
		setUnlocalizedName(Reference.FirstLetters.LETTER_R.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.LETTER_R.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
