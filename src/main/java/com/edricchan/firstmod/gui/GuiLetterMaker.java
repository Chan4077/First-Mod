package com.edricchan.firstmod.gui;

import com.edricchan.firstmod.Reference;
import com.edricchan.firstmod.handler.ModBlocks;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

public class GuiLetterMaker extends GuiContainer {
	public static final int WIDTH = 176;
	public static final int HEIGHT = 180;
	private InventoryPlayer playerInv;
	private static final ResourceLocation background = new ResourceLocation(Reference.MOD_ID, "textures/gui/lettermakercontainer.png");

	public GuiLetterMaker(Container container, InventoryPlayer playerInv) {
		super(container);
		this.playerInv = playerInv;
	}

	@Override
	protected void actionPerformed(GuiButton guiButton) {
		if (guiButton.id == 1) {
			System.out.println("Hello world!");
		}
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GlStateManager.color(1, 1, 1, 1);
		mc.getTextureManager().bindTexture(background);
		int x = (width - xSize) / 2;
		int y = (height - ySize) / 2;
		drawTexturedModalRect(x, y, 0, 0, WIDTH, HEIGHT);
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		String name = I18n.format(ModBlocks.blockLetterMaker.getUnlocalizedName() + ".name");
		fontRenderer.drawString(name, WIDTH / 2 - fontRenderer.getStringWidth(name) / 2, 6, 0x404040);
		fontRenderer.drawString(playerInv.getDisplayName().getUnformattedText(), 8, HEIGHT - 94, 0x404040);
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		this.drawDefaultBackground();
		super.drawScreen(mouseX, mouseY, partialTicks);
		this.renderHoveredToolTip(mouseX, mouseY);
	}
}