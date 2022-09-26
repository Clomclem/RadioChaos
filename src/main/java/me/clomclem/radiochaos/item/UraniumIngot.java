package me.clomclem.radiochaos.item;

import net.minecraft.world.item.Item;

public class UraniumIngot extends AbstractRadioactiveItem {

    public UraniumIngot(Item.Properties properties) {
        super(properties);
    }

    @Override
    public float getRadiationLevel() {
        return 2;
    }
}
