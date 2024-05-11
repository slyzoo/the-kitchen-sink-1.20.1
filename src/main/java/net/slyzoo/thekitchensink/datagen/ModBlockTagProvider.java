package net.slyzoo.thekitchensink.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.slyzoo.thekitchensink.block.ModBlocks;
import net.slyzoo.thekitchensink.item.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Blocks.METAL_DETECTOR_DETECTABLE_BLOCKS)
                .add(ModBlocks.NETHER_ALUMINIUM_ORE)
                .add(ModBlocks.GARNET_ORE)
                .add(ModBlocks.DEEPSLATE_GARNET_ORE)
                .add(ModBlocks.JASPER_ORE)
                .add(ModBlocks.DEEPSLATE_JASPER_ORE)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE)
                .add(ModBlocks.TIN_ORE)
                .add(ModBlocks.DEEPSLATE_TIN_ORE)
                .add(ModBlocks.SAPPHIRE_ORE)
                .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE)
                .add(ModBlocks.TOPAZ_ORE)
                .add(ModBlocks.DEEPSLATE_TOPAZ_ORE)
                .add(ModBlocks.ZINC_ORE)
                .add(ModBlocks.DEEPSLATE_ZINC_ORE)
                .add(ModBlocks.JADE_ORE)
                .add(ModBlocks.DEEPSLATE_JADE_ORE)
                .forceAddTag(BlockTags.COAL_ORES)
                .forceAddTag(BlockTags.COPPER_ORES)
                .forceAddTag(BlockTags.REDSTONE_ORES)
                .forceAddTag(BlockTags.IRON_ORES)
                .forceAddTag(BlockTags.GOLD_ORES)
                .forceAddTag(BlockTags.LAPIS_ORES)
                .forceAddTag(BlockTags.DIAMOND_ORES)
                .forceAddTag(BlockTags.EMERALD_ORES);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.ALUMINIUM_BLOCK)
                .add(ModBlocks.RAW_ALUMINIUM_BLOCK)
                .add(ModBlocks.NETHER_ALUMINIUM_ORE)
                .add(ModBlocks.BACKROOMS_LEVEL_ZERO_FLUORESCENT_LIGHT)
                .add(ModBlocks.BACKROOMS_LEVEL_ZERO_TILE_CEILING_BLOCK)
                .add(ModBlocks.BACKROOMS_LEVEL_ZERO_WALL_CEILING_BLOCK)
                .add(ModBlocks.BACKROOMS_LEVEL_ZERO_WALL_BLOCK)
                .add(ModBlocks.BACKROOMS_LEVEL_ZERO_WALL_BASEBOARD_BLOCK)
                .add(ModBlocks.BACKROOMS_LEVEL_ZERO_MOIST_CARPET_BLOCK)
                .add(ModBlocks.BACKROOMS_LEVEL_THIRTY_SEVEN_POOL_TILE_BLOCK)
                .add(ModBlocks.BRONZE_BLOCK)
                .add(ModBlocks.GARNET_BLOCK)
                .add(ModBlocks.GARNET_ORE)
                .add(ModBlocks.DEEPSLATE_GARNET_ORE)
                .add(ModBlocks.JADE_BLOCK)
                .add(ModBlocks.JADE_ORE)
                .add(ModBlocks.DEEPSLATE_JADE_ORE)
                .add(ModBlocks.JASPER_BLOCK)
                .add(ModBlocks.JASPER_ORE)
                .add(ModBlocks.DEEPSLATE_JASPER_ORE)
                .add(ModBlocks.PEARL_BLOCK)
                .add(ModBlocks.PURPLE_GOLD_BLOCK)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE)
                .add(ModBlocks.ROSE_QUARTZ_BLOCK)
                .add(ModBlocks.SAPPHIRE_BLOCK)
                .add(ModBlocks.SAPPHIRE_ORE)
                .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE)
                .add(ModBlocks.STEEL_BLOCK)
                .add(ModBlocks.TIN_BLOCK)
                .add(ModBlocks.RAW_TIN_BLOCK)
                .add(ModBlocks.TIN_ORE)
                .add(ModBlocks.DEEPSLATE_TIN_ORE)
                .add(ModBlocks.TOPAZ_BLOCK)
                .add(ModBlocks.TOPAZ_ORE)
                .add(ModBlocks.DEEPSLATE_TOPAZ_ORE)
                .add(ModBlocks.ZINC_BLOCK)
                .add(ModBlocks.ZINC_ORE)
                .add(ModBlocks.RAW_ZINC_BLOCK)
                .add(ModBlocks.DEEPSLATE_ZINC_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.ALUMINIUM_BLOCK)
                .add(ModBlocks.RAW_ALUMINIUM_BLOCK)
                .add(ModBlocks.NETHER_ALUMINIUM_ORE)
                .add(ModBlocks.BRONZE_BLOCK)
                .add(ModBlocks.PEARL_BLOCK)
                .add(ModBlocks.TIN_BLOCK)
                .add(ModBlocks.RAW_TIN_BLOCK)
                .add(ModBlocks.TIN_ORE)
                .add(ModBlocks.ZINC_BLOCK)
                .add(ModBlocks.ZINC_ORE)
                .add(ModBlocks.RAW_ZINC_BLOCK)
                .add(ModBlocks.DEEPSLATE_ZINC_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.GARNET_BLOCK)
                .add(ModBlocks.GARNET_ORE)
                .add(ModBlocks.DEEPSLATE_GARNET_ORE)
                .add(ModBlocks.PURPLE_GOLD_BLOCK)
                .add(ModBlocks.ROSE_QUARTZ_BLOCK)
                .add(ModBlocks.STEEL_BLOCK)
                .add(ModBlocks.DEEPSLATE_TIN_ORE)
                .add(ModBlocks.TOPAZ_BLOCK)
                .add(ModBlocks.TOPAZ_ORE)
                .add(ModBlocks.DEEPSLATE_TOPAZ_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.BACKROOMS_LEVEL_ZERO_FLUORESCENT_LIGHT)
                .add(ModBlocks.BACKROOMS_LEVEL_ZERO_TILE_CEILING_BLOCK)
                .add(ModBlocks.BACKROOMS_LEVEL_ZERO_WALL_CEILING_BLOCK)
                .add(ModBlocks.BACKROOMS_LEVEL_ZERO_WALL_BLOCK)
                .add(ModBlocks.BACKROOMS_LEVEL_ZERO_WALL_BASEBOARD_BLOCK)
                .add(ModBlocks.BACKROOMS_LEVEL_ZERO_MOIST_CARPET_BLOCK)
                .add(ModBlocks.BACKROOMS_LEVEL_THIRTY_SEVEN_POOL_TILE_BLOCK)
                .add(ModBlocks.JADE_BLOCK)
                .add(ModBlocks.JADE_ORE)
                .add(ModBlocks.DEEPSLATE_JADE_ORE)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE)
                .add(ModBlocks.SAPPHIRE_BLOCK)
                .add(ModBlocks.SAPPHIRE_ORE)
                .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);

    }
}
