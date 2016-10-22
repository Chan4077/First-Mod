package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class ItemLetterP extends Item {

	public ItemLetterP() {
		setUnlocalizedName(Reference.FirstLetters.ITEM_LETTER_P.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.ITEM_LETTER_P.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
