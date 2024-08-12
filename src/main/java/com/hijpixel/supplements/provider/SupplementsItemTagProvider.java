package com.hijpixel.supplements.provider;

import com.hijpixel.supplements.PixelsSupplements;
import com.hijpixel.supplements.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;

import java.util.concurrent.CompletableFuture;

public class SupplementsItemTagProvider extends FabricTagProvider.ItemTagProvider{
    public SupplementsItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    private static final TagKey<Item> SUPPLEMENTS_ITEMS_TAG = TagKey.of(RegistryKeys.ITEM, PixelsSupplements.id("supplements_items"));

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ItemInit.ROSE_GOLD_SWORD);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ItemInit.ROSE_GOLD_AXE);

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ItemInit.ROSE_GOLD_PICKAXE);

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ItemInit.ROSE_GOLD_SHOVEL);

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ItemInit.ROSE_GOLD_HOE);

        //getOrCreateTagBuilder(BATTLEAXE_TAG)
                //.add(ItemInit.ROSE_GOLD_BATTLEAXE);

        getOrCreateTagBuilder(SUPPLEMENTS_ITEMS_TAG)
                .add(ItemInit.ROSE_GOLD_INGOT)
                .add(ItemInit.ROSE_GOLD_SWORD)
                .add(ItemInit.ROSE_GOLD_AXE)
                .add(ItemInit.ROSE_GOLD_PICKAXE)
                .add(ItemInit.ROSE_GOLD_SHOVEL)
                .add(ItemInit.ROSE_GOLD_HOE)
                .add(ItemInit.COPPER_ALLOY)
                .add(ItemInit.COPPER_NUGGET)
                .add(ItemInit.DIAMOND_APPLE)
                .add(ItemInit.ORANGE)
                .add(ItemInit.PEPPER);
    }
}
