package me.clomclem.radiochaos.mixin;

import me.clomclem.radiochaos.radioactive.Radioactive;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.spongepowered.asm.mixin.Mixin;

@SuppressWarnings("unused")
@Mixin(Block.class)
public abstract class BlockMixin extends BlockBehaviour implements ItemLike, Radioactive {
    private float radiationLevel = 0;

    public BlockMixin(Properties properties) {
        super(properties);
    }

    @Override
    public void setRadiationLevel(float radiationLevel) {
        this.radiationLevel = radiationLevel;
    }

    @Override
    public float getRadiationLevel() {
        return radiationLevel;
    }
}
