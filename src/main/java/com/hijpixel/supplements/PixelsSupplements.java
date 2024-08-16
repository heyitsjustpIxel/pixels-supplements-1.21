package com.hijpixel.supplements;

import com.hijpixel.supplements.init.ArmorMaterialInit;
import com.hijpixel.supplements.init.BlockInit;
import com.hijpixel.supplements.init.ItemGroupsInit;
import com.hijpixel.supplements.init.ItemInit;
import net.fabricmc.api.ModInitializer;


import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PixelsSupplements implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("pixels-supplements");
	public static final String MOD_ID = "pixels-supplements";


	@Override
	public void onInitialize() {
		LOGGER.info("Loading Pixel's Supplements...");

		//LOAD THIS SHIT!!
		LOGGER.info("CRAFTING ITEMS...");
		ItemInit.load();
		ArmorMaterialInit.load();
		LOGGER.info("CRAFTING BLOCKS...");
		BlockInit.load();
		LOGGER.info("GROUPING ITEMS...");
		ItemGroupsInit.load();

		LOGGER.info("REARRANGING ITEMS...");
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.addAfter(Items.GOLD_BLOCK, ItemInit.ROSE_GOLD_BLOCK));

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
			entries.addAfter(Items.GOLDEN_SWORD, ItemInit.ROSE_GOLD_SWORD);
			entries.addAfter(Items.GOLDEN_AXE, ItemInit.ROSE_GOLD_AXE);
			entries.addAfter(Items.GOLDEN_BOOTS, ItemInit.ROSE_GOLD_HELMET);
			entries.addAfter(ItemInit.ROSE_GOLD_HELMET, ItemInit.ROSE_GOLD_CHESTPLATE);
			entries.addAfter(ItemInit.ROSE_GOLD_CHESTPLATE, ItemInit.ROSE_GOLD_LEGGINGS);
			entries.addAfter(ItemInit.ROSE_GOLD_LEGGINGS, ItemInit.ROSE_GOLD_BOOTS);
		});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
			entries.addAfter(Items.GOLDEN_HOE, ItemInit.ROSE_GOLD_SHOVEL);
			entries.addAfter(ItemInit.ROSE_GOLD_SHOVEL, ItemInit.ROSE_GOLD_PICKAXE);
			entries.addAfter(ItemInit.ROSE_GOLD_PICKAXE, ItemInit.ROSE_GOLD_AXE);
			entries.addAfter(ItemInit.ROSE_GOLD_AXE, ItemInit.ROSE_GOLD_HOE);
		});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
			entries.addAfter(Items.IRON_NUGGET, ItemInit.COPPER_NUGGET);
			entries.addBefore(Items.COPPER_INGOT, ItemInit.COPPER_ALLOY);
			entries.addAfter(Items.GOLD_INGOT, ItemInit.ROSE_GOLD_INGOT);
		});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
			entries.addAfter(Items.GLOW_BERRIES, ItemInit.ORANGE);
			entries.addAfter(Items.DRIED_KELP , ItemInit.PEPPER);
			entries.addAfter(Items.GOLDEN_APPLE, ItemInit.ROSE_GOLD_APPLE);
			entries.addAfter(Items.ENCHANTED_GOLDEN_APPLE, ItemInit.DIAMOND_APPLE);
		});

		LOGGER.info("Success!!");
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}