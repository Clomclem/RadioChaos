package me.clomclem.radiochaos.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public abstract class AbstractRadioactiveItem extends Item implements RadioactiveItem {
    public AbstractRadioactiveItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> tooltip, TooltipFlag isAdvanced) {
        this.generateTooltip(itemStack, level, tooltip, isAdvanced);
    }
}
