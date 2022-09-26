package me.clomclem.radiochaos.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public abstract class AbstractRadioactiveBlockItem extends BlockItem implements RadioactiveItem {

    public AbstractRadioactiveBlockItem(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> tooltip, TooltipFlag isAdvanced) {
        this.generateTooltip(itemStack, level, tooltip, isAdvanced);
    }
}
