package me.clomclem.radiochaos.item;

import me.clomclem.radiochaos.radioactive.Radioactive;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

// Maybe move this class to radioactive package
public interface RadioactiveItem extends Radioactive {
    default void generateTooltip(ItemStack itemStack, @Nullable Level level, List<Component> tooltip, TooltipFlag isAdvanced) {
        tooltip.add(Component.translatable("item.radiochaos.radioactive_item.tooltip").withStyle(ChatFormatting.YELLOW).append(Component.literal(": "+getRadiationLevel())));
    }
}
