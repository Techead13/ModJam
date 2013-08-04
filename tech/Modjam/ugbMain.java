package tech.Modjam;

import tech.Modjam.proxy.common;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.*;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


@Mod(modid = "ugbiomes", name = "Underground Biomes", version = "0.4")

@NetworkMod(clientSideRequired = true, serverSideRequired = false)



public class ugbMain {


	
	public static final String modid = "tech_ugbiomes";
	
	public static Block vase_brown;
	
	public static Block vase_green;
	
	public static Block vase_blue;
	
	public static Block vase_fs1;
	
	@SidedProxy(clientSide = "tech.Modjam.proxy.client", serverSide = "tech.Modjam.proxy.common")
	public static common proxy;

	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		
		proxy.initSounds();

	}
	
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		
		
		vase_brown = new vase_brown(696).setUnlocalizedName("vase").setCreativeTab(CreativeTabs.tabDecorations).setHardness(0.2f);
		
		vase_blue= new vase_blue(697).setUnlocalizedName("vase2").setCreativeTab(CreativeTabs.tabDecorations).setHardness(0.2f);
		
		vase_green = new vase_green(698).setUnlocalizedName("vase3").setCreativeTab(CreativeTabs.tabDecorations).setHardness(0.2f);
		
		vase_fs1 = new vase_fs1(699).setUnlocalizedName("vase4").setCreativeTab(CreativeTabs.tabDecorations).setHardness(0.2f);
		
		
		GameRegistry.registerTileEntity(VaseTileEntity.class, "vaseTileEntity");
		
		GameRegistry.registerTileEntity(gr_VaseTileEntity.class, "gr_vaseTileEntity");
		
		GameRegistry.registerTileEntity(bl_VaseTileEntity.class, "bl_vaseTileEntity");
		
		GameRegistry.registerTileEntity(fs1_VaseTileEntity.class, "fs1_vaseTileEntity");
		
		
		proxy.initRenderers();
		
		
		
		LanguageRegistry.addName(vase_brown, "Brown Vase");
		
		GameRegistry.registerBlock(vase_brown, "vaseBrown");
	
		LanguageRegistry.addName(vase_blue, "Blue Vase");
		
		GameRegistry.registerBlock(vase_blue, "vaseBlue");
		
		LanguageRegistry.addName(vase_green, "Green Vase");
		
		GameRegistry.registerBlock(vase_green, "vaseGreen");
		
		LanguageRegistry.addName(vase_fs1, "Special Vase");
		
		GameRegistry.registerBlock(vase_fs1, "vaseFs1");
	
	
	}
	
	
	
	
	
}

