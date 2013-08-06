package tech.Modjam;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
public class vase_guiHandler implements IGuiHandler {

         @Override
         public Object getServerGuiElement(int id, EntityPlayer player, World world,
                                         int x, int y, int z) {
                         TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                         if(tileEntity instanceof VaseTileEntity){
                                         return new VaseContainer(player.inventory, (VaseTileEntity) tileEntity);
                         }
                         
                         else if(tileEntity instanceof yl_VaseTileEntity){
                        	 
                        	 return new yl_VaseContainer(player.inventory, (yl_VaseTileEntity) tileEntity);
                       
                         }
                         else if(tileEntity instanceof wh_VaseTileEntity){
                        	 
                        	 return new wh_VaseContainer(player.inventory, (wh_VaseTileEntity) tileEntity);
                       
                         }
                         else if(tileEntity instanceof rd_VaseTileEntity){
                        	 
                        	 return new rd_VaseContainer(player.inventory, (rd_VaseTileEntity) tileEntity);
                       
                         }
                         else if(tileEntity instanceof pl_VaseTileEntity){
                        	 
                        	 return new pl_VaseContainer(player.inventory, (pl_VaseTileEntity) tileEntity);
                       
                         }                         else if(tileEntity instanceof pk_VaseTileEntity){
                        	 
                        	 return new pk_VaseContainer(player.inventory, (pk_VaseTileEntity) tileEntity);
                       
                         }                         else if(tileEntity instanceof or_VaseTileEntity){
                        	 
                        	 return new or_VaseContainer(player.inventory, (or_VaseTileEntity) tileEntity);
                       
                         }                         else if(tileEntity instanceof mg_VaseTileEntity){
                        	 
                        	 return new mg_VaseContainer(player.inventory, (mg_VaseTileEntity) tileEntity);
                       
                         }                         else if(tileEntity instanceof lm_VaseTileEntity){
                        	 
                        	 return new lm_VaseContainer(player.inventory, (lm_VaseTileEntity) tileEntity);
                       
                         }                         else if(tileEntity instanceof gy_VaseTileEntity){
                        	 
                        	 return new gy_VaseContainer(player.inventory, (gy_VaseTileEntity) tileEntity);
                       
                         }                         else if(tileEntity instanceof gr_VaseTileEntity){
                        	 
                        	 return new gr_VaseContainer(player.inventory, (gr_VaseTileEntity) tileEntity);
                       
                         }                         else if(tileEntity instanceof fs1_VaseTileEntity){
                        	 
                        	 return new fs1_VaseContainer(player.inventory, (fs1_VaseTileEntity) tileEntity);
                       
                         }                         else if(tileEntity instanceof cy_VaseTileEntity){
                        	 
                        	 return new cy_VaseContainer(player.inventory, (cy_VaseTileEntity) tileEntity);
                       
                         }                         else if(tileEntity instanceof bl_VaseTileEntity){
                        	 
                        	 return new bl_VaseContainer(player.inventory, (bl_VaseTileEntity) tileEntity);
                       
                         }                         else if(tileEntity instanceof bk_VaseTileEntity){
                        	 
                        	 return new bk_vaseContainer(player.inventory, (bk_VaseTileEntity) tileEntity);
                       
                         }
                         
                         return null;
         }

         @Override
         public Object getClientGuiElement(int id, EntityPlayer player, World world,
                                         int x, int y, int z) {
                         TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                         if(tileEntity instanceof VaseTileEntity){
                                         return new Vase_gui(player.inventory, (VaseTileEntity) tileEntity);
                         }
                         
                         else if(tileEntity instanceof yl_VaseTileEntity){
                        	 
                        	 return new yl_gui(player.inventory, (yl_VaseTileEntity) tileEntity);
                       
                         }
                         else if(tileEntity instanceof wh_VaseTileEntity){
                        	 
                        	 return new wh_gui(player.inventory, (wh_VaseTileEntity) tileEntity);
                       
                         }
                         else if(tileEntity instanceof rd_VaseTileEntity){
                        	 
                        	 return new rd_gui(player.inventory, (rd_VaseTileEntity) tileEntity);
                       
                         }
                         else if(tileEntity instanceof pl_VaseTileEntity){
                        	 
                        	 return new pl_gui(player.inventory, (pl_VaseTileEntity) tileEntity);
                       
                         }
                         else if(tileEntity instanceof pk_VaseTileEntity){
                        	 
                        	 return new pk_gui(player.inventory, (pk_VaseTileEntity) tileEntity);
                       
                         }
                         else if(tileEntity instanceof or_VaseTileEntity){
                        	 
                        	 return new or_gui(player.inventory, (or_VaseTileEntity) tileEntity);
                       
                         }
                         else if(tileEntity instanceof mg_VaseTileEntity){
                        	 
                        	 return new mg_gui(player.inventory, (mg_VaseTileEntity) tileEntity);
                       
                         }
                         else if(tileEntity instanceof lm_VaseTileEntity){
                        	 
                        	 return new lm_gui(player.inventory, (lm_VaseTileEntity) tileEntity);
                       
                         }
                         else if(tileEntity instanceof gy_VaseTileEntity){
                        	 
                        	 return new gy_gui(player.inventory, (gy_VaseTileEntity) tileEntity);
                       
                         }
                         else if(tileEntity instanceof gr_VaseTileEntity){
                        	 
                        	 return new gr_gui(player.inventory, (gr_VaseTileEntity) tileEntity);
                       
                         }
                         else if(tileEntity instanceof fs1_VaseTileEntity){
                        	 
                        	 return new fs1_gui(player.inventory, (fs1_VaseTileEntity) tileEntity);
                       
                         }
                         else if(tileEntity instanceof cy_VaseTileEntity){
                        	 
                        	 return new cy_gui(player.inventory, (cy_VaseTileEntity) tileEntity);
                       
                         }
                         else if(tileEntity instanceof bl_VaseTileEntity){
                        	 
                        	 return new bl_gui(player.inventory, (bl_VaseTileEntity) tileEntity);
                       
                         }
                         else if(tileEntity instanceof bk_VaseTileEntity){
                        	 
                        	 return new bk_gui(player.inventory, (bk_VaseTileEntity) tileEntity);
                       
                         }
                         
                         return null;
         }
}
