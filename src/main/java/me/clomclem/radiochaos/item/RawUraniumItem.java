package me.clomclem.radiochaos.item;

public class RawUraniumItem extends AbstractRadioactiveItem {
    public RawUraniumItem(Properties properties) {
        super(properties);
    }

    @Override
    public float getRadiationLevel() {
        return 1;
    }
}
