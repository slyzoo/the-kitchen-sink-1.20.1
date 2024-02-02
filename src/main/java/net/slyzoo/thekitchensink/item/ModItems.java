package net.slyzoo.thekitchensink.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.slyzoo.thekitchensink.Thekitchensink;
import net.slyzoo.thekitchensink.item.custom.MetalDetectorItem;

public class ModItems {
//      Gems
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item GARNET = registerItem("garnet", new Item(new FabricItemSettings()));
    public static final Item TOPAZ = registerItem("topaz", new Item(new FabricItemSettings()));
    public static final Item JADE = registerItem("jade", new Item(new FabricItemSettings()));
    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new FabricItemSettings()));
    public static final Item PEARL = registerItem("pearl", new Item(new FabricItemSettings()));
    public static final Item ROSE_QUARTZ = registerItem("rose_quartz", new Item(new FabricItemSettings()));
    public static final Item JASPER = registerItem("jasper", new Item(new FabricItemSettings()));

//      Ingots
    public static final Item ALUMINIUM_INGOT = registerItem("aluminium_ingot", new Item(new FabricItemSettings()));
    public static final Item BRONZE_INGOT = registerItem("bronze_ingot", new Item(new FabricItemSettings()));
    public static final Item PURPLE_GOLD_INGOT = registerItem("purple_gold_ingot", new Item(new FabricItemSettings()));
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new FabricItemSettings()));
    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(new FabricItemSettings()));
    public static final Item ZINC_INGOT = registerItem("zinc_ingot", new Item(new FabricItemSettings()));
    public static final Item FIRE_INFUSED_STEEL_INGOT = registerItem("fire_infused_steel_ingot", new Item(new FabricItemSettings()));
    public static final Item WATER_INFUSED_STEEL_INGOT = registerItem("water_infused_steel_ingot", new Item(new FabricItemSettings()));
    public static final Item EARTH_INFUSED_STEEL_INGOT = registerItem("earth_infused_steel_ingot", new Item(new FabricItemSettings()));
    public static final Item AIR_INFUSED_STEEL_INGOT = registerItem("air_infused_steel_ingot", new Item(new FabricItemSettings()));

//      Flowers

//      Raw Ore
    public static final Item RAW_ALUMINIUM = registerItem("raw_aluminium", new Item(new FabricItemSettings()));
    public static final Item RAW_TIN = registerItem("raw_tin", new Item(new FabricItemSettings()));
    public static final Item RAW_ZINC = registerItem("raw_zinc", new Item(new FabricItemSettings()));

//      Misc
    public static final Item ENDER_STAR = registerItem("ender_star", new Item(new FabricItemSettings()));
    public static final Item OBSIDIAN_STICK = registerItem("obsidian_stick", new Item(new FabricItemSettings()));
    public static final Item HEART = registerItem("HeartItem", new Item(new FabricItemSettings()));
    public static final Item METAL_DETECTOR = registerItem("metal_detector", new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));
    public static final Item SOUL = registerItem("soul", new Item(new FabricItemSettings()));

//     Weapons
public static final Item LIFESTEALER_SWORD = registerItem("lifestealer_sword", new Item(new FabricItemSettings()));

    //      Registering the item
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Thekitchensink.MOD_ID, name), item);
    }
//      Logging the items
    public static void registerModItems(){
        Thekitchensink.LOGGER.info("registering Mod Items for "+ Thekitchensink.MOD_ID);
    }
}
