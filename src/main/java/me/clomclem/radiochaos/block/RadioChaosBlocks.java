package me.clomclem.radiochaos.block;

import me.clomclem.radiochaos.RadioChaos;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class RadioChaosBlocks {
    public static final UraniumBlock URANIUM_BLOCK = new UraniumBlock(
            FabricBlockSettings.of(Material.HEAVY_METAL, MaterialColor.METAL).luminance(10).sound(SoundType.METAL)
                    .strength(10.0F, 10.0F).requiresCorrectToolForDrops());

    private static void registerBlock(String name, Block block) {
        Registry.register(Registry.BLOCK, new ResourceLocation(RadioChaos.MOD_ID, name), block);
    }

    public static void registerBlocks() {
        registerBlock("uranium_block", URANIUM_BLOCK);
    }
}
