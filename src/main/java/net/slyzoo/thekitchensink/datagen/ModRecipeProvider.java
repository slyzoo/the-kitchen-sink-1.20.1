package net.slyzoo.thekitchensink.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.slyzoo.thekitchensink.block.ModBlocks;
import net.slyzoo.thekitchensink.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    private static final List<ItemConvertible> TIN_SMELTABLES = List.of(ModItems.RAW_TIN, ModBlocks.TIN_ORE, ModBlocks.DEEPSLATE_TIN_ORE);

    private static final List<ItemConvertible> ALUMINIUM_SMELTABLES = List.of(ModItems.RAW_ALUMINIUM, ModBlocks.NETHER_ALUMINIUM_ORE);

    private static final List<ItemConvertible> ZINC_SMELTABLES = List.of(ModItems.RAW_ZINC, ModBlocks.ZINC_ORE, ModBlocks.DEEPSLATE_ZINC_ORE);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
//    Ruby
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY, RecipeCategory.DECORATIONS,
                ModBlocks.RUBY_BLOCK);

//    Sapphire
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SAPPHIRE, RecipeCategory.DECORATIONS,
                ModBlocks.SAPPHIRE_BLOCK);

//    Topaz
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.TOPAZ, RecipeCategory.DECORATIONS,
                ModBlocks.TOPAZ_BLOCK);

//    Jade
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.JADE, RecipeCategory.DECORATIONS,
                ModBlocks.JADE_BLOCK);

//    Jasper
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.JASPER, RecipeCategory.DECORATIONS,
                ModBlocks.JASPER_BLOCK);

//    Pearl
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PEARL, RecipeCategory.DECORATIONS,
                ModBlocks.PEARL_BLOCK);

//    Rose Quartz
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.ROSE_QUARTZ,4)
                .pattern("GQ")
                .pattern("QG")
                .input('Q', Items.QUARTZ)
                .input('G', Items.GOLD_INGOT)
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .criterion(hasItem(Items.QUARTZ), conditionsFromItem(Items.QUARTZ))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ROSE_QUARTZ)));

//    Aluminium
    offerSmelting(exporter,ALUMINIUM_SMELTABLES, RecipeCategory.MISC, ModItems.ALUMINIUM_INGOT, 0.7f,200,"aluminium");
    offerBlasting(exporter,ALUMINIUM_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT, 0.7f,200,"aluminium");
    offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ALUMINIUM_INGOT, RecipeCategory.DECORATIONS,
            ModBlocks.ALUMINIUM_BLOCK);

//    Bronze
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BRONZE_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.BRONZE_BLOCK);

//    Purple Gold
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PURPLE_GOLD_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.PURPLE_GOLD_BLOCK);

//    Tin
    offerSmelting(exporter,TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT, 0.7f,200,"tin");
    offerBlasting(exporter,TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT, 0.7f,200,"tin");
    offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_INGOT, RecipeCategory.DECORATIONS, ModBlocks.TIN_BLOCK);

//    Zinc
    offerSmelting(exporter,ZINC_SMELTABLES, RecipeCategory.MISC, ModItems.ZINC_INGOT, 0.7f,200,"zinc");
    offerBlasting(exporter,ZINC_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT, 0.7f,200,"zinc");
    offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ZINC_INGOT, RecipeCategory.DECORATIONS, ModBlocks.ZINC_BLOCK);

//    Steel
      offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.STEEL_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.STEEL_BLOCK);

//    Fire Infused Ingot
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FIRE_INFUSED_STEEL_INGOT,4)
                .pattern(" S ")
                .pattern("SBS")
                .pattern(" S ")
                .input('B', Items.BLAZE_POWDER)
                .input('S', ModItems.STEEL_INGOT)
                .criterion(hasItem(Items.BLAZE_POWDER), conditionsFromItem(Items.BLAZE_POWDER))
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.FIRE_INFUSED_STEEL_INGOT)));

