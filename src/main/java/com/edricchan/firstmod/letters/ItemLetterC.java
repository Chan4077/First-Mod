package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class ItemLetterC extends Item {

	public ItemLetterC() {
		setUnlocalizedName(Reference.FirstLetters.LETTER_C.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.LETTER_C.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
