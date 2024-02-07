package net.slyzoo.thekitchensink.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.slyzoo.thekitchensink.Thekitchensink;
import net.slyzoo.thekitchensink.item.custom.MetalDetectorItem;

public class ModItems {
//      Gems
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item GARNET = registerItem("garnet", new Item(new FabricItemSettings()));
    public static final Item TOPAZ = registerItem("topaz", new Item(new FabricItemSettings()));
    public static final Item JADE = registerItem("jade", new Item(new FabricItemSettings()));
    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new FabricItemSettings()));
    public static final Item PEARL = registerItem("pearl", new Item(new FabricItemSettings()));
    public static final Item ROSE_QUARTZ = registerItem("rose_quartz", new Item(new FabricItemSettings()));
    public static final Item JASPER = registerItem("jasper", new Item(new FabricItemSettings()));

//      Ingots
    public static final Item ALUMINIUM_INGOT = registerItem("aluminium_ingot", new Item(new FabricItemSettings()));
    public static final Item BRONZE_INGOT = registerItem("bronze_ingot", new Item(new FabricItemSettings()));
    public static final Item PURPLE_GOLD_INGOT = registerItem("purple_gold_ingot", new Item(new FabricItemSettings()));
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new FabricItemSettings()));
    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(new FabricItemSettings()));
    public static final Item ZINC_INGOT = registerItem("zinc_ingot", new Item(new FabricItemSettings()));
    public static final Item FIRE_INFUSED_STEEL_INGOT = registerItem("fire_infused_steel_ingot", new Item(new FabricItemSettings()));
    public static final Item WATER_INFUSED_STEEL_INGOT = registerItem("water_infused_steel_ingot", new Item(new FabricItemSettings()));
    public static final Item EARTH_INFUSED_STEEL_INGOT = registerItem("earth_infused_steel_ingot", new Item(new FabricItemSettings()));
    public static final Item AIR_INFUSED_STEEL_INGOT = registerItem("air_infused_steel_ingot", new Item(new FabricItemSettings()));

//    Currency
    public static final Item BRONZE_COIN = registerItem("bronze_coin", new Item(new FabricItemSettings()));
    public static final Item COPPER_COIN = registerItem("copper_coin", new Item(new FabricItemSettings()));
    public static final Item IRON_COIN = registerItem("iron_coin", new Item(new FabricItemSettings()));
    public static final Item GOLD_COIN = registerItem("gold_coin", new Item(new FabricItemSettings()));
    public static final Item STEEL_COIN = registerItem("steel_coin", new Item(new FabricItemSettings()));
    public static final Item ALUMINIUM_COIN = registerItem("aluminium_coin", new Item(new FabricItemSettings()));
    public static final Item DIAMOND_COIN = registerItem("diamond_coin", new Item(new FabricItemSettings()));
    public static final Item NETHERITE_COIN = registerItem("netherite_coin", new Item(new FabricItemSettings()));

//      Flowers

//      Raw Ore
    public static final Item RAW_ALUMINIUM = registerItem("raw_aluminium", new Item(new FabricItemSettings()));
    public static final Item RAW_TIN = registerItem("raw_tin", new Item(new FabricItemSettings()));
    public static final Item RAW_ZINC = registerItem("raw_zinc", new Item(new FabricItemSettings()));

//      Misc
    public static final Item ENDER_STAR = registerItem("ender_star", new Item(new FabricItemSettings()));
    public static final Item OBSIDIAN_STICK = registerItem("obsidian_stick", new Item(new FabricItemSettings()));
    public static final Item METAL_DETECTOR = registerItem("metal_detector", new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));
    public static final Item SOUL = registerItem("soul", new Item(new FabricItemSettings()));

