package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class ItemLetterC extends Item {

	public ItemLetterC() {
		setUnlocalizedName(Reference.FirstLetters.ITEM_LETTER_C.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.ITEM_LETTER_C.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
