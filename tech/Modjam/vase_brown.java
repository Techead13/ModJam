package tech.Modjam;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class vase_brown extends BlockContainer {


    public vase_brown(int id) {
            super(id, Material.iron);
    }


    @Override
    public TileEntity createNewTileEntity(World world) {
            return new VaseTileEntity();
    }
    

    @Override
    public int getRenderType() {
            return -1;
    }
    

    @Override
    public boolean isOpaqueCube() {
            return false;
    }
    

    public boolean renderAsNormalBlock() {
            return false;
    }
    
 

}
