package me.clomclem.radiochaos;

import me.clomclem.radiochaos.block.RadioChaosBlocks;
import me.clomclem.radiochaos.item.RadioChaosItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RadioChaos implements ModInitializer {
	public static final String MOD_ID = RadioChaos.class.getSimpleName().toLowerCase();

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		RadioChaosBlocks.registerBlocks();
		RadioChaosItems.registerItems();
	}
}
