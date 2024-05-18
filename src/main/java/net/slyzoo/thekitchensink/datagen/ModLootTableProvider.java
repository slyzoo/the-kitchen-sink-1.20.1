package net.slyzoo.thekitchensink.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.slyzoo.thekitchensink.block.ModBlocks;
import net.slyzoo.thekitchensink.item.ModItems;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.ALUMINIUM_BLOCK);
        addDrop(ModBlocks.RAW_ALUMINIUM_BLOCK);
        addDrop(ModBlocks.BACKROOMS_LEVEL_ZERO_FLUORESCENT_LIGHT);
        addDrop(ModBlocks.BACKROOMS_LEVEL_ZERO_TILE_CEILING_BLOCK);
        addDrop(ModBlocks.BACKROOMS_LEVEL_ZERO_WALL_CEILING_BLOCK);
        addDrop(ModBlocks.BACKROOMS_LEVEL_ZERO_WALL_BLOCK);
        addDrop(ModBlocks.BACKROOMS_LEVEL_ZERO_WALL_BASEBOARD_BLOCK);
        addDrop(ModBlocks.BACKROOMS_LEVEL_ZERO_MOIST_CARPET_BLOCK);
        addDrop(ModBlocks.BACKROOMS_LEVEL_THIRTY_SEVEN_POOL_TILE_BLOCK);
        addDrop(ModBlocks.BRONZE_BLOCK);
        addDrop(ModBlocks.GARNET_BLOCK);
        addDrop(ModBlocks.JADE_BLOCK);
        addDrop(ModBlocks.JASPER_BLOCK);
        addDrop(ModBlocks.PEARL_BLOCK);
        addDrop(ModBlocks.PURPLE_GOLD_BLOCK);
        addDrop(ModBlocks.RUBY_BLOCK);
        addDrop(ModBlocks.ROSE_QUARTZ_BLOCK);
        addDrop(ModBlocks.SAPPHIRE_BLOCK);
        addDrop(ModBlocks.STEEL_BLOCK);
        addDrop(ModBlocks.TIN_BLOCK);
        addDrop(ModBlocks.RAW_TIN_BLOCK);
        addDrop(ModBlocks.TOPAZ_BLOCK);
        addDrop(ModBlocks.ZINC_BLOCK);
        addDrop(ModBlocks.RAW_ZINC_BLOCK);

        addDrop(ModBlocks.NETHER_ALUMINIUM_ORE, oreDrops(ModBlocks.NETHER_ALUMINIUM_ORE, ModItems.RAW_ALUMINIUM));
        addDrop(ModBlocks.GARNET_ORE, oreDrops(ModBlocks.GARNET_ORE, ModItems.GARNET));
        addDrop(ModBlocks.DEEPSLATE_GARNET_ORE, oreDrops(ModBlocks.DEEPSLATE_GARNET_ORE, ModItems.GARNET));
        addDrop(ModBlocks.JADE_ORE, oreDrops(ModBlocks.JADE_ORE, ModItems.JADE));
        addDrop(ModBlocks.DEEPSLATE_JADE_ORE, oreDrops(ModBlocks.DEEPSLATE_JADE_ORE, ModItems.JADE));
        addDrop(ModBlocks.JASPER_ORE, oreDrops(ModBlocks.JASPER_ORE, ModItems.JASPER));
        addDrop(ModBlocks.DEEPSLATE_JASPER_ORE, oreDrops(ModBlocks.DEEPSLATE_JASPER_ORE, ModItems.JASPER));
        addDrop(ModBlocks.RUBY_ORE, oreDrops(ModBlocks.RUBY_ORE, ModItems.RUBY));
        addDrop(ModBlocks.DEEPSLATE_RUBY_ORE, oreDrops(ModBlocks.DEEPSLATE_RUBY_ORE, ModItems.RUBY));
        addDrop(ModBlocks.SAPPHIRE_ORE, oreDrops(ModBlocks.SAPPHIRE_ORE, ModItems.SAPPHIRE));
        addDrop(ModBlocks.DEEPSLATE_SAPPHIRE_ORE, oreDrops(ModBlocks.DEEPSLATE_SAPPHIRE_ORE, ModItems.SAPPHIRE));
        addDrop(ModBlocks.TIN_ORE, copperLikeOreDrops(ModBlocks.TIN_ORE, ModItems.RAW_TIN));
        addDrop(ModBlocks.DEEPSLATE_TIN_ORE, copperLikeOreDrops(ModBlocks.DEEPSLATE_TIN_ORE, ModItems.RAW_TIN));
        addDrop(ModBlocks.TOPAZ_ORE, oreDrops(ModBlocks.TOPAZ_ORE, ModItems.TOPAZ));
        addDrop(ModBlocks.DEEPSLATE_TOPAZ_ORE, oreDrops(ModBlocks.DEEPSLATE_TOPAZ_ORE, ModItems.TOPAZ));
        addDrop(ModBlocks.ZINC_ORE, copperLikeOreDrops(ModBlocks.ZINC_ORE, ModItems.RAW_ZINC));
        addDrop(ModBlocks.DEEPSLATE_ZINC_ORE, copperLikeOreDrops(ModBlocks.DEEPSLATE_ZINC_ORE, ModItems.RAW_ZINC));

    }
    public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider.create(2.0f, 5.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}
