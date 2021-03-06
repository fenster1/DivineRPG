package net.divinerpg.client;

import com.jadarstudios.developercapes.DevCapes;

import net.divinerpg.CommonProxy;
import net.divinerpg.DivineRPG;
import net.divinerpg.Reference;
import net.divinerpg.client.render.entity.IceikaEntityRenderer;
import net.divinerpg.client.render.entity.OverworldEntityRenderer;
import net.divinerpg.client.render.entity.TwilightEntityRenderer;
import net.divinerpg.client.render.entity.VetheaEntityRenderer;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.network.NetworkRegistry;

public class ClientProxy extends CommonProxy{

	@Override
	public void renderThings() {
		OverworldEntityRenderer.init();
		TwilightEntityRenderer.init();
		IceikaEntityRenderer.init();
		VetheaEntityRenderer.init();
		MinecraftForge.EVENT_BUS.register(new SoundLoader());
		NetworkRegistry.INSTANCE.registerGuiHandler(DivineRPG.instance, new GuiHandler());
		DevCapes.getInstance().registerConfig("https://dl-web.dropbox.com/get/Divine%20RPG/DivineRPGCapes.json", Reference.MOD_NAME);
	}
}