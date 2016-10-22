package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class ItemLetterM extends Item {

	public ItemLetterM() {
		setUnlocalizedName(Reference.FirstLetters.ITEM_LETTER_M.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.ITEM_LETTER_M.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
