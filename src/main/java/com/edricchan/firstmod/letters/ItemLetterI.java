package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class ItemLetterI extends Item {

	public ItemLetterI() {
		setUnlocalizedName(Reference.FirstLetters.ITEM_LETTER_I.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.ITEM_LETTER_I.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
