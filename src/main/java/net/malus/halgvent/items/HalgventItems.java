package net.malus.halgvent.items;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.malus.halgvent.Halgvent_Newlands;
import net.malus.halgvent.block.HalgventBlocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class HalgventItems
{
    public static final Item HAFHELM_SWORD = registerItem("hafhelm_sword", new Item(new FabricItemSettings()));
    public static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries)
    {
        entries.add(HAFHELM_SWORD);
    }
    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(Halgvent_Newlands.MOD_ID, name), item);
    }
    public static void registerModItems()
    {
        Halgvent_Newlands.LOGGER.info("Registering items for" + Halgvent_Newlands.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(HalgventItems::addItemsToIngredientTabItemGroup);
    }
}
