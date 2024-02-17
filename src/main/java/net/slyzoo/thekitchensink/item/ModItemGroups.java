package net.slyzoo.thekitchensink.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.slyzoo.thekitchensink.Thekitchensink;
import net.slyzoo.thekitchensink.block.ModBlocks;

public class ModItemGroups {


    private static final ItemGroup METALS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.STEEL_INGOT))
            .displayName(Text.translatable("itemgroup.thekitchensink.metals"))
            .entries((context, entries) -> {

//                              Metals
                entries.add(ModBlocks.ALUMINIUM_BLOCK);
                entries.add(ModBlocks.RAW_ALUMINIUM_BLOCK);
                entries.add(ModBlocks.NETHER_ALUMINIUM_ORE);
                entries.add(ModItems.RAW_ALUMINIUM);
                entries.add(ModItems.ALUMINIUM_INGOT);
                entries.add(ModItems.FIRE_INFUSED_ALUMINIUM_INGOT);
                entries.add(ModItems.WATER_INFUSED_ALUMINIUM_INGOT);
                entries.add(ModItems.EARTH_INFUSED_ALUMINIUM_INGOT);
                entries.add(ModItems.AIR_INFUSED_ALUMINIUM_INGOT);
                entries.add(ModItems.ALUMINIUM_NUGGET);
                entries.add(ModItems.ALUMINIUM_COIN);

                entries.add(ModBlocks.BRONZE_BLOCK);
                entries.add(ModItems.BRONZE_INGOT);
                entries.add(ModItems.BRONZE_NUGGET);
                entries.add(ModItems.BRONZE_COIN);

                entries.add(ModItems.AIR_INFUSED_COPPER_INGOT);
                entries.add(ModItems.EARTH_INFUSED_COPPER_INGOT);
                entries.add(ModItems.FIRE_INFUSED_COPPER_INGOT);
                entries.add(ModItems.WATER_INFUSED_COPPER_INGOT);
                entries.add(ModItems.COPPER_COIN);
                entries.add(ModItems.COPPER_NUGGET);

                entries.add(ModBlocks.PURPLE_GOLD_BLOCK);
                entries.add(ModItems.PURPLE_GOLD_INGOT);
                entries.add(ModItems.FIRE_INFUSED_PURPLE_GOLD_INGOT);
                entries.add(ModItems.WATER_INFUSED_PURPLE_GOLD_INGOT);
                entries.add(ModItems.EARTH_INFUSED_PURPLE_GOLD_INGOT);
                entries.add(ModItems.AIR_INFUSED_PURPLE_GOLD_INGOT);

                entries.add(ModBlocks.STEEL_BLOCK);
                entries.add(ModItems.STEEL_INGOT);
                entries.add(ModItems.FIRE_INFUSED_STEEL_INGOT);
                entries.add(ModItems.WATER_INFUSED_STEEL_INGOT);
                entries.add(ModItems.EARTH_INFUSED_STEEL_INGOT);
                entries.add(ModItems.AIR_INFUSED_STEEL_INGOT);
                entries.add(ModItems.STEEL_NUGGET);
                entries.add(ModItems.STEEL_COIN);

                entries.add(ModBlocks.TIN_BLOCK);
                entries.add(ModBlocks.TIN_ORE);
                entries.add(ModBlocks.DEEPSLATE_TIN_ORE);
                entries.add(ModBlocks.RAW_TIN_BLOCK);
                entries.add(ModItems.RAW_TIN);
                entries.add(ModItems.TIN_INGOT);
                entries.add(ModItems.FIRE_INFUSED_TIN_INGOT);
                entries.add(ModItems.WATER_INFUSED_TIN_INGOT);
                entries.add(ModItems.EARTH_INFUSED_TIN_INGOT);
                entries.add(ModItems.AIR_INFUSED_TIN_INGOT);
                entries.add(ModItems.TIN_NUGGET);

                entries.add(ModBlocks.ZINC_BLOCK);
                entries.add(ModBlocks.ZINC_ORE);
                entries.add(ModBlocks.DEEPSLATE_ZINC_ORE);
                entries.add(ModBlocks.RAW_ZINC_BLOCK);
                entries.add(ModItems.RAW_ZINC);
                entries.add(ModItems.ZINC_INGOT);
                entries.add(ModItems.FIRE_INFUSED_ZINC_INGOT);
                entries.add(ModItems.WATER_INFUSED_ZINC_INGOT);
                entries.add(ModItems.EARTH_INFUSED_ZINC_INGOT);
                entries.add(ModItems.AIR_INFUSED_ZINC_INGOT);
                entries.add(ModItems.ZINC_NUGGET);


                entries.add(ModItems.AIR_INFUSED_IRON_INGOT);
                entries.add(ModItems.EARTH_INFUSED_IRON_INGOT);
                entries.add(ModItems.FIRE_INFUSED_IRON_INGOT);
                entries.add(ModItems.WATER_INFUSED_IRON_INGOT);
                entries.add(ModItems.IRON_COIN);

                entries.add(ModItems.AIR_INFUSED_GOLD_INGOT);
                entries.add(ModItems.EARTH_INFUSED_GOLD_INGOT);
                entries.add(ModItems.FIRE_INFUSED_GOLD_INGOT);
                entries.add(ModItems.WATER_INFUSED_GOLD_INGOT);
                entries.add(ModItems.GOLD_COIN);

                entries.add(ModItems.AIR_INFUSED_DIAMOND);
                entries.add(ModItems.EARTH_INFUSED_DIAMOND);
                entries.add(ModItems.FIRE_INFUSED_DIAMOND);
                entries.add(ModItems.WATER_INFUSED_DIAMOND);
                entries.add(ModItems.DIAMOND_NUGGET);
                entries.add(ModItems.DIAMOND_COIN);

                entries.add(ModItems.AIR_INFUSED_NETHER_QUARTZ);
                entries.add(ModItems.EARTH_INFUSED_NETHER_QUARTZ);
                entries.add(ModItems.FIRE_INFUSED_NETHER_QUARTZ);
                entries.add(ModItems.WATER_INFUSED_NETHER_QUARTZ);

                entries.add(ModItems.AIR_INFUSED_NETHERITE_INGOT);
                entries.add(ModItems.EARTH_INFUSED_NETHERITE_INGOT);
                entries.add(ModItems.FIRE_INFUSED_NETHERITE_INGOT);
                entries.add(ModItems.WATER_INFUSED_NETHERITE_INGOT);
                entries.add(ModItems.NETHERITE_NUGGET);
                entries.add(ModItems.NETHERITE_COIN);
                    }).build();

    private static final ItemGroup GEMS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.RUBY))
            .displayName(Text.translatable("itemgroup.thekitchensink.gems"))
            .entries((context, entries) -> {
//                        Gems
                entries.add(ModBlocks.GARNET_BLOCK);
                entries.add(ModBlocks.GARNET_ORE);
                entries.add(ModBlocks.DEEPSLATE_GARNET_ORE);
                entries.add(ModItems.GARNET);
                entries.add(ModItems.AIR_INFUSED_GARNET);
                entries.add(ModItems.EARTH_INFUSED_GARNET);
                entries.add(ModItems.FIRE_INFUSED_GARNET);
                entries.add(ModItems.WATER_INFUSED_GARNET);

                entries.add(ModBlocks.JADE_BLOCK);
                entries.add(ModBlocks.JADE_ORE);
                entries.add(ModBlocks.DEEPSLATE_JADE_ORE);
                entries.add(ModItems.JADE);
                entries.add(ModItems.AIR_INFUSED_JADE);
                entries.add(ModItems.EARTH_INFUSED_JADE);
                entries.add(ModItems.FIRE_INFUSED_JADE);
                entries.add(ModItems.WATER_INFUSED_JADE);

                entries.add(ModBlocks.JASPER_BLOCK);
                entries.add(ModBlocks.JASPER_ORE);
                entries.add(ModBlocks.DEEPSLATE_JASPER_ORE);
                entries.add(ModItems.JASPER);
                entries.add(ModItems.AIR_INFUSED_JASPER);
                entries.add(ModItems.EARTH_INFUSED_JASPER);
                entries.add(ModItems.FIRE_INFUSED_JASPER);
                entries.add(ModItems.WATER_INFUSED_JASPER);

                entries.add(ModBlocks.PEARL_BLOCK);
                entries.add(ModItems.PEARL);
                entries.add(ModItems.AIR_INFUSED_PEARL);
                entries.add(ModItems.EARTH_INFUSED_PEARL);
                entries.add(ModItems.FIRE_INFUSED_PEARL);
                entries.add(ModItems.WATER_INFUSED_PEARL);

                entries.add(ModBlocks.RUBY_BLOCK);
                entries.add(ModBlocks.RUBY_ORE);
                entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                entries.add(ModItems.RUBY);
                entries.add(ModItems.AIR_INFUSED_RUBY);
                entries.add(ModItems.EARTH_INFUSED_RUBY);
                entries.add(ModItems.FIRE_INFUSED_RUBY);
                entries.add(ModItems.WATER_INFUSED_RUBY);

                entries.add(ModBlocks.ROSE_QUARTZ_BLOCK);
                entries.add(ModItems.ROSE_QUARTZ);
                entries.add(ModItems.AIR_INFUSED_ROSE_QUARTZ);
                entries.add(ModItems.EARTH_INFUSED_ROSE_QUARTZ);
                entries.add(ModItems.FIRE_INFUSED_ROSE_QUARTZ);
                entries.add(ModItems.WATER_INFUSED_ROSE_QUARTZ);

                entries.add(ModBlocks.SAPPHIRE_BLOCK);
                entries.add(ModBlocks.SAPPHIRE_ORE);
                entries.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
                entries.add(ModItems.SAPPHIRE);
                entries.add(ModItems.AIR_INFUSED_SAPPHIRE);
                entries.add(ModItems.EARTH_INFUSED_SAPPHIRE);
                entries.add(ModItems.FIRE_INFUSED_SAPPHIRE);
                entries.add(ModItems.WATER_INFUSED_SAPPHIRE);

                entries.add(ModBlocks.TOPAZ_BLOCK);
                entries.add(ModBlocks.TOPAZ_ORE);
                entries.add(ModBlocks.DEEPSLATE_TOPAZ_ORE);
                entries.add(ModItems.TOPAZ);
                entries.add(ModItems.AIR_INFUSED_TOPAZ);
                entries.add(ModItems.EARTH_INFUSED_TOPAZ);
                entries.add(ModItems.FIRE_INFUSED_TOPAZ);
                entries.add(ModItems.WATER_INFUSED_TOPAZ);
            }).build();

    private static final ItemGroup BACKROOMS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModBlocks.BACKROOMS_LEVEL_ZERO_WALL_BLOCK))
            .displayName(Text.translatable("itemgroup.thekitchensink.thebackrooms"))
            .entries((context, entries) -> {
//                          The Backrooms
//    Level 0 (Entrance)
                entries.add(ModBlocks.BACKROOMS_LEVEL_ZERO_FLUORESCENT_LIGHT);
                entries.add(ModBlocks.BACKROOMS_LEVEL_ZERO_TILE_CEILING_BLOCK);
                entries.add(ModBlocks.BACKROOMS_LEVEL_ZERO_WALL_CEILING_BLOCK);
                entries.add(ModBlocks.BACKROOMS_LEVEL_ZERO_WALL_BLOCK);
                entries.add(ModBlocks.BACKROOMS_LEVEL_ZERO_WALL_BASEBOARD_BLOCK);
                entries.add(ModBlocks.BACKROOMS_LEVEL_ZERO_MOIST_CARPET_BLOCK);
//    Level 37 (Poolrooms)
                entries.add(ModBlocks.BACKROOMS_LEVEL_THIRTY_SEVEN_POOL_TILE_BLOCK);
            }).build();

    private static final ItemGroup MISC = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.ENDER_STAR))
            .displayName(Text.translatable("itemgroup.thekitchensink.misc"))
            .entries((context, entries) -> {
//                        Misc
                entries.add(ModItems.ENDER_STAR);

                entries.add(ModItems.HEART);
                entries.add(ModItems.COPPER_PLATED_HEART);
                entries.add(ModItems.IRON_PLATED_HEART);
                entries.add(ModItems.GOLDEN_PLATED_HEART);
                entries.add(ModItems.DIAMOND_PLATED_HEART);
                entries.add(ModItems.NETHERITE_PLATED_HEART);

                entries.add(ModItems.OBSIDIAN_STICK);

                entries.add(ModItems.METAL_DETECTOR);

                entries.add(ModItems.SOUL);

                entries.add(ModItems.CRUMPLED_PAPER);
                    }).build();

    private static final ItemGroup FOOD = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.BAGUETTE))
            .displayName(Text.translatable("itemgroup.thekitchensink.food"))
            .entries((context, entries) -> {
//                  Fruit
                entries.add(ModItems.BANANA);
                entries.add(ModItems.BLACKBERRY);
                entries.add(ModItems.BLUEBERRY);
                entries.add(ModItems.CHERRY);
                entries.add(ModItems.CANTALOUPE);
                entries.add(ModItems.DRAGON_FRUIT);
                entries.add(ModItems.GRAPEFRUIT);
                entries.add(ModItems.ORANGE);
                entries.add(ModItems.LIME);
                entries.add(ModItems.LEMON);
                entries.add(ModItems.KIWI);
                entries.add(ModItems.PINEAPPLE);
                entries.add(ModItems.RASPBERRY);
                entries.add(ModItems.STRAWBERRY);
//                Bread
                entries.add(ModItems.BAGUETTE);

//                Veggies

//                Special Fruits
                entries.add(ModItems.DIAMOND_APPLE);
                entries.add(ModItems.NETHERITE_APPLE);
            }).build();

    private static final ItemGroup ARMOUR_AND_TOOLS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.VOIDSTAR_SWORD))
            .displayName(Text.translatable("itemgroup.thekitchensink.armour_and_tools"))
            .entries((context, entries) -> {
                //                Weapons
                entries.add(ModItems.LIFESTEALER_SWORD);
                entries.add(ModItems.DARK_ENERGY_SWORD);
                entries.add(ModItems.VOIDSTAR_SWORD);
                entries.add(ModItems.DEATHS_SCYTHE);
            }).build();

//      Logger for item group
    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, new Identifier("thekitchensink", "metals"), METALS);
        Registry.register(Registries.ITEM_GROUP, new Identifier("thekitchensink", "gems"), GEMS);
        Registry.register(Registries.ITEM_GROUP, new Identifier("thekitchensink", "armour_and_tools"), ARMOUR_AND_TOOLS);
        Registry.register(Registries.ITEM_GROUP, new Identifier("thekitchensink", "food"), FOOD);
        Registry.register(Registries.ITEM_GROUP, new Identifier("thekitchensink", "backrooms"), BACKROOMS);
        Registry.register(Registries.ITEM_GROUP, new Identifier("thekitchensink", "misc"), MISC);

        Thekitchensink.LOGGER.info("Registering Item Groups for" +Thekitchensink.MOD_ID);
    }
}