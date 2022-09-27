package me.clomclem.radiochaos.mixin;

import me.clomclem.radiochaos.radioactive.Radioactive;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@SuppressWarnings("unused")
@Mixin(Player.class)
public abstract class PlayerMixin extends LivingEntity implements Radioactive {
    private float radiationLevel = 0;

    private int tickDelta = 0;

    private PlayerMixin(EntityType<? extends LivingEntity> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public void setRadiationLevel(float radiationLevel) {
        this.radiationLevel = radiationLevel;
    }

    @Override
    public float getRadiationLevel() {
        return radiationLevel;
    }

    @Inject(method = "tick", at = @At("TAIL"))
    private void onTick(CallbackInfo ci) {
        if (tickDelta == Radioactive.radiationTicks) {
            tickDelta = 0;
            Player thisPlayer = ((Player)(Object)this);
            Inventory inventory = thisPlayer.getInventory();
            radiationLevel = 0;
            for (ItemStack itemStack : inventory.items) {
                radiationLevel += getRadioactivityOfItemstack(itemStack);
            }
            radiationLevel += getRadioactivityOfItemstack(inventory.offhand.get(0));
            thisPlayer.hurt(Radioactive.RADIOACTIVITY, radiationLevel);
        }
        tickDelta += 1;
    }

    private static float getRadioactivityOfItemstack(ItemStack itemStack) {
        Item item = itemStack.getItem();
        return ((Radioactive)item).getRadiationLevel() * itemStack.getCount();
    }
}
