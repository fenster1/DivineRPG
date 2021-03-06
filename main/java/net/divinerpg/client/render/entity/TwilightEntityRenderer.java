package net.divinerpg.client.render.entity;

import net.divinerpg.client.render.EntityResourceLocation;
import net.divinerpg.client.render.RenderDivineArrow;
import net.divinerpg.client.render.RenderDivineMob;
import net.divinerpg.client.render.RenderIconProjectile;
import net.divinerpg.client.render.RenderProjectile;
import net.divinerpg.client.render.RenderSizeable;
import net.divinerpg.helper.items.TwilightItemsWeapons;
import net.divinerpg.twilight.entity.mob.EntityAngryBunny;
import net.divinerpg.twilight.entity.mob.EntityApalachiaArcher;
import net.divinerpg.twilight.entity.mob.EntityApalachiaCadillion;
import net.divinerpg.twilight.entity.mob.EntityApalachiaGolem;
import net.divinerpg.twilight.entity.mob.EntityApalachiaTomo;
import net.divinerpg.twilight.entity.mob.EntityApalachiaWarrior;
import net.divinerpg.twilight.entity.mob.EntityBaslisk;
import net.divinerpg.twilight.entity.mob.EntityBunny;
import net.divinerpg.twilight.entity.mob.EntityCadillion;
import net.divinerpg.twilight.entity.mob.EntityCori;
import net.divinerpg.twilight.entity.mob.EntityCori2;
import net.divinerpg.twilight.entity.mob.EntityDensos;
import net.divinerpg.twilight.entity.mob.EntityEdenTomo;
import net.divinerpg.twilight.entity.mob.EntityKarot;
import net.divinerpg.twilight.entity.mob.EntityMadivel;
import net.divinerpg.twilight.entity.mob.EntityMoonWolf;
import net.divinerpg.twilight.entity.mob.EntityMortumCadillion;
import net.divinerpg.twilight.entity.mob.EntityMortumDemon;
import net.divinerpg.twilight.entity.mob.EntityNesro;
import net.divinerpg.twilight.entity.mob.EntityReyvor;
import net.divinerpg.twilight.entity.mob.EntitySamek;
import net.divinerpg.twilight.entity.mob.EntitySkythernArcher;
import net.divinerpg.twilight.entity.mob.EntitySkythernFiend;
import net.divinerpg.twilight.entity.mob.EntitySkythernGolem;
import net.divinerpg.twilight.entity.mob.EntitySoulFiend;
import net.divinerpg.twilight.entity.mob.EntitySoulStealer;
import net.divinerpg.twilight.entity.mob.EntityTwilightDemon;
import net.divinerpg.twilight.entity.mob.EntityVamacheron;
import net.divinerpg.twilight.entity.mob.EntityVerek;
import net.divinerpg.twilight.entity.mob.EntityWildWoodGolem;
import net.divinerpg.twilight.entity.mob.EntityWildWoodTomo;
import net.divinerpg.twilight.entity.mob.model.ModelAngryBunny;
import net.divinerpg.twilight.entity.mob.model.ModelBasalisk;
import net.divinerpg.twilight.entity.mob.model.ModelBunny;
import net.divinerpg.twilight.entity.mob.model.ModelCadillion;
import net.divinerpg.twilight.entity.mob.model.ModelCori;
import net.divinerpg.twilight.entity.mob.model.ModelDenseDemon;
import net.divinerpg.twilight.entity.mob.model.ModelDensos;
import net.divinerpg.twilight.entity.mob.model.ModelEnchantedArcher;
import net.divinerpg.twilight.entity.mob.model.ModelEnchantedWarrior;
import net.divinerpg.twilight.entity.mob.model.ModelKarot;
import net.divinerpg.twilight.entity.mob.model.ModelMadivel;
import net.divinerpg.twilight.entity.mob.model.ModelMoonWolf;
import net.divinerpg.twilight.entity.mob.model.ModelMytrilFiend;
import net.divinerpg.twilight.entity.mob.model.ModelNesro;
import net.divinerpg.twilight.entity.mob.model.ModelSamek;
import net.divinerpg.twilight.entity.mob.model.ModelSoulFiend;
import net.divinerpg.twilight.entity.mob.model.ModelSoulStealer;
import net.divinerpg.twilight.entity.mob.model.ModelTomo;
import net.divinerpg.twilight.entity.mob.model.ModelTwilightDemon;
import net.divinerpg.twilight.entity.mob.model.ModelTwilightGolem;
import net.divinerpg.twilight.entity.mob.model.ModelVamacheron;
import net.divinerpg.twilight.entity.projectile.EntityApalachiaArrow;
import net.divinerpg.twilight.entity.projectile.EntityBlitzAlapachia;
import net.divinerpg.twilight.entity.projectile.EntityBlitzEden;
import net.divinerpg.twilight.entity.projectile.EntityBlitzHalite;
import net.divinerpg.twilight.entity.projectile.EntityBlitzMortum;
import net.divinerpg.twilight.entity.projectile.EntityBlitzSkythern;
import net.divinerpg.twilight.entity.projectile.EntityBlitzWildWood;
import net.divinerpg.twilight.entity.projectile.EntityEdenArrow;
import net.divinerpg.twilight.entity.projectile.EntityHaliteArrow;
import net.divinerpg.twilight.entity.projectile.EntityMortumArrow;
import net.divinerpg.twilight.entity.projectile.EntityPhaserApalachia;
import net.divinerpg.twilight.entity.projectile.EntityPhaserEden;
import net.divinerpg.twilight.entity.projectile.EntityPhaserHalite;
import net.divinerpg.twilight.entity.projectile.EntityPhaserMortum;
import net.divinerpg.twilight.entity.projectile.EntityPhaserSkythern;
import net.divinerpg.twilight.entity.projectile.EntityPhaserWildWood;
import net.divinerpg.twilight.entity.projectile.EntitySkythernArrow;
import net.divinerpg.twilight.entity.projectile.EntitySlicerApalachia;
import net.divinerpg.twilight.entity.projectile.EntitySlicerEden;
import net.divinerpg.twilight.entity.projectile.EntitySlicerHalite;
import net.divinerpg.twilight.entity.projectile.EntitySlicerMortum;
import net.divinerpg.twilight.entity.projectile.EntitySlicerSkythern;
import net.divinerpg.twilight.entity.projectile.EntitySlicerWildWoods;
import net.divinerpg.twilight.entity.projectile.EntityWildArrow;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class TwilightEntityRenderer {
	

	public static void init(){
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerEden.class, new RenderIconProjectile(TwilightItemsWeapons.edenSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerWildWoods.class, new RenderIconProjectile(TwilightItemsWeapons.wildWoodSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerApalachia.class, new RenderIconProjectile(TwilightItemsWeapons.apalachiaSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerSkythern.class, new RenderIconProjectile(TwilightItemsWeapons.skythernSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerMortum.class, new RenderIconProjectile(TwilightItemsWeapons.mortumSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerHalite.class, new RenderIconProjectile(TwilightItemsWeapons.haliteSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzEden.class, new RenderProjectile(EntityResourceLocation.blitzEden));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzWildWood.class, new RenderProjectile(EntityResourceLocation.blitzWild));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzAlapachia.class, new RenderProjectile(EntityResourceLocation.blitzApalachia));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzSkythern.class, new RenderProjectile(EntityResourceLocation.blitzSkythern));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzMortum.class, new RenderProjectile(EntityResourceLocation.blitzMortum));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzHalite.class, new RenderProjectile(EntityResourceLocation.blitzHalite));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserEden.class, new RenderProjectile(EntityResourceLocation.phaserEden));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserWildWood.class, new RenderProjectile(EntityResourceLocation.phaserWild));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserApalachia.class, new RenderProjectile(EntityResourceLocation.phaserApalachia));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserSkythern.class, new RenderProjectile(EntityResourceLocation.phaserSkythern));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserMortum.class, new RenderProjectile(EntityResourceLocation.phaserMortum));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserHalite.class, new RenderProjectile(EntityResourceLocation.phaserHalite));
        
        RenderingRegistry.registerEntityRenderingHandler(EntityCadillion.class, new RenderDivineMob(new ModelCadillion(), 0.0F, EntityResourceLocation.cadillion));
        RenderingRegistry.registerEntityRenderingHandler(EntityEdenTomo.class, new RenderDivineMob(new ModelTomo(), 0.0F, EntityResourceLocation.edenTomo));
        RenderingRegistry.registerEntityRenderingHandler(EntityBunny.class, new RenderDivineMob(new ModelBunny(), 0.0F, EntityResourceLocation.bunny));
        RenderingRegistry.registerEntityRenderingHandler(EntityAngryBunny.class, new RenderSizeable(new ModelAngryBunny(), 0.0F, 2.0F, EntityResourceLocation.angryBunny));
        RenderingRegistry.registerEntityRenderingHandler(EntityCori.class, new RenderDivineMob(new ModelCori(), 0.0F, EntityResourceLocation.edenCori));
        RenderingRegistry.registerEntityRenderingHandler(EntityMadivel.class, new RenderDivineMob(new ModelMadivel(), 0.0F, EntityResourceLocation.madivel));
        RenderingRegistry.registerEntityRenderingHandler(EntityNesro.class, new RenderDivineMob(new ModelNesro(), 0.0F, EntityResourceLocation.nesro));
        RenderingRegistry.registerEntityRenderingHandler(EntityWildWoodGolem.class, new RenderDivineMob(new ModelTwilightGolem(), 0.0F, EntityResourceLocation.wildWoodGolem));
        RenderingRegistry.registerEntityRenderingHandler(EntityWildWoodTomo.class, new RenderDivineMob(new ModelTomo(), 0.0F, EntityResourceLocation.wildWoodTomo));
        RenderingRegistry.registerEntityRenderingHandler(EntityVerek.class, new RenderDivineMob(new ModelSamek(), 0.0F, EntityResourceLocation.varek));
        RenderingRegistry.registerEntityRenderingHandler(EntityMoonWolf.class, new RenderDivineMob(new ModelMoonWolf(), 0.0F, EntityResourceLocation.wildWoodWolf));
        RenderingRegistry.registerEntityRenderingHandler(EntityApalachiaCadillion.class, new RenderDivineMob(new ModelCadillion(), 0.0F, EntityResourceLocation.cadillion));
        RenderingRegistry.registerEntityRenderingHandler(EntityApalachiaTomo.class, new RenderDivineMob(new ModelTomo(), 0.0F, EntityResourceLocation.apalachiaTomo));
        RenderingRegistry.registerEntityRenderingHandler(EntityApalachiaGolem.class, new RenderDivineMob(new ModelTwilightGolem(), 0.0F, EntityResourceLocation.apalachiaGolem));
        RenderingRegistry.registerEntityRenderingHandler(EntityApalachiaWarrior.class, new RenderDivineMob(new ModelEnchantedWarrior(), 0.0F, EntityResourceLocation.apalachiaWarrior));
        RenderingRegistry.registerEntityRenderingHandler(EntityApalachiaArcher.class, new RenderDivineMob(new ModelEnchantedArcher(), 0.0F, EntityResourceLocation.apalachiaArcher));
        RenderingRegistry.registerEntityRenderingHandler(EntitySkythernArcher.class, new RenderDivineMob(new ModelEnchantedArcher(), 0.0F, EntityResourceLocation.skythernArcher));
        RenderingRegistry.registerEntityRenderingHandler(EntitySamek.class, new RenderDivineMob(new ModelSamek(), 0.0F, EntityResourceLocation.samek));
        RenderingRegistry.registerEntityRenderingHandler(EntitySkythernGolem.class, new RenderDivineMob(new ModelTwilightGolem(), 0.0F, EntityResourceLocation.skythernGolem));
        RenderingRegistry.registerEntityRenderingHandler(EntityCori2.class, new RenderDivineMob(new ModelCori(), 0.0F, EntityResourceLocation.skythernGolem));
        RenderingRegistry.registerEntityRenderingHandler(EntitySkythernFiend.class, new RenderDivineMob(new ModelMytrilFiend(), 0.0F, EntityResourceLocation.skythernGolem));
        RenderingRegistry.registerEntityRenderingHandler(EntityMortumCadillion.class, new RenderDivineMob(new ModelCadillion(), 0.0F, EntityResourceLocation.mortumCadillion));
        RenderingRegistry.registerEntityRenderingHandler(EntityMortumDemon.class, new RenderDivineMob(new ModelDenseDemon(), 0.0F, EntityResourceLocation.mortumDemon));
        RenderingRegistry.registerEntityRenderingHandler(EntityBaslisk.class, new RenderDivineMob(new ModelBasalisk(), 0.0F, EntityResourceLocation.basalisk));
        RenderingRegistry.registerEntityRenderingHandler(EntitySoulStealer.class, new RenderDivineMob(new ModelSoulStealer(), 0.0F, EntityResourceLocation.soulStealer));
        RenderingRegistry.registerEntityRenderingHandler(EntityDensos.class, new RenderDivineMob(new ModelDensos(), 0.0F, EntityResourceLocation.densos));
        RenderingRegistry.registerEntityRenderingHandler(EntityReyvor.class, new RenderDivineMob(new ModelDensos(), 0.0F, EntityResourceLocation.reyvor));
        RenderingRegistry.registerEntityRenderingHandler(EntityTwilightDemon.class, new RenderSizeable(new ModelTwilightDemon(), 0.0F, 2.0F, EntityResourceLocation.twilightDemon));
        RenderingRegistry.registerEntityRenderingHandler(EntitySoulFiend.class, new RenderSizeable(new ModelSoulFiend(), 0.0F, 1.0F, EntityResourceLocation.soulFiend));
        RenderingRegistry.registerEntityRenderingHandler(EntityVamacheron.class, new RenderSizeable(new ModelVamacheron(), 0.0F, 3.0F, EntityResourceLocation.vamacheron));
        RenderingRegistry.registerEntityRenderingHandler(EntityKarot.class, new RenderSizeable(new ModelKarot(), 0.0F, 5.0F, EntityResourceLocation.karot));
	
        RenderingRegistry.registerEntityRenderingHandler(EntityEdenArrow.class, new RenderDivineArrow(EntityResourceLocation.edenArrow));
        RenderingRegistry.registerEntityRenderingHandler(EntityWildArrow.class, new RenderDivineArrow(EntityResourceLocation.wildArrow));
        RenderingRegistry.registerEntityRenderingHandler(EntityApalachiaArrow.class, new RenderDivineArrow(EntityResourceLocation.apalachiaArrow));
        RenderingRegistry.registerEntityRenderingHandler(EntitySkythernArrow.class, new RenderDivineArrow(EntityResourceLocation.skythernArrow));
        RenderingRegistry.registerEntityRenderingHandler(EntityMortumArrow.class, new RenderDivineArrow(EntityResourceLocation.mortumArrow));
        RenderingRegistry.registerEntityRenderingHandler(EntityHaliteArrow.class, new RenderDivineArrow(EntityResourceLocation.haliteArrow));
	}	
}