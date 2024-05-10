package net.slyzoo.thekitchensink.item;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.slyzoo.thekitchensink.Thekitchensink;

import java.util.function.Supplier;

public enum ModArmourMaterials implements ArmorMaterial {
    SAPPHIRE("sapphire",25, new int[] {3, 8, 6, 3}, 19, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2f, 0.1f, ()->Ingredient.ofItems(ModItems.SAPPHIRE)),
    JADE("jade",25, new int[] {3, 8, 6, 3}, 19, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2f, 0.1f, ()->Ingredient.ofItems(ModItems.JADE)),
    RUBY("ruby",25, new int[] {3, 8, 6, 3}, 19, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2f, 0.1f, ()->Ingredient.ofItems(ModItems.RUBY)),
    TOPAZ("topaz",25, new int[] {3, 8, 6, 3}, 19, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2f, 0.1f, ()->Ingredient.ofItems(ModItems.TOPAZ)),
    JASPER("jasper",25, new int[] {3, 8, 6, 3}, 19, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2f, 0.1f, ()->Ingredient.ofItems(ModItems.JASPER)),
    GARNET("garnet",25, new int[] {3, 8, 6, 3}, 19, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2f, 0.1f, ()->Ingredient.ofItems(ModItems.GARNET)),
    ROSE_QUARTZ("rose_quartz",25, new int[] {3, 8, 6, 3}, 19, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2f, 0.1f, ()->Ingredient.ofItems(ModItems.ROSE_QUARTZ)),

    ALUMINIUM("aluminium",25, new int[] {3, 8, 6, 3}, 19, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2f, 0.1f, ()->Ingredient.ofItems(ModItems.ALUMINIUM_INGOT)),
    BRONZE("bronze",25, new int[] {3, 8, 6, 3}, 19, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2f, 0.1f, ()->Ingredient.ofItems(ModItems.BRONZE_INGOT)),
    PURPLE_GOLD("purple_gold",25, new int[] {3, 8, 6, 3}, 19, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 2f, 0.1f, ()->Ingredient.ofItems(ModItems.PURPLE_GOLD_INGOT)),
    STEEL("steel",25, new int[] {3, 8, 6, 3}, 19, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2f, 0.1f, ()->Ingredient.ofItems(ModItems.STEEL_INGOT));

    private final String name;
    private final int durabilityMultiplayer;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = {11, 16, 15, 13};

    ModArmourMaterials(String name, int durabilityMultiplayer, int[] protectionAmounts, int enchantability, SoundEvent equipSound,
                       float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplayer = durabilityMultiplayer;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }


    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal() % this.durabilityMultiplayer];
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return protectionAmounts[type.ordinal()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return Thekitchensink.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
