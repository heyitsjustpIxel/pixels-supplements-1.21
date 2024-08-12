package com.hijpixel.supplements.provider;

import com.hijpixel.supplements.init.BlockInit;
import com.hijpixel.supplements.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class PixelsSupplementsModelProvider extends FabricModelProvider {
    public PixelsSupplementsModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.ROSE_GOLD_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //COPPER
        itemModelGenerator.register(ItemInit.COPPER_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ItemInit.COPPER_ALLOY, Models.GENERATED);

        //ROSE GOLD STUFFS
        itemModelGenerator.register(ItemInit.ROSE_GOLD_INGOT, Models.GENERATED);
        itemModelGenerator.register(ItemInit.ROSE_GOLD_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.ROSE_GOLD_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.ROSE_GOLD_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.ROSE_GOLD_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.ROSE_GOLD_HOE, Models.HANDHELD);

        //FOODS
        itemModelGenerator.register(ItemInit.ORANGE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.PEPPER, Models.GENERATED);
        itemModelGenerator.register(ItemInit.DIAMOND_APPLE, Models.GENERATED);
    }
}
