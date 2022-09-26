package me.clomclem.radiochaos.item;

import me.clomclem.radiochaos.RadioChaos;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class RadioChaosItems {

    public static final CreativeModeTab RADIOCHAOS_TAB = FabricItemGroupBuilder.build(
            new ResourceLocation(RadioChaos.MOD_ID, "main_tab"),
            () -> new ItemStack(RadioChaosItems.URANIUM_INGOT));

    // Maybe change reference type back to item (public static final Item URANIUM_INGOT)
    public static final UraniumIngotItem URANIUM_INGOT = new UraniumIngotItem(
            new FabricItemSettings().group(RadioChaosItems.RADIOCHAOS_TAB));

    // Thanks Kaupenjoe
    private static void registerItem(String name, Item item) {
        Registry.register(Registry.ITEM, new ResourceLocation(RadioChaos.MOD_ID, name), item);
    }

    public static void registerItems() {
        registerItem("uranium_ingot", URANIUM_INGOT);
    }
}
