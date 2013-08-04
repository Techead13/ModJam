package tech.Modjam;

import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;

import tech.Modjam.ect.Resources;

public class FS1VaseTileEntity extends vaseTileEntityRenderer {
    
	@Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) {

            GL11.glPushMatrix();

            GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);

            tileEntityRenderer.renderEngine.func_110577_a(Resources.MODEL_TEXTURE_VASE_FS1);
   
            GL11.glPushMatrix();
            GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
  
            this.model.render((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
 
            GL11.glPopMatrix();
            GL11.glPopMatrix();
    }
	
}
