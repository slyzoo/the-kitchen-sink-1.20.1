package net.slyzoo.thekitchensink.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.slyzoo.thekitchensink.Thekitchensink;
import net.slyzoo.thekitchensink.item.custom.MetalDetectorItem;

public class ModItems {

//      Gems
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RUBY_SWORD = registerItem("ruby_sword",
            new SwordItem(ModToolMaterial.RUBY, 10, 1f,  new FabricItemSettings()));
    public static final Item RUBY_AXE = registerItem("ruby_axe",
            new AxeItem(ModToolMaterial.RUBY, 10, 1f,  new FabricItemSettings()));
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
            new PickaxeItem(ModToolMaterial.RUBY, 10, 1f,  new FabricItemSettings()));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel",
            new ShovelItem(ModToolMaterial.RUBY, 10, 1f,  new FabricItemSettings()));
    public static final Item RUBY_HOE = registerItem("ruby_hoe",
            new HoeItem(ModToolMaterial.RUBY, 10, 1f,  new FabricItemSettings()));

    /* colours for gimp
     * hue : 180.0
     * lightness : 00.0
     * saturation : % */

    public static final Item GARNET = registerItem("garnet", new Item(new FabricItemSettings()));
    public static final Item GARNET_SWORD = registerItem("garnet_sword",
            new SwordItem(ModToolMaterial.GARNET, 10, 1f,  new FabricItemSettings()));
    public static final Item GARNET_AXE = registerItem("garnet_axe",
            new AxeItem(ModToolMaterial.GARNET, 10, 1f,  new FabricItemSettings()));
    public static final Item GARNET_PICKAXE = registerItem("garnet_pickaxe",
            new PickaxeItem(ModToolMaterial.GARNET, 10, 1f,  new FabricItemSettings()));
    public static final Item GARNET_SHOVEL = registerItem("garnet_shovel",
            new ShovelItem(ModToolMaterial.GARNET, 10, 1f,  new FabricItemSettings()));
    public static final Item GARNET_HOE = registerItem("garnet_hoe",
            new HoeItem(ModToolMaterial.GARNET, 10, 1f,  new FabricItemSettings()));
    /* colours for gimp
     * hue : -180.0
     * lightness : -30.0
     * saturation : % */

    public static final Item TOPAZ = registerItem("topaz", new Item(new FabricItemSettings()));
    public static final Item TOPAZ_SWORD = registerItem("topaz_sword",
            new SwordItem(ModToolMaterial.TOPAZ, 10, 1f,  new FabricItemSettings()));
    public static final Item TOPAZ_AXE = registerItem("topaz_axe",
            new AxeItem(ModToolMaterial.TOPAZ, 10, 1f,  new FabricItemSettings()));
    public static final Item TOPAZ_PICKAXE = registerItem("topaz_pickaxe",
            new PickaxeItem(ModToolMaterial.TOPAZ, 10, 1f,  new FabricItemSettings()));
    public static final Item TOPAZ_SHOVEL = registerItem("topaz_shovel",
            new ShovelItem(ModToolMaterial.TOPAZ, 10, 1f,  new FabricItemSettings()));
    public static final Item TOPAZ_HOE = registerItem("topaz_hoe",
            new HoeItem(ModToolMaterial.TOPAZ, 10, 1f,  new FabricItemSettings()));
    /* colours for gimp
     * hue : -120.0
     * lightness : 00.0
     * saturation : % */

    public static final Item JADE = registerItem("jade", new Item(new FabricItemSettings()));
    public static final Item JADE_SWORD = registerItem("jade_sword",
            new SwordItem(ModToolMaterial.JADE, 10, 1f,  new FabricItemSettings()));
    public static final Item JADE_AXE = registerItem("jade_axe",
            new AxeItem(ModToolMaterial.JADE, 10, 1f,  new FabricItemSettings()));
    public static final Item JADE_PICKAXE = registerItem("jade_pickaxe",
            new PickaxeItem(ModToolMaterial.JADE, 10, 1f,  new FabricItemSettings()));
    public static final Item JADE_SHOVEL = registerItem("jade_shovel",
            new ShovelItem(ModToolMaterial.JADE, 10, 1f,  new FabricItemSettings()));
    public static final Item JADE_HOE = registerItem("jade_hoe",
            new HoeItem(ModToolMaterial.JADE, 10, 1f,  new FabricItemSettings()));
    /* colours for gimp
    * hue : -56.0
    * lightness : -54.0
    * saturation : 100% */

    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new FabricItemSettings()));
    public static final Item SAPPHIRE_SWORD = registerItem("sapphire_sword",
            new SwordItem(ModToolMaterial.SAPPHIRE, 10, 1f,  new FabricItemSettings()));
    public static final Item SAPPHIRE_AXE = registerItem("sapphire_axe",
            new AxeItem(ModToolMaterial.SAPPHIRE, 10, 1f,  new FabricItemSettings()));
    public static final Item SAPPHIRE_PICKAXE = registerItem("sapphire_pickaxe",
            new PickaxeItem(ModToolMaterial.SAPPHIRE, 10, 1f,  new FabricItemSettings()));
    public static final Item SAPPHIRE_SHOVEL = registerItem("sapphire_shovel",
            new ShovelItem(ModToolMaterial.SAPPHIRE, 10, 1f,  new FabricItemSettings()));
    public static final Item SAPPHIRE_HOE = registerItem("sapphire_hoe",
            new HoeItem(ModToolMaterial.SAPPHIRE, 10, 1f,  new FabricItemSettings()));
    /* colours for gimp
     * hue : 55.0
     * lightness : 10.0
     * saturation : % */

    public static final Item PEARL = registerItem("pearl", new Item(new FabricItemSettings()));
    /* colours for gimp
     * hue : 00.0
     * lightness : 100.0
     * saturation : 100% */

    public static final Item ROSE_QUARTZ = registerItem("rose_quartz", new Item(new FabricItemSettings()));
    public static final Item ROSE_QUARTZ_SWORD = registerItem("rose_quartz_sword",
            new SwordItem(ModToolMaterial.ROSE_QUARTZ, 10, 1f,  new FabricItemSettings()));
    public static final Item ROSE_QUARTZ_AXE = registerItem("rose_quartz_axe",
            new AxeItem(ModToolMaterial.ROSE_QUARTZ, 10, 1f,  new FabricItemSettings()));
    public static final Item ROSE_QUARTZ_PICKAXE = registerItem("rose_quartz_pickaxe",
            new PickaxeItem(ModToolMaterial.ROSE_QUARTZ, 10, 1f,  new FabricItemSettings()));
    public static final Item ROSE_QUARTZ_SHOVEL = registerItem("rose_quartz_shovel",
            new ShovelItem(ModToolMaterial.ROSE_QUARTZ, 10, 1f,  new FabricItemSettings()));
    public static final Item ROSE_QUARTZ_HOE = registerItem("rose_quartz_hoe",
            new HoeItem(ModToolMaterial.ROSE_QUARTZ, 10, 1f,  new FabricItemSettings()));
    /* colours for gimp
     * hue : 135.0
     * lightness : 50.0
     * saturation : % */

    public static final Item JASPER = registerItem("jasper", new Item(new FabricItemSettings()));
    public static final Item JASPER_SWORD = registerItem("jasper_sword",
            new SwordItem(ModToolMaterial.JASPER, 10, 1f,  new FabricItemSettings()));
    public static final Item JASPER_AXE = registerItem("jasper_axe",
            new AxeItem(ModToolMaterial.JASPER, 10, 1f,  new FabricItemSettings()));
    public static final Item JASPER_PICKAXE = registerItem("jasper_pickaxe",
            new PickaxeItem(ModToolMaterial.JASPER, 10, 1f,  new FabricItemSettings()));
    public static final Item JASPER_SHOVEL = registerItem("jasper_shovel",
            new ShovelItem(ModToolMaterial.JASPER, 10, 1f,  new FabricItemSettings()));
    public static final Item JASPER_HOE = registerItem("jasper_hoe",
            new HoeItem(ModToolMaterial.JASPER, 10, 1f,  new FabricItemSettings()));
    /* colours for gimp
     * hue : 120.0
     * lightness : 10.0
     * saturation : % */

