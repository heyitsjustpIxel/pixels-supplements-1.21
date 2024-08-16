package com.hijpixel.supplements.init;

import com.hijpixel.supplements.PixelsSupplements;
import com.hijpixel.supplements.enums.SupplementsToolsMaterial;
import com.hijpixel.supplements.lists.FoodList;
import net.minecraft.component.DataComponentTypes;
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
                    .attributeModifiers(SwordItem.createAttributeModifiers(SupplementsToolsMaterial.ROSE_GOLD, 1, -2.4F))
            ));

    public static final AxeItem ROSE_GOLD_AXE = register("rose_gold_axe",
            new AxeItem(SupplementsToolsMaterial.ROSE_GOLD, new Item.Settings()
                    .rarity(Rarity.COMMON)
                    .attributeModifiers(AxeItem.createAttributeModifiers(SupplementsToolsMaterial.ROSE_GOLD, 3.5F, -3F))));

    public static final PickaxeItem ROSE_GOLD_PICKAXE = register("rose_gold_pickaxe",
            new PickaxeItem(SupplementsToolsMaterial.ROSE_GOLD, new Item.Settings()
                    .rarity(Rarity.COMMON)
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(SupplementsToolsMaterial.ROSE_GOLD, -1.5F, -2.8F))));

    public static final ShovelItem ROSE_GOLD_SHOVEL = register("rose_gold_shovel",
            new ShovelItem(SupplementsToolsMaterial.ROSE_GOLD, new Item.Settings()
                    .rarity(Rarity.COMMON)
                    .attributeModifiers(ShovelItem.createAttributeModifiers(SupplementsToolsMaterial.ROSE_GOLD, -0.5F, -2.4F))));

    public static final HoeItem ROSE_GOLD_HOE = register("rose_gold_hoe",
            new HoeItem(SupplementsToolsMaterial.ROSE_GOLD, new Item.Settings()
                    .rarity(Rarity.COMMON)
                    .attributeModifiers(HoeItem.createAttributeModifiers(SupplementsToolsMaterial.ROSE_GOLD, -4, -1F))));

    public static final ArmorItem ROSE_GOLD_HELMET = register("rose_gold_helmet",
            new ArmorItem(ArmorMaterialInit.ROSE_GOLD, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));

    public static final ArmorItem ROSE_GOLD_CHESTPLATE = register("rose_gold_chestplate",
            new ArmorItem(ArmorMaterialInit.ROSE_GOLD, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));

    public static final ArmorItem ROSE_GOLD_LEGGINGS= register("rose_gold_leggings",
            new ArmorItem(ArmorMaterialInit.ROSE_GOLD, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));

    public static final ArmorItem ROSE_GOLD_BOOTS= register("rose_gold_boots",
            new ArmorItem(ArmorMaterialInit.ROSE_GOLD, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));

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

    //Rose Gold Apple
    public static final Item ROSE_GOLD_APPLE = register("rose_gold_apple",
            new Item(new Item.Settings()
                    .rarity(Rarity.UNCOMMON)
                    .food(FoodList.ROSE_GOLD_APPLE)
            ));

    //Diamond Apple
    public static final Item DIAMOND_APPLE = register("diamond_apple",
            new Item(new Item.Settings()
                    .rarity(Rarity.EPIC)
                    .component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true)
                    .food(FoodList.DIAMOND_APPLE)));

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, PixelsSupplements.id(name), item);
    }

    public static void load() {
    }
}
