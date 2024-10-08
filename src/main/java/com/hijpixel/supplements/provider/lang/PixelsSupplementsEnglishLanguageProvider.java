package com.hijpixel.supplements.provider.lang;

import com.hijpixel.supplements.PixelsSupplements;
import com.hijpixel.supplements.init.BlockInit;
import com.hijpixel.supplements.init.ItemGroupsInit;
import com.hijpixel.supplements.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;

import java.util.concurrent.CompletableFuture;

public class PixelsSupplementsEnglishLanguageProvider extends FabricLanguageProvider {

    public PixelsSupplementsEnglishLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    private static void addTabText(TranslationBuilder builder, Text text, String value) {
        if(text.getContent() instanceof TranslatableTextContent) {
            builder.add(((TranslatableTextContent) text.getContent()).getKey(), value);
        } else {
            PixelsSupplements.LOGGER.warn("Failed to add translated text: {}", text.getString());
        }
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {

        //Copper Items
        translationBuilder.add(ItemInit.COPPER_NUGGET, "Copper Nugget");
        translationBuilder.add(ItemInit.COPPER_ALLOY, "Copper Alloy");

        translationBuilder.add(ItemInit.ROSE_GOLD_INGOT, "Rose Gold Ingot");
        translationBuilder.add(BlockInit.ROSE_GOLD_BLOCK, "Block of Rose Gold");

        translationBuilder.add(ItemInit.ROSE_GOLD_SWORD, "Rose Gold Sword");
        translationBuilder.add(ItemInit.ROSE_GOLD_AXE, "Rose Gold Axe");
        translationBuilder.add(ItemInit.ROSE_GOLD_PICKAXE, "Rose Gold Pickaxe");
        translationBuilder.add(ItemInit.ROSE_GOLD_SHOVEL, "Rose Gold Shovel");
        translationBuilder.add(ItemInit.ROSE_GOLD_HOE, "Rose Gold Hoe");

        translationBuilder.add(ItemInit.ROSE_GOLD_HELMET, "Rose Gold Helmet");
        translationBuilder.add(ItemInit.ROSE_GOLD_CHESTPLATE, "Rose Gold Chestplate");
        translationBuilder.add(ItemInit.ROSE_GOLD_LEGGINGS, "Rose Gold Leggings");
        translationBuilder.add(ItemInit.ROSE_GOLD_BOOTS, "Rose Gold Boots");

        //Foods
        translationBuilder.add(ItemInit.ORANGE, "Orange");
        translationBuilder.add(ItemInit.ROSE_GOLD_APPLE, "Rose Gold Apple");
        translationBuilder.add(ItemInit.DIAMOND_APPLE, "Diamond Apple");
        translationBuilder.add(ItemInit.PEPPER, "Pepper");

        //Creative Tab(s)
        addTabText(translationBuilder, ItemGroupsInit.SUPPLEMENTS, "Pixel's Supplements");
    }


}
