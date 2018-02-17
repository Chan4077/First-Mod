package com.edricchan.firstmod.item;

import com.edricchan.firstmod.Reference;
import com.edricchan.firstmod.handler.CreativeTabHandler;

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

public class FoodCheese extends ItemFood {
	/**
	 * Params: <code>int amount, float saturation, boolean isWolfFood</code>
	 */
	public FoodCheese() {
		super(8, 2, true);
		setRegistryName("food_cheese");
		setUnlocalizedName(Reference.MOD_ID + ".food_cheese");
		setCreativeTab(CreativeTabHandler.tabFoods);

	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add("Delicious cheese by itself!");
		tooltip.add("§lBut who earth would eat this by itself?§r");
		if (GuiScreen.isShiftKeyDown()) {
			tooltip.add("§9Food: Replenishes hunger by 8 shanks§r");
			tooltip.add("§9Crafting: WIP§r");
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
