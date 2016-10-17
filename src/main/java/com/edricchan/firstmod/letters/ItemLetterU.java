package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class ItemLetterU extends Item {

	public ItemLetterU() {
		setUnlocalizedName(Reference.FirstLetters.LETTER_U.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.LETTER_U.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
