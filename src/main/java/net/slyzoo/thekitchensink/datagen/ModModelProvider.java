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
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BACKROOMS_LEVEL_THIRTY_SEVEN_POOL_TILE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BACKROOMS_LEVEL_ZERO_FLUORESCENT_LIGHT);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BACKROOMS_LEVEL_ZERO_TILE_CEILING_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BACKROOMS_LEVEL_ZERO_WALL_CEILING_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BACKROOMS_LEVEL_ZERO_WALL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BACKROOMS_LEVEL_ZERO_WALL_BASEBOARD_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BACKROOMS_LEVEL_ZERO_MOIST_CARPET_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRONZE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_TIN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_TOPAZ_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_JADE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_GARNET_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_ZINC_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_TIN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_JASPER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GARNET_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GARNET_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.JASPER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.JASPER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.JADE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.JADE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_ALUMINIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PEARL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_GOLD_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ROSE_QUARTZ_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_ZINC_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_ALUMINIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_TIN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SAPPHIRE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SAPPHIRE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STEEL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TOPAZ_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TOPAZ_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TIN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TIN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ZINC_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ZINC_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.AIR_INFUSED_STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ALUMINIUM_COIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.ALUMINIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BAGUETTE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BANANA, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACKBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUEBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_COIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CANTALOUPE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.CRUMPLED_PAPER, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_COIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_PLATED_HEART, Models.GENERATED);
        itemModelGenerator.register(ModItems.DARK_ENERGY_SWORD, Models.GENERATED);
        itemModelGenerator.register(ModItems.DEATHS_SCYTHE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_COIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.DRAGON_FRUIT, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_PLATED_HEART, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDER_STAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.EARTH_INFUSED_STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.FIRE_INFUSED_STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.GARNET, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLD_COIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAPEFRUIT, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_PLATED_HEART, Models.GENERATED);
        itemModelGenerator.register(ModItems.HEART, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_COIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_PLATED_HEART, Models.GENERATED);
        itemModelGenerator.register(ModItems.JADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.JASPER, Models.GENERATED);
        itemModelGenerator.register(ModItems.KIWI, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEMON, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIME, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIFESTEALER_SWORD, Models.GENERATED);
        itemModelGenerator.register(ModItems.METAL_DETECTOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_COIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_PLATED_HEART, Models.GENERATED);
        itemModelGenerator.register(ModItems.OBSIDIAN_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PEARL, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINEAPPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_GOLD_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RASPBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_ALUMINIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.ALUMINIUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_TIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_ZINC, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROSE_QUARTZ, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SOUL, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(ModItems.STRAWBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.TIN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.TIN_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOPAZ, Models.GENERATED);
        itemModelGenerator.register(ModItems.VOIDSTAR_SWORD, Models.GENERATED);
        itemModelGenerator.register(ModItems.WATER_INFUSED_STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ZINC_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ZINC_NUGGET, Models.GENERATED);

    }
}
