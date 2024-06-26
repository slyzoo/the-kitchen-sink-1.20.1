package net.slyzoo.thekitchensink.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.slyzoo.thekitchensink.block.ModBlocks;
import net.slyzoo.thekitchensink.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ALUMINIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BACKROOMS_LEVEL_ZERO_FLUORESCENT_LIGHT);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BACKROOMS_LEVEL_ZERO_TILE_CEILING_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BACKROOMS_LEVEL_ZERO_WALL_CEILING_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BACKROOMS_LEVEL_ZERO_WALL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BACKROOMS_LEVEL_ZERO_WALL_BASEBOARD_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BACKROOMS_LEVEL_ZERO_MOIST_CARPET_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BACKROOMS_LEVEL_THIRTY_SEVEN_POOL_TILE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRONZE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_GARNET_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_JADE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_JASPER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_TIN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_TOPAZ_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_ZINC_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GARNET_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GARNET_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.JADE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.JADE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.JASPER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.JASPER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_ALUMINIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PEARL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_GOLD_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_ALUMINIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_TIN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_ZINC_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ROSE_QUARTZ_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SAPPHIRE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SAPPHIRE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STEEL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TIN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TIN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TOPAZ_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TOPAZ_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ZINC_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ZINC_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ALUMINIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_ALUMINIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.ALUMINIUM_SWORD, Models.GENERATED);
        itemModelGenerator.register(ModItems.ALUMINIUM_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ALUMINIUM_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ALUMINIUM_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.ALUMINIUM_HOE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ALUMINIUM_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.ALUMINIUM_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ALUMINIUM_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.ALUMINIUM_BOOTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_SWORD, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_HOE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_BOOTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.GARNET, Models.GENERATED);
        itemModelGenerator.register(ModItems.GARNET_SWORD, Models.GENERATED);
        itemModelGenerator.register(ModItems.GARNET_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GARNET_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GARNET_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.GARNET_HOE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GARNET_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.GARNET_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GARNET_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.GARNET_BOOTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.JADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.JADE_SWORD, Models.GENERATED);
        itemModelGenerator.register(ModItems.JADE_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.JADE_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.JADE_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.JADE_HOE, Models.GENERATED);
        itemModelGenerator.register(ModItems.JADE_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.JADE_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.JADE_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.JADE_BOOTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.JASPER, Models.GENERATED);
        itemModelGenerator.register(ModItems.JASPER_SWORD, Models.GENERATED);
        itemModelGenerator.register(ModItems.JASPER_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.JASPER_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.JASPER_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.JASPER_HOE, Models.GENERATED);
        itemModelGenerator.register(ModItems.JASPER_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.JASPER_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.JASPER_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.JASPER_BOOTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.PEARL, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_GOLD_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_GOLD_SWORD, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_GOLD_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_GOLD_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_GOLD_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_GOLD_HOE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_GOLD_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_GOLD_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_GOLD_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_GOLD_BOOTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROSE_QUARTZ, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROSE_QUARTZ_SWORD, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROSE_QUARTZ_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROSE_QUARTZ_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROSE_QUARTZ_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROSE_QUARTZ_HOE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROSE_QUARTZ_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROSE_QUARTZ_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROSE_QUARTZ_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROSE_QUARTZ_BOOTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY_SWORD, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY_HOE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY_BOOTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAPPHIRE_SWORD, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAPPHIRE_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAPPHIRE_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAPPHIRE_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAPPHIRE_HOE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAPPHIRE_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAPPHIRE_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAPPHIRE_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAPPHIRE_BOOTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_SWORD, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_HOE, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_BOOTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.TIN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_TIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOPAZ, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOPAZ_SWORD, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOPAZ_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOPAZ_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOPAZ_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOPAZ_HOE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOPAZ_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOPAZ_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOPAZ_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOPAZ_BOOTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.ZINC_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_ZINC, Models.GENERATED);
        itemModelGenerator.register(ModItems.ALUMINIUM_COIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_COIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_COIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_COIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLD_COIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_COIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_COIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_COIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.HEART, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_PLATED_HEART, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_PLATED_HEART, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_PLATED_HEART, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_PLATED_HEART, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_PLATED_HEART, Models.GENERATED);
        itemModelGenerator.register(ModItems.VOIDSTAR_SWORD, Models.GENERATED);
        itemModelGenerator.register(ModItems.DEATHS_SCYTHE, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIFESTEALER_SWORD, Models.GENERATED);
        itemModelGenerator.register(ModItems.BAGUETTE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BANANA, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACKBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUEBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.CANTALOUPE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DRAGON_FRUIT, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAPEFRUIT, Models.GENERATED);
        itemModelGenerator.register(ModItems.KIWI, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEMON, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIME, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINEAPPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RASPBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.CRUMPLED_PAPER, Models.GENERATED);
        itemModelGenerator.register(ModItems.OBSIDIAN_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.METAL_DETECTOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDER_STAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.SOUL, Models.GENERATED);
        itemModelGenerator.register(ModItems.ALUMINIUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.TIN_NUGGET, Models.GENERATED);
    }
}
