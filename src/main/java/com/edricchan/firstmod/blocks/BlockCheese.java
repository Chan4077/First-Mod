package com.edricchan.firstmod.blocks;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;
import com.edricchan.firstmod.tileentity.TileEntityStorageChest;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockCheese extends Block {

	public BlockCheese() {
		super(Material.CAKE);
		setUnlocalizedName(Reference.FirstBlocks.CHEESE_BLOCK.getUnlocalizedName());
		setRegistryName(Reference.FirstBlocks.CHEESE_BLOCK.getRegistryName());
		setHardness(1.0F);
		setCreativeTab(FirstMod.MAIN_TAB);
		setHarvestLevel("pickaxe", 2);
	}
	
}
