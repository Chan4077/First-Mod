package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class ItemLetterU extends Item {

	public ItemLetterU() {
		setUnlocalizedName(Reference.FirstLetters.ITEM_LETTER_U.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.ITEM_LETTER_U.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
