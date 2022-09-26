package me.clomclem.radiochaos.block;

public class UraniumBlock extends AbstractRadioactiveBlock {
    public UraniumBlock(Properties properties) {
        super(properties);
    }

    @Override
    public float getRadiationLevel() {
        return 18;
    }
}
