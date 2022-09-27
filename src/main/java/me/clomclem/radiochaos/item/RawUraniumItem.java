package me.clomclem.radiochaos.item;

import me.clomclem.radiochaos.radioactive.Radioactive;
import net.minecraft.world.item.Item;

public class RawUraniumItem extends Item {
    public RawUraniumItem(Properties properties) {
        super(properties);
        ((Radioactive)this).setRadiationLevel(1);
    }
}
