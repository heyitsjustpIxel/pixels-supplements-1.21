package com.hijpixel.supplements.init;

import com.hijpixel.supplements.PixelsSupplements;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class ArmorMaterialInit {

    public static final RegistryEntry<ArmorMaterial> ROSE_GOLD = register("rose_gold", Map.of(
            ArmorItem.Type.HELMET, 3,
            ArmorItem.Type.CHESTPLATE, 6,
            ArmorItem.Type.LEGGINGS, 4,
            ArmorItem.Type.BOOTS, 2
    ),
    30,
            SoundEvents.ITEM_ARMOR_EQUIP_GOLD,
            () -> Ingredient.ofItems(ItemInit.ROSE_GOLD_INGOT),
    1,
    0,
            false);


    public static RegistryEntry<ArmorMaterial> register(String id, Map<ArmorItem.Type, Integer> defensePoints,
                                                        int enchantability, RegistryEntry<SoundEvent> equipSound,
                                                        Supplier<Ingredient> repairIngredient, float toughness,
                                                        float knockbackResistance, boolean dyable) {
        List<ArmorMaterial.Layer> layers = List.of (
                new ArmorMaterial.Layer(PixelsSupplements.id(id))
        );

        var material = new ArmorMaterial(defensePoints, enchantability, equipSound, repairIngredient, layers, toughness, knockbackResistance);

        material = Registry.register(Registries.ARMOR_MATERIAL, PixelsSupplements.id(id), material);

        return RegistryEntry.of(material);
    }

    public static void  load() {}
}
