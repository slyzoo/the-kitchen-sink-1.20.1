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
                entries.add(ModItems.ALUMINIUM_NUGGET);
                entries.add(ModItems.ALUMINIUM_COIN);

                entries.add(ModBlocks.BRONZE_BLOCK);
                entries.add(ModItems.BRONZE_INGOT);
                entries.add(ModItems.BRONZE_NUGGET);
                entries.add(ModItems.BRONZE_COIN);

                entries.add(ModItems.COPPER_COIN);
                entries.add(ModItems.COPPER_NUGGET);

                entries.add(ModBlocks.PURPLE_GOLD_BLOCK);
                entries.add(ModItems.PURPLE_GOLD_INGOT);

                entries.add(ModBlocks.STEEL_BLOCK);
                entries.add(ModItems.STEEL_INGOT);
                entries.add(ModItems.STEEL_NUGGET);
                entries.add(ModItems.STEEL_COIN);

                entries.add(ModBlocks.TIN_BLOCK);
                entries.add(ModBlocks.TIN_ORE);
                entries.add(ModBlocks.DEEPSLATE_TIN_ORE);
                entries.add(ModBlocks.RAW_TIN_BLOCK);
                entries.add(ModItems.RAW_TIN);
                entries.add(ModItems.TIN_INGOT);
                entries.add(ModItems.TIN_NUGGET);

                entries.add(ModBlocks.ZINC_BLOCK);
                entries.add(ModBlocks.ZINC_ORE);
                entries.add(ModBlocks.DEEPSLATE_ZINC_ORE);
                entries.add(ModBlocks.RAW_ZINC_BLOCK);
                entries.add(ModItems.RAW_ZINC);
                entries.add(ModItems.ZINC_INGOT);
                entries.add(ModItems.ZINC_NUGGET);


                entries.add(ModItems.IRON_COIN);
                entries.add(ModItems.GOLD_COIN);
                entries.add(ModItems.DIAMOND_NUGGET);
                entries.add(ModItems.DIAMOND_COIN);
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

                entries.add(ModBlocks.JADE_BLOCK);
                entries.add(ModBlocks.JADE_ORE);
                entries.add(ModBlocks.DEEPSLATE_JADE_ORE);
                entries.add(ModItems.JADE);

                entries.add(ModBlocks.JASPER_BLOCK);
                entries.add(ModBlocks.JASPER_ORE);
                entries.add(ModBlocks.DEEPSLATE_JASPER_ORE);
                entries.add(ModItems.JASPER);

                entries.add(ModBlocks.PEARL_BLOCK);
                entries.add(ModItems.PEARL);

                entries.add(ModBlocks.RUBY_BLOCK);
                entries.add(ModBlocks.RUBY_ORE);
                entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                entries.add(ModItems.RUBY);

                entries.add(ModBlocks.ROSE_QUARTZ_BLOCK);
                entries.add(ModItems.ROSE_QUARTZ);

                entries.add(ModBlocks.SAPPHIRE_BLOCK);
                entries.add(ModBlocks.SAPPHIRE_ORE);
                entries.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
                entries.add(ModItems.SAPPHIRE);

                entries.add(ModBlocks.TOPAZ_BLOCK);
                entries.add(ModBlocks.TOPAZ_ORE);
                entries.add(ModBlocks.DEEPSLATE_TOPAZ_ORE);
                entries.add(ModItems.TOPAZ);
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
//                God-Like Weapons & Tools
                entries.add(ModItems.LIFESTEALER_SWORD);
                entries.add(ModItems.DARK_ENERGY_SWORD);
                entries.add(ModItems.VOIDSTAR_SWORD);
                entries.add(ModItems.DEATHS_SCYTHE);

