package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class ItemLetterG extends Item {

	public ItemLetterG() {
		setUnlocalizedName(Reference.FirstLetters.ITEM_LETTER_G.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.ITEM_LETTER_G.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
