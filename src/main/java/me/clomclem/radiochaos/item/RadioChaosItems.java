package me.clomclem.radiochaos.item;

import me.clomclem.radiochaos.RadioChaos;
import me.clomclem.radiochaos.block.RadioChaosBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class RadioChaosItems {
    public static final CreativeModeTab RADIOCHAOS_TAB = FabricItemGroupBuilder.build(
            new ResourceLocation(RadioChaos.MOD_ID, "main_tab"),
            () -> new ItemStack(RadioChaosItems.URANIUM_INGOT));

    public static final BlockItem URANIUM_BLOCK = new BlockItem(RadioChaosBlocks.URANIUM_BLOCK,
            new FabricItemSettings().group(RadioChaosItems.RADIOCHAOS_TAB));

    public static final BlockItem URANIUM_ORE = new BlockItem(RadioChaosBlocks.URANIUM_ORE,
            new FabricItemSettings().group(RadioChaosItems.RADIOCHAOS_TAB));

    public static final BlockItem DEEPSLATE_URANIUM_ORE = new BlockItem(RadioChaosBlocks.DEEPSLATE_URANIUM_ORE,
            new FabricItemSettings().group(RadioChaosItems.RADIOCHAOS_TAB));

    public static final UraniumIngotItem URANIUM_INGOT = new UraniumIngotItem(
            new FabricItemSettings().group(RadioChaosItems.RADIOCHAOS_TAB));
    public static final RawUraniumItem RAW_URANIUM = new RawUraniumItem(
            new FabricItemSettings().group(RadioChaosItems.RADIOCHAOS_TAB));

    // Thanks Kaupenjoe
    private static void registerItem(String name, Item item) {
        Registry.register(Registry.ITEM, new ResourceLocation(RadioChaos.MOD_ID, name), item);
    }

    public static void registerItems() {
        registerItem("uranium_block", URANIUM_BLOCK);
        registerItem("uranium_ore", URANIUM_ORE);
        registerItem("deepslate_uranium_ore", DEEPSLATE_URANIUM_ORE);
        registerItem("uranium_ingot", URANIUM_INGOT);
        registerItem("raw_uranium", RAW_URANIUM);
    }
}
