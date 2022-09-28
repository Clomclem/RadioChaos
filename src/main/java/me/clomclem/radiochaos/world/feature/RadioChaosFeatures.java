package me.clomclem.radiochaos.world.feature;

import me.clomclem.radiochaos.RadioChaos;
import me.clomclem.radiochaos.block.RadioChaosBlocks;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.Arrays;

public class RadioChaosFeatures {
    public static final ConfiguredFeature<?, ?> URANIUM_ORE_CONFIGURED_FEATURE = new ConfiguredFeature<>(
            Feature.ORE, new OreConfiguration(
            OreFeatures.STONE_ORE_REPLACEABLES, RadioChaosBlocks.URANIUM_ORE.defaultBlockState(),
            2));

    public static final PlacedFeature URANIUM_ORE_PLACED_FEATURE = new PlacedFeature(
            Holder.direct(URANIUM_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacement.of(5),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.top())
            ));

    public static void registerFeature(String name, ConfiguredFeature<?, ?> configuredFeature, PlacedFeature placedFeature) {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new ResourceLocation(RadioChaos.MOD_ID, name), configuredFeature);
        Registry.register(BuiltinRegistries.PLACED_FEATURE,
                new ResourceLocation(RadioChaos.MOD_ID, name), placedFeature);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY,
                        new ResourceLocation(RadioChaos.MOD_ID, name)));
    }

    public static void registerFeatures() {
        registerFeature("uranium_ore", URANIUM_ORE_CONFIGURED_FEATURE, URANIUM_ORE_PLACED_FEATURE);
    }
}
