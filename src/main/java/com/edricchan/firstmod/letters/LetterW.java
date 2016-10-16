package com.edricchan.firstmod.letters;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class LetterW extends Item {

	public LetterW() {
		setUnlocalizedName(Reference.FirstLetters.LETTER_W.getUnlocalizedName());
		setRegistryName(Reference.FirstLetters.LETTER_W.getRegistryName());
		setCreativeTab(FirstMod.LETTERS_TAB);

	}
}
