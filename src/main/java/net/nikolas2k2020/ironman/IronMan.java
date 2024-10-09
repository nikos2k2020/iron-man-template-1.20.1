package net.nikolas2k2020.ironman;

import net.fabricmc.api.ModInitializer;

import net.nikolas2k2020.ironman.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IronMan implements ModInitializer {
	public static final String MOD_ID = "ironman-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}