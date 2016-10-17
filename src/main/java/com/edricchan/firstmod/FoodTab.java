package com.edricchan.firstmod;

import com.edricchan.firstmod.init.ModFoods;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class FoodTab extends CreativeTabs {

	public FoodTab() {
		super("foodTab");
	}

	@Override
	public Item getTabIconItem() {
		return ModFoods.CHEESE_AND_COOKIE;
	}
	
}
