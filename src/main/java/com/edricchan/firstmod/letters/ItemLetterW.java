package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class ItemLetterW extends Item {

	public ItemLetterW() {
		setUnlocalizedName(Reference.FirstLetters.ITEM_LETTER_W.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.ITEM_LETTER_W.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
