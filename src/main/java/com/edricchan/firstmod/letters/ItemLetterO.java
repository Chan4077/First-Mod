package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class ItemLetterO extends Item {

	public ItemLetterO() {
		setUnlocalizedName(Reference.FirstLetters.LETTER_O.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.LETTER_O.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
