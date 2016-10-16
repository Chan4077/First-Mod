/* package com.edricchan.firstmod.blocks;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;
import com.edricchan.firstmod.tileentity.TileEntityStorageChest;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockStorageChest extends BlockContainer implements ITileEntityProvider{

	public BlockStorageChest() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.FirstBlocks.STORAGE_BLOCK.getUnlocalizedName());
		setRegistryName(Reference.FirstBlocks.STORAGE_BLOCK.getRegistryName());
		setHardness(1.0F);
		setCreativeTab(FirstMod.MAIN_TAB);

	}
	
	@Override
	public TileEntity createNewTileEntity(World worldin, int meta) {
		return new TileEntityStorageChest();
		};
}
*/