package com.hijpixel.supplements.provider;

import com.hijpixel.supplements.init.BlockInit;
import com.hijpixel.supplements.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class SupplementsRecipeGenerator extends FabricRecipeProvider {
    public SupplementsRecipeGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        //COPPER ITEMS
        //Copper Nuggets to Copper Ingot
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.COPPER_INGOT)
                .input('C', ItemInit.COPPER_NUGGET)
                .pattern("CCC")
                .pattern("CCC")
                .pattern("CCC")
                .criterion(hasItem(ItemInit.COPPER_NUGGET), conditionsFromItem(ItemInit.COPPER_NUGGET))
                .offerTo(exporter);

        //Copper Ingot to Copper Nuggets
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ItemInit.COPPER_NUGGET, 9)
                .input(Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter);


        //FOODS
        //Diamond Apple
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ItemInit.DIAMOND_APPLE)
                .input('G', Items.ENCHANTED_GOLDEN_APPLE)
                .input('S', ConventionalItemTags.STORAGE_BLOCKS_DIAMOND)
                .pattern("SSS")
                .pattern("SGS")
                .pattern("SSS")
                .criterion(hasItem(Items.ENCHANTED_GOLDEN_APPLE), conditionsFromItem(Items.ENCHANTED_GOLDEN_APPLE))
                .criterion(hasTag(ConventionalItemTags.STORAGE_BLOCKS_DIAMOND),conditionsFromTag(ConventionalItemTags.STORAGE_BLOCKS_DIAMOND))
                .offerTo(exporter);

        //ROSE GOLD ITEMS
        //Rose Gold Ingots to Blocks
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInit.ROSE_GOLD_BLOCK)
                .input('R', ItemInit.ROSE_GOLD_INGOT)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .criterion(hasItem(BlockInit.ROSE_GOLD_BLOCK), conditionsFromItem(BlockInit.ROSE_GOLD_BLOCK))
                .offerTo(exporter);

        //Rose Gold Blocks to Ingots
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ItemInit.ROSE_GOLD_INGOT, 9)
                .input(ItemInit.ROSE_GOLD_BLOCK)
                .criterion(hasItem(BlockInit.ROSE_GOLD_BLOCK), conditionsFromItem(BlockInit.ROSE_GOLD_BLOCK))
                .offerTo(exporter);

        //ROSE GOLD SWORD
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemInit.ROSE_GOLD_SWORD)
                .input('R', ItemInit.ROSE_GOLD_INGOT)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern(" R ")
                .pattern(" R ")
                .pattern(" S ")
                .criterion(hasItem(ItemInit.ROSE_GOLD_INGOT), conditionsFromItem(ItemInit.ROSE_GOLD_INGOT))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter);

        //ROSE GOLD AXE
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ItemInit.ROSE_GOLD_AXE)
                .input('R', ItemInit.ROSE_GOLD_INGOT)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern(" RR")
                .pattern(" SR")
                .pattern(" S ")
                .criterion(hasItem(ItemInit.ROSE_GOLD_INGOT), conditionsFromItem(ItemInit.ROSE_GOLD_INGOT))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter);

        //ROSE GOLD PICKAXE
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ItemInit.ROSE_GOLD_PICKAXE)
                .input('R', ItemInit.ROSE_GOLD_INGOT)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("RRR")
                .pattern(" S ")
                .pattern(" S ")
                .criterion(hasItem(ItemInit.ROSE_GOLD_INGOT), conditionsFromItem(ItemInit.ROSE_GOLD_INGOT))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter);

        //ROSE GOLD SHOVEL
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ItemInit.ROSE_GOLD_SHOVEL)
                .input('R', ItemInit.ROSE_GOLD_INGOT)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("R")
                .pattern("S")
                .pattern("S")
                .criterion(hasItem(ItemInit.ROSE_GOLD_INGOT), conditionsFromItem(ItemInit.ROSE_GOLD_INGOT))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter);

        //ROSE GOLD HOE
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ItemInit.ROSE_GOLD_HOE)
                .input('R', ItemInit.ROSE_GOLD_INGOT)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern(" RR")
                .pattern(" S ")
                .pattern(" S ")
                .criterion(hasItem(ItemInit.ROSE_GOLD_INGOT), conditionsFromItem(ItemInit.ROSE_GOLD_INGOT))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter);

    }

    private static @NotNull String hasTag(@NotNull TagKey<Item> tag) {
        return "has_" + tag.id().toString();
    }
}
