package me.clomclem.radiochaos.block;

import me.clomclem.radiochaos.radioactive.Radioactive;
import net.minecraft.world.level.block.Block;

public abstract class AbstractRadioactiveBlock extends Block implements Radioactive {
    public AbstractRadioactiveBlock(Properties properties) {
        super(properties);
    }
}
