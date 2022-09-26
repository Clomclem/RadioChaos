package me.clomclem.radiochaos.radioactive;

import net.minecraft.world.damagesource.DamageSource;

public interface Radioactive {

    // Maybe move this DamageSource to another class
    DamageSource RADIOACTIVITY = (new DamageSource("radioactivity")).bypassArmor();
    float getRadiationLevel();

}