//    Water Infused Ingot
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WATER_INFUSED_STEEL_INGOT,4)
                .pattern(" S ")
                .pattern("SHS")
                .pattern(" S ")
                .input('H', Items.HEART_OF_THE_SEA)
                .input('S', ModItems.STEEL_INGOT)
                .criterion(hasItem(Items.HEART_OF_THE_SEA), conditionsFromItem(Items.HEART_OF_THE_SEA))
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WATER_INFUSED_STEEL_INGOT)));

//    Earth Infused Ingot
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EARTH_INFUSED_STEEL_INGOT,4)
                .pattern("TSI")
                .pattern("SDS")
                .pattern("GSA")
                .input('A', Items.ANDESITE)
                .input('T', Items.STONE)
                .input('I', Items.DIORITE)
                .input('G', Items.GRANITE)
                .input('D', Items.DIRT)
                .input('S', ModItems.STEEL_INGOT)
                .criterion(hasItem(Items.ANDESITE), conditionsFromItem(Items.ANDESITE))
                .criterion(hasItem(Items.STONE), conditionsFromItem(Items.STONE))
                .criterion(hasItem(Items.DIORITE), conditionsFromItem(Items.DIORITE))
                .criterion(hasItem(Items.GRANITE), conditionsFromItem(Items.GRANITE))
                .criterion(hasItem(Items.DIRT), conditionsFromItem(Items.DIRT))
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.EARTH_INFUSED_STEEL_INGOT)));

//    Air Infused Ingot
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AIR_INFUSED_STEEL_INGOT,4)
                .pattern(" S ")
                .pattern("SFS")
                .pattern(" S ")
                .input('F', Items.FIREWORK_STAR)
                .input('S', ModItems.STEEL_INGOT)
                .criterion(hasItem(Items.FIREWORK_STAR), conditionsFromItem(Items.FIREWORK_STAR))
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AIR_INFUSED_STEEL_INGOT)));

//    Bronze Coin
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BRONZE_COIN,4)
                .pattern("BB")
                .pattern("BB")
                .input('B', ModItems.BRONZE_NUGGET)
                .criterion(hasItem(ModItems.BRONZE_NUGGET), conditionsFromItem(ModItems.BRONZE_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BRONZE_COIN)));

//    Aluminium Coin
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ALUMINIUM_COIN,4)
                .pattern("AA")
                .pattern("AA")
                .input('A', ModItems.ALUMINIUM_NUGGET)
                .criterion(hasItem(ModItems.ALUMINIUM_NUGGET), conditionsFromItem(ModItems.ALUMINIUM_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ALUMINIUM_COIN)));

//    Steel Coin
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_COIN,4)
                .pattern("SS")
                .pattern("SS")
                .input('S', ModItems.STEEL_NUGGET)
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_COIN)));

//    Copper Coin
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_COIN,4)
                .pattern("CC")
                .pattern("CC")
                .input('C', ModItems.COPPER_NUGGET)
                .criterion(hasItem(ModItems.COPPER_NUGGET), conditionsFromItem(ModItems.COPPER_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_COIN)));

//    Iron Coin
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRON_COIN,4)
                .pattern("II")
                .pattern("II")
                .input('I', Items.IRON_NUGGET)
                .criterion(hasItem(Items.IRON_NUGGET), conditionsFromItem(Items.IRON_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IRON_COIN)));

//    Gold Coin
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GOLD_COIN,4)
                .pattern("GG")
                .pattern("GG")
                .input('G', Items.GOLD_NUGGET)
                .criterion(hasItem(Items.GOLD_NUGGET), conditionsFromItem(Items.GOLD_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLD_COIN)));

//    Diamond Coin
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DIAMOND_COIN,4)
                .pattern("DD")
                .pattern("DD")
                .input('D', ModItems.DIAMOND_NUGGET)
                .criterion(hasItem(ModItems.DIAMOND_NUGGET), conditionsFromItem(ModItems.DIAMOND_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DIAMOND_COIN)));

//    Netherite Coin
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NETHERITE_COIN,4)
                .pattern("NN")
                .pattern("NN")
                .input('N', ModItems.NETHERITE_NUGGET)
                .criterion(hasItem(ModItems.NETHERITE_NUGGET), conditionsFromItem(ModItems.NETHERITE_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.NETHERITE_COIN)));

