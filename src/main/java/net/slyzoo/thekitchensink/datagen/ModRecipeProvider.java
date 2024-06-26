package net.slyzoo.thekitchensink.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.slyzoo.thekitchensink.block.ModBlocks;
import net.slyzoo.thekitchensink.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> ALUMINIUM_SMELTABLES = List.of(ModItems.RAW_ALUMINIUM, ModBlocks.NETHER_ALUMINIUM_ORE);
    private static final List<ItemConvertible> GARNET_SMELTABLES = List.of(ModBlocks.GARNET_ORE, ModBlocks.DEEPSLATE_GARNET_ORE);
    private static final List<ItemConvertible> JADE_SMELTABLES = List.of(ModBlocks.JADE_ORE, ModBlocks.DEEPSLATE_JADE_ORE);
    private static final List<ItemConvertible> JASPER_SMELTABLES = List.of(ModBlocks.JASPER_ORE, ModBlocks.DEEPSLATE_JASPER_ORE);
    private static final List<ItemConvertible> RUBY_SMELTABLES = List.of(ModBlocks.RUBY_ORE, ModBlocks.DEEPSLATE_RUBY_ORE);
    private static final List<ItemConvertible> SAPPHIRE_SMELTABLES = List.of(ModBlocks.SAPPHIRE_ORE, ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
    private static final List<ItemConvertible> TIN_SMELTABLES = List.of(ModItems.RAW_TIN, ModBlocks.TIN_ORE, ModBlocks.DEEPSLATE_TIN_ORE);
    private static final List<ItemConvertible> TOPAZ_SMELTABLES = List.of(ModBlocks.TOPAZ_ORE, ModBlocks.DEEPSLATE_TOPAZ_ORE);
    private static final List<ItemConvertible> ZINC_SMELTABLES = List.of(ModItems.RAW_ZINC, ModBlocks.ZINC_ORE, ModBlocks.DEEPSLATE_ZINC_ORE);
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, ALUMINIUM_SMELTABLES, RecipeCategory.MISC, ModItems.ALUMINIUM_INGOT, 0.7f, 200, "aluminium");
        offerBlasting(exporter, ALUMINIUM_SMELTABLES, RecipeCategory.MISC, ModItems.ALUMINIUM_INGOT, 0.7f, 200, "aluminium");
        offerSmelting(exporter, GARNET_SMELTABLES, RecipeCategory.MISC, ModItems.GARNET, 0.7f, 200, "garnet");
        offerBlasting(exporter, GARNET_SMELTABLES, RecipeCategory.MISC, ModItems.GARNET, 0.7f, 200, "garnet");
        offerSmelting(exporter, JADE_SMELTABLES, RecipeCategory.MISC, ModItems.JADE, 0.7f, 200, "jade");
        offerBlasting(exporter, JADE_SMELTABLES, RecipeCategory.MISC, ModItems.JADE, 0.7f, 200, "jade");
        offerSmelting(exporter, JASPER_SMELTABLES, RecipeCategory.MISC, ModItems.JASPER, 0.7f, 200, "jasper");
        offerBlasting(exporter, JASPER_SMELTABLES, RecipeCategory.MISC, ModItems.JASPER, 0.7f, 200, "jasper");
        offerSmelting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY, 0.7f, 200, "ruby");
        offerBlasting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY, 0.7f, 200, "ruby");
        offerSmelting(exporter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE, 0.7f, 200, "sapphire");
        offerBlasting(exporter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE, 0.7f, 200, "sapphire");
        offerSmelting(exporter, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT, 0.7f, 200, "tin");
        offerBlasting(exporter, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT, 0.7f, 200, "tin");
        offerSmelting(exporter, TOPAZ_SMELTABLES, RecipeCategory.MISC, ModItems.TOPAZ, 0.7f, 200, "topaz");
        offerBlasting(exporter, TOPAZ_SMELTABLES, RecipeCategory.MISC, ModItems.TOPAZ, 0.7f, 200, "topaz");
        offerSmelting(exporter, ZINC_SMELTABLES, RecipeCategory.MISC, ModItems.ZINC_INGOT, 0.7f, 200, "zinc");
        offerBlasting(exporter, ZINC_SMELTABLES, RecipeCategory.MISC, ModItems.ZINC_INGOT, 0.7f, 200, "zinc");


        offerReversibleCompactingRecipes(exporter,RecipeCategory.BUILDING_BLOCKS,ModItems.ALUMINIUM_INGOT, RecipeCategory.DECORATIONS, ModBlocks.ALUMINIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter,RecipeCategory.BUILDING_BLOCKS,ModItems.GARNET, RecipeCategory.DECORATIONS, ModBlocks.GARNET_BLOCK);
        offerReversibleCompactingRecipes(exporter,RecipeCategory.BUILDING_BLOCKS,ModItems.JADE, RecipeCategory.DECORATIONS, ModBlocks.JADE_BLOCK);
        offerReversibleCompactingRecipes(exporter,RecipeCategory.BUILDING_BLOCKS,ModItems.JASPER, RecipeCategory.DECORATIONS, ModBlocks.JASPER_BLOCK);
        offerReversibleCompactingRecipes(exporter,RecipeCategory.BUILDING_BLOCKS,ModItems.PEARL, RecipeCategory.DECORATIONS, ModBlocks.PEARL_BLOCK);
        offerReversibleCompactingRecipes(exporter,RecipeCategory.BUILDING_BLOCKS,ModItems.RUBY, RecipeCategory.DECORATIONS, ModBlocks.RUBY_BLOCK);
        offerReversibleCompactingRecipes(exporter,RecipeCategory.BUILDING_BLOCKS,ModItems.SAPPHIRE, RecipeCategory.DECORATIONS, ModBlocks.SAPPHIRE_BLOCK);
        offerReversibleCompactingRecipes(exporter,RecipeCategory.BUILDING_BLOCKS,ModItems.TIN_INGOT, RecipeCategory.DECORATIONS, ModBlocks.TIN_BLOCK);
        offerReversibleCompactingRecipes(exporter,RecipeCategory.BUILDING_BLOCKS,ModItems.TOPAZ, RecipeCategory.DECORATIONS, ModBlocks.TOPAZ_BLOCK);
        offerReversibleCompactingRecipes(exporter,RecipeCategory.BUILDING_BLOCKS,ModItems.ZINC_INGOT, RecipeCategory.DECORATIONS, ModBlocks.ZINC_BLOCK);

        offerReversibleCompactingRecipes(exporter,RecipeCategory.BUILDING_BLOCKS,ModItems.ALUMINIUM_NUGGET, RecipeCategory.DECORATIONS, ModItems.ALUMINIUM_INGOT);
        offerReversibleCompactingRecipes(exporter,RecipeCategory.BUILDING_BLOCKS,ModItems.BRONZE_NUGGET, RecipeCategory.DECORATIONS, ModItems.BRONZE_INGOT);
        offerReversibleCompactingRecipes(exporter,RecipeCategory.BUILDING_BLOCKS,ModItems.COPPER_NUGGET, RecipeCategory.DECORATIONS, Items.COPPER_INGOT);
        offerReversibleCompactingRecipes(exporter,RecipeCategory.BUILDING_BLOCKS,ModItems.DIAMOND_NUGGET, RecipeCategory.DECORATIONS, Items.DIAMOND);
        offerReversibleCompactingRecipes(exporter,RecipeCategory.BUILDING_BLOCKS,ModItems.NETHERITE_NUGGET, RecipeCategory.DECORATIONS, Items.NETHERITE_INGOT);
        offerReversibleCompactingRecipes(exporter,RecipeCategory.BUILDING_BLOCKS,ModItems.TIN_NUGGET, RecipeCategory.DECORATIONS, ModItems.TIN_INGOT);
        offerReversibleCompactingRecipes(exporter,RecipeCategory.BUILDING_BLOCKS,ModItems.ZINC_NUGGET, RecipeCategory.DECORATIONS, ModItems.ZINC_INGOT);

