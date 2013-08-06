package tech.Modjam;

import org.lwjgl.opengl.GL11;

import tech.Modjam.ect.Resources;

import cpw.mods.fml.client.FMLClientHandler;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.StatCollector;

public class cy_gui extends GuiContainer {

    public cy_gui (InventoryPlayer inventoryPlayer, cy_VaseTileEntity tileEntity) {

        super(new cy_VaseContainer(inventoryPlayer, tileEntity));
}
@Override
protected void drawGuiContainerForegroundLayer(int param1, int param2) {

	
        fontRenderer.drawString("Vase", 8, 6, 4210752);

        fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, ySize - 96 + 2, 4210752);
}
@Override
protected void drawGuiContainerBackgroundLayer(float par1, int par2,
                        int par3) {

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        FMLClientHandler.instance().getClient().renderEngine.func_110577_a(Resources.BACKGROUNDVASE);
        
        
        int x = (width - xSize) / 2;
        int y = (height - ySize) / 2;
        this.drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
}
}