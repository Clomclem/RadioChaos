package me.clomclem.radiochaos.block;

import me.clomclem.radiochaos.radioactive.Radioactive;
import net.minecraft.world.level.block.DropExperienceBlock;

public class UraniumOreBlock extends DropExperienceBlock {
    public UraniumOreBlock(Properties properties) {
        super(properties);
        ((Radioactive)this).setRadiationLevel(0.5f);
    }
}