//        ALUMINIUM
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ALUMINIUM_INGOT, 1)
                .pattern("A")
                .pattern("A")
                .pattern("T")
                .input('A', ModItems.ALUMINIUM_INGOT).input('T',Items.STICK)
                .criterion(hasItem(ModItems.ALUMINIUM_INGOT), conditionsFromItem(ModItems.ALUMINIUM_INGOT)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ALUMINIUM_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ALUMINIUM_INGOT, 1)
                .pattern("AA")
                .pattern("AT")
                .pattern(" T")
                .input('A', ModItems.ALUMINIUM_INGOT).input('T',Items.STICK)
                .criterion(hasItem(ModItems.ALUMINIUM_INGOT), conditionsFromItem(ModItems.ALUMINIUM_INGOT)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ALUMINIUM_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ALUMINIUM_INGOT, 1)
                .pattern("AAA")
                .pattern(" T ")
                .pattern(" T ")
                .input('A', ModItems.ALUMINIUM_INGOT).input('T',Items.STICK)
                .criterion(hasItem(ModItems.ALUMINIUM_INGOT), conditionsFromItem(ModItems.ALUMINIUM_INGOT)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ALUMINIUM_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ALUMINIUM_INGOT, 1)
                .pattern("A")
                .pattern("T")
                .pattern("T")
                .input('A', ModItems.ALUMINIUM_INGOT).input('T',Items.STICK)
                .criterion(hasItem(ModItems.ALUMINIUM_INGOT), conditionsFromItem(ModItems.ALUMINIUM_INGOT)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ALUMINIUM_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ALUMINIUM_INGOT, 1)
                .pattern("AA")
                .pattern(" T")
                .pattern(" T")
                .input('A', ModItems.ALUMINIUM_INGOT).input('T',Items.STICK)
                .criterion(hasItem(ModItems.ALUMINIUM_INGOT), conditionsFromItem(ModItems.ALUMINIUM_INGOT)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ALUMINIUM_HOE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ALUMINIUM_INGOT, 1)
                .pattern("AAA")
                .pattern("A A")
                .input('A', ModItems.ALUMINIUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINIUM_INGOT), conditionsFromItem(ModItems.ALUMINIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ALUMINIUM_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ALUMINIUM_INGOT, 1)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .input('A', ModItems.ALUMINIUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINIUM_INGOT), conditionsFromItem(ModItems.ALUMINIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ALUMINIUM_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ALUMINIUM_INGOT, 1)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .input('A', ModItems.ALUMINIUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINIUM_INGOT), conditionsFromItem(ModItems.ALUMINIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ALUMINIUM_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ALUMINIUM_INGOT, 1)
                .pattern("A A")
                .pattern("A A")
                .input('A', ModItems.ALUMINIUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINIUM_INGOT), conditionsFromItem(ModItems.ALUMINIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ALUMINIUM_BOOTS)));

