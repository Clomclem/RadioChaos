package me.clomclem.radiochaos.radioactive;

import net.minecraft.world.damagesource.DamageSource;

/**
 * An interface for anything that has or can have radioactive
 * properties.
 */
public interface Radioactive {
    // Once every 100 ticks, the player gets damaged by radiation
    int radiationTicks = 100;

    // Maybe move this DamageSource to another class
    DamageSource RADIOACTIVITY = (new DamageSource("radioactivity")).bypassArmor();
    float getRadiationLevel();
}
