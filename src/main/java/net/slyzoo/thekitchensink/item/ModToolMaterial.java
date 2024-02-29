package net.slyzoo.thekitchensink.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
//    Gems
    RUBY(5, 650, 7.4f, 3.5f, 26, () -> Ingredient.ofItems(ModItems.RUBY)),
    TOPAZ(5, 650, 7.4f, 3.5f, 26, () -> Ingredient.ofItems(ModItems.TOPAZ)),
    JADE(5, 650, 7.4f, 3.5f, 26, () -> Ingredient.ofItems(ModItems.JADE)),
    SAPPHIRE(5, 650, 7.4f, 3.5f, 26, () -> Ingredient.ofItems(ModItems.SAPPHIRE)),
    GARNET(MiningLevels.IRON, 650, 7.4f, 3.5f, 26, () -> Ingredient.ofItems(ModItems.GARNET)),
    PEARL(MiningLevels.IRON, 650, 7.4f, 3.5f, 26, () -> Ingredient.ofItems(ModItems.PEARL)),
    ROSE_QUARTZ(MiningLevels.STONE, 650, 7.4f, 3.5f, 26, () -> Ingredient.ofItems(ModItems.ROSE_QUARTZ)),
    JASPER(MiningLevels.IRON, 650, 7.4f, 3.5f, 26, () -> Ingredient.ofItems(ModItems.JASPER)),

//    Metals
    ALUMINIUM(MiningLevels.IRON, 650, 7.4f, 3.5f, 26, () -> Ingredient.ofItems(ModItems.ALUMINIUM_INGOT)),
    BRONZE(MiningLevels.IRON, 650, 7.4f, 3.5f, 26, () -> Ingredient.ofItems(ModItems.BRONZE_INGOT)),
    PURPLE_GOLD(MiningLevels.WOOD, 650, 7.4f, 3.5f, 26, () -> Ingredient.ofItems(ModItems.PURPLE_GOLD_INGOT)),
    STEEL(MiningLevels.IRON, 650, 7.4f, 3.5f, 26, () -> Ingredient.ofItems(ModItems.STEEL_INGOT)),
    TIN(MiningLevels.IRON, 650, 7.4f, 3.5f, 26, () -> Ingredient.ofItems(ModItems.TIN_INGOT)),
    ZINC(MiningLevels.IRON, 650, 7.4f, 3.5f, 26, () -> Ingredient.ofItems(ModItems.ZINC_INGOT)),

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
