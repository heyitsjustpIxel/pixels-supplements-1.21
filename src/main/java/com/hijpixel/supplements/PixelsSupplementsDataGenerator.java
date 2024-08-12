package com.hijpixel.supplements;

import com.hijpixel.supplements.provider.*;
import com.hijpixel.supplements.provider.lang.PixelsSupplementsEnglishLanguageProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class PixelsSupplementsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(PixelsSupplementsModelProvider::new);
		pack.addProvider(PixelsSupplementsEnglishLanguageProvider::new);
		pack.addProvider(SupplementsRecipeGenerator::new);
		pack.addProvider(SupplementsBlockLootProvider::new);
		pack.addProvider(SupplementsBlocksTagProvider::new);
		pack.addProvider(SupplementsItemTagProvider::new);
	}
}
