package com.edricchan.firstmod.handlers;

import com.edricchan.firstmod.container.LetterMakerContainer;
import com.edricchan.firstmod.gui.LetterMakerContainerGui;
import com.edricchan.firstmod.tileentity.LetterMakerContainerTileEntity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		BlockPos pos = new BlockPos(x, y, z);
		TileEntity te = world.getTileEntity(pos);
		if (te instanceof LetterMakerContainerTileEntity) {
			return new LetterMakerContainer(player.inventory, (LetterMakerContainerTileEntity) te);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		BlockPos pos = new BlockPos(x, y, z);
		TileEntity te = world.getTileEntity(pos);
		if (te instanceof LetterMakerContainerTileEntity) {
			LetterMakerContainerTileEntity containerTileEntity = (LetterMakerContainerTileEntity) te;
			return new LetterMakerContainerGui(containerTileEntity, new LetterMakerContainer(player.inventory, containerTileEntity));
		}
		return null;
	}
}