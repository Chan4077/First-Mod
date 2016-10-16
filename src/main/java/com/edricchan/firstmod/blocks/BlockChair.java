package com.edricchan.firstmod.blocks;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockChair extends Block {

	public BlockChair() {
		super(Material.CLAY);
		setUnlocalizedName(Reference.FirstBlocks.CHAIR.getUnlocalizedName());
		setRegistryName(Reference.FirstBlocks.CHAIR.getRegistryName());
		setHardness(1.0F);
		setCreativeTab(FirstMod.MAIN_TAB);
		setHarvestLevel("pickaxe", 2);
		setSoundType(blockSoundType.WOOD);
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.SOLID;
	}
	
	@Override
	public boolean isFlammable(IBlockAccess world, BlockPos pos, EnumFacing face) {
		return true;
	}
}
