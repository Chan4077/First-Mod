package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class ItemLetterA extends Item {

	public ItemLetterA() {
		setUnlocalizedName(Reference.FirstLetters.ITEM_LETTER_A.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.ITEM_LETTER_A.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