//                Gem Weapons & Tools
                entries.add(ModItems.RUBY_HELMET);
                entries.add(ModItems.RUBY_CHESTPLATE);
                entries.add(ModItems.RUBY_LEGGINGS);
                entries.add(ModItems.RUBY_BOOTS);
                entries.add(ModItems.RUBY_SWORD);
                entries.add(ModItems.RUBY_AXE);
                entries.add(ModItems.RUBY_PICKAXE);
                entries.add(ModItems.RUBY_SHOVEL);
                entries.add(ModItems.RUBY_HOE);

                entries.add(ModItems.GARNET_HELMET);
                entries.add(ModItems.GARNET_CHESTPLATE);
                entries.add(ModItems.GARNET_LEGGINGS);
                entries.add(ModItems.GARNET_BOOTS);
                entries.add(ModItems.GARNET_SWORD);
                entries.add(ModItems.GARNET_AXE);
                entries.add(ModItems.GARNET_PICKAXE);
                entries.add(ModItems.GARNET_SHOVEL);
                entries.add(ModItems.GARNET_HOE);

                entries.add(ModItems.TOPAZ_HELMET);
                entries.add(ModItems.TOPAZ_CHESTPLATE);
                entries.add(ModItems.TOPAZ_LEGGINGS);
                entries.add(ModItems.TOPAZ_BOOTS);
                entries.add(ModItems.TOPAZ_SWORD);
                entries.add(ModItems.TOPAZ_AXE);
                entries.add(ModItems.TOPAZ_PICKAXE);
                entries.add(ModItems.TOPAZ_SHOVEL);
                entries.add(ModItems.TOPAZ_HOE);

                entries.add(ModItems.JADE_HELMET);
                entries.add(ModItems.JADE_CHESTPLATE);
                entries.add(ModItems.JADE_LEGGINGS);
                entries.add(ModItems.JADE_BOOTS);
                entries.add(ModItems.JADE_SWORD);
                entries.add(ModItems.JADE_AXE);
                entries.add(ModItems.JADE_PICKAXE);
                entries.add(ModItems.JADE_SHOVEL);
                entries.add(ModItems.JADE_HOE);

                entries.add(ModItems.SAPPHIRE_HELMET);
                entries.add(ModItems.SAPPHIRE_CHESTPLATE);
                entries.add(ModItems.SAPPHIRE_LEGGINGS);
                entries.add(ModItems.SAPPHIRE_BOOTS);
                entries.add(ModItems.SAPPHIRE_SWORD);
                entries.add(ModItems.SAPPHIRE_AXE);
                entries.add(ModItems.SAPPHIRE_PICKAXE);
                entries.add(ModItems.SAPPHIRE_SHOVEL);
                entries.add(ModItems.SAPPHIRE_HOE);

                entries.add(ModItems.ROSE_QUARTZ_HELMET);
                entries.add(ModItems.ROSE_QUARTZ_CHESTPLATE);
                entries.add(ModItems.ROSE_QUARTZ_LEGGINGS);
                entries.add(ModItems.ROSE_QUARTZ_BOOTS);
                entries.add(ModItems.ROSE_QUARTZ_SWORD);
                entries.add(ModItems.ROSE_QUARTZ_AXE);
                entries.add(ModItems.ROSE_QUARTZ_PICKAXE);
                entries.add(ModItems.ROSE_QUARTZ_SHOVEL);
                entries.add(ModItems.ROSE_QUARTZ_HOE);

                entries.add(ModItems.JASPER_HELMET);
                entries.add(ModItems.JASPER_CHESTPLATE);
                entries.add(ModItems.JASPER_LEGGINGS);
                entries.add(ModItems.JASPER_BOOTS);
                entries.add(ModItems.JASPER_SWORD);
                entries.add(ModItems.JASPER_AXE);
                entries.add(ModItems.JASPER_PICKAXE);
                entries.add(ModItems.JASPER_SHOVEL);
                entries.add(ModItems.JASPER_HOE);

//                Metal Weapons & Tools
                entries.add(ModItems.ALUMINIUM_HELMET);
                entries.add(ModItems.ALUMINIUM_CHESTPLATE);
                entries.add(ModItems.ALUMINIUM_LEGGINGS);
                entries.add(ModItems.ALUMINIUM_BOOTS);
                entries.add(ModItems.ALUMINIUM_SWORD);
                entries.add(ModItems.ALUMINIUM_AXE);
                entries.add(ModItems.ALUMINIUM_PICKAXE);
                entries.add(ModItems.ALUMINIUM_SHOVEL);
                entries.add(ModItems.ALUMINIUM_HOE);

                entries.add(ModItems.BRONZE_HELMET);
                entries.add(ModItems.BRONZE_CHESTPLATE);
                entries.add(ModItems.BRONZE_LEGGINGS);
                entries.add(ModItems.BRONZE_BOOTS);
                entries.add(ModItems.BRONZE_SWORD);
                entries.add(ModItems.BRONZE_AXE);
                entries.add(ModItems.BRONZE_PICKAXE);
                entries.add(ModItems.BRONZE_SHOVEL);
                entries.add(ModItems.BRONZE_HOE);

                entries.add(ModItems.PURPLE_GOLD_HELMET);
                entries.add(ModItems.PURPLE_GOLD_CHESTPLATE);
                entries.add(ModItems.PURPLE_GOLD_LEGGINGS);
                entries.add(ModItems.PURPLE_GOLD_BOOTS);
                entries.add(ModItems.PURPLE_GOLD_SWORD);
                entries.add(ModItems.PURPLE_GOLD_AXE);
                entries.add(ModItems.PURPLE_GOLD_PICKAXE);
                entries.add(ModItems.PURPLE_GOLD_SHOVEL);
                entries.add(ModItems.PURPLE_GOLD_HOE);

                entries.add(ModItems.STEEL_HELMET);
                entries.add(ModItems.STEEL_CHESTPLATE);
                entries.add(ModItems.STEEL_LEGGINGS);
                entries.add(ModItems.STEEL_BOOTS);
                entries.add(ModItems.STEEL_SWORD);
                entries.add(ModItems.STEEL_AXE);
                entries.add(ModItems.STEEL_PICKAXE);
                entries.add(ModItems.STEEL_SHOVEL);
                entries.add(ModItems.STEEL_HOE);
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