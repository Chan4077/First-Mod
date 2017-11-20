package com.edricchan.firstmod.blocks;

import com.edricchan.firstmod.FirstMod;
import com.edricchan.firstmod.Reference;
import com.edricchan.firstmod.handlers.CreativeTabHandler;
import com.edricchan.firstmod.tileentity.LetterMakerContainerTileEntity;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class LetterMakerContainerBlock extends Block implements ITileEntityProvider {

	public static final int GUI_ID = 1;

	public LetterMakerContainerBlock() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.MODID + ".lettermakercontainerblock");
		setRegistryName("lettermakercontainerblock");
		setCreativeTab(CreativeTabHandler.tabBlocks);
	}
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
	{
		tooltip.add("This chest is the most useful block in the whole world!");
		if (GuiScreen.isAltKeyDown()) {
			tooltip.add("§cBut seriously, why on earth would you craft it?§r");
		} else {
			tooltip.add("§cPress [ALT] for more info§r");
		}
	}
	@SideOnly(Side.CLIENT)
	public void initModel() {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new LetterMakerContainerTileEntity();
	}


	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
		if (world.isRemote) {
			return true;
		}
		TileEntity te = world.getTileEntity(pos);
		if (!(te instanceof LetterMakerContainerTileEntity)) {
			return false;
		}
		player.openGui(FirstMod.instance, GUI_ID, world, pos.getX(), pos.getY(), pos.getZ());
		return true;
	}
}