//      Ingots
    public static final Item ALUMINIUM_INGOT = registerItem("aluminium_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_ALUMINIUM = registerItem("raw_aluminium", new Item(new FabricItemSettings()));
    public static final Item ALUMINIUM_NUGGET = registerItem("aluminium_nugget", new Item(new FabricItemSettings()));
    public static final Item ALUMINIUM_COIN = registerItem("aluminium_coin", new Item(new FabricItemSettings()));
    public static final Item ALUMINIUM_SWORD = registerItem("aluminium_sword",
            new SwordItem(ModToolMaterial.ALUMINIUM, 10, 1f,  new FabricItemSettings()));
    public static final Item ALUMINIUM_AXE = registerItem("aluminium_axe",
            new AxeItem(ModToolMaterial.ALUMINIUM, 10, 1f,  new FabricItemSettings()));
    public static final Item ALUMINIUM_PICKAXE = registerItem("aluminium_pickaxe",
            new PickaxeItem(ModToolMaterial.ALUMINIUM, 10, 1f,  new FabricItemSettings()));
    public static final Item ALUMINIUM_SHOVEL = registerItem("aluminium_shovel",
            new ShovelItem(ModToolMaterial.ALUMINIUM, 10, 1f,  new FabricItemSettings()));
    public static final Item ALUMINIUM_HOE = registerItem("aluminium_hoe",
            new HoeItem(ModToolMaterial.ALUMINIUM, 10, 1f,  new FabricItemSettings()));
    /* start from gold and do
     * -100.0 saturation
     * 85.0 lightness */

    public static final Item BRONZE_INGOT = registerItem("bronze_ingot", new Item(new FabricItemSettings()));
    public static final Item BRONZE_NUGGET = registerItem("bronze_nugget", new Item(new FabricItemSettings()));
    public static final Item BRONZE_COIN = registerItem("bronze_coin", new Item(new FabricItemSettings()));
    public static final Item BRONZE_SWORD = registerItem("bronze_sword",
            new SwordItem(ModToolMaterial.BRONZE, 10, 1f,  new FabricItemSettings()));
    public static final Item BRONZE_AXE = registerItem("bronze_axe",
            new AxeItem(ModToolMaterial.BRONZE, 10, 1f,  new FabricItemSettings()));
    public static final Item BRONZE_PICKAXE = registerItem("bronze_pickaxe",
            new PickaxeItem(ModToolMaterial.BRONZE, 10, 1f,  new FabricItemSettings()));
    public static final Item BRONZE_SHOVEL = registerItem("bronze_shovel",
            new ShovelItem(ModToolMaterial.BRONZE, 10, 1f,  new FabricItemSettings()));
    public static final Item BRONZE_HOE = registerItem("bronze_hoe",
            new HoeItem(ModToolMaterial.BRONZE, 10, 1f,  new FabricItemSettings()));
    /* colours for gimp
     * hue : -150.0
     * lightness : 25.0
     * saturation : % */

    public static final Item PURPLE_GOLD_INGOT = registerItem("purple_gold_ingot", new Item(new FabricItemSettings()));
    public static final Item PURPLE_GOLD_SWORD = registerItem("purple_gold_sword",
            new SwordItem(ModToolMaterial.PURPLE_GOLD, 10, 1f,  new FabricItemSettings()));
    public static final Item PURPLE_GOLD_AXE = registerItem("purple_gold_axe",
            new AxeItem(ModToolMaterial.PURPLE_GOLD, 10, 1f,  new FabricItemSettings()));
    public static final Item PURPLE_GOLD_PICKAXE = registerItem("purple_gold_pickaxe",
            new PickaxeItem(ModToolMaterial.PURPLE_GOLD, 10, 1f,  new FabricItemSettings()));
    public static final Item PURPLE_GOLD_SHOVEL = registerItem("purple_gold_shovel",
            new ShovelItem(ModToolMaterial.PURPLE_GOLD, 10, 1f,  new FabricItemSettings()));
    public static final Item PURPLE_GOLD_HOE = registerItem("purple_gold_hoe",
            new HoeItem(ModToolMaterial.PURPLE_GOLD, 10, 1f,  new FabricItemSettings()));
    /* colours for gimp
     * hue : 00.0
     * lightness : 00.0
     * saturation : % */

    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new FabricItemSettings()));
    public static final Item STEEL_NUGGET = registerItem("steel_nugget", new Item(new FabricItemSettings()));
    public static final Item STEEL_COIN = registerItem("steel_coin", new Item(new FabricItemSettings()));
    public static final Item STEEL_SWORD = registerItem("steel_sword",
            new SwordItem(ModToolMaterial.STEEL, 10, 1f,  new FabricItemSettings()));
    public static final Item STEEL_AXE = registerItem("steel_axe",
            new AxeItem(ModToolMaterial.STEEL, 10, 1f,  new FabricItemSettings()));
    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe",
            new PickaxeItem(ModToolMaterial.STEEL, 10, 1f,  new FabricItemSettings()));
    public static final Item STEEL_SHOVEL = registerItem("steel_shovel",
            new ShovelItem(ModToolMaterial.STEEL, 10, 1f,  new FabricItemSettings()));
    public static final Item STEEL_HOE = registerItem("steel_hoe",
            new HoeItem(ModToolMaterial.STEEL, 10, 1f,  new FabricItemSettings()));

    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_TIN = registerItem("raw_tin", new Item(new FabricItemSettings()));
    public static final Item TIN_NUGGET = registerItem("tin_nugget", new Item(new FabricItemSettings()));

    public static final Item ZINC_INGOT = registerItem("zinc_ingot", new Item(new FabricItemSettings()));
    public static final Item ZINC_NUGGET = registerItem("zinc_nugget", new Item(new FabricItemSettings()));
    public static final Item RAW_ZINC = registerItem("raw_zinc", new Item(new FabricItemSettings()));

    public static final Item HEART = registerItem("heart", new Item(new FabricItemSettings()));

