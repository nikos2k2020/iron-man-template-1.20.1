package net.nikolas2k2020.ironman.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nikolas2k2020.ironman.IronMan;

public class ModItems {

    public static final Item IRON_MAN_BOOTS = registerItem("iron_man_boots",
            new Item(new FabricItemSettings().maxCount(1)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(IronMan.MOD_ID, name), item);
    }

    public static void registerModItems() {
        IronMan.LOGGER.info("Registering Items for " + IronMan.MOD_ID);
    }
}
