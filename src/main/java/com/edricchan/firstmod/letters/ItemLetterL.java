package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class ItemLetterL extends Item {

	public ItemLetterL() {
		setUnlocalizedName(Reference.FirstLetters.ITEM_LETTER_L.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.ITEM_LETTER_L.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
