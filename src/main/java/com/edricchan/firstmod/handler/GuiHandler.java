package com.edricchan.firstmod.handler;

import com.edricchan.firstmod.container.ContainerLetterMaker;
import com.edricchan.firstmod.gui.GuiLetterMaker;
import com.edricchan.firstmod.tileentity.TileEntityLetterMaker;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	public static final int LETTER_MAKER = 1;

	@Override
	public Container getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch (ID) {
			case LETTER_MAKER:
				return new ContainerLetterMaker(player.inventory, (TileEntityLetterMaker) world.getTileEntity(new BlockPos(x, y, z)));
			default:
				return null;
		}
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch (ID) {
			case LETTER_MAKER:
				return new GuiLetterMaker(getServerGuiElement(ID, player, world, x, y, z), player.inventory);
			default:
				return null;
		}
	}
}