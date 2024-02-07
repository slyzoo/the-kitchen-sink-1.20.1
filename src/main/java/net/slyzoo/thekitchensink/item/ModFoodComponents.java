package net.slyzoo.thekitchensink.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
//    Fruit
    public static final FoodComponent CHERRY = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).build();
    public static final FoodComponent STRAWBERRY = new FoodComponent.Builder().hunger(2).saturationModifier(0.25f).build();
    public static final FoodComponent RASPBERRY = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f).build();
    public static final FoodComponent BLUEBERRY = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f).build();
    public static final FoodComponent BLACKBERRY = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f).build();
    public static final FoodComponent ORANGE = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f).build();
    public static final FoodComponent LEMON = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f).build();
    public static final FoodComponent LIME = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f).build();
    public static final FoodComponent GRAPEFRUIT = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f).build();
    public static final FoodComponent PINEAPPLE = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f).build();
    public static final FoodComponent BANANA = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f).build();
    public static final FoodComponent KIWI = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f).build();
    public static final FoodComponent DRAGON_FRUIT = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f).build();
    public static final FoodComponent CANTALOUPE = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f).build();

//    Bread
    public static final FoodComponent BAGUETTE = new FoodComponent.Builder().hunger(10).saturationModifier(0.18f).build();


//                  Special Foods
    public static final FoodComponent DIAMOND_APPLE = new FoodComponent.Builder().hunger(6).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,6000, 2),1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,6000, 3),1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,6000, 3),1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,6000, 2),1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST,6000, 5),1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION,6000, 2),1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 6000, 2), 1.0f)
            .alwaysEdible().build();

    public static final FoodComponent NETHERITE_APPLE = new FoodComponent.Builder().hunger(6).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,6000, 3),1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,6000, 4),1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,6000, 4),1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,6000, 3),1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST,6000, 6),1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION,6000, 3),1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 6000, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 6000, 3), 1.0f)
            .alwaysEdible().build();
}
