package com.edricchan.firstmod.items;

import com.edricchan.firstmod.Reference;
import com.edricchan.firstmod.handlers.CreativeTabHandler;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class FoodCheeseCookie extends ItemFood {
	/**
	 * Params: <code>int amount, float saturation, boolean isWolfFood</code>
	 */
	public FoodCheeseCookie() {
		super(12, 4, true);
		setRegistryName("foodcheesecookie");
		setUnlocalizedName(Reference.MODID + ".foodcheesecookie");
		setCreativeTab(CreativeTabHandler.tabFoods);
	}
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
	{
		tooltip.add("Cheese added to a cookie = Amazing!");
		if (GuiScreen.isShiftKeyDown()) {
			tooltip.add("§9Food: Replenishes hunger by 12 shanks§r");
			tooltip.add("§9Crafting: Cheese + Cookie§r");
			tooltip.add("§9Wolf food: true§r");
		} else {
			tooltip.add("§9Press [SHIFT] for more info§r");
		}
	}
	@SideOnly(Side.CLIENT)
	public void initModel() {
		 ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	}
}
