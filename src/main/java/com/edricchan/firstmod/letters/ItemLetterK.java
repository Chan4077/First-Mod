package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class ItemLetterK extends Item {

	public ItemLetterK() {
		setUnlocalizedName(Reference.FirstLetters.ITEM_LETTER_K.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.ITEM_LETTER_K.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
