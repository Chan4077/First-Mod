package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class ItemLetterH extends Item {

	public ItemLetterH() {
		setUnlocalizedName(Reference.FirstLetters.ITEM_LETTER_H.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.ITEM_LETTER_H.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
