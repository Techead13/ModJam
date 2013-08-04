package tech.Modjam.proxy;

import tech.Modjam.BLVaseTileEntity;
import tech.Modjam.FS1VaseTileEntity;
import tech.Modjam.GRVaseTileEntity;
import tech.Modjam.vaseTileEntityRenderer;
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
		
	}	
	
}
