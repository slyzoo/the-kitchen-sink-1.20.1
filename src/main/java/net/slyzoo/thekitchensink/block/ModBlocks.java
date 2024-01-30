package net.slyzoo.thekitchensink.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.WetSpongeBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.slyzoo.thekitchensink.Thekitchensink;

public class ModBlocks {
//                        Gems
    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));

    public static final Block ROSE_QUARTZ_BLOCK = registerBlock("rose_quartz_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));

    public static final Block PEARL_BLOCK = registerBlock("pearl_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));

    public static final Block GARNET_BLOCK = registerBlock("garnet_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));

    public static final Block JADE_BLOCK = registerBlock("jade_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));

    public static final Block JASPER_BLOCK = registerBlock("jasper_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));

    public static final Block TOPAZ_BLOCK = registerBlock("topaz_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));

//                        Metals
    public static final Block ALUMINIUM_BLOCK = registerBlock("aluminium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block BRONZE_BLOCK = registerBlock("bronze_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block PURPLE_GOLD_BLOCK = registerBlock("purple_gold_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block TIN_BLOCK = registerBlock("tin_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block ZINC_BLOCK = registerBlock("zinc_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    
//                            Ores
    public static final Block NETHER_ALUMINIUM_ORE = registerBlock("nether_aluminium_ore",
        new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE), UniformIntProvider.create(2, 5)));

    public static final Block GARNET_ORE = registerBlock("garnet_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE), UniformIntProvider.create(2, 5)));

    public static final Block DEEPSLATE_GARNET_ORE = registerBlock("deepslate_garnet_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE), UniformIntProvider.create(2, 5)));

    public static final Block TIN_ORE = registerBlock("tin_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE), UniformIntProvider.create(2, 5)));

    public static final Block DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE), UniformIntProvider.create(2, 5)));

    public static final Block ZINC_ORE = registerBlock("zinc_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE), UniformIntProvider.create(2, 5)));

    public static final Block DEEPSLATE_ZINC_ORE = registerBlock("deepslate_zinc_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE), UniformIntProvider.create(2, 5)));

    public static final Block JADE_ORE = registerBlock("jade_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE), UniformIntProvider.create(2, 5)));

    public static final Block DEEPSLATE_JADE_ORE = registerBlock("deepslate_jade_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE), UniformIntProvider.create(2, 5)));

    public static final Block JASPER_ORE = registerBlock("jasper_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE), UniformIntProvider.create(2, 5)));

    public static final Block DEEPSLATE_JASPER_ORE = registerBlock("deepslate_jasper_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE), UniformIntProvider.create(2, 5)));

    public static final Block TOPAZ_ORE = registerBlock("topaz_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE), UniformIntProvider.create(2, 5)));

    public static final Block DEEPSLATE_TOPAZ_ORE = registerBlock("deepslate_topaz_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE), UniformIntProvider.create(2, 5)));

    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE), UniformIntProvider.create(2, 5)));

    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE), UniformIntProvider.create(2, 5)));

    public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE), UniformIntProvider.create(2, 5)));

    public static final Block DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE), UniformIntProvider.create(2, 5)));


//                        Raw Metals
    public static final Block RAW_ALUMINIUM_BLOCK = registerBlock("raw_aluminium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)));

    public static final Block RAW_TIN_BLOCK = registerBlock("raw_tin_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)));

    public static final Block RAW_ZINC_BLOCK = registerBlock("raw_zinc_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)));


//                  The Backrooms
//    Level 0 (Entrance)
    public static final Block BACKROOMS_LEVEL_ZERO_FLUORESCENT_LIGHT = registerBlock("backrooms_level_zero_fluorescent_light",
            new Block(FabricBlockSettings.copyOf(Blocks.LANTERN)));

    public static final Block BACKROOMS_LEVEL_ZERO_TILE_CEILING_BLOCK = registerBlock("backrooms_level_zero_tile_ceiling_block",
            new Block(FabricBlockSettings.copyOf(Blocks.YELLOW_CONCRETE)));

    public static final Block BACKROOMS_LEVEL_ZERO_WALL_CEILING_BLOCK = registerBlock("backrooms_level_zero_wall_crown_molding_block",
            new Block(FabricBlockSettings.copyOf(Blocks.YELLOW_CONCRETE)));

    public static final Block BACKROOMS_LEVEL_ZERO_WALL_BLOCK = registerBlock("backrooms_level_zero_wall_block",
            new Block(FabricBlockSettings.copyOf(Blocks.YELLOW_CONCRETE)));

    public static final Block BACKROOMS_LEVEL_ZERO_WALL_BASEBOARD_BLOCK = registerBlock("backrooms_level_zero_wall_baseboard_block",
            new Block(FabricBlockSettings.copyOf(Blocks.YELLOW_CONCRETE)));

    public static final Block BACKROOMS_LEVEL_ZERO_MOIST_CARPET_BLOCK = registerBlock("backrooms_level_zero_moist_carpet_block",
            new Block(FabricBlockSettings.copyOf(Blocks.BROWN_WOOL)));

// Level 37 (Poolrooms)
    public static final Block BACKROOMS_LEVEL_THIRTY_SEVEN_POOL_TILE_BLOCK = registerBlock("backrooms_level_thirty_seven_pool_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)));

//    Registers block
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Thekitchensink.MOD_ID, name), block);
    }
//    Registers the block item
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Thekitchensink.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

//    Logger
    public static void registerModBlocks() {
        Thekitchensink.LOGGER.info("registering Mod Blocks For"+ Thekitchensink.MOD_ID);
    }
}
