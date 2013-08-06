package tech.Modjam;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class vase_clay extends Item {

	public vase_clay(int par1) {
		super(par1);

	}
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ir)
    {
    this.itemIcon = ir.registerIcon( "vasemod:vase_clay");
    }
}
