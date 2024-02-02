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
                    }).build();

    private static final ItemGroup BACKROOMS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModBlocks.BACKROOMS_LEVEL_ZERO_WALL_BLOCK))
            .displayName(Text.translatable("itemgroup.thekitchensink.thebackrooms"))
            .entries((context, entries) -> {
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
            }).build();

    private static final ItemGroup METALS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.STEEL_INGOT))
            .displayName(Text.translatable("itemgroup.thekitchensink.metals"))
            .entries((context, entries) -> {
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
            }).build();

    private static final ItemGroup MISC = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.ENDER_STAR))
            .displayName(Text.translatable("itemgroup.thekitchensink.misc"))
            .entries((context, entries) -> {
                //                        Misc
                entries.add(ModItems.ENDER_STAR);
                entries.add(ModItems.HEART);
                entries.add(ModItems.OBSIDIAN_STICK);
                entries.add(ModItems.METAL_DETECTOR);
                entries.add(ModItems.SOUL);
                    }).build();

    private static final ItemGroup ELEMENTAL = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.FIRE_INFUSED_STEEL_INGOT))
            .displayName(Text.translatable("itemgroup.thekitchensink.elemental"))
            .entries((context, entries) -> {
                //                        Elemental
                entries.add(ModBlocks.STEEL_BLOCK);
                entries.add(ModItems.STEEL_INGOT);
                entries.add(ModItems.FIRE_INFUSED_STEEL_INGOT);
                entries.add(ModItems.WATER_INFUSED_STEEL_INGOT);
                entries.add(ModItems.EARTH_INFUSED_STEEL_INGOT);
                entries.add(ModItems.AIR_INFUSED_STEEL_INGOT);
            }).build();

//      Logger for item group
    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, new Identifier("thekitchensink", "gems"), GEMS);
        Registry.register(Registries.ITEM_GROUP, new Identifier("thekitchensink", "backrooms"), BACKROOMS);
        Registry.register(Registries.ITEM_GROUP, new Identifier("thekitchensink", "metals"), METALS);
        Registry.register(Registries.ITEM_GROUP, new Identifier("thekitchensink", "misc"), MISC);
        Registry.register(Registries.ITEM_GROUP, new Identifier("thekitchensink", "elemental"), ELEMENTAL);

        Thekitchensink.LOGGER.info("Registering Item Groups for" +Thekitchensink.MOD_ID);
    }
}