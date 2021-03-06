package net.divinerpg.vethea.entity.projectile;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;


public class EntityVetheanCannonShot extends EntityThrowable
{
    public int damage;
    public EntityVetheanCannonShot(World par1)
    {
        super(par1);
    }

    public EntityVetheanCannonShot(World par1, EntityLivingBase par2, int par3)
    {
        super(par1, par2);
        this.damage = par3;
    }

    public EntityVetheanCannonShot(World par1, double par2, double par4, double par6)
    {
        super(par1, par2, par4, par6);
    }

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    @Override
    protected void onImpact(MovingObjectPosition par1)
    {
        if (par1.entityHit != null)
        {
            par1.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), this.damage);
        }

        if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
    }
}