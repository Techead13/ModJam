package tech.Modjam;

import tech.Modjam.proxy.common;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.*;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;




@Mod(modid = "vasemod", name = "Vase Mod", version = "0.4")

@NetworkMod(clientSideRequired = true, serverSideRequired = false)



public class vaseMain {


	
	public static final String modid = "vasemod";
	
	public static Block vase_brown;
	
	public static Block vase_green;
	
	public static Block vase_blue;
	
	public static Block vase_fs1;
	
	public static Block vase_black;
	
	public static Block vase_cyan;
	
	public static Block vase_gray;
	
	public static Block vase_lime;
	
	public static Block vase_magenta;
	
	public static Block vase_orange;
	
	public static Block vase_pink;
	
	public static Block vase_purple;
	
	public static Block vase_red;
	
	public static Block vase_white;
	
	public static Block vase_yellow;
	
	public static Item vase_clay;
	

	
	@SidedProxy(clientSide = "tech.Modjam.proxy.client", serverSide = "tech.Modjam.proxy.common")
	public static common proxy;


	@Instance("vasemod")
    public static vaseMain instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		
		proxy.initSounds();

	}
	
	

	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		
		//block registration
		
		vase_brown = new vase_brown(696).setUnlocalizedName("vase").setCreativeTab(CreativeTabs.tabDecorations).setHardness(0.2f);
		
		vase_blue = new vase_blue(697).setUnlocalizedName("vase2").setCreativeTab(CreativeTabs.tabDecorations).setHardness(0.2f);
		
		vase_green = new vase_green(698).setUnlocalizedName("vase3").setCreativeTab(CreativeTabs.tabDecorations).setHardness(0.2f);
		
		vase_fs1 = new vase_fs1(699).setUnlocalizedName("vase4").setCreativeTab(CreativeTabs.tabDecorations).setHardness(0.2f);
		
		vase_black = new vase_black(700).setUnlocalizedName("vase5").setCreativeTab(CreativeTabs.tabDecorations).setHardness(0.2f);
		
		vase_gray = new vase_gray(701).setUnlocalizedName("vase6").setCreativeTab(CreativeTabs.tabDecorations).setHardness(0.2f);
		
		vase_lime = new vase_lime(702).setUnlocalizedName("vase7").setCreativeTab(CreativeTabs.tabDecorations).setHardness(0.2f);
		
		vase_magenta = new vase_magenta(703).setUnlocalizedName("vase8").setCreativeTab(CreativeTabs.tabDecorations).setHardness(0.2f);
		
		vase_orange = new vase_orange(704).setUnlocalizedName("vase9").setCreativeTab(CreativeTabs.tabDecorations).setHardness(0.2f);
		
		vase_pink = new vase_pink(705).setUnlocalizedName("vase10").setCreativeTab(CreativeTabs.tabDecorations).setHardness(0.2f);
		
		vase_purple = new vase_purple(706).setUnlocalizedName("vase11").setCreativeTab(CreativeTabs.tabDecorations).setHardness(0.2f);
		
		vase_red = new vase_red(707).setUnlocalizedName("vase12").setCreativeTab(CreativeTabs.tabDecorations).setHardness(0.2f);
		
		vase_cyan = new vase_cyan(708).setUnlocalizedName("vase13").setCreativeTab(CreativeTabs.tabDecorations).setHardness(0.2f);
		
		vase_white = new vase_white(709).setUnlocalizedName("vase14").setCreativeTab(CreativeTabs.tabDecorations).setHardness(0.2f);
		
		vase_yellow = new vase_yellow(710).setUnlocalizedName("vase15").setCreativeTab(CreativeTabs.tabDecorations).setHardness(0.2f);
		
		vase_fs1 = new vase_fs1(711).setUnlocalizedName("vase16").setCreativeTab(CreativeTabs.tabDecorations).setHardness(0.2f);
		
		vase_brown = new vase_brown(712).setUnlocalizedName("vase17").setCreativeTab(CreativeTabs.tabDecorations).setHardness(0.2f);
		
		vase_blue= new vase_blue(713).setUnlocalizedName("vase18").setCreativeTab(CreativeTabs.tabDecorations).setHardness(0.2f);
		
		vase_green = new vase_green(714).setUnlocalizedName("vase19").setCreativeTab(CreativeTabs.tabDecorations).setHardness(0.2f);
       
		
		// item 
		
        vase_clay = new vase_clay(5100).setUnlocalizedName("clayVase").setMaxStackSize(16).setCreativeTab(CreativeTabs.tabMaterials);
		
		
        
        //gui registration :D
        
        NetworkRegistry.instance().registerGuiHandler(this, new vase_guiHandler());
        

        
        
		// tile entity registration
		
		GameRegistry.registerTileEntity(VaseTileEntity.class, "vaseTileEntity");
		
		GameRegistry.registerTileEntity(gr_VaseTileEntity.class, "gr_vaseTileEntity");
		
		GameRegistry.registerTileEntity(bl_VaseTileEntity.class, "bl_vaseTileEntity");
		
		GameRegistry.registerTileEntity(fs1_VaseTileEntity.class, "fs1_vaseTileEntity");
		
		GameRegistry.registerTileEntity(bk_VaseTileEntity.class, "bk_VaseTileEntity");
		
		GameRegistry.registerTileEntity(cy_VaseTileEntity.class, "cy_VaseTileEntity");
		
		GameRegistry.registerTileEntity(gy_VaseTileEntity.class, "gy_VaseTileEntity");
		
		GameRegistry.registerTileEntity(lm_VaseTileEntity.class, "lm_VaseTileEntity");
		
		GameRegistry.registerTileEntity(mg_VaseTileEntity.class, "mg_VaseTileEntity");
		
		GameRegistry.registerTileEntity(or_VaseTileEntity.class, "or_VaseTileEntity");
		
		GameRegistry.registerTileEntity(pk_VaseTileEntity.class, "pk_VaseTileEntity");
		
		GameRegistry.registerTileEntity(pl_VaseTileEntity.class, "pl_VaseTileEntity");
		
		GameRegistry.registerTileEntity(rd_VaseTileEntity.class, "rd_VaseTileEntity");
		
		GameRegistry.registerTileEntity(wh_VaseTileEntity.class, "wh_VaseTileEntity");
		
		GameRegistry.registerTileEntity(yl_VaseTileEntity.class, "yl_VaseTileEntity");
		
		//items
		
		LanguageRegistry.addName(vase_clay, "Clay Vase");
		

		
		proxy.initRenderers();
		
		
		// more registration stuff
		
		LanguageRegistry.addName(vase_brown, "Brown Vase");
		
		GameRegistry.registerBlock(vase_brown, "vaseBrown");
	
		LanguageRegistry.addName(vase_blue, "Blue Vase");
		
		GameRegistry.registerBlock(vase_blue, "vaseBlue");
		
		LanguageRegistry.addName(vase_green, "Green Vase");
		
		GameRegistry.registerBlock(vase_green, "vaseGreen");
		
		LanguageRegistry.addName(vase_fs1, "Special Vase");
		
		GameRegistry.registerBlock(vase_fs1, "vaseFs1");
		
		LanguageRegistry.addName(vase_black, "Black Vase");
		
		GameRegistry.registerBlock(vase_black, "vaseBlack");
	
		LanguageRegistry.addName(vase_gray, "Gray Vase");
		
		GameRegistry.registerBlock(vase_gray, "vaseGray");
		
		LanguageRegistry.addName(vase_cyan, "Cyan Vase");
		
		GameRegistry.registerBlock(vase_cyan, "vaseCyan");
		
		LanguageRegistry.addName(vase_lime, "Lime Vase");
		
		GameRegistry.registerBlock(vase_lime, "vaseLime");
		
		LanguageRegistry.addName(vase_magenta, "Magenta Vase");
		
		GameRegistry.registerBlock(vase_magenta, "vaseMagenta");
	
		LanguageRegistry.addName(vase_orange, "Orange Vase");
		
		GameRegistry.registerBlock(vase_orange, "vaseOrange");
		
		LanguageRegistry.addName(vase_pink, "Pink Vase");
		
		GameRegistry.registerBlock(vase_pink, "vasePink");
		
		LanguageRegistry.addName(vase_purple, "Purple Vase");
		
		GameRegistry.registerBlock(vase_purple, "vasePurple");
		
		LanguageRegistry.addName(vase_red, "Red Vase");
		
		GameRegistry.registerBlock(vase_red, "vaseRed");
	
		LanguageRegistry.addName(vase_white, "White Vase");
		
		GameRegistry.registerBlock(vase_white, "vaseWhite");
		
		LanguageRegistry.addName(vase_yellow, "Yellow Vase");
		
		GameRegistry.registerBlock(vase_yellow, "vaseYellow");

	
		//recipes (Yay!)
		
	  GameRegistry.addSmelting(vase_clay.itemID, new ItemStack(vase_brown, 1), 0.3F);
		
		
	  
	  
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_white), new Object[]
			    {
			     new ItemStack(vase_brown), new ItemStack(Item.dyePowder, 1, 15)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_white), new Object[]
			    {
			     new ItemStack(vase_black), new ItemStack(Item.dyePowder, 1, 15)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_white), new Object[]
			    {
			     new ItemStack(vase_blue), new ItemStack(Item.dyePowder, 1, 15)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_white), new Object[]
			    {
			     new ItemStack(vase_cyan), new ItemStack(Item.dyePowder, 1, 15)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_white), new Object[]
			    {
			     new ItemStack(vase_gray), new ItemStack(Item.dyePowder, 1, 15)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_white), new Object[]
			    {
			     new ItemStack(vase_green), new ItemStack(Item.dyePowder, 1, 15)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_white), new Object[]
			    {
			     new ItemStack(vase_lime), new ItemStack(Item.dyePowder, 1, 15)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_white), new Object[]
			    {
			     new ItemStack(vase_magenta), new ItemStack(Item.dyePowder, 1, 15)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_white), new Object[]
			    {
			     new ItemStack(vase_orange), new ItemStack(Item.dyePowder, 1, 15)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_white), new Object[]
			    {
			     new ItemStack(vase_pink), new ItemStack(Item.dyePowder, 1, 15)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_white), new Object[]
			    {
			     new ItemStack(vase_purple), new ItemStack(Item.dyePowder, 1, 15)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_white), new Object[]
			    {
			     new ItemStack(vase_red), new ItemStack(Item.dyePowder, 1, 15)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_white), new Object[]
			    {
			     new ItemStack(vase_white), new ItemStack(Item.dyePowder, 1, 15)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_white), new Object[]
			    {
			     new ItemStack(vase_yellow), new ItemStack(Item.dyePowder, 1, 15)
			    });

	 // there was probably a faster way to do this. Oh well
	  
	  
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_black), new Object[]
			    {
			     new ItemStack(vase_brown), new ItemStack(Item.dyePowder, 1)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_black), new Object[]
			    {
			     new ItemStack(vase_white), new ItemStack(Item.dyePowder, 1)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_black), new Object[]
			    {
			     new ItemStack(vase_blue), new ItemStack(Item.dyePowder, 1)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_black), new Object[]
			    {
			     new ItemStack(vase_cyan), new ItemStack(Item.dyePowder, 1)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_black), new Object[]
			    {
			     new ItemStack(vase_gray), new ItemStack(Item.dyePowder, 1)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_black), new Object[]
			    {
			     new ItemStack(vase_green), new ItemStack(Item.dyePowder, 1)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_black), new Object[]
			    {
			     new ItemStack(vase_lime), new ItemStack(Item.dyePowder, 1)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_black), new Object[]
			    {
			     new ItemStack(vase_magenta), new ItemStack(Item.dyePowder, 1)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_black), new Object[]
			    {
			     new ItemStack(vase_orange), new ItemStack(Item.dyePowder, 1)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_black), new Object[]
			    {
			     new ItemStack(vase_pink), new ItemStack(Item.dyePowder, 1)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_black), new Object[]
			    {
			     new ItemStack(vase_purple), new ItemStack(Item.dyePowder, 1)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_black), new Object[]
			    {
			     new ItemStack(vase_red), new ItemStack(Item.dyePowder, 1)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_black), new Object[]
			    {
			     new ItemStack(vase_white), new ItemStack(Item.dyePowder, 1)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_black), new Object[]
			    {
			     new ItemStack(vase_yellow), new ItemStack(Item.dyePowder, 1)
			    });
	  

	  GameRegistry.addShapelessRecipe(new ItemStack(vase_blue), new Object[]
			    {
			     new ItemStack(vase_brown), new ItemStack(Item.dyePowder, 1, 4)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_blue), new Object[]
			    {
			     new ItemStack(vase_black), new ItemStack(Item.dyePowder, 1, 4)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_blue), new Object[]
			    {
			     new ItemStack(vase_white), new ItemStack(Item.dyePowder, 1, 4)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_blue), new Object[]
			    {
			     new ItemStack(vase_cyan), new ItemStack(Item.dyePowder, 1, 4)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_blue), new Object[]
			    {
			     new ItemStack(vase_gray), new ItemStack(Item.dyePowder, 1, 4)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_blue), new Object[]
			    {
			     new ItemStack(vase_green), new ItemStack(Item.dyePowder, 1, 4)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_blue), new Object[]
			    {
			     new ItemStack(vase_lime), new ItemStack(Item.dyePowder, 1, 4)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_blue), new Object[]
			    {
			     new ItemStack(vase_magenta), new ItemStack(Item.dyePowder, 1, 4)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_blue), new Object[]
			    {
			     new ItemStack(vase_orange), new ItemStack(Item.dyePowder, 1, 4)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_blue), new Object[]
			    {
			     new ItemStack(vase_pink), new ItemStack(Item.dyePowder, 1, 4)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_blue), new Object[]
			    {
			     new ItemStack(vase_purple), new ItemStack(Item.dyePowder, 1, 4)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_blue), new Object[]
			    {
			     new ItemStack(vase_red), new ItemStack(Item.dyePowder, 1, 4)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_blue), new Object[]
			    {
			     new ItemStack(vase_white), new ItemStack(Item.dyePowder, 1, 4)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_blue), new Object[]
			    {
			     new ItemStack(vase_yellow), new ItemStack(Item.dyePowder, 1, 4)
			    });
	  
	 
	  
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_brown), new Object[]
			    {
			     new ItemStack(vase_blue), new ItemStack(Item.dyePowder, 1, 3)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_brown), new Object[]
			    {
			     new ItemStack(vase_black), new ItemStack(Item.dyePowder, 1, 3)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_brown), new Object[]
			    {
			     new ItemStack(vase_white), new ItemStack(Item.dyePowder, 1, 3)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_brown), new Object[]
			    {
			     new ItemStack(vase_cyan), new ItemStack(Item.dyePowder, 1, 3)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_brown), new Object[]
			    {
			     new ItemStack(vase_gray), new ItemStack(Item.dyePowder, 1, 3)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_brown), new Object[]
			    {
			     new ItemStack(vase_green), new ItemStack(Item.dyePowder, 1, 3)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_brown), new Object[]
			    {
			     new ItemStack(vase_lime), new ItemStack(Item.dyePowder, 1, 3)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_brown), new Object[]
			    {
			     new ItemStack(vase_magenta), new ItemStack(Item.dyePowder, 1, 3)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_brown), new Object[]
			    {
			     new ItemStack(vase_orange), new ItemStack(Item.dyePowder, 1, 3)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_brown), new Object[]
			    {
			     new ItemStack(vase_pink), new ItemStack(Item.dyePowder, 1, 3)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_brown), new Object[]
			    {
			     new ItemStack(vase_purple), new ItemStack(Item.dyePowder, 1, 3)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_brown), new Object[]
			    {
			     new ItemStack(vase_red), new ItemStack(Item.dyePowder, 1, 3)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_brown), new Object[]
			    {
			     new ItemStack(vase_white), new ItemStack(Item.dyePowder, 1, 3)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_brown), new Object[]
			    {
			     new ItemStack(vase_yellow), new ItemStack(Item.dyePowder, 1, 3)
			    });
	  
	  
	  
	  
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_cyan), new Object[]
			    {
			     new ItemStack(vase_blue), new ItemStack(Item.dyePowder, 1, 6)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_cyan), new Object[]
			    {
			     new ItemStack(vase_black), new ItemStack(Item.dyePowder, 1, 6)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_cyan), new Object[]
			    {
			     new ItemStack(vase_white), new ItemStack(Item.dyePowder, 1, 6)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_cyan), new Object[]
			    {
			     new ItemStack(vase_brown), new ItemStack(Item.dyePowder, 1, 6)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_cyan), new Object[]
			    {
			     new ItemStack(vase_gray), new ItemStack(Item.dyePowder, 1, 6)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_cyan), new Object[]
			    {
			     new ItemStack(vase_green), new ItemStack(Item.dyePowder, 1, 6)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_cyan), new Object[]
			    {
			     new ItemStack(vase_lime), new ItemStack(Item.dyePowder, 1, 6)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_cyan), new Object[]
			    {
			     new ItemStack(vase_magenta), new ItemStack(Item.dyePowder, 1, 6)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_cyan), new Object[]
			    {
			     new ItemStack(vase_orange), new ItemStack(Item.dyePowder, 1, 6)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_cyan), new Object[]
			    {
			     new ItemStack(vase_pink), new ItemStack(Item.dyePowder, 1, 6)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_cyan), new Object[]
			    {
			     new ItemStack(vase_purple), new ItemStack(Item.dyePowder, 1, 6)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_cyan), new Object[]
			    {
			     new ItemStack(vase_red), new ItemStack(Item.dyePowder, 1, 6)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_cyan), new Object[]
			    {
			     new ItemStack(vase_white), new ItemStack(Item.dyePowder, 1, 6)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_cyan), new Object[]
			    {
			     new ItemStack(vase_yellow), new ItemStack(Item.dyePowder, 1, 6)
			    });
	  
	  
	  
	  
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_gray), new Object[]
			    {
			     new ItemStack(vase_blue), new ItemStack(Item.dyePowder, 1, 8)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_gray), new Object[]
			    {
			     new ItemStack(vase_black), new ItemStack(Item.dyePowder, 1, 8)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_gray), new Object[]
			    {
			     new ItemStack(vase_white), new ItemStack(Item.dyePowder, 1, 8)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_gray), new Object[]
			    {
			     new ItemStack(vase_brown), new ItemStack(Item.dyePowder, 1, 8)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_gray), new Object[]
			    {
			     new ItemStack(vase_cyan), new ItemStack(Item.dyePowder, 1, 8)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_gray), new Object[]
			    {
			     new ItemStack(vase_green), new ItemStack(Item.dyePowder, 1, 8)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_gray), new Object[]
			    {
			     new ItemStack(vase_lime), new ItemStack(Item.dyePowder, 1, 8)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_gray), new Object[]
			    {
			     new ItemStack(vase_magenta), new ItemStack(Item.dyePowder, 1, 8)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_gray), new Object[]
			    {
			     new ItemStack(vase_orange), new ItemStack(Item.dyePowder, 1, 8)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_gray), new Object[]
			    {
			     new ItemStack(vase_pink), new ItemStack(Item.dyePowder, 1, 8)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_gray), new Object[]
			    {
			     new ItemStack(vase_purple), new ItemStack(Item.dyePowder, 1, 8)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_gray), new Object[]
			    {
			     new ItemStack(vase_red), new ItemStack(Item.dyePowder, 1, 8)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_gray), new Object[]
			    {
			     new ItemStack(vase_white), new ItemStack(Item.dyePowder, 1, 8)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_gray), new Object[]
			    {
			     new ItemStack(vase_yellow), new ItemStack(Item.dyePowder, 1, 8)
			    });
	  
	  
	  
	  
	  
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_green), new Object[]
			    {
			     new ItemStack(vase_blue), new ItemStack(Item.dyePowder, 1, 2)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_green), new Object[]
			    {
			     new ItemStack(vase_black), new ItemStack(Item.dyePowder, 1, 2)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_green), new Object[]
			    {
			     new ItemStack(vase_white), new ItemStack(Item.dyePowder, 1, 2)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_green), new Object[]
			    {
			     new ItemStack(vase_brown), new ItemStack(Item.dyePowder, 1, 2)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_green), new Object[]
			    {
			     new ItemStack(vase_cyan), new ItemStack(Item.dyePowder, 1, 2)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_green), new Object[]
			    {
			     new ItemStack(vase_gray), new ItemStack(Item.dyePowder, 1, 2)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_green), new Object[]
			    {
			     new ItemStack(vase_lime), new ItemStack(Item.dyePowder, 1, 2)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_green), new Object[]
			    {
			     new ItemStack(vase_magenta), new ItemStack(Item.dyePowder, 1, 2)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_green), new Object[]
			    {
			     new ItemStack(vase_orange), new ItemStack(Item.dyePowder, 1, 2)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_green), new Object[]
			    {
			     new ItemStack(vase_pink), new ItemStack(Item.dyePowder, 1, 2)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_green), new Object[]
			    {
			     new ItemStack(vase_purple), new ItemStack(Item.dyePowder, 1, 2)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_green), new Object[]
			    {
			     new ItemStack(vase_red), new ItemStack(Item.dyePowder, 1, 2)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_green), new Object[]
			    {
			     new ItemStack(vase_white), new ItemStack(Item.dyePowder, 1, 2)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_green), new Object[]
			    {
			     new ItemStack(vase_yellow), new ItemStack(Item.dyePowder, 1, 2)
			    });
	  
	  
	  // lC tech is unhappy & tired of this copying and pasting garbage
	  
	
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_lime), new Object[]
			    {
			     new ItemStack(vase_blue), new ItemStack(Item.dyePowder, 1, 10)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_lime), new Object[]
			    {
			     new ItemStack(vase_black), new ItemStack(Item.dyePowder, 1, 10)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_lime), new Object[]
			    {
			     new ItemStack(vase_white), new ItemStack(Item.dyePowder, 1, 10)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_lime), new Object[]
			    {
			     new ItemStack(vase_brown), new ItemStack(Item.dyePowder, 1, 10)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_lime), new Object[]
			    {
			     new ItemStack(vase_cyan), new ItemStack(Item.dyePowder, 1, 10)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_lime), new Object[]
			    {
			     new ItemStack(vase_gray), new ItemStack(Item.dyePowder, 1, 10)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_green), new Object[]
			    {
			     new ItemStack(vase_green), new ItemStack(Item.dyePowder, 1, 10)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_lime), new Object[]
			    {
			     new ItemStack(vase_magenta), new ItemStack(Item.dyePowder, 1, 10)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_lime), new Object[]
			    {
			     new ItemStack(vase_orange), new ItemStack(Item.dyePowder, 1, 10)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_lime), new Object[]
			    {
			     new ItemStack(vase_pink), new ItemStack(Item.dyePowder, 1, 10)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_lime), new Object[]
			    {
			     new ItemStack(vase_purple), new ItemStack(Item.dyePowder, 1, 10)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_lime), new Object[]
			    {
			     new ItemStack(vase_red), new ItemStack(Item.dyePowder, 1, 10)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_lime), new Object[]
			    {
			     new ItemStack(vase_white), new ItemStack(Item.dyePowder, 1, 10)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_lime), new Object[]
			    {
			     new ItemStack(vase_yellow), new ItemStack(Item.dyePowder, 1, 10)
			    });
	  
	
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_magenta), new Object[]
			    {
			     new ItemStack(vase_blue), new ItemStack(Item.dyePowder, 1, 13)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_magenta), new Object[]
			    {
			     new ItemStack(vase_black), new ItemStack(Item.dyePowder, 1, 13)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_magenta), new Object[]
			    {
			     new ItemStack(vase_white), new ItemStack(Item.dyePowder, 1, 13)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_magenta), new Object[]
			    {
			     new ItemStack(vase_brown), new ItemStack(Item.dyePowder, 1, 13)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_magenta), new Object[]
			    {
			     new ItemStack(vase_cyan), new ItemStack(Item.dyePowder, 1, 13)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_magenta), new Object[]
			    {
			     new ItemStack(vase_gray), new ItemStack(Item.dyePowder, 1, 13)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_magenta), new Object[]
			    {
			     new ItemStack(vase_green), new ItemStack(Item.dyePowder, 1, 13)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_magenta), new Object[]
			    {
			     new ItemStack(vase_lime), new ItemStack(Item.dyePowder, 1, 13)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_magenta), new Object[]
			    {
			     new ItemStack(vase_orange), new ItemStack(Item.dyePowder, 1, 13)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_magenta), new Object[]
			    {
			     new ItemStack(vase_pink), new ItemStack(Item.dyePowder, 1, 13)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_magenta), new Object[]
			    {
			     new ItemStack(vase_purple), new ItemStack(Item.dyePowder, 1, 13)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_magenta), new Object[]
			    {
			     new ItemStack(vase_red), new ItemStack(Item.dyePowder, 1, 13)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_magenta), new Object[]
			    {
			     new ItemStack(vase_white), new ItemStack(Item.dyePowder, 1, 13)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_magenta), new Object[]
			    {
			     new ItemStack(vase_yellow), new ItemStack(Item.dyePowder, 1, 13)
			    });
	
	
	
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_orange), new Object[]
			    {
			     new ItemStack(vase_blue), new ItemStack(Item.dyePowder, 1, 14)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_orange), new Object[]
			    {
			     new ItemStack(vase_black), new ItemStack(Item.dyePowder, 1, 14)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_orange), new Object[]
			    {
			     new ItemStack(vase_white), new ItemStack(Item.dyePowder, 1, 14)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_orange), new Object[]
			    {
			     new ItemStack(vase_brown), new ItemStack(Item.dyePowder, 1, 14)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_orange), new Object[]
			    {
			     new ItemStack(vase_cyan), new ItemStack(Item.dyePowder, 1, 14)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_orange), new Object[]
			    {
			     new ItemStack(vase_gray), new ItemStack(Item.dyePowder, 1, 14)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_orange), new Object[]
			    {
			     new ItemStack(vase_green), new ItemStack(Item.dyePowder, 1, 14)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_orange), new Object[]
			    {
			     new ItemStack(vase_lime), new ItemStack(Item.dyePowder, 1, 14)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_orange), new Object[]
			    {
			     new ItemStack(vase_magenta), new ItemStack(Item.dyePowder, 1, 14)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_orange), new Object[]
			    {
			     new ItemStack(vase_pink), new ItemStack(Item.dyePowder, 1, 14)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_orange), new Object[]
			    {
			     new ItemStack(vase_purple), new ItemStack(Item.dyePowder, 1, 14)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_orange), new Object[]
			    {
			     new ItemStack(vase_red), new ItemStack(Item.dyePowder, 1, 14)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_orange), new Object[]
			    {
			     new ItemStack(vase_white), new ItemStack(Item.dyePowder, 1, 14)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_orange), new Object[]
			    {
			     new ItemStack(vase_yellow), new ItemStack(Item.dyePowder, 1, 14)
			    });
	
	
	  
	  
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_pink), new Object[]
			    {
			     new ItemStack(vase_blue), new ItemStack(Item.dyePowder, 1, 9)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_pink), new Object[]
			    {
			     new ItemStack(vase_black), new ItemStack(Item.dyePowder, 1, 9)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_pink), new Object[]
			    {
			     new ItemStack(vase_white), new ItemStack(Item.dyePowder, 1, 9)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_pink), new Object[]
			    {
			     new ItemStack(vase_brown), new ItemStack(Item.dyePowder, 1, 9)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_pink), new Object[]
			    {
			     new ItemStack(vase_cyan), new ItemStack(Item.dyePowder, 1, 9)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_pink), new Object[]
			    {
			     new ItemStack(vase_gray), new ItemStack(Item.dyePowder, 1, 9)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_pink), new Object[]
			    {
			     new ItemStack(vase_lime), new ItemStack(Item.dyePowder, 1, 9)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_pink), new Object[]
			    {
			     new ItemStack(vase_magenta), new ItemStack(Item.dyePowder, 1, 9)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_pink), new Object[]
			    {
			     new ItemStack(vase_orange), new ItemStack(Item.dyePowder, 1, 9)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_pink), new Object[]
			    {
			     new ItemStack(vase_green), new ItemStack(Item.dyePowder, 1, 9)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_pink), new Object[]
			    {
			     new ItemStack(vase_purple), new ItemStack(Item.dyePowder, 1, 9)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_pink), new Object[]
			    {
			     new ItemStack(vase_red), new ItemStack(Item.dyePowder, 1, 9)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_pink), new Object[]
			    {
			     new ItemStack(vase_white), new ItemStack(Item.dyePowder, 1, 9)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_pink), new Object[]
			    {
			     new ItemStack(vase_yellow), new ItemStack(Item.dyePowder, 1, 9)
			    });
	
	
	  
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_purple), new Object[]
			    {
			     new ItemStack(vase_blue), new ItemStack(Item.dyePowder, 1, 5)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_purple), new Object[]
			    {
			     new ItemStack(vase_black), new ItemStack(Item.dyePowder, 1, 5)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_purple), new Object[]
			    {
			     new ItemStack(vase_white), new ItemStack(Item.dyePowder, 1, 5)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_purple), new Object[]
			    {
			     new ItemStack(vase_brown), new ItemStack(Item.dyePowder, 1, 5)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_purple), new Object[]
			    {
			     new ItemStack(vase_cyan), new ItemStack(Item.dyePowder, 1, 5)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_purple), new Object[]
			    {
			     new ItemStack(vase_gray), new ItemStack(Item.dyePowder, 1, 5)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_purple), new Object[]
			    {
			     new ItemStack(vase_lime), new ItemStack(Item.dyePowder, 1, 5)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_purple), new Object[]
			    {
			     new ItemStack(vase_magenta), new ItemStack(Item.dyePowder, 1, 5)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_purple), new Object[]
			    {
			     new ItemStack(vase_orange), new ItemStack(Item.dyePowder, 1, 5)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_purple), new Object[]
			    {
			     new ItemStack(vase_green), new ItemStack(Item.dyePowder, 1, 5)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_purple), new Object[]
			    {
			     new ItemStack(vase_pink), new ItemStack(Item.dyePowder, 1, 5)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_purple), new Object[]
			    {
			     new ItemStack(vase_red), new ItemStack(Item.dyePowder, 1, 5)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_purple), new Object[]
			    {
			     new ItemStack(vase_white), new ItemStack(Item.dyePowder, 1, 5)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_purple), new Object[]
			    {
			     new ItemStack(vase_yellow), new ItemStack(Item.dyePowder, 1, 5)
			    });
	
	
	
	
	
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_yellow), new Object[]
			    {
			     new ItemStack(vase_blue), new ItemStack(Item.dyePowder, 1, 11)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_yellow), new Object[]
			    {
			     new ItemStack(vase_black), new ItemStack(Item.dyePowder, 1, 11)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_yellow), new Object[]
			    {
			     new ItemStack(vase_white), new ItemStack(Item.dyePowder, 1, 11)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_yellow), new Object[]
			    {
			     new ItemStack(vase_brown), new ItemStack(Item.dyePowder, 1, 11)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_yellow), new Object[]
			    {
			     new ItemStack(vase_cyan), new ItemStack(Item.dyePowder, 1, 11)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_yellow), new Object[]
			    {
			     new ItemStack(vase_gray), new ItemStack(Item.dyePowder, 1, 11)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_yellow), new Object[]
			    {
			     new ItemStack(vase_green), new ItemStack(Item.dyePowder, 1, 11)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_yellow), new Object[]
			    {
			     new ItemStack(vase_lime), new ItemStack(Item.dyePowder, 1, 11)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_yellow), new Object[]
			    {
			     new ItemStack(vase_magenta), new ItemStack(Item.dyePowder, 1, 11)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_yellow), new Object[]
			    {
			     new ItemStack(vase_pink), new ItemStack(Item.dyePowder, 1, 11)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_yellow), new Object[]
			    {
			     new ItemStack(vase_purple), new ItemStack(Item.dyePowder, 1, 11)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_yellow), new Object[]
			    {
			     new ItemStack(vase_red), new ItemStack(Item.dyePowder, 1, 11)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_yellow), new Object[]
			    {
			     new ItemStack(vase_white), new ItemStack(Item.dyePowder, 1, 11)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_yellow), new Object[]
			    {
			     new ItemStack(vase_orange), new ItemStack(Item.dyePowder, 1, 11)
			    });
	
	
	
	
	
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_red), new Object[]
			    {
			     new ItemStack(vase_blue), new ItemStack(Item.dyePowder, 1, 1)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_red), new Object[]
			    {
			     new ItemStack(vase_black), new ItemStack(Item.dyePowder, 1, 1)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_red), new Object[]
			    {
			     new ItemStack(vase_white), new ItemStack(Item.dyePowder, 1, 1)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_red), new Object[]
			    {
			     new ItemStack(vase_brown), new ItemStack(Item.dyePowder, 1, 1)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_red), new Object[]
			    {
			     new ItemStack(vase_cyan), new ItemStack(Item.dyePowder, 1, 1)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_red), new Object[]
			    {
			     new ItemStack(vase_gray), new ItemStack(Item.dyePowder, 1, 1)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_red), new Object[]
			    {
			     new ItemStack(vase_lime), new ItemStack(Item.dyePowder, 1, 1)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_red), new Object[]
			    {
			     new ItemStack(vase_magenta), new ItemStack(Item.dyePowder, 1, 1)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_red), new Object[]
			    {
			     new ItemStack(vase_orange), new ItemStack(Item.dyePowder, 1, 1)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_red), new Object[]
			    {
			     new ItemStack(vase_green), new ItemStack(Item.dyePowder, 1, 1)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_red), new Object[]
			    {
			     new ItemStack(vase_pink), new ItemStack(Item.dyePowder, 1, 1)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_red), new Object[]
			    {
			     new ItemStack(vase_purple), new ItemStack(Item.dyePowder, 1, 1)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_red), new Object[]
			    {
			     new ItemStack(vase_white), new ItemStack(Item.dyePowder, 1, 1)
			    });
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_red), new Object[]
			    {
			     new ItemStack(vase_yellow), new ItemStack(Item.dyePowder, 1, 1)
			    });
	
	
	  GameRegistry.addShapelessRecipe(new ItemStack(vase_red), new Object[]
			    {
			     new ItemStack(vase_yellow), new ItemStack(vase_red), new ItemStack(vase_blue)
			    });
	  
	  
	  GameRegistry.addRecipe(new ItemStack(vase_clay, 1), new Object[]
			    {
			     "XXX", "X X", " X ", 'X', Item.clay
			    });
	

	
	
	
	}
	
	
	
	
	
	
	
}

