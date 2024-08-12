package com.hijpixel.supplements.init;

import com.hijpixel.supplements.PixelsSupplements;
import com.hijpixel.supplements.enums.SupplementsToolsMaterial;
import com.hijpixel.supplements.lists.FoodList;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Rarity;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {
    public static final List<ItemConvertible> BLACKLIST = new ArrayList<>();

    //ITEMS

    //Copper Items
    public static final Item COPPER_NUGGET = register("copper_nugget",
            new Item(new Item.Settings()
                    .rarity(Rarity.COMMON)));

    public static final Item COPPER_ALLOY = register("copper_alloy",
            new Item(new Item.Settings()
                    .rarity(Rarity.COMMON)));

    //Rose Gold
    public static final Item ROSE_GOLD_INGOT= register("rose_gold_ingot",
            new Item(new Item.Settings()
                    .rarity(Rarity.COMMON)));

    public static final BlockItem ROSE_GOLD_BLOCK = register("rose_gold_block",
            new BlockItem(BlockInit.ROSE_GOLD_BLOCK, new Item.Settings()));

    public static final SwordItem ROSE_GOLD_SWORD = register("rose_gold_sword",
            new SwordItem(SupplementsToolsMaterial.ROSE_GOLD, new Item.Settings()
                    .rarity(Rarity.COMMON)
                    .attributeModifiers(SwordItem.createAttributeModifiers(SupplementsToolsMaterial.ROSE_GOLD, 0, -2.4F))
            ));

    //Foods
    //Orange
    public static final Item ORANGE = register("orange",
            new Item(new Item.Settings()
                    .rarity(Rarity.COMMON)
                    .food(FoodList.ORANGE)));

    public static final Item PEPPER = register("pepper",
            new Item(new Item.Settings()
                    .rarity(Rarity.COMMON)
                    .food(FoodList.PEPPER)));


    //Diamond Apple
    public static final Item DIAMOND_APPLE = register("diamond_apple",
            new Item(new Item.Settings()
                    .rarity(Rarity.EPIC)
                    .food(FoodList.DIAMOND_APPLE)));

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, PixelsSupplements.id(name), item);
    }

    public static void load() {
    }
}
