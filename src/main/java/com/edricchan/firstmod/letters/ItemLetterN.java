package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class ItemLetterN extends Item {

	public ItemLetterN() {
		setUnlocalizedName(Reference.FirstLetters.LETTER_N.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.LETTER_N.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
