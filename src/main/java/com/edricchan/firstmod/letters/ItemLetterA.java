package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class ItemLetterA extends Item {

	public ItemLetterA() {
		setUnlocalizedName(Reference.FirstLetters.LETTER_A.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.LETTER_A.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
