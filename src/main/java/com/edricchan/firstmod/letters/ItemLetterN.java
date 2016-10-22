package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class ItemLetterN extends Item {

	public ItemLetterN() {
		setUnlocalizedName(Reference.FirstLetters.ITEM_LETTER_N.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.ITEM_LETTER_N.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
