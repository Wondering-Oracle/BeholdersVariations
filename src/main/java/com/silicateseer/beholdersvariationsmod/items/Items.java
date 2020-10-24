package com.silicateseer.beholdersvariationsmod.items;

import com.silicateseer.beholdersvariationsmod.BeholdersVariations;
import com.silicateseer.beholdersvariationsmod.blocks.Blocks;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Items 
{
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, BeholdersVariations.MODID);
	
	public static final RegistryObject<Item> NETHER_PEARL = ITEMS.register("nether_pearl", 
			() -> new Item(new Item.Properties().maxStackSize(64)));
	
	
	//Quartz Sandstone
	public static final RegistryObject<Item> SILICA_SAND = ITEMS.register("silica_sand", 
			() -> new BlockItem(Blocks.SILICA_SAND.get(), new Item.Properties().maxStackSize(64)));
	
	public static final RegistryObject<Item> SILICASTONE = ITEMS.register("silicastone", 
			() -> new BlockItem(Blocks.SILICASTONE.get(), new Item.Properties().maxStackSize(64)));
	public static final RegistryObject<Item> SILICASTONE_SLAB = ITEMS.register("silicastone_slab", 
			() -> new BlockItem(Blocks.SILICASTONE_SLAB.get(), new Item.Properties().maxStackSize(64)));
	public static final RegistryObject<Item> SILICASTONE_STAIRS = ITEMS.register("silicastone_stairs", 
			() -> new BlockItem(Blocks.SILICASTONE_STAIRS.get(), new Item.Properties().maxStackSize(64)));
	
	public static final RegistryObject<Item> SMOOTH_SILICASTONE = ITEMS.register("smooth_silicastone", 
			() -> new BlockItem(Blocks.SMOOTH_SILICASTONE.get(), new Item.Properties().maxStackSize(64)));
	public static final RegistryObject<Item> SMOOTH_SILICASTONE_SLAB = ITEMS.register("smooth_silicastone_slab", 
			() -> new BlockItem(Blocks.SMOOTH_SILICASTONE_SLAB.get(), new Item.Properties().maxStackSize(64)));
	public static final RegistryObject<Item> SMOOTH_SILICASTONE_STAIRS = ITEMS.register("smooth_silicastone_stairs", 
			() -> new BlockItem(Blocks.SMOOTH_SILICASTONE_STAIRS.get(), new Item.Properties().maxStackSize(64)));
	
	public static final RegistryObject<Item> CUT_SILICASTONE = ITEMS.register("cut_silicastone", 
			() -> new BlockItem(Blocks.CUT_SILICASTONE.get(), new Item.Properties().maxStackSize(64)));
	public static final RegistryObject<Item> CUT_SILICASTONE_SLAB = ITEMS.register("cut_silicastone_slab", 
			() -> new BlockItem(Blocks.CUT_SILICASTONE_SLAB.get(), new Item.Properties().maxStackSize(64)));
	
	public static final RegistryObject<Item> CHISELED_SILICASTONE = ITEMS.register("chiseled_silicastone", 
			() -> new BlockItem(Blocks.CHISELED_SILICASTONE.get(), new Item.Properties().maxStackSize(64)));
	
	//Soulsand Sandstone
	public static final RegistryObject<Item> SOULSANDSTONE = ITEMS.register("soulsandstone", 
			() -> new BlockItem(Blocks.SOULSANDSTONE.get(), new Item.Properties().maxStackSize(64)));
	public static final RegistryObject<Item> SOULSANDSTONE_SLAB = ITEMS.register("soulsandstone_slab", 
			() -> new BlockItem(Blocks.SOULSANDSTONE_SLAB.get(), new Item.Properties().maxStackSize(64)));
	public static final RegistryObject<Item> SOULSANDSTONE_STAIRS = ITEMS.register("soulsandstone_stairs", 
			() -> new BlockItem(Blocks.SOULSANDSTONE_STAIRS.get(), new Item.Properties().maxStackSize(64)));
	
	public static final RegistryObject<Item> SMOOTH_SOULSANDSTONE = ITEMS.register("smooth_soulsandstone", 
			() -> new BlockItem(Blocks.SMOOTH_SOULSANDSTONE.get(), new Item.Properties().maxStackSize(64)));
	public static final RegistryObject<Item> SMOOTH_SOULSANDSTONE_SLAB = ITEMS.register("smooth_soulsandstone_slab", 
			() -> new BlockItem(Blocks.SMOOTH_SOULSANDSTONE_SLAB.get(), new Item.Properties().maxStackSize(64)));
	public static final RegistryObject<Item> SMOOTH_SOULSANDSTONE_STAIRS = ITEMS.register("smooth_soulsandstone_stairs", 
			() -> new BlockItem(Blocks.SMOOTH_SOULSANDSTONE_STAIRS.get(), new Item.Properties().maxStackSize(64)));
	
	public static final RegistryObject<Item> CUT_SOULSANDSTONE = ITEMS.register("cut_soulsandstone", 
			() -> new BlockItem(Blocks.CUT_SOULSANDSTONE.get(), new Item.Properties().maxStackSize(64)));
	public static final RegistryObject<Item> CUT_SOULSANDSTONE_SLAB = ITEMS.register("cut_soulsandstone_slab", 
			() -> new BlockItem(Blocks.CUT_SOULSANDSTONE_SLAB.get(), new Item.Properties().maxStackSize(64)));
	
	public static final RegistryObject<Item> CHISELED_SOULSANDSTONE = ITEMS.register("chiseled_soulsandstone", 
			() -> new BlockItem(Blocks.CHISELED_SOULSANDSTONE.get(), new Item.Properties().maxStackSize(64)));
	
	//Soulsand Quartz
	public static final RegistryObject<Item> VITRIC_SOULSANDSTONE = ITEMS.register("vitric_soulsandstone", 
			() -> new BlockItem(Blocks.VITRIC_SOULSANDSTONE.get(), new Item.Properties().maxStackSize(64)));
	public static final RegistryObject<Item> VITRIC_SOULSANDSTONE_SLAB = ITEMS.register("vitric_soulsandstone_slab", 
			() -> new BlockItem(Blocks.SOULSANDSTONE_SLAB.get(), new Item.Properties().maxStackSize(64)));
	public static final RegistryObject<Item> VITRIC_SOULSANDSTONE_STAIRS = ITEMS.register("vitric_soulsandstone_stairs", 
			() -> new BlockItem(Blocks.VITRIC_SOULSANDSTONE_STAIRS.get(), new Item.Properties().maxStackSize(64)));
	
	public static final RegistryObject<Item> SMOOTH_VITRIC_SOULSANDSTONE = ITEMS.register("smooth_vitric_soulsandstone", 
			() -> new BlockItem(Blocks.SMOOTH_VITRIC_SOULSANDSTONE.get(), new Item.Properties().maxStackSize(64)));
	public static final RegistryObject<Item> SMOOTH_VITRIC_SOULSANDSTONE_SLAB = ITEMS.register("smooth_vitric_soulsandstone_slab", 
			() -> new BlockItem(Blocks.SMOOTH_VITRIC_SOULSANDSTONE_SLAB.get(), new Item.Properties().maxStackSize(64)));
	public static final RegistryObject<Item> SMOOTH_VITRIC_SOULSANDSTONE_STAIRS = ITEMS.register("smooth_vitric_soulsandstone_stairs", 
			() -> new BlockItem(Blocks.SMOOTH_VITRIC_SOULSANDSTONE_STAIRS.get(), new Item.Properties().maxStackSize(64)));
	
	public static final RegistryObject<Item> VITRIC_SOULSANDSTONE_PILLAR = ITEMS.register("vitric_soulsandstone_pillar", 
			() -> new BlockItem(Blocks.VITRIC_SOULSANDSTONE_PILLAR.get(), new Item.Properties().maxStackSize(64)));
	
	public static final RegistryObject<Item> CHISELED_VITRIC_SOULSANDSTONE = ITEMS.register("chiseled_vitric_soulsandstone", 
			() -> new BlockItem(Blocks.CHISELED_VITRIC_SOULSANDSTONE.get(), new Item.Properties().maxStackSize(64)));
	
}