//  Elemental Infused Vanilla Materials
    public static final Item IRON_COIN = registerItem("iron_coin", new Item(new FabricItemSettings()));
    public static final Item IRON_PLATED_HEART = registerItem("iron_plated_heart", new Item(new FabricItemSettings()));

    public static final Item COPPER_NUGGET = registerItem("copper_nugget", new Item(new FabricItemSettings()));
    public static final Item COPPER_COIN = registerItem("copper_coin", new Item(new FabricItemSettings()));
    public static final Item COPPER_PLATED_HEART = registerItem("copper_plated_heart", new Item(new FabricItemSettings()));

    public static final Item GOLD_COIN = registerItem("gold_coin", new Item(new FabricItemSettings()));
    public static final Item GOLDEN_PLATED_HEART = registerItem("golden_plated_heart", new Item(new FabricItemSettings()));

    public static final Item DIAMOND_NUGGET = registerItem("diamond_nugget", new Item(new FabricItemSettings()));
    public static final Item DIAMOND_COIN = registerItem("diamond_coin", new Item(new FabricItemSettings()));
    public static final Item DIAMOND_PLATED_HEART = registerItem("diamond_plated_heart", new Item(new FabricItemSettings()));
    public static final Item DIAMOND_APPLE = registerItem("diamond_apple", new Item(new FabricItemSettings()
        .food(ModFoodComponents.DIAMOND_APPLE)));

    public static final Item NETHERITE_NUGGET = registerItem("netherite_nugget", new Item(new FabricItemSettings()));
    public static final Item NETHERITE_COIN = registerItem("netherite_coin", new Item(new FabricItemSettings()));
    public static final Item NETHERITE_PLATED_HEART = registerItem("netherite_plated_heart", new Item(new FabricItemSettings()));
    public static final Item NETHERITE_APPLE = registerItem("netherite_apple", new Item(new FabricItemSettings()
            .food(ModFoodComponents.NETHERITE_APPLE)));

