package tech.Modjam.proxy;

import tech.Modjam.BLVaseTileEntity;
import tech.Modjam.FS1VaseTileEntity;
import tech.Modjam.GRVaseTileEntity;
import tech.Modjam.bk_VaseTileEntityRender;
import tech.Modjam.cy_VaseTileEntityRender;
import tech.Modjam.gy_VaseTileEntityRender;
import tech.Modjam.lm_VaseTileEntityRender;
import tech.Modjam.mg_VaseTileEntityRender;
import tech.Modjam.or_VaseTileEntityRender;
import tech.Modjam.pk_VaseTileEntityRender;
import tech.Modjam.pl_VaseTileEntityRender;
import tech.Modjam.rd_VaseTileEntityRender;
import tech.Modjam.vaseTileEntityRenderer;
import tech.Modjam.wh_VaseTileEntityRender;
import tech.Modjam.yl_VaseTileEntityRender;
import cpw.mods.fml.client.registry.ClientRegistry;

public class client extends common {
	
	@Override
	public void initSounds() {
		//init all the sounds
	}

	@Override
	public void initRenderers() {
		ClientRegistry.bindTileEntitySpecialRenderer(tech.Modjam.VaseTileEntity.class, new vaseTileEntityRenderer());
		ClientRegistry.bindTileEntitySpecialRenderer(tech.Modjam.gr_VaseTileEntity.class, new GRVaseTileEntity());
		ClientRegistry.bindTileEntitySpecialRenderer(tech.Modjam.bl_VaseTileEntity.class, new BLVaseTileEntity());
		ClientRegistry.bindTileEntitySpecialRenderer(tech.Modjam.fs1_VaseTileEntity.class, new FS1VaseTileEntity());
		ClientRegistry.bindTileEntitySpecialRenderer(tech.Modjam.bk_VaseTileEntity.class, new bk_VaseTileEntityRender());
		ClientRegistry.bindTileEntitySpecialRenderer(tech.Modjam.cy_VaseTileEntity.class, new cy_VaseTileEntityRender());
		ClientRegistry.bindTileEntitySpecialRenderer(tech.Modjam.gy_VaseTileEntity.class, new gy_VaseTileEntityRender());
		ClientRegistry.bindTileEntitySpecialRenderer(tech.Modjam.lm_VaseTileEntity.class, new lm_VaseTileEntityRender());
		ClientRegistry.bindTileEntitySpecialRenderer(tech.Modjam.mg_VaseTileEntity.class, new mg_VaseTileEntityRender());
		ClientRegistry.bindTileEntitySpecialRenderer(tech.Modjam.or_VaseTileEntity.class, new or_VaseTileEntityRender());
		ClientRegistry.bindTileEntitySpecialRenderer(tech.Modjam.pk_VaseTileEntity.class, new pk_VaseTileEntityRender());
		ClientRegistry.bindTileEntitySpecialRenderer(tech.Modjam.pl_VaseTileEntity.class, new pl_VaseTileEntityRender());
		ClientRegistry.bindTileEntitySpecialRenderer(tech.Modjam.rd_VaseTileEntity.class, new rd_VaseTileEntityRender());
		ClientRegistry.bindTileEntitySpecialRenderer(tech.Modjam.wh_VaseTileEntity.class, new wh_VaseTileEntityRender());
		ClientRegistry.bindTileEntitySpecialRenderer(tech.Modjam.yl_VaseTileEntity.class, new yl_VaseTileEntityRender());
		
	}	
	
}