//      BRONZE
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BRONZE_INGOT, 1)
                .pattern("B")
                .pattern("B")
                .pattern("T")
                .input('B', ModItems.BRONZE_INGOT).input('T',Items.STICK)
                .criterion(hasItem(ModItems.BRONZE_INGOT), conditionsFromItem(ModItems.BRONZE_INGOT)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BRONZE_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BRONZE_INGOT, 1)
                .pattern("BB")
                .pattern("BT")
                .pattern(" T")
                .input('B', ModItems.BRONZE_INGOT).input('T',Items.STICK)
                .criterion(hasItem(ModItems.BRONZE_INGOT), conditionsFromItem(ModItems.BRONZE_INGOT)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BRONZE_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BRONZE_INGOT, 1)
                .pattern("BBB")
                .pattern(" T ")
                .pattern(" T ")
                .input('B', ModItems.BRONZE_INGOT).input('T',Items.STICK)
                .criterion(hasItem(ModItems.BRONZE_INGOT), conditionsFromItem(ModItems.BRONZE_INGOT)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BRONZE_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BRONZE_INGOT, 1)
                .pattern("B")
                .pattern("T")
                .pattern("T")
                .input('B', ModItems.BRONZE_INGOT).input('T',Items.STICK)
                .criterion(hasItem(ModItems.BRONZE_INGOT), conditionsFromItem(ModItems.BRONZE_INGOT)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BRONZE_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BRONZE_INGOT, 1)
                .pattern("BB")
                .pattern(" T")
                .pattern(" T")
                .input('B', ModItems.BRONZE_INGOT).input('T',Items.STICK)
                .criterion(hasItem(ModItems.BRONZE_INGOT), conditionsFromItem(ModItems.BRONZE_INGOT)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BRONZE_HOE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BRONZE_INGOT, 1)
                .pattern("BBB")
                .pattern("B B")
                .input('B', ModItems.BRONZE_INGOT)
                .criterion(hasItem(ModItems.BRONZE_INGOT), conditionsFromItem(ModItems.BRONZE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BRONZE_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BRONZE_INGOT, 1)
                .pattern("B B")
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ModItems.BRONZE_INGOT)
                .criterion(hasItem(ModItems.BRONZE_INGOT), conditionsFromItem(ModItems.BRONZE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BRONZE_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BRONZE_INGOT, 1)
                .pattern("BBB")
                .pattern("B B")
                .pattern("B B")
                .input('B', ModItems.BRONZE_INGOT)
                .criterion(hasItem(ModItems.BRONZE_INGOT), conditionsFromItem(ModItems.BRONZE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BRONZE_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BRONZE_INGOT, 1)
                .pattern("B B")
                .pattern("B B")
                .input('B', ModItems.BRONZE_INGOT)
                .criterion(hasItem(ModItems.BRONZE_INGOT), conditionsFromItem(ModItems.BRONZE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BRONZE_BOOTS)));

        //      GARNET
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GARNET, 1)
                .pattern("G")
                .pattern("G")
                .pattern("T")
                .input('G', ModItems.GARNET).input('T',Items.STICK)
                .criterion(hasItem(ModItems.GARNET), conditionsFromItem(ModItems.GARNET)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GARNET_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GARNET, 1)
                .pattern("GG")
                .pattern("GT")
                .pattern(" T")
                .input('G', ModItems.GARNET).input('T',Items.STICK)
                .criterion(hasItem(ModItems.GARNET), conditionsFromItem(ModItems.GARNET)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GARNET_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GARNET, 1)
                .pattern("GGG")
                .pattern(" T ")
                .pattern(" T ")
                .input('G', ModItems.GARNET).input('T',Items.STICK)
                .criterion(hasItem(ModItems.GARNET), conditionsFromItem(ModItems.GARNET)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BRONZE_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GARNET, 1)
                .pattern("G")
                .pattern("T")
                .pattern("T")
                .input('G', ModItems.GARNET).input('T',Items.STICK)
                .criterion(hasItem(ModItems.GARNET), conditionsFromItem(ModItems.GARNET)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GARNET_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GARNET, 1)
                .pattern("GG")
                .pattern(" T")
                .pattern(" T")
                .input('G', ModItems.GARNET).input('T',Items.STICK)
                .criterion(hasItem(ModItems.GARNET), conditionsFromItem(ModItems.GARNET)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GARNET_HOE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GARNET, 1)
                .pattern("GGG")
                .pattern("G G")
                .input('G', ModItems.GARNET)
                .criterion(hasItem(ModItems.GARNET), conditionsFromItem(ModItems.GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GARNET_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GARNET, 1)
                .pattern("G G")
                .pattern("GGG")
                .pattern("GGG")
                .input('G', ModItems.GARNET)
                .criterion(hasItem(ModItems.GARNET), conditionsFromItem(ModItems.GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GARNET_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GARNET, 1)
                .pattern("GGG")
                .pattern("G G")
                .pattern("G G")
                .input('G', ModItems.GARNET)
                .criterion(hasItem(ModItems.GARNET), conditionsFromItem(ModItems.GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GARNET_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GARNET, 1)
                .pattern("G G")
                .pattern("G G")
                .input('G', ModItems.GARNET)
                .criterion(hasItem(ModItems.GARNET), conditionsFromItem(ModItems.GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GARNET_BOOTS)));

        //      JADE
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.JADE, 1)
                .pattern("J")
                .pattern("J")
                .pattern("T")
                .input('J', ModItems.JADE).input('T',Items.STICK)
                .criterion(hasItem(ModItems.JADE), conditionsFromItem(ModItems.JADE)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.JADE_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.JADE, 1)
                .pattern("JJ")
                .pattern("JT")
                .pattern(" T")
                .input('J', ModItems.JADE).input('T',Items.STICK)
                .criterion(hasItem(ModItems.JADE), conditionsFromItem(ModItems.JADE)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.JADE_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.JADE, 1)
                .pattern("JJJ")
                .pattern(" T ")
                .pattern(" T ")
                .input('J', ModItems.JADE).input('T',Items.STICK)
                .criterion(hasItem(ModItems.JADE), conditionsFromItem(ModItems.JADE)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.JADE_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.JADE, 1)
                .pattern("J")
                .pattern("T")
                .pattern("T")
                .input('J', ModItems.JADE).input('T',Items.STICK)
                .criterion(hasItem(ModItems.JADE), conditionsFromItem(ModItems.JADE)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.JADE_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.JADE, 1)
                .pattern("JJ")
                .pattern(" T")
                .pattern(" T")
                .input('J', ModItems.JADE).input('T',Items.STICK)
                .criterion(hasItem(ModItems.JADE), conditionsFromItem(ModItems.JADE)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.JADE_HOE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.JADE, 1)
                .pattern("JJJ")
                .pattern("J J")
                .input('J', ModItems.JADE)
                .criterion(hasItem(ModItems.JADE), conditionsFromItem(ModItems.JADE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.JADE_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.JADE, 1)
                .pattern("J J")
                .pattern("JJJ")
                .pattern("JJJ")
                .input('J', ModItems.JADE)
                .criterion(hasItem(ModItems.JADE), conditionsFromItem(ModItems.JADE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.JADE_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.JADE, 1)
                .pattern("JJJ")
                .pattern("J J")
                .pattern("J J")
                .input('J', ModItems.JADE)
                .criterion(hasItem(ModItems.JADE), conditionsFromItem(ModItems.JADE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.JADE_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.JADE, 1)
                .pattern("J J")
                .pattern("J J")
                .input('J', ModItems.JADE)
                .criterion(hasItem(ModItems.JADE), conditionsFromItem(ModItems.JADE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.JADE_BOOTS)));


        //      JASPER
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.JASPER, 1)
                .pattern("J")
                .pattern("J")
                .pattern("T")
                .input('J', ModItems.JASPER).input('T',Items.STICK)
                .criterion(hasItem(ModItems.JASPER), conditionsFromItem(ModItems.JASPER)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.JASPER_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.JASPER, 1)
                .pattern("JJ")
                .pattern("JT")
                .pattern(" T")
                .input('J', ModItems.JASPER).input('T',Items.STICK)
                .criterion(hasItem(ModItems.JASPER), conditionsFromItem(ModItems.JASPER)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.JASPER_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.JASPER, 1)
                .pattern("JJJ")
                .pattern(" T ")
                .pattern(" T ")
                .input('J', ModItems.JASPER).input('T',Items.STICK)
                .criterion(hasItem(ModItems.JASPER), conditionsFromItem(ModItems.JASPER)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.JASPER_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.JADE, 1)
                .pattern("J")
                .pattern("T")
                .pattern("T")
                .input('J', ModItems.JASPER).input('T',Items.STICK)
                .criterion(hasItem(ModItems.JASPER), conditionsFromItem(ModItems.JASPER)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.JASPER_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.JASPER, 1)
                .pattern("JJ")
                .pattern(" T")
                .pattern(" T")
                .input('J', ModItems.JASPER).input('T',Items.STICK)
                .criterion(hasItem(ModItems.JASPER), conditionsFromItem(ModItems.JASPER)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.JASPER_HOE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.JASPER, 1)
                .pattern("JJJ")
                .pattern("J J")
                .input('J', ModItems.JASPER)
                .criterion(hasItem(ModItems.JASPER), conditionsFromItem(ModItems.JASPER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.JASPER_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.JASPER, 1)
                .pattern("J J")
                .pattern("JJJ")
                .pattern("JJJ")
                .input('J', ModItems.JASPER)
                .criterion(hasItem(ModItems.JASPER), conditionsFromItem(ModItems.JASPER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.JASPER_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.JASPER, 1)
                .pattern("JJJ")
                .pattern("J J")
                .pattern("J J")
                .input('J', ModItems.JASPER)
                .criterion(hasItem(ModItems.JASPER), conditionsFromItem(ModItems.JASPER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.JASPER_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.JASPER, 1)
                .pattern("J J")
                .pattern("J J")
                .input('J', ModItems.JASPER)
                .criterion(hasItem(ModItems.JASPER), conditionsFromItem(ModItems.JASPER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.JASPER_BOOTS)));

        //      PURPLE GOLD
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.PURPLE_GOLD_INGOT, 1)
                .pattern("P")
                .pattern("P")
                .pattern("T")
                .input('P', ModItems.PURPLE_GOLD_INGOT).input('T',Items.STICK)
                .criterion(hasItem(ModItems.PURPLE_GOLD_INGOT), conditionsFromItem(ModItems.PURPLE_GOLD_INGOT)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PURPLE_GOLD_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PURPLE_GOLD_INGOT, 1)
                .pattern("PP")
                .pattern("PT")
                .pattern(" T")
                .input('P', ModItems.PURPLE_GOLD_INGOT).input('T',Items.STICK)
                .criterion(hasItem(ModItems.PURPLE_GOLD_INGOT), conditionsFromItem(ModItems.PURPLE_GOLD_INGOT)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PURPLE_GOLD_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PURPLE_GOLD_INGOT, 1)
                .pattern("PPP")
                .pattern(" T ")
                .pattern(" T ")
                .input('P', ModItems.PURPLE_GOLD_INGOT).input('T',Items.STICK)
                .criterion(hasItem(ModItems.PURPLE_GOLD_INGOT), conditionsFromItem(ModItems.PURPLE_GOLD_INGOT)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PURPLE_GOLD_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PURPLE_GOLD_INGOT, 1)
                .pattern("P")
                .pattern("T")
                .pattern("T")
                .input('P', ModItems.PURPLE_GOLD_INGOT).input('T',Items.STICK)
                .criterion(hasItem(ModItems.PURPLE_GOLD_INGOT), conditionsFromItem(ModItems.PURPLE_GOLD_INGOT)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PURPLE_GOLD_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PURPLE_GOLD_INGOT, 1)
                .pattern("PP")
                .pattern(" T")
                .pattern(" T")
                .input('P', ModItems.PURPLE_GOLD_INGOT).input('T',Items.STICK)
                .criterion(hasItem(ModItems.PURPLE_GOLD_INGOT), conditionsFromItem(ModItems.PURPLE_GOLD_INGOT)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PURPLE_GOLD_HOE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.PURPLE_GOLD_INGOT, 1)
                .pattern("PPP")
                .pattern("P P")
                .input('P', ModItems.PURPLE_GOLD_INGOT)
                .criterion(hasItem(ModItems.PURPLE_GOLD_INGOT), conditionsFromItem(ModItems.PURPLE_GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PURPLE_GOLD_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.PURPLE_GOLD_INGOT, 1)
                .pattern("P P")
                .pattern("PPP")
                .pattern("PPP")
                .input('P', ModItems.PURPLE_GOLD_INGOT)
                .criterion(hasItem(ModItems.PURPLE_GOLD_INGOT), conditionsFromItem(ModItems.PURPLE_GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PURPLE_GOLD_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.PURPLE_GOLD_INGOT, 1)
                .pattern("PPP")
                .pattern("P P")
                .pattern("P P")
                .input('P', ModItems.PURPLE_GOLD_INGOT)
                .criterion(hasItem(ModItems.PURPLE_GOLD_INGOT), conditionsFromItem(ModItems.PURPLE_GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PURPLE_GOLD_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.PURPLE_GOLD_INGOT, 1)
                .pattern("P P")
                .pattern("P P")
                .input('P', ModItems.PURPLE_GOLD_INGOT)
                .criterion(hasItem(ModItems.PURPLE_GOLD_INGOT), conditionsFromItem(ModItems.PURPLE_GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PURPLE_GOLD_BOOTS)));

        //      ROSE QUARTZ
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ROSE_QUARTZ, 1)
                .pattern("R")
                .pattern("R")
                .pattern("T")
                .input('R', ModItems.ROSE_QUARTZ).input('T',Items.STICK)
                .criterion(hasItem(ModItems.ROSE_QUARTZ), conditionsFromItem(ModItems.ROSE_QUARTZ)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ROSE_QUARTZ_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ROSE_QUARTZ, 1)
                .pattern("RR")
                .pattern("RT")
                .pattern(" T")
                .input('R', ModItems.ROSE_QUARTZ).input('T',Items.STICK)
                .criterion(hasItem(ModItems.ROSE_QUARTZ), conditionsFromItem(ModItems.ROSE_QUARTZ)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ROSE_QUARTZ_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ROSE_QUARTZ, 1)
                .pattern("RRR")
                .pattern(" T ")
                .pattern(" T ")
                .input('R', ModItems.ROSE_QUARTZ).input('T',Items.STICK)
                .criterion(hasItem(ModItems.ROSE_QUARTZ), conditionsFromItem(ModItems.ROSE_QUARTZ)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ROSE_QUARTZ_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ROSE_QUARTZ, 1)
                .pattern("R")
                .pattern("T")
                .pattern("T")
                .input('R', ModItems.ROSE_QUARTZ).input('T',Items.STICK)
                .criterion(hasItem(ModItems.ROSE_QUARTZ), conditionsFromItem(ModItems.ROSE_QUARTZ)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ROSE_QUARTZ_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ROSE_QUARTZ, 1)
                .pattern("RR")
                .pattern(" T")
                .pattern(" T")
                .input('R', ModItems.ROSE_QUARTZ).input('T',Items.STICK)
                .criterion(hasItem(ModItems.ROSE_QUARTZ), conditionsFromItem(ModItems.ROSE_QUARTZ)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ROSE_QUARTZ_HOE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ROSE_QUARTZ, 1)
                .pattern("RRR")
                .pattern("R R")
                .input('R', ModItems.ROSE_QUARTZ)
                .criterion(hasItem(ModItems.ROSE_QUARTZ), conditionsFromItem(ModItems.ROSE_QUARTZ))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ROSE_QUARTZ_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ROSE_QUARTZ, 1)
                .pattern("R R")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.ROSE_QUARTZ)
                .criterion(hasItem(ModItems.ROSE_QUARTZ), conditionsFromItem(ModItems.ROSE_QUARTZ))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ROSE_QUARTZ_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ROSE_QUARTZ, 1)
                .pattern("RRR")
                .pattern("R R")
                .pattern("R R")
                .input('R', ModItems.ROSE_QUARTZ)
                .criterion(hasItem(ModItems.ROSE_QUARTZ), conditionsFromItem(ModItems.ROSE_QUARTZ))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ROSE_QUARTZ_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ROSE_QUARTZ, 1)
                .pattern("R R")
                .pattern("R R")
                .input('R', ModItems.ROSE_QUARTZ)
                .criterion(hasItem(ModItems.ROSE_QUARTZ), conditionsFromItem(ModItems.ROSE_QUARTZ))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ROSE_QUARTZ_BOOTS)));

        //      RUBY
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.RUBY, 1)
                .pattern("R")
                .pattern("R")
                .pattern("T")
                .input('R', ModItems.RUBY).input('T',Items.STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RUBY_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY, 1)
                .pattern("RR")
                .pattern("RT")
                .pattern(" T")
                .input('R', ModItems.RUBY).input('T',Items.STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RUBY_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY, 1)
                .pattern("RRR")
                .pattern(" T ")
                .pattern(" T ")
                .input('R', ModItems.RUBY).input('T',Items.STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RUBY_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY, 1)
                .pattern("R")
                .pattern("T")
                .pattern("T")
                .input('R', ModItems.RUBY).input('T',Items.STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RUBY_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY, 1)
                .pattern("RR")
                .pattern(" T")
                .pattern(" T")
                .input('R', ModItems.RUBY).input('T',Items.STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RUBY_HOE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.RUBY, 1)
                .pattern("RRR")
                .pattern("R R")
                .input('R', ModItems.RUBY)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RUBY_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.RUBY, 1)
                .pattern("R R")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.RUBY)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RUBY_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.RUBY, 1)
                .pattern("RRR")
                .pattern("R R")
                .pattern("R R")
                .input('R', ModItems.RUBY)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RUBY_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.RUBY, 1)
                .pattern("R R")
                .pattern("R R")
                .input('R', ModItems.RUBY)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RUBY_BOOTS)));

        //      SAPPHIRE
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.SAPPHIRE, 1)
                .pattern("S")
                .pattern("S")
                .pattern("T")
                .input('S', ModItems.SAPPHIRE).input('T',Items.STICK)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SAPPHIRE_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.SAPPHIRE, 1)
                .pattern("SS")
                .pattern("ST")
                .pattern(" T")
                .input('S', ModItems.SAPPHIRE).input('T',Items.STICK)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SAPPHIRE_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.SAPPHIRE, 1)
                .pattern("SSS")
                .pattern(" T ")
                .pattern(" T ")
                .input('S', ModItems.SAPPHIRE).input('T',Items.STICK)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SAPPHIRE_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.SAPPHIRE, 1)
                .pattern("S")
                .pattern("T")
                .pattern("T")
                .input('S', ModItems.SAPPHIRE).input('T',Items.STICK)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SAPPHIRE_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.SAPPHIRE, 1)
                .pattern("SS")
                .pattern(" T")
                .pattern(" T")
                .input('S', ModItems.SAPPHIRE).input('T',Items.STICK)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SAPPHIRE_HOE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.SAPPHIRE, 1)
                .pattern("SSS")
                .pattern("S S")
                .input('S', ModItems.SAPPHIRE)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SAPPHIRE_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.SAPPHIRE, 1)
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', ModItems.SAPPHIRE)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SAPPHIRE_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.SAPPHIRE, 1)
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .input('S', ModItems.SAPPHIRE)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SAPPHIRE_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.SAPPHIRE, 1)
                .pattern("S S")
                .pattern("S S")
                .input('S', ModItems.SAPPHIRE)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SAPPHIRE_BOOTS)));

        //      STEEL
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_INGOT, 1)
                .pattern("S")
                .pattern("S")
                .pattern("T")
                .input('S', ModItems.STEEL_INGOT).input('T',Items.STICK)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_INGOT, 1)
                .pattern("SS")
                .pattern("ST")
                .pattern(" T")
                .input('S', ModItems.STEEL_INGOT).input('T',Items.STICK)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_INGOT, 1)
                .pattern("SSS")
                .pattern(" T ")
                .pattern(" T ")
                .input('S', ModItems.STEEL_INGOT).input('T',Items.STICK)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_INGOT, 1)
                .pattern("S")
                .pattern("T")
                .pattern("T")
                .input('S', ModItems.STEEL_INGOT).input('T',Items.STICK)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_INGOT, 1)
                .pattern("SS")
                .pattern(" T")
                .pattern(" T")
                .input('S', ModItems.STEEL_INGOT).input('T',Items.STICK)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_HOE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_INGOT, 1)
                .pattern("SSS")
                .pattern("S S")
                .input('S', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_INGOT, 1)
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_INGOT, 1)
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .input('S', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_INGOT, 1)
                .pattern("S S")
                .pattern("S S")
                .input('S', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_BOOTS)));

        //      TOPAZ
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TOPAZ, 1)
                .pattern("S")
                .pattern("S")
                .pattern("T")
                .input('S', ModItems.TOPAZ).input('T',Items.STICK)
                .criterion(hasItem(ModItems.TOPAZ), conditionsFromItem(ModItems.TOPAZ)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TOPAZ_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TOPAZ, 1)
                .pattern("SS")
                .pattern("ST")
                .pattern(" T")
                .input('S', ModItems.TOPAZ).input('T',Items.STICK)
                .criterion(hasItem(ModItems.TOPAZ), conditionsFromItem(ModItems.TOPAZ)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TOPAZ_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TOPAZ, 1)
                .pattern("SSS")
                .pattern(" T ")
                .pattern(" T ")
                .input('S', ModItems.TOPAZ).input('T',Items.STICK)
                .criterion(hasItem(ModItems.TOPAZ), conditionsFromItem(ModItems.TOPAZ)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TOPAZ_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TOPAZ, 1)
                .pattern("S")
                .pattern("T")
                .pattern("T")
                .input('S', ModItems.TOPAZ).input('T',Items.STICK)
                .criterion(hasItem(ModItems.TOPAZ), conditionsFromItem(ModItems.TOPAZ)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TOPAZ_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TOPAZ, 1)
                .pattern("SS")
                .pattern(" T")
                .pattern(" T")
                .input('S', ModItems.TOPAZ).input('T',Items.STICK)
                .criterion(hasItem(ModItems.TOPAZ), conditionsFromItem(ModItems.TOPAZ)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TOPAZ_HOE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TOPAZ, 1)
                .pattern("SSS")
                .pattern("S S")
                .input('S', ModItems.TOPAZ)
                .criterion(hasItem(ModItems.TOPAZ), conditionsFromItem(ModItems.TOPAZ))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TOPAZ_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TOPAZ, 1)
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', ModItems.TOPAZ)
                .criterion(hasItem(ModItems.TOPAZ), conditionsFromItem(ModItems.TOPAZ))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TOPAZ_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TOPAZ, 1)
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .input('S', ModItems.TOPAZ)
                .criterion(hasItem(ModItems.TOPAZ), conditionsFromItem(ModItems.TOPAZ))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TOPAZ_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TOPAZ, 1)
                .pattern("S S")
                .pattern("S S")
                .input('S', ModItems.TOPAZ)
                .criterion(hasItem(ModItems.TOPAZ), conditionsFromItem(ModItems.TOPAZ))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TOPAZ)));

