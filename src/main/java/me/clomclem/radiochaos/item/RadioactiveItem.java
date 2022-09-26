package me.clomclem.radiochaos.item;

import me.clomclem.radiochaos.radioactive.Radioactive;
import net.minecraft.world.item.Item;

// Maybe move this class to radioactive package
public class RadioactiveItem extends Item implements Radioactive {

    private final float radiationLevel;

    public RadioactiveItem(Item.Properties properties, float radiationLevel) {
        super(properties);
        this.radiationLevel = radiationLevel;
    }

    @Override
    public float getRadiationLevel() {
        return radiationLevel;
    }
}
