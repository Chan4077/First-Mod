package com.edricchan.firstmod.items;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.item.Item;

public class ItemRuby extends Item {

	public ItemRuby() {
		setUnlocalizedName(Reference.FirstItems.RUBY.getUnlocalizedName());
		setRegistryName(Reference.FirstItems.RUBY.getRegistryName());
		setCreativeTab(FirstMod.MAIN_TAB);

	}
}
