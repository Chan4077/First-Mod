package com.edricchan.firstmod.items;

import com.edricchan.firstmod.Reference;
import com.edricchan.firstmod.handlers.CreativeTabHandler;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemFood;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class FoodCheeseCookie extends ItemFood {
	/**
	 * Params: <code>int amount, float saturation, boolean isWolfFood</code>
	 */
	public FoodCheeseCookie() {
		super(12, 4, true);
		setRegistryName("food_cheese_cookie");
		setUnlocalizedName(Reference.MODID + ".food_cheese_cookie");
		setCreativeTab(CreativeTabHandler.tabFoods);
	}
	@SideOnly(Side.CLIENT)
	public void initModel() {
		 ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	}
}
