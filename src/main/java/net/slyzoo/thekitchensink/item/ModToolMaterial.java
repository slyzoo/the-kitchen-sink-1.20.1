package net.slyzoo.thekitchensink.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
//    Gems
    SAPPHIRE(5, 4851, 11.3f, 3.5f, 30, () -> Ingredient.ofItems(ModItems.SAPPHIRE)),
    JADE(5, 4851, 10.1f, 3.5f, 29, () -> Ingredient.ofItems(ModItems.JADE)),
    RUBY(5, 4851, 9.0f, 3.0f, 20, () -> Ingredient.ofItems(ModItems.RUBY)),
    TOPAZ(5,   4851, 5f, 3.5f, 26, () -> Ingredient.ofItems(ModItems.TOPAZ)),
    JASPER(MiningLevels.IRON,3911 , 7.4f, 3.5f, 27, () -> Ingredient.ofItems(ModItems.JASPER)),
    GARNET(MiningLevels.IRON,3441 , 1.6f, 3.5f, 22, () -> Ingredient.ofItems(ModItems.GARNET)),
    ROSE_QUARTZ(MiningLevels.STONE, 2501, 6.0f, 3.5f, 26, () -> Ingredient.ofItems(ModItems.ROSE_QUARTZ)),

//    Metals
    ALUMINIUM(MiningLevels.IRON, 650, 7.4f, 3.5f, 14, () -> Ingredient.ofItems(ModItems.ALUMINIUM_INGOT)),
    BRONZE(MiningLevels.IRON, 650, 7.4f, 3.5f, 22, () -> Ingredient.ofItems(ModItems.BRONZE_INGOT)),
    PURPLE_GOLD(MiningLevels.WOOD, 650, 7.4f, 3.5f, 21, () -> Ingredient.ofItems(ModItems.PURPLE_GOLD_INGOT)),
    STEEL(MiningLevels.IRON, 650, 7.4f, 3.5f, 14, () -> Ingredient.ofItems(ModItems.STEEL_INGOT)),

//    God-Like
    LIFESTEALER(5, 650, 7.4f, 3.5f, 26, () -> Ingredient.ofItems(ModItems.HEART)),
    DEATHS(5, 650, 7.4f, 3.5f, 26, () -> Ingredient.ofItems(ModItems.STEEL_INGOT)),
    DARK_ENERGY(5, 650, 7.4f, 3.5f, 26, () -> Ingredient.ofItems(ModItems.ENDER_STAR)),
    VOIDSTAR(5, 650, 7.4f, 3.5f, 26, () -> Ingredient.ofItems(ModItems.ENDER_STAR)),


    ;

    private final int mininglevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterial(int mininglevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.mininglevel = mininglevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.mininglevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
