package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class ItemLetterS extends Item {

	public ItemLetterS() {
		setUnlocalizedName(Reference.FirstLetters.ITEM_LETTER_S.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.ITEM_LETTER_S.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
