package com.edricchan.firstmod.item;

import com.edricchan.firstmod.Reference;
import com.edricchan.firstmod.handler.CreativeTabHandler;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class ItemRuby extends Item {
	public ItemRuby() {
		setRegistryName("item_ruby");
		setUnlocalizedName(Reference.MOD_ID + ".item_ruby");
		setCreativeTab(CreativeTabHandler.tabItems);
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add("A ruby! Amazing!");
		if (GuiScreen.isCtrlKeyDown()) {
			tooltip.add("§6Did you know that this item exists in the minecraft textures?§r");
			tooltip.add("§6However, it wasn't used at all!§r");
		} else {
			tooltip.add("§6Press [CTRL/COMMAND] for some facts!§r");
		}
	}

	@SideOnly(Side.CLIENT)
	public void initModel() {
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	}
}
