package me.clomclem.radiochaos.block;

import me.clomclem.radiochaos.radioactive.Radioactive;
import net.minecraft.world.level.block.Block;

public class UraniumBlock extends Block {
    public UraniumBlock(Properties properties) {
        super(properties);
        ((Radioactive)this).setRadiationLevel(18);
    }
}
