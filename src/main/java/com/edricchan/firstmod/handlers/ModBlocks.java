package com.edricchan.firstmod.handlers;

import com.edricchan.firstmod.blocks.LetterMakerContainerBlock;
import com.edricchan.firstmod.blocks.SimpleBlock;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {
	@GameRegistry.ObjectHolder("first:simpleblock")
	public static SimpleBlock simpleBlock;

	@GameRegistry.ObjectHolder("first:lettermakercontainerblock")
	public static LetterMakerContainerBlock letterMakerContainerBlock;
	/**
	 * Initializes all item models
	 */
	@SideOnly(Side.CLIENT)
	public static void initModels() {
		simpleBlock.initModel();
		letterMakerContainerBlock.initModel();
	}
}