//    Bronze Nugget
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.BRONZE_INGOT, RecipeCategory.MISC, ModItems.BRONZE_NUGGET);

//    Aluminium Nugget
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.ALUMINIUM_INGOT, RecipeCategory.MISC, ModItems.ALUMINIUM_NUGGET);

//    Steel Nugget
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.STEEL_INGOT, RecipeCategory.MISC, ModItems.STEEL_NUGGET);

//    Zinc Nugget
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.ZINC_INGOT, RecipeCategory.MISC, ModItems.ZINC_NUGGET);

//    Tin Nugget
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.TIN_INGOT, RecipeCategory.MISC, ModItems.TIN_NUGGET);

//    Copper Nugget
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.COPPER_INGOT, RecipeCategory.MISC, ModItems.COPPER_NUGGET);

//    Diamond Nugget
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.DIAMOND, RecipeCategory.MISC, ModItems.DIAMOND_NUGGET);

//    Netherite Nugget
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.NETHERITE_INGOT, RecipeCategory.MISC, ModItems.NETHERITE_NUGGET);

//    Ender Star
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ENDER_STAR,1)
                .pattern(" N ")
                .pattern("NEN")
                .pattern(" N ")
                .input('E', Items.NETHER_STAR)
                .input('N', Items.NETHERITE_INGOT)
                .criterion(hasItem(Items.NETHER_STAR), conditionsFromItem(Items.NETHER_STAR))
                .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ENDER_STAR)));

//    Obsidian Stick
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NETHERITE_PLATED_HEART,1)
                .pattern("O")
                .pattern("O")
                .input('O', Items.OBSIDIAN)
                .criterion(hasItem(Items.OBSIDIAN), conditionsFromItem(Items.OBSIDIAN))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.NETHERITE_PLATED_HEART)));

//    Metal Detector
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.METAL_DETECTOR,1)
                .pattern("  R")
                .pattern(" S ")
                .pattern("S  ")
                .input('R', Items.REDSTONE)
                .input('S', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.METAL_DETECTOR)));

//    Heart
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HEART,1)
                .pattern("GRG")
                .pattern("RTR")
                .pattern("GRG")
                .input('R', ModBlocks.RUBY_BLOCK)
                .input('G', Items.GOLD_BLOCK)
                .input('T', Items.TOTEM_OF_UNDYING)
                .criterion(hasItem(ModBlocks.RUBY_BLOCK), conditionsFromItem(ModBlocks.RUBY_BLOCK))
                .criterion(hasItem(Items.GOLD_BLOCK), conditionsFromItem(Items.GOLD_BLOCK))
                .criterion(hasItem(Items.TOTEM_OF_UNDYING), conditionsFromItem(Items.TOTEM_OF_UNDYING))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HEART)));

//    Copper Plated Heart
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_PLATED_HEART,1)
                .pattern("CCC")
                .pattern("CHC")
                .pattern("CCC")
                .input('H', ModItems.HEART)
                .input('C', Items.COPPER_BLOCK)
                .criterion(hasItem(ModItems.HEART), conditionsFromItem(ModItems.HEART))
                .criterion(hasItem(Items.COPPER_BLOCK), conditionsFromItem(Items.COPPER_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_PLATED_HEART)));

//    Iron Plated Heart
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRON_PLATED_HEART,1)
                .pattern("III")
                .pattern("IHI")
                .pattern("III")
                .input('H', ModItems.HEART)
                .input('I', Items.IRON_BLOCK)
                .criterion(hasItem(ModItems.HEART), conditionsFromItem(ModItems.HEART))
                .criterion(hasItem(Items.IRON_BLOCK), conditionsFromItem(Items.IRON_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IRON_PLATED_HEART)));

//    Gold Plated Heart
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GOLDEN_PLATED_HEART,1)
                .pattern("GGG")
                .pattern("GHG")
                .pattern("GGG")
                .input('H', ModItems.HEART)
                .input('G', Items.GOLD_BLOCK)
                .criterion(hasItem(ModItems.HEART), conditionsFromItem(ModItems.HEART))
                .criterion(hasItem(Items.GOLD_BLOCK), conditionsFromItem(Items.GOLD_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLDEN_PLATED_HEART)));

