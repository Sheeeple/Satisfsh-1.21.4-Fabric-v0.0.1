package satisfish.com.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import satisfish.com.Satisfsh;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
public class ModItems {
    public static final Item UWU = registerItem("uwu", new Item(new Item.Settings()));


    private static  Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Satisfsh.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Satisfsh.LOGGER.info("Registering Mod Items for " + Satisfsh.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(UWU);
        });
    }
}