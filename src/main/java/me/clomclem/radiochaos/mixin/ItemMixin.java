package me.clomclem.radiochaos.mixin;

import me.clomclem.radiochaos.radioactive.Radioactive;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

@SuppressWarnings("unused")
@Mixin(Item.class)
public abstract class ItemMixin implements ItemLike, FabricItem, Radioactive {
    private float radiationLevel = 0;

    @Inject(method = "appendHoverText", at = @At("HEAD"))
    private void addTooltip(ItemStack itemStack, @Nullable Level level, List<Component> tooltip, TooltipFlag isAdvanced, CallbackInfo ci) {
        if (radiationLevel > 0) {
            tooltip.add(Component.translatable("item.radiochaos.radioactive_item.tooltip.radiation_level").withStyle(ChatFormatting.YELLOW).append(Component.literal(": "+getRadiationLevel())));
        }
    }

    @Override
    public void setRadiationLevel(float radiationLevel) {
        this.radiationLevel = radiationLevel;
    }

    @Override
    public float getRadiationLevel() {
        return radiationLevel;
    }
}
