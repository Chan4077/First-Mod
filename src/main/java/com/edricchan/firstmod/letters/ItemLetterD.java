package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class ItemLetterD extends Item {

	public ItemLetterD() {
		setUnlocalizedName(Reference.FirstLetters.ITEM_LETTER_D.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.ITEM_LETTER_D.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
