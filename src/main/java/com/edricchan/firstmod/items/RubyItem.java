package com.edricchan.firstmod.items;

import com.edricchan.firstmod.Reference;
import com.edricchan.firstmod.handlers.CreativeTabHandler;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RubyItem extends Item {
	public RubyItem() {
		setRegistryName("item_ruby");
		setUnlocalizedName(Reference.MODID+".item_ruby");
		setCreativeTab(CreativeTabHandler.tabItems);
	}
	@SideOnly(Side.CLIENT)
	public void initModel() {
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	}
}
