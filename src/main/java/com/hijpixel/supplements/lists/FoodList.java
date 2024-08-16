package com.hijpixel.supplements.lists;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class FoodList {
    //Orange
    public static final FoodComponent ORANGE = (new FoodComponent.Builder())
            .nutrition(4)
            .saturationModifier(0.4F)
            .build();

    //Pepper
    public static final FoodComponent PEPPER = (new FoodComponent.Builder())
            .nutrition(2)
            .saturationModifier(0.1F)
            .snack()
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 2, 1), 0.25F)
            .build();

    public static final FoodComponent ROSE_GOLD_APPLE = (new FoodComponent.Builder())
            .nutrition(4)
            .saturationModifier(1.1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 2), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 3600, 2), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 3600, 1), 1.0F)
            .alwaysEdible()
            .build();

    //Diamond Apple
    public static final FoodComponent DIAMOND_APPLE = (new FoodComponent.Builder())
            .nutrition(8)
            .saturationModifier(0.8F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1800, 3), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 5, 2), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 3600, 2), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 3600, 2), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 2400, 0), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 3000, 4), 1.0F)
            .alwaysEdible()
    .build();
}
