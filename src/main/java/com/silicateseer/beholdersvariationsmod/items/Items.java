package com.silicateseer.beholdersvariationsmod.items;

import com.silicateseer.beholdersvariationsmod.BeholdersVariations;
import com.silicateseer.beholdersvariationsmod.blocks.Blocks;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Items 
{
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, BeholdersVariations.MODID);
	
	public static final RegistryObject<Item> NETHER_PEARL = ITEMS.register("nether_pearl", 
			() -> new Item(new Item.Properties().maxStackSize(64).group(ItemGroup.MISC)));
	
	//0.1.0
	//Quartz Sandstone
	public static final RegistryObject<Item> SILICA_SAND = ITEMS.register("silica_sand", 
			() -> new BlockItem(Blocks.SILICA_SAND.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> SILICASTONE = ITEMS.register("silicastone", 
			() -> new BlockItem(Blocks.SILICASTONE.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> SILICASTONE_SLAB = ITEMS.register("silicastone_slab", 
			() -> new BlockItem(Blocks.SILICASTONE_SLAB.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> SILICASTONE_STAIRS = ITEMS.register("silicastone_stairs", 
			() -> new BlockItem(Blocks.SILICASTONE_STAIRS.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> SMOOTH_SILICASTONE = ITEMS.register("smooth_silicastone", 
			() -> new BlockItem(Blocks.SMOOTH_SILICASTONE.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> SMOOTH_SILICASTONE_SLAB = ITEMS.register("smooth_silicastone_slab", 
			() -> new BlockItem(Blocks.SMOOTH_SILICASTONE_SLAB.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> SMOOTH_SILICASTONE_STAIRS = ITEMS.register("smooth_silicastone_stairs", 
			() -> new BlockItem(Blocks.SMOOTH_SILICASTONE_STAIRS.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> CUT_SILICASTONE = ITEMS.register("cut_silicastone", 
			() -> new BlockItem(Blocks.CUT_SILICASTONE.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> CUT_SILICASTONE_SLAB = ITEMS.register("cut_silicastone_slab", 
			() -> new BlockItem(Blocks.CUT_SILICASTONE_SLAB.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> CHISELED_SILICASTONE = ITEMS.register("chiseled_silicastone", 
			() -> new BlockItem(Blocks.CHISELED_SILICASTONE.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	
	//Soulsand Sandstone
	public static final RegistryObject<Item> SOULSANDSTONE = ITEMS.register("soulsandstone", 
			() -> new BlockItem(Blocks.SOULSANDSTONE.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> SOULSANDSTONE_SLAB = ITEMS.register("soulsandstone_slab", 
			() -> new BlockItem(Blocks.SOULSANDSTONE_SLAB.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> SOULSANDSTONE_STAIRS = ITEMS.register("soulsandstone_stairs", 
			() -> new BlockItem(Blocks.SOULSANDSTONE_STAIRS.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> SMOOTH_SOULSANDSTONE = ITEMS.register("smooth_soulsandstone", 
			() -> new BlockItem(Blocks.SMOOTH_SOULSANDSTONE.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> SMOOTH_SOULSANDSTONE_SLAB = ITEMS.register("smooth_soulsandstone_slab", 
			() -> new BlockItem(Blocks.SMOOTH_SOULSANDSTONE_SLAB.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> SMOOTH_SOULSANDSTONE_STAIRS = ITEMS.register("smooth_soulsandstone_stairs", 
			() -> new BlockItem(Blocks.SMOOTH_SOULSANDSTONE_STAIRS.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> CUT_SOULSANDSTONE = ITEMS.register("cut_soulsandstone", 
			() -> new BlockItem(Blocks.CUT_SOULSANDSTONE.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> CUT_SOULSANDSTONE_SLAB = ITEMS.register("cut_soulsandstone_slab", 
			() -> new BlockItem(Blocks.CUT_SOULSANDSTONE_SLAB.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> CHISELED_SOULSANDSTONE = ITEMS.register("chiseled_soulsandstone", 
			() -> new BlockItem(Blocks.CHISELED_SOULSANDSTONE.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	
	//Soulsand Quartz
	public static final RegistryObject<Item> VITRIC_SOULSANDSTONE = ITEMS.register("vitric_soulsandstone", 
			() -> new BlockItem(Blocks.VITRIC_SOULSANDSTONE.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> VITRIC_SOULSANDSTONE_SLAB = ITEMS.register("vitric_soulsandstone_slab", 
			() -> new BlockItem(Blocks.VITRIC_SOULSANDSTONE_SLAB.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> VITRIC_SOULSANDSTONE_STAIRS = ITEMS.register("vitric_soulsandstone_stairs", 
			() -> new BlockItem(Blocks.VITRIC_SOULSANDSTONE_STAIRS.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> SMOOTH_VITRIC_SOULSANDSTONE = ITEMS.register("smooth_vitric_soulsandstone", 
			() -> new BlockItem(Blocks.SMOOTH_VITRIC_SOULSANDSTONE.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> SMOOTH_VITRIC_SOULSANDSTONE_SLAB = ITEMS.register("smooth_vitric_soulsandstone_slab", 
			() -> new BlockItem(Blocks.SMOOTH_VITRIC_SOULSANDSTONE_SLAB.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> SMOOTH_VITRIC_SOULSANDSTONE_STAIRS = ITEMS.register("smooth_vitric_soulsandstone_stairs", 
			() -> new BlockItem(Blocks.SMOOTH_VITRIC_SOULSANDSTONE_STAIRS.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> VITRIC_SOULSANDSTONE_PILLAR = ITEMS.register("vitric_soulsandstone_pillar", 
			() -> new BlockItem(Blocks.VITRIC_SOULSANDSTONE_PILLAR.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> CHISELED_VITRIC_SOULSANDSTONE = ITEMS.register("chiseled_vitric_soulsandstone", 
			() -> new BlockItem(Blocks.CHISELED_VITRIC_SOULSANDSTONE.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	
	//Sandstone Quartz
	public static final RegistryObject<Item> VITRIC_SANDSTONE = ITEMS.register("vitric_sandstone", 
			() -> new BlockItem(Blocks.VITRIC_SANDSTONE.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> VITRIC_SANDSTONE_SLAB = ITEMS.register("vitric_sandstone_slab", 
			() -> new BlockItem(Blocks.VITRIC_SANDSTONE_SLAB.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> VITRIC_SANDSTONE_STAIRS = ITEMS.register("vitric_sandstone_stairs", 
			() -> new BlockItem(Blocks.VITRIC_SANDSTONE_STAIRS.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> SMOOTH_VITRIC_SANDSTONE = ITEMS.register("smooth_vitric_sandstone", 
			() -> new BlockItem(Blocks.SMOOTH_VITRIC_SANDSTONE.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> SMOOTH_VITRIC_SANDSTONE_SLAB = ITEMS.register("smooth_vitric_sandstone_slab", 
			() -> new BlockItem(Blocks.SMOOTH_VITRIC_SANDSTONE_SLAB.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> SMOOTH_VITRIC_SANDSTONE_STAIRS = ITEMS.register("smooth_vitric_sandstone_stairs", 
			() -> new BlockItem(Blocks.SMOOTH_VITRIC_SANDSTONE_STAIRS.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> VITRIC_SANDSTONE_PILLAR = ITEMS.register("vitric_sandstone_pillar", 
			() -> new BlockItem(Blocks.VITRIC_SANDSTONE_PILLAR.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> CHISELED_VITRIC_SANDSTONE = ITEMS.register("chiseled_vitric_sandstone", 
			() -> new BlockItem(Blocks.CHISELED_VITRIC_SANDSTONE.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	
	//Red Sandstone Quartz
	public static final RegistryObject<Item> VITRIC_RED_SANDSTONE = ITEMS.register("vitric_red_sandstone", 
			() -> new BlockItem(Blocks.VITRIC_RED_SANDSTONE.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> VITRIC_RED_SANDSTONE_SLAB = ITEMS.register("vitric_red_sandstone_slab", 
			() -> new BlockItem(Blocks.VITRIC_RED_SANDSTONE_SLAB.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> VITRIC_RED_SANDSTONE_STAIRS = ITEMS.register("vitric_red_sandstone_stairs", 
			() -> new BlockItem(Blocks.VITRIC_RED_SANDSTONE_STAIRS.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> SMOOTH_VITRIC_RED_SANDSTONE = ITEMS.register("smooth_vitric_red_sandstone", 
			() -> new BlockItem(Blocks.SMOOTH_VITRIC_RED_SANDSTONE.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> SMOOTH_VITRIC_RED_SANDSTONE_SLAB = ITEMS.register("smooth_vitric_red_sandstone_slab", 
			() -> new BlockItem(Blocks.SMOOTH_VITRIC_RED_SANDSTONE_SLAB.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> SMOOTH_VITRIC_RED_SANDSTONE_STAIRS = ITEMS.register("smooth_vitric_red_sandstone_stairs", 
			() -> new BlockItem(Blocks.SMOOTH_VITRIC_RED_SANDSTONE_STAIRS.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> VITRIC_RED_SANDSTONE_PILLAR = ITEMS.register("vitric_red_sandstone_pillar", 
			() -> new BlockItem(Blocks.VITRIC_RED_SANDSTONE_PILLAR.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> CHISELED_VITRIC_RED_SANDSTONE = ITEMS.register("chiseled_vitric_red_sandstone", 
			() -> new BlockItem(Blocks.CHISELED_VITRIC_RED_SANDSTONE.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	
	//0.2.0
	//Prismarine Sand
	public static final RegistryObject<Item> PRISMARINE_SAND = ITEMS.register("prismarine_sand", 
			() -> new BlockItem(Blocks.PRISMARINE_SAND.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	//Prismarine Bricks Sandstone
	public static final RegistryObject<Item> PRISMARINE_SANDSTONE = ITEMS.register("prismarine_sandstone", 
			() -> new BlockItem(Blocks.PRISMARINE_SANDSTONE.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> PRISMARINE_SANDSTONE_SLAB = ITEMS.register("prismarine_sandstone_slab", 
			() -> new BlockItem(Blocks.PRISMARINE_SANDSTONE_SLAB.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> PRISMARINE_SANDSTONE_STAIRS = ITEMS.register("prismarine_sandstone_stairs", 
			() -> new BlockItem(Blocks.PRISMARINE_SANDSTONE_STAIRS.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> SMOOTH_PRISMARINE_SANDSTONE = ITEMS.register("smooth_prismarine_sandstone", 
			() -> new BlockItem(Blocks.SMOOTH_PRISMARINE_SANDSTONE.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> SMOOTH_PRISMARINE_SANDSTONE_SLAB = ITEMS.register("smooth_prismarine_sandstone_slab", 
			() -> new BlockItem(Blocks.SMOOTH_PRISMARINE_SANDSTONE_SLAB.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> SMOOTH_PRISMARINE_SANDSTONE_STAIRS = ITEMS.register("smooth_prismarine_sandstone_stairs", 
			() -> new BlockItem(Blocks.SMOOTH_PRISMARINE_SANDSTONE_STAIRS.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> CUT_PRISMARINE_SANDSTONE = ITEMS.register("cut_prismarine_sandstone", 
			() -> new BlockItem(Blocks.CUT_PRISMARINE_SANDSTONE.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> CUT_PRISMARINE_SANDSTONE_SLAB = ITEMS.register("cut_prismarine_sandstone_slab", 
			() -> new BlockItem(Blocks.CUT_PRISMARINE_SANDSTONE_SLAB.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> CHISELED_PRISMARINE_SANDSTONE = ITEMS.register("chiseled_prismarine_sandstone", 
			() -> new BlockItem(Blocks.CHISELED_PRISMARINE_SANDSTONE.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	//Prismarine Bricks Quartz
	public static final RegistryObject<Item> VITRIC_PRISMARINE = ITEMS.register("vitric_prismarine", 
			() -> new BlockItem(Blocks.VITRIC_PRISMARINE.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> VITRIC_PRISMARINE_SLAB = ITEMS.register("vitric_prismarine_slab", 
			() -> new BlockItem(Blocks.VITRIC_PRISMARINE_SLAB.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> VITRIC_PRISMARINE_STAIRS = ITEMS.register("vitric_prismarine_stairs", 
			() -> new BlockItem(Blocks.VITRIC_PRISMARINE_STAIRS.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> SMOOTH_VITRIC_PRISMARINE = ITEMS.register("smooth_vitric_prismarine", 
			() -> new BlockItem(Blocks.SMOOTH_VITRIC_PRISMARINE.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> SMOOTH_VITRIC_PRISMARINE_SLAB = ITEMS.register("smooth_vitric_prismarine_slab", 
			() -> new BlockItem(Blocks.SMOOTH_VITRIC_PRISMARINE_SLAB.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> SMOOTH_VITRIC_PRISMARINE_STAIRS = ITEMS.register("smooth_vitric_prismarine_stairs", 
			() -> new BlockItem(Blocks.SMOOTH_VITRIC_PRISMARINE_STAIRS.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> VITRIC_PRISMARINE_PILLAR = ITEMS.register("vitric_prismarine_pillar", 
			() -> new BlockItem(Blocks.VITRIC_PRISMARINE_PILLAR.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> CHISELED_VITRIC_PRISMARINE = ITEMS.register("chiseled_vitric_prismarine", 
			() -> new BlockItem(Blocks.CHISELED_VITRIC_PRISMARINE.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	//Dark Prismarine Sandstone
	public static final RegistryObject<Item> DARK_PRISMARINE_SANDSTONE = ITEMS.register("dark_prismarine_sandstone", 
			() -> new BlockItem(Blocks.DARK_PRISMARINE_SANDSTONE.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> DARK_PRISMARINE_SANDSTONE_SLAB = ITEMS.register("dark_prismarine_sandstone_slab", 
			() -> new BlockItem(Blocks.DARK_PRISMARINE_SANDSTONE_SLAB.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> DARK_PRISMARINE_SANDSTONE_STAIRS = ITEMS.register("dark_prismarine_sandstone_stairs", 
			() -> new BlockItem(Blocks.DARK_PRISMARINE_SANDSTONE_STAIRS.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> SMOOTH_DARK_PRISMARINE_SANDSTONE = ITEMS.register("smooth_dark_prismarine_sandstone", 
			() -> new BlockItem(Blocks.SMOOTH_DARK_PRISMARINE_SANDSTONE.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> SMOOTH_DARK_PRISMARINE_SANDSTONE_SLAB = ITEMS.register("smooth_dark_prismarine_sandstone_slab", 
			() -> new BlockItem(Blocks.SMOOTH_DARK_PRISMARINE_SANDSTONE_SLAB.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> SMOOTH_DARK_PRISMARINE_SANDSTONE_STAIRS = ITEMS.register("smooth_dark_prismarine_sandstone_stairs", 
			() -> new BlockItem(Blocks.SMOOTH_DARK_PRISMARINE_SANDSTONE_STAIRS.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> CUT_DARK_PRISMARINE_SANDSTONE = ITEMS.register("cut_dark_prismarine_sandstone", 
			() -> new BlockItem(Blocks.CUT_DARK_PRISMARINE_SANDSTONE.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> CUT_DARK_PRISMARINE_SANDSTONE_SLAB = ITEMS.register("cut_dark_prismarine_sandstone_slab", 
			() -> new BlockItem(Blocks.CUT_DARK_PRISMARINE_SANDSTONE_SLAB.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> CHISELED_DARK_PRISMARINE_SANDSTONE = ITEMS.register("chiseled_dark_prismarine_sandstone", 
			() -> new BlockItem(Blocks.CHISELED_DARK_PRISMARINE_SANDSTONE.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	//Dark Prismarine Quartz
	public static final RegistryObject<Item> VITRIC_DARK_PRISMARINE = ITEMS.register("vitric_dark_prismarine", 
			() -> new BlockItem(Blocks.VITRIC_DARK_PRISMARINE.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> VITRIC_DARK_PRISMARINE_SLAB = ITEMS.register("vitric_dark_prismarine_slab", 
			() -> new BlockItem(Blocks.VITRIC_DARK_PRISMARINE_SLAB.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> VITRIC_DARK_PRISMARINE_STAIRS = ITEMS.register("vitric_dark_prismarine_stairs", 
			() -> new BlockItem(Blocks.VITRIC_DARK_PRISMARINE_STAIRS.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> SMOOTH_VITRIC_DARK_PRISMARINE = ITEMS.register("smooth_vitric_dark_prismarine", 
			() -> new BlockItem(Blocks.SMOOTH_VITRIC_DARK_PRISMARINE.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> SMOOTH_VITRIC_DARK_PRISMARINE_SLAB = ITEMS.register("smooth_vitric_dark_prismarine_slab", 
			() -> new BlockItem(Blocks.SMOOTH_VITRIC_DARK_PRISMARINE_SLAB.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> SMOOTH_VITRIC_DARK_PRISMARINE_STAIRS = ITEMS.register("smooth_vitric_dark_prismarine_stairs", 
			() -> new BlockItem(Blocks.SMOOTH_VITRIC_DARK_PRISMARINE_STAIRS.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> VITRIC_DARK_PRISMARINE_PILLAR = ITEMS.register("vitric_dark_prismarine_pillar", 
			() -> new BlockItem(Blocks.VITRIC_DARK_PRISMARINE_PILLAR.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> CHISELED_VITRIC_DARK_PRISMARINE = ITEMS.register("chiseled_vitric_dark_prismarine", 
			() -> new BlockItem(Blocks.CHISELED_VITRIC_DARK_PRISMARINE.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	//Prismarine Bricks Dark Prismarine
	public static final RegistryObject<Item> PRISMARINE_TILING = ITEMS.register("prismarine_tiling", 
			() -> new BlockItem(Blocks.PRISMARINE_TILING.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> PRISMARINE_TILING_SLAB = ITEMS.register("prismarine_tiling_slab", 
			() -> new BlockItem(Blocks.PRISMARINE_TILING_SLAB.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> PRISMARINE_TILING_STAIRS = ITEMS.register("prismarine_tiling_stairs", 
			() -> new BlockItem(Blocks.PRISMARINE_TILING_STAIRS.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	
	//Dark Prismarine Prismarine Bricks
	public static final RegistryObject<Item> DARK_PRISMARINE_BRICKS = ITEMS.register("dark_prismarine_bricks", 
			() -> new BlockItem(Blocks.DARK_PRISMARINE_BRICKS.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> DARK_PRISMARINE_BRICK_SLAB = ITEMS.register("dark_prismarine_brick_slab", 
			() -> new BlockItem(Blocks.DARK_PRISMARINE_BRICK_SLAB.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<Item> DARK_PRISMARINE_BRICK_STAIRS = ITEMS.register("dark_prismarine_brick_stairs", 
			() -> new BlockItem(Blocks.DARK_PRISMARINE_BRICK_STAIRS.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)));
}
