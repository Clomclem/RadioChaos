package me.clomclem.radiochaos.item;

import me.clomclem.radiochaos.block.AbstractRadioactiveBlock;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RadioactiveBlockItem extends BlockItem implements RadioactiveItem {
    public RadioactiveBlockItem(AbstractRadioactiveBlock block, Properties properties) {
        super(block, properties);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> tooltip, TooltipFlag isAdvanced) {
        this.generateTooltip(itemStack, level, tooltip, isAdvanced);
    }

    @Override
    public float getRadiationLevel() {
        return ((AbstractRadioactiveBlock)getBlock()).getRadiationLevel();
    }
}
