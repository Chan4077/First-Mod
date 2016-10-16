package com.edricchan.firstmod.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.text.ITextComponent;

public class TileEntityStorageChest extends TileEntity implements IInventory {

	@Override
	public ITextComponent getDisplayName() {

		return null;
	}

	@Override
	public String getName() {

		return null;
	}

	@Override
	public boolean hasCustomName() {

		return false;
	}

	@Override
	public void clear() {

	}

	@Override
	public void closeInventory(EntityPlayer arg0) {

		
	}

	@Override
	public ItemStack decrStackSize(int arg0, int arg1) {

		return null;
	}

	@Override
	public int getField(int arg0) {

		return 0;
	}

	@Override
	public int getFieldCount() {

		return 0;
	}

	@Override
	public int getInventoryStackLimit() {
		
		return 0;
	}

	@Override
	public int getSizeInventory() {
		
		return 0;
	}

	@Override
	public ItemStack getStackInSlot(int arg0) {
		
		return null;
	}

	@Override
	public boolean isItemValidForSlot(int arg0, ItemStack arg1) {
		
		return false;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer arg0) {
		
		return false;
	}

	@Override
	public void openInventory(EntityPlayer arg0) {
		
		
	}

	@Override
	public ItemStack removeStackFromSlot(int arg0) {
		
		return null;
	}

	@Override
	public void setField(int arg0, int arg1) {
		
		
	}

	@Override
	public void setInventorySlotContents(int arg0, ItemStack arg1) {
		
		
	}

	

}
