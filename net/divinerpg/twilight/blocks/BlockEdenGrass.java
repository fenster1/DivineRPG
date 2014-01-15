package net.divinerpg.twilight.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.divinerpg.Reference;
import net.divinerpg.helper.DivineRPGTabs;
import net.divinerpg.helper.blocks.TwilightBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;

public class BlockEdenGrass extends Block {

	IIcon top;
	IIcon bottom;
	IIcon side;
	
    public BlockEdenGrass() {
        super(Material.field_151577_b);
        func_149647_a(DivineRPGTabs.blocks);
        func_149663_c("edenGrass");
        this.func_149675_a(true);
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon func_149691_a(int par1, int par2) {
        return par1 == 1 ? top : (par1 == 0 ? bottom : side);
    }
    
    @SideOnly(Side.CLIENT)
    public void func_149651_a(IIconRegister icon) {
        side = icon.registerIcon(Reference.prefix + "edengrass_side");
        top = icon.registerIcon(Reference.prefix + "edengrass_top");
        bottom = icon.registerIcon(Reference.prefix + "edendirt");
    }

    @Override
    public void func_149674_a(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (!par1World.isRemote)
        {
            if (par1World.getBlockLightValue(par2, par3 + 1, par4) < 4 && par1World.getBlockLightOpacity(par2, par3 + 1, par4) > 2)
            {
                par1World.func_147449_b(par2, par3, par4, TwilightBlocks.edenDirt);
            }
            else if (par1World.getBlockLightValue(par2, par3 + 1, par4) >= 9)
            {
                for (int l = 0; l < 4; ++l)
                {
                    int i1 = par2 + par5Random.nextInt(3) - 1;
                    int j1 = par3 + par5Random.nextInt(5) - 3;
                    int k1 = par4 + par5Random.nextInt(3) - 1;
                    Block l1 = par1World.func_147439_a(i1, j1 + 1, k1);

                    if (par1World.func_147439_a(i1, j1, k1) == TwilightBlocks.edenDirt && par1World.getBlockLightValue(i1, j1 + 1, k1) >= 4 && par1World.getBlockLightOpacity(i1, j1 + 1, k1) <= 2)
                    {
                        par1World.func_147449_b(i1, j1, k1, TwilightBlocks.edenGrass);
                    }
                }
            }
        }
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    @Override
    public Item func_149650_a(int par1, Random par2Random, int par3) {
        return Item.func_150898_a(TwilightBlocks.edenDirt);
    }
    
    public boolean func_149851_a(World world, int par1, int par2, int par3, boolean par4)
    {
        return true;
    }

    public boolean func_149852_a(World world, Random rand, int par1, int par2, int par3)
    {
        return true;
    }
}