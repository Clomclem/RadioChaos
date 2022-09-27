package me.clomclem.radiochaos.item;

import me.clomclem.radiochaos.radioactive.Radioactive;
import net.minecraft.world.item.Item;

public class UraniumIngotItem extends Item {
    public UraniumIngotItem(Item.Properties properties) {
        super(properties);
        ((Radioactive)this).setRadiationLevel(2);
    }
}
