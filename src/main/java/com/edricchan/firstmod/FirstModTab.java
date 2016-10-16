package com.edricchan.firstmod;

import com.edricchan.firstmod.init.ModBlocks;
import com.edricchan.firstmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class FirstModTab extends CreativeTabs {

	public FirstModTab() {
		super("tabFirst");
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(ModBlocks.cheese_block);
	}
	
}