//    Diamond Plated Heart
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DIAMOND_PLATED_HEART,1)
                .pattern("DDD")
                .pattern("DHD")
                .pattern("DDD")
                .input('H', ModItems.HEART)
                .input('D', Items.DIAMOND_BLOCK)
                .criterion(hasItem(ModItems.HEART), conditionsFromItem(ModItems.HEART))
                .criterion(hasItem(Items.DIAMOND_BLOCK), conditionsFromItem(Items.DIAMOND_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DIAMOND_PLATED_HEART)));

//    Netherite Plated Heart
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NETHERITE_PLATED_HEART,1)
                .pattern(" N ")
                .pattern("NHN")
                .pattern(" N ")
                .input('H', ModItems.HEART)
                .input('N', Items.NETHERITE_INGOT)
                .criterion(hasItem(ModItems.HEART), conditionsFromItem(ModItems.HEART))
                .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.NETHERITE_PLATED_HEART)));

//    LifeStealer
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.LIFESTEALER_SWORD,1)
                .pattern("  R")
                .pattern(" N ")
                .pattern("O  ")
                .input('R', ModItems.RUBY)
                .input('N', ModItems.NETHERITE_PLATED_HEART)
                .input('O', ModItems.OBSIDIAN_STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .criterion(hasItem(ModItems.NETHERITE_PLATED_HEART), conditionsFromItem(ModItems.NETHERITE_PLATED_HEART))
                .criterion(hasItem(ModItems.OBSIDIAN_STICK), conditionsFromItem(ModItems.OBSIDIAN_STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LIFESTEALER_SWORD)));

//    Dark Energy Sword
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.DARK_ENERGY_SWORD,1)
                .pattern("  S")
                .pattern(" E ")
                .pattern("O  ")
                .input('S', ModItems.STEEL_INGOT)
                .input('E', ModItems.ENDER_STAR)
                .input('O', ModItems.OBSIDIAN_STICK)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .criterion(hasItem(ModItems.ENDER_STAR), conditionsFromItem(ModItems.ENDER_STAR))
                .criterion(hasItem(ModItems.OBSIDIAN_STICK), conditionsFromItem(ModItems.OBSIDIAN_STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DARK_ENERGY_SWORD)));

//    Void Sword
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.VOIDSTAR_SWORD,1)
                .pattern(" SS")
                .pattern("RGS")
                .pattern("OR ")
                .input('S', ModItems.STEEL_INGOT)
                .input('R', ModItems.RUBY)
                .input('G', Items.GOLD_BLOCK)
                .input('O', ModItems.OBSIDIAN_STICK)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .criterion(hasItem(ModItems.OBSIDIAN_STICK), conditionsFromItem(ModItems.OBSIDIAN_STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LIFESTEALER_SWORD)));

//    Death's Scythe
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.DEATHS_SCYTHE,1)
                .pattern("TTT")
                .pattern(" ST")
                .pattern("S  ")
                .input('T', ModItems.STEEL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DEATHS_SCYTHE)));

//    Baguette
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.BAGUETTE,3)
                .pattern("  B")
                .pattern(" B ")
                .pattern("B")
                .input('B', Items.BREAD)
                .criterion(hasItem(Items.BREAD), conditionsFromItem(Items.BREAD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BAGUETTE)));

//    Diamond Apple
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.DIAMOND_APPLE,1)
                .pattern("DDD")
                .pattern("DAD")
                .pattern("DDD")
                .input('D', Items.DIAMOND)
                .input('A', Items.APPLE)
                .criterion(hasItem(Items.APPLE), conditionsFromItem(Items.APPLE))
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DIAMOND_APPLE)));

//    Netherite apple
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.NETHERITE_APPLE,1)
                .pattern("NNN")
                .pattern("NAN")
                .pattern("NNN")
                .input('N', Items.NETHERITE_INGOT)
                .input('A', Items.APPLE)
                .criterion(hasItem(Items.APPLE), conditionsFromItem(Items.APPLE))
                .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.NETHERITE_APPLE)));
    }
}