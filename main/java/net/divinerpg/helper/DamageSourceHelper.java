package net.divinerpg.helper;

import net.divinerpg.twilight.entity.projectile.EntityApalachiaArrow;
import net.divinerpg.twilight.entity.projectile.EntityEdenArrow;
import net.divinerpg.twilight.entity.projectile.EntityHaliteArrow;
import net.divinerpg.twilight.entity.projectile.EntityMortumArrow;
import net.divinerpg.twilight.entity.projectile.EntitySkythernArrow;
import net.divinerpg.twilight.entity.projectile.EntityWildArrow;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;

public class DamageSourceHelper {

    public static DamageSource edenArrowDamage(EntityEdenArrow par0EntityArrow, Entity par1Entity) {
        return (new EntityDamageSourceIndirect("edenArrow", par0EntityArrow, par1Entity)).setProjectile();
    }
    
    public static DamageSource wildArrowDamage(EntityWildArrow par0EntityArrow, Entity par1Entity) {
        return (new EntityDamageSourceIndirect("wildArrow", par0EntityArrow, par1Entity)).setProjectile();
    } 
    
    public static DamageSource apalachiaArrowDamage(EntityApalachiaArrow par0EntityArrow, Entity par1Entity) {
        return (new EntityDamageSourceIndirect("apalachiaArrow", par0EntityArrow, par1Entity)).setProjectile();
    }
    
    public static DamageSource skythernArrowDamage(EntitySkythernArrow par0EntityArrow, Entity par1Entity) {
        return (new EntityDamageSourceIndirect("skythernArrow", par0EntityArrow, par1Entity)).setProjectile();
    }
    
    public static DamageSource mortumArrowDamage(EntityMortumArrow par0EntityArrow, Entity par1Entity) {
        return (new EntityDamageSourceIndirect("mortumArrow", par0EntityArrow, par1Entity)).setProjectile();
    }
    
    public static DamageSource haliteArrowDamage(EntityHaliteArrow par0EntityArrow, Entity par1Entity) {
        return (new EntityDamageSourceIndirect("haliteArrow", par0EntityArrow, par1Entity)).setProjectile();
    }
}
