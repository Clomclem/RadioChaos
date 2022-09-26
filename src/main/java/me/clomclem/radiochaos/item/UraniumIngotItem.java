package me.clomclem.radiochaos.item;

import net.minecraft.world.item.Item;

public class UraniumIngotItem extends AbstractRadioactiveItem {

    public UraniumIngotItem(Item.Properties properties) {
        super(properties);
    }

    @Override
    public float getRadiationLevel() {
        return 2;
    }
}
