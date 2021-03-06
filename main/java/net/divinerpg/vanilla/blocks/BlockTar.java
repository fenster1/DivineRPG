package net.divinerpg.vanilla.blocks;

import net.divinerpg.DivineRPG;
import net.divinerpg.Reference;
import net.divinerpg.helper.utils.LangRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraftforge.fluids.BlockFluidClassic;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockTar extends BlockFluidClassic{

	public IIcon[] theIIcon;
	
	public BlockTar() {
		super(DivineRPG.Mod, Material.lava);
		DivineRPG.Mod.setBlock(this);
		setLightLevel(1F);
		GameRegistry.registerBlock(this, "Tar");
		setBlockName("Tar");
		LangRegistry.addBlock(this);
	}

	@Override
    public IIcon getIcon(int par1, int par2) {
        return par1 != 0 && par1 != 1 ? this.theIIcon[1] : this.theIIcon[0];
    }
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister par1IIconRegister) {
		this.theIIcon = new IIcon[] {par1IIconRegister.registerIcon(Reference.MOD_ID + ":" + "Tar"), par1IIconRegister.registerIcon(Reference.MOD_ID + ":" + "Tar")};
	}
}
