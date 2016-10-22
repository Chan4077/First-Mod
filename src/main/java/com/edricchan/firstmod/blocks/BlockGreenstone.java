/*
package com.edricchan.firstmod.blocks;

import java.util.Random;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;
import com.edricchan.firstmod.tileentity.TileEntityStorageChest;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockGreenstone extends Block {

	public BlockGreenstone() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.FirstBlocks.GREENSTONE_BLOCK.getUnlocalizedName());
		setRegistryName(Reference.FirstBlocks.GREENSTONE_BLOCK.getRegistryName());
		setHardness(1.0F);
		setCreativeTab(CreativeTabs.REDSTONE);
		setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	public int getWeakPower(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
		return super.getWeakPower(blockState, blockAccess, pos, side);
	}
	
	@Override
	public boolean canProvidePower(IBlockState state) {
		// Checks if this block can provide redstone power
		return true;
	}
	@Override
	public int quantityDropped(Random random) {
		// Random quantity when picked
		return super.quantityDropped(random);
	}
}
*/