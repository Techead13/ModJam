package tech.Modjam;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;

public class ModelVase extends ModelBase
{
  //fields
    ModelRenderer Bottom;
    ModelRenderer Middle;
    ModelRenderer Neck;
    ModelRenderer Top;
  
  public ModelVase()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Bottom = new ModelRenderer(this, 0, 21);
      Bottom.addBox(0F, 0F, 0F, 8, 3, 8);
      Bottom.setRotationPoint(-4F, 21F, -4F);
      Bottom.setTextureSize(64, 32);
      Bottom.mirror = true;
      setRotation(Bottom, 0F, 0F, 0F);
      Middle = new ModelRenderer(this, 0, 0);
      Middle.addBox(0F, 0F, -5F, 10, 8, 10);
      Middle.setRotationPoint(-5F, 14F, 0F);
      Middle.setTextureSize(64, 32);
      Middle.mirror = true;
      setRotation(Middle, 0F, 0F, 0F);
      Neck = new ModelRenderer(this, 0, 21);
      Neck.addBox(0F, 0F, 0F, 8, 2, 8);
      Neck.setRotationPoint(-4F, 12F, -4F);
      Neck.setTextureSize(64, 32);
      Neck.mirror = true;
      setRotation(Neck, 0F, 0F, 0F);
      Top = new ModelRenderer(this, 0, 0);
      Top.addBox(0F, 0F, -4F, 10, 1, 10);
      Top.setRotationPoint(-5F, 11F, -1F);
      Top.setTextureSize(64, 32);
      Top.mirror = true;
      setRotation(Top, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Bottom.render(f5);
    Middle.render(f5);
    Neck.render(f5);
    Top.render(f5);
  }
 
  public void renderModel(float f1)
  {
	    Bottom.render(f1);
	    Middle.render(f1);
	    Neck.render(f1);
	    Top.render(f1);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
  }

public void render(TileEntity tileentity, double d0, double d1, double d2,
		float f) {

	
}


}
