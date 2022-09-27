package me.clomclem.radiochaos.mixin;

import me.clomclem.radiochaos.radioactive.Radioactive;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@SuppressWarnings("unused")
@Mixin(BlockItem.class)
public abstract class BlockItemMixin extends Item {

    public BlockItemMixin(Properties properties) {
        super(properties);
    }

    @Inject(method = "<init>", at = @At("TAIL"))
    private void onInit(Block block, Item.Properties properties, CallbackInfo ci) {
        ((Radioactive)this).setRadiationLevel(((Radioactive)block).getRadiationLevel());
    }
}
