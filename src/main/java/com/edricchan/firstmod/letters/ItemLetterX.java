package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class ItemLetterX extends Item {

	public ItemLetterX() {
		setUnlocalizedName(Reference.FirstLetters.LETTER_X.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.LETTER_X.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