//    Hearts
    public static final Item HEART = registerItem("heart", new Item(new FabricItemSettings()));
    public static final Item COPPER_PLATED_HEART = registerItem("copper_plated_heart", new Item(new FabricItemSettings()));
    public static final Item IRON_PLATED_HEART = registerItem("iron_plated_heart", new Item(new FabricItemSettings()));
    public static final Item GOLDEN_PLATED_HEART = registerItem("golden_plated_heart", new Item(new FabricItemSettings()));
    public static final Item DIAMOND_PLATED_HEART = registerItem("diamond_plated_heart", new Item(new FabricItemSettings()));
    public static final Item NETHERITE_PLATED_HEART = registerItem("netherite_plated_heart", new Item(new FabricItemSettings()));

//     Weapons
    public static final Item LIFESTEALER_SWORD = registerItem("lifestealer_sword", new Item(new FabricItemSettings()));
    public static final Item DARK_ENERGY_SWORD = registerItem("dark_energy_sword", new Item(new FabricItemSettings()));
    public static final Item VOIDSTAR_SWORD = registerItem("voidstar_sword", new Item(new FabricItemSettings()));
    public static final Item DEATHS_SCYTHE = registerItem("deaths_scythe", new Item(new FabricItemSettings()));

//    Fruit
    public static final Item CHERRY = registerItem("cherry", new Item(new FabricItemSettings().food(ModFoodComponents.CHERRY)));
    public static final Item STRAWBERRY = registerItem("strawberry", new Item(new FabricItemSettings().food(ModFoodComponents.STRAWBERRY)));
    public static final Item RASPBERRY = registerItem("raspberry", new Item(new FabricItemSettings().food(ModFoodComponents.RASPBERRY)));
    public static final Item BLUEBERRY = registerItem("blueberry", new Item(new FabricItemSettings().food(ModFoodComponents.BLUEBERRY)));
    public static final Item BLACKBERRY = registerItem("blackberry", new Item(new FabricItemSettings().food(ModFoodComponents.BLACKBERRY)));
    public static final Item ORANGE = registerItem("orange", new Item(new FabricItemSettings().food(ModFoodComponents.ORANGE)));
    public static final Item LEMON = registerItem("lemon", new Item(new FabricItemSettings().food(ModFoodComponents.LEMON)));
    public static final Item LIME = registerItem("lime", new Item(new FabricItemSettings().food(ModFoodComponents.LIME)));
    public static final Item GRAPEFRUIT = registerItem("grapefruit", new Item(new FabricItemSettings().food(ModFoodComponents.GRAPEFRUIT)));
    public static final Item PINEAPPLE = registerItem("pineapple", new Item(new FabricItemSettings().food(ModFoodComponents.PINEAPPLE)));
    public static final Item BANANA = registerItem("banana", new Item(new FabricItemSettings().food(ModFoodComponents.BANANA)));
    public static final Item KIWI = registerItem("kiwi", new Item(new FabricItemSettings().food(ModFoodComponents.KIWI)));
    public static final Item DRAGON_FRUIT = registerItem("dragon_fruit", new Item(new FabricItemSettings().food(ModFoodComponents.DRAGON_FRUIT)));
    public static final Item CANTALOUPE = registerItem("cantaloupe", new Item(new FabricItemSettings().food(ModFoodComponents.CANTALOUPE)));

//    Bread
    public static final Item BAGUETTE = registerItem("baguette", new Item(new FabricItemSettings().food(ModFoodComponents.BAGUETTE)));

//    Veggies

//    Special Fruit
    public static final Item DIAMOND_APPLE = registerItem("diamond_apple", new Item(new FabricItemSettings()
        .food(ModFoodComponents.DIAMOND_APPLE)));
    public static final Item NETHERITE_APPLE = registerItem("netherite_apple", new Item(new FabricItemSettings()
            .food(ModFoodComponents.NETHERITE_APPLE)));

//    Fuel
    public static final Item CRUMPLED_PAPER = registerItem("crumpled_paper", new Item(new FabricItemSettings()));

    //      Registering the item
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Thekitchensink.MOD_ID, name), item);
    }
//      Logging the items
    public static void registerModItems(){
        Thekitchensink.LOGGER.info("registering Mod Items for "+ Thekitchensink.MOD_ID);
    }
}
