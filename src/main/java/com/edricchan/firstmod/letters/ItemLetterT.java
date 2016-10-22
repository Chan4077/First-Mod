package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class ItemLetterT extends Item {

	public ItemLetterT() {
		setUnlocalizedName(Reference.FirstLetters.ITEM_LETTER_T.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.ITEM_LETTER_T.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
