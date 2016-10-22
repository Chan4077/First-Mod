package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class ItemLetterE extends Item {

	public ItemLetterE() {
		setUnlocalizedName(Reference.FirstLetters.ITEM_LETTER_E.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.ITEM_LETTER_E.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