//      Misc
    public static final Item ENDER_STAR = registerItem("ender_star", new Item(new FabricItemSettings()));
    public static final Item OBSIDIAN_STICK = registerItem("obsidian_stick", new Item(new FabricItemSettings()));
    public static final Item METAL_DETECTOR = registerItem("metal_detector", new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));
    public static final Item SOUL = registerItem("soul", new Item(new FabricItemSettings()));

//     God-Like Weapons
    public static final Item LIFESTEALER_SWORD = registerItem("lifestealer_sword",
        new SwordItem(ModToolMaterial.LIFESTEALER, 10, 1f,  new FabricItemSettings()));
    public static final Item DARK_ENERGY_SWORD = registerItem("dark_energy_sword",
        new SwordItem(ModToolMaterial.DARK_ENERGY, 10, 1f,new FabricItemSettings()));
    public static final Item VOIDSTAR_SWORD = registerItem("voidstar_sword",
        new SwordItem(ModToolMaterial.VOIDSTAR, 10, 1f,new FabricItemSettings()));
    public static final Item DEATHS_SCYTHE = registerItem("deaths_scythe",
        new SwordItem(ModToolMaterial.DEATHS, 10, 1f,new FabricItemSettings()));

//    Fruit
    public static final Item BANANA = registerItem("banana", new Item(new FabricItemSettings().food(ModFoodComponents.BANANA)));
    public static final Item BLACKBERRY = registerItem("blackberry", new Item(new FabricItemSettings().food(ModFoodComponents.BLACKBERRY)));
    public static final Item BLUEBERRY = registerItem("blueberry", new Item(new FabricItemSettings().food(ModFoodComponents.BLUEBERRY)));
    public static final Item CANTALOUPE = registerItem("cantaloupe", new Item(new FabricItemSettings().food(ModFoodComponents.CANTALOUPE)));
    public static final Item CHERRY = registerItem("cherry", new Item(new FabricItemSettings().food(ModFoodComponents.CHERRY)));
    public static final Item DRAGON_FRUIT = registerItem("dragon_fruit", new Item(new FabricItemSettings().food(ModFoodComponents.DRAGON_FRUIT)));
    public static final Item GRAPEFRUIT = registerItem("grapefruit", new Item(new FabricItemSettings().food(ModFoodComponents.GRAPEFRUIT)));
    public static final Item STRAWBERRY = registerItem("strawberry", new Item(new FabricItemSettings().food(ModFoodComponents.STRAWBERRY)));
    public static final Item RASPBERRY = registerItem("raspberry", new Item(new FabricItemSettings().food(ModFoodComponents.RASPBERRY)));
    public static final Item ORANGE = registerItem("orange", new Item(new FabricItemSettings().food(ModFoodComponents.ORANGE)));
    public static final Item LEMON = registerItem("lemon", new Item(new FabricItemSettings().food(ModFoodComponents.LEMON)));
    public static final Item LIME = registerItem("lime", new Item(new FabricItemSettings().food(ModFoodComponents.LIME)));
    public static final Item PINEAPPLE = registerItem("pineapple", new Item(new FabricItemSettings().food(ModFoodComponents.PINEAPPLE)));
    public static final Item KIWI = registerItem("kiwi", new Item(new FabricItemSettings().food(ModFoodComponents.KIWI)));
    public static final Item BAGUETTE = registerItem("baguette", new Item(new FabricItemSettings().food(ModFoodComponents.BAGUETTE)));

//    Fuel
    public static final Item CRUMPLED_PAPER = registerItem("crumpled_paper", new Item(new FabricItemSettings()));

//      Flowers

    //      Registering the item
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Thekitchensink.MOD_ID, name), item);
    }
//      Logging the items
    public static void registerModItems(){
        Thekitchensink.LOGGER.info("registering Mod Items for "+ Thekitchensink.MOD_ID);
    }
}