//      DARK ENERGY SWORD
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ENDER_STAR, 1)
                .pattern("P")
                .pattern("E")
                .pattern("T")
                .input('R', ModItems.PURPLE_GOLD_INGOT)
                .input('E',ModItems.ENDER_STAR)
                .input('T',ModItems.OBSIDIAN_STICK)
                .criterion(hasItem(ModItems.PURPLE_GOLD_INGOT), conditionsFromItem(ModItems.PURPLE_GOLD_INGOT))
                .criterion(hasItem(ModItems.ENDER_STAR), conditionsFromItem(ModItems.ENDER_STAR))
                .criterion(hasItem(ModItems.OBSIDIAN_STICK), conditionsFromItem(ModItems.OBSIDIAN_STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LIFESTEALER_SWORD)));

        //      VOIDSTAR SWORD
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ENDER_STAR, 1)
                .pattern("R")
                .pattern("E")
                .pattern("T")
                .input('R', ModItems.RUBY)
                .input('E',ModItems.ENDER_STAR)
                .input('T',ModItems.OBSIDIAN_STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY)).criterion(hasItem(ModItems.ENDER_STAR), conditionsFromItem(ModItems.ENDER_STAR))
                .criterion(hasItem(ModItems.OBSIDIAN_STICK), conditionsFromItem(ModItems.OBSIDIAN_STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.VOIDSTAR_SWORD)));

        //      LIFESTEALER SWORD
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.HEART, 1)
                .pattern("R")
                .pattern("H")
                .pattern("T")
                .input('R', ModItems.RUBY)
                .input('E',ModItems.HEART)
                .input('T',ModItems.OBSIDIAN_STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .criterion(hasItem(ModItems.HEART), conditionsFromItem(ModItems.HEART))
                .criterion(hasItem(ModItems.OBSIDIAN_STICK), conditionsFromItem(ModItems.OBSIDIAN_STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LIFESTEALER_SWORD)));

//              OBBY STICK
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.OBSIDIAN, 1)
                .pattern("O")
                .pattern("O")
                .input('O', Items.OBSIDIAN)
                .criterion(hasItem(Items.OBSIDIAN), conditionsFromItem(Items.OBSIDIAN))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.OBSIDIAN_STICK)));


    }
}
