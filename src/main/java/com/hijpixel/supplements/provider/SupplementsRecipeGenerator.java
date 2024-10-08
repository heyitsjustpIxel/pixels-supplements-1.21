package com.hijpixel.supplements.provider;

import com.hijpixel.supplements.PixelsSupplements;
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
                .group("rose_gold_ingot")
                .criterion(hasItem(BlockInit.ROSE_GOLD_BLOCK), conditionsFromItem(BlockInit.ROSE_GOLD_BLOCK))
                .offerTo(exporter, PixelsSupplements.id("rose_gold_block_to_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ItemInit.ROSE_GOLD_INGOT)
                .input('#', ItemInit.COPPER_ALLOY)
                .input('I', Items.IRON_INGOT)
                .input('G', Items.GOLD_INGOT)
                .pattern("##I")
                .pattern("IGG")
                .group("rose_gold_ingot")
                .criterion(hasItem(ItemInit.COPPER_ALLOY), conditionsFromItem(ItemInit.COPPER_ALLOY))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, PixelsSupplements.id("rose_gold_ingot_recipe"));

        //ROSE GOLD SWORD
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemInit.ROSE_GOLD_SWORD)
                .input('R', ItemInit.ROSE_GOLD_INGOT)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("R")
                .pattern("R")
                .pattern("S")
                .group("rose_gold_sword")
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
                .group("rose_gold_axe")
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
                .group("rose_gold_pickaxe")
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
                .group("rose_gold_shovel")
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
                .group("rose_gold_hoe")
                .criterion(hasItem(ItemInit.ROSE_GOLD_INGOT), conditionsFromItem(ItemInit.ROSE_GOLD_INGOT))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemInit.ROSE_GOLD_HELMET)
                .input('E', ItemInit.ROSE_GOLD_INGOT)
                .pattern(" EEE")
                .pattern(" E E")
                .criterion(hasItem(ItemInit.ROSE_GOLD_INGOT), conditionsFromItem(ItemInit.ROSE_GOLD_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemInit.ROSE_GOLD_CHESTPLATE)
                .input('E', ItemInit.ROSE_GOLD_INGOT)
                .pattern(" E E")
                .pattern(" EEE")
                .pattern(" EEE")
                .criterion(hasItem(ItemInit.ROSE_GOLD_INGOT), conditionsFromItem(ItemInit.ROSE_GOLD_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemInit.ROSE_GOLD_LEGGINGS)
                .input('E', ItemInit.ROSE_GOLD_INGOT)
                .pattern(" EEE")
                .pattern(" E E")
                .pattern(" E E")
                .criterion(hasItem(ItemInit.ROSE_GOLD_INGOT), conditionsFromItem(ItemInit.ROSE_GOLD_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemInit.ROSE_GOLD_BOOTS)
                .input('E', ItemInit.ROSE_GOLD_INGOT)
                .pattern(" E E")
                .pattern(" E E")
                .criterion(hasItem(ItemInit.ROSE_GOLD_INGOT), conditionsFromItem(ItemInit.ROSE_GOLD_INGOT))
                .offerTo(exporter);

        //VANILLA ADDITIONS
        //CHAINMAIL ARMOR
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Items.CHAINMAIL_HELMET)
                .input('C', Items.CHAIN)
                .pattern("CCC")
                .pattern("C C")
                .criterion(hasItem(Items.CHAIN), conditionsFromItem(Items.CHAIN))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Items.CHAINMAIL_CHESTPLATE)
                .input('C', Items.CHAIN)
                .pattern("C C")
                .pattern("CCC")
                .pattern("CCC")
                .criterion(hasItem(Items.CHAIN), conditionsFromItem(Items.CHAIN))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Items.CHAINMAIL_LEGGINGS)
                .input('C', Items.CHAIN)
                .pattern("CCC")
                .pattern("C C")
                .pattern("C C")
                .criterion(hasItem(Items.CHAIN), conditionsFromItem(Items.CHAIN))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Items.CHAINMAIL_BOOTS)
                .input('C', Items.CHAIN)
                .pattern("C C")
                .pattern("C C")
                .criterion(hasItem(Items.CHAIN), conditionsFromItem(Items.CHAIN))
                .offerTo(exporter);


        //HORSE ARMOR
        //IRON HORSE ARMOR
        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, Items.IRON_HORSE_ARMOR)
                .input('X', Items.IRON_INGOT)
                .input('O', Items.LEATHER)
                .pattern("X X")
                .pattern("XOX")
                .pattern("X X")
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.LEATHER), conditionsFromItem(Items.LEATHER))
                .offerTo(exporter);

        //IRON HORSE ARMOR
        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, Items.GOLDEN_HORSE_ARMOR)
                .input('X', Items.GOLD_INGOT)
                .input('O', Items.LEATHER)
                .pattern("X X")
                .pattern("XOX")
                .pattern("X X")
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .criterion(hasItem(Items.LEATHER), conditionsFromItem(Items.LEATHER))
                .offerTo(exporter);


    }

    private static @NotNull String hasTag(@NotNull TagKey<Item> tag) {
        return "has_" + tag.id().toString();
    }
}
