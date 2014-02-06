package net.divinerpg.api.blocks;

import java.util.Random;

import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockModGrass extends BlockMod {

	IIcon top;
	IIcon bottom;
	IIcon side;
    Block grass;
    Block dirt;
	
    public BlockModGrass(Block Grass, Block Dirt, String name) {
        super(Material.grass);
        setCreativeTab(DivineRPGTabs.blocks);
        setName(name);
        this.setTickRandomly(true);
        grass = Grass;
        dirt = Dirt;
    }
    
    public static Item getBlock(Block b){
		return Item.getItemFromBlock(b);
	}
    
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int par1, int par2) {
        return par1 == 1 ? top : (par1 == 0 ? bottom : side);
    }
    
    @SideOnly(Side.CLIENT)
    public void getIcon(IIconRegister icon) {
        side = icon.registerIcon(getTextureName() + "Grass_side");
        top = icon.registerIcon(getTextureName() + "Grass_top");
        bottom = icon.registerIcon(getTextureName() + "Dirt");
    }

    @Override
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (!par1World.isRemote)
        {
            if (par1World.getBlockLightValue(par2, par3 + 1, par4) < 4 && par1World.getBlockLightOpacity(par2, par3 + 1, par4) > 2)
            {
                par1World.setBlock(par2, par3, par4, dirt);
            }
            else if (par1World.getBlockLightValue(par2, par3 + 1, par4) >= 9)
            {
                for (int l = 0; l < 4; ++l)
                {
                    int i1 = par2 + par5Random.nextInt(3) - 1;
                    int j1 = par3 + par5Random.nextInt(5) - 3;
                    int k1 = par4 + par5Random.nextInt(3) - 1;

                    if (par1World.getBlock(i1, j1, k1) == dirt && par1World.getBlockLightValue(i1, j1 + 1, k1) >= 4 && par1World.getBlockLightOpacity(i1, j1 + 1, k1) <= 2)
                    {
                        par1World.setBlock(i1, j1, k1, grass);
                    }
                }
            }
        }
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    @Override
    public Item getItemDropped(int par1, Random par2Random, int par3) {
        return getBlock(dirt);
    }
    
    public boolean func_149851_a(World p_149851_1_, int p_149851_2_, int p_149851_3_, int p_149851_4_, boolean p_149851_5_)
    {
        return true;
    }

    public boolean func_149852_a(World p_149852_1_, Random p_149852_2_, int p_149852_3_, int p_149852_4_, int p_149852_5_)
    {
        return true;
    }
    
    public Block setName(String name){
        this.name = name;
        setTextureName(name);
        setBlockName(name + "Grass");
        register();
        return this;
    }
}
