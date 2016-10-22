package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class ItemLetterY extends Item {

	public ItemLetterY() {
		setUnlocalizedName(Reference.FirstLetters.ITEM_LETTER_Y.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.ITEM_LETTER_Y.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
