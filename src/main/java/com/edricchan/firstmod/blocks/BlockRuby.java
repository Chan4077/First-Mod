package com.edricchan.firstmod.blocks;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRuby extends Block {

	public BlockRuby() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.FirstBlocks.RUBY_BLOCK.getUnlocalizedName());
		setRegistryName(Reference.FirstBlocks.RUBY_BLOCK.getRegistryName());
		setHardness(1.0F);
		setCreativeTab(FirstMod.MAIN_TAB);
		setSoundType(blockSoundType.METAL);
	}

}
