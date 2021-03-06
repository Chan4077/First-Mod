package com.edricchan.firstmod.block;

import com.edricchan.firstmod.Reference;
import com.edricchan.firstmod.handler.CreativeTabHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
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

public class BlockSimple extends Block {
	public BlockSimple() {
		// Makes the material clay
		super(Material.CLAY);
		// first.simple_block
		setUnlocalizedName(Reference.MOD_ID + ".simple_block");
		setRegistryName("simple_block");
		setCreativeTab(CreativeTabHandler.tabBlocks);
		setHardness(0.6F);
	}

	@SideOnly(Side.CLIENT)
	/**
	 * Adds information to the item's tooltip
	 */
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add("The most basic block in the world. Only meant for decoration purposes.");
	}

	@SideOnly(Side.CLIENT)
	/**
	 * Initialises the item's model on the client side
	 */
	public void initModel() {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	}
}