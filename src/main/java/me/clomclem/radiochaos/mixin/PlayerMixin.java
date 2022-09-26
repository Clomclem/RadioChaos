package me.clomclem.radiochaos.mixin;

import me.clomclem.radiochaos.item.RadioChaosItems;
import me.clomclem.radiochaos.item.UraniumIngot;
import me.clomclem.radiochaos.radioactive.Radioactive;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Player.class)
public abstract class PlayerMixin extends LivingEntity {

    private PlayerMixin(EntityType<? extends LivingEntity> entityType, Level level) {
        super(entityType, level);
    }

    @Inject(method = "tick", at = @At("TAIL"))
    private void onTick(CallbackInfo ci) {
        if (((Player)(Object)this).getInventory().contains(new ItemStack(RadioChaosItems.URANIUM_INGOT))) {
            ((Player)(Object)this).hurt(Radioactive.RADIOACTIVITY, RadioChaosItems.URANIUM_INGOT.getRadiationLevel());
        }
    }
}
