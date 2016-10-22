package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class ItemLetterJ extends Item {

	public ItemLetterJ() {
		setUnlocalizedName(Reference.FirstLetters.ITEM_LETTER_J.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.ITEM_LETTER_J.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
