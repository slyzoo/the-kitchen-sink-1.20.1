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

    public static final ItemGroup GEMS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Thekitchensink.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.thekitchensink"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {

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
                        entries.add(ModItems.RUBY);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
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

//                        Metals
                        entries.add(ModBlocks.ALUMINIUM_BLOCK);
                        entries.add(ModBlocks.RAW_ALUMINIUM_BLOCK);
                        entries.add(ModBlocks.NETHER_ALUMINIUM_ORE);
                        entries.add(ModItems.RAW_ALUMINIUM);
                        entries.add(ModItems.ALUMINIUM_INGOT);
                        entries.add(ModBlocks.BRONZE_BLOCK);
                        entries.add(ModItems.BRONZE_INGOT);
                        entries.add(ModBlocks.PURPLE_GOLD_BLOCK);
                        entries.add(ModItems.PURPLE_GOLD_INGOT);
                        entries.add(ModBlocks.STEEL_BLOCK);
                        entries.add(ModItems.STEEL_INGOT);
                        entries.add(ModBlocks.TIN_BLOCK);
                        entries.add(ModBlocks.RAW_TIN_BLOCK);
                        entries.add(ModBlocks.TIN_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TIN_ORE);
                        entries.add(ModItems.RAW_TIN);
                        entries.add(ModItems.TIN_INGOT);
                        entries.add(ModBlocks.ZINC_BLOCK);
                        entries.add(ModBlocks.RAW_ZINC_BLOCK);
                        entries.add(ModBlocks.ZINC_ORE);
                        entries.add(ModBlocks.DEEPSLATE_ZINC_ORE);
                        entries.add(ModItems.RAW_ZINC);
                        entries.add(ModItems.ZINC_INGOT);

//                  The Backrooms
//    Level 0 (Entrance)
                        entries.add(ModBlocks.BACKROOMS_LEVEL_ZERO_FLUORESCENT_LIGHT);
                        entries.add(ModBlocks.BACKROOMS_LEVEL_ZERO_TILE_CEILING_BLOCK);
                        entries.add(ModBlocks.BACKROOMS_LEVEL_ZERO_WALL_CEILING_BLOCK);
                        entries.add(ModBlocks.BACKROOMS_LEVEL_ZERO_WALL_BLOCK);
                        entries.add(ModBlocks.BACKROOMS_LEVEL_ZERO_WALL_BASEBOARD_BLOCK);
                        entries.add(ModBlocks.BACKROOMS_LEVEL_ZERO_MOIST_CARPET_BLOCK);

//    Level 37 (Poolrooms)
                        entries.add(ModBlocks.BACKROOMS_LEVEL_THIRTY_SEVEN_POOL_TILE_BLOCK);


//                        Misc
                        entries.add(ModItems.ENDER_STAR);
                        entries.add(ModItems.HEART);
                        entries.add(ModItems.OBSIDIAN_STICK);
                        entries.add(ModItems.METAL_DETECTOR);

                    }).build());


//      Logger for item group
    public static void registerItemGroups() {
        Thekitchensink.LOGGER.info("Registering Item Groups for" +Thekitchensink.MOD_ID);
    }
}