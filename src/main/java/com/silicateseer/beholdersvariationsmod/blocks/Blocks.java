package com.silicateseer.beholdersvariationsmod.blocks;

import com.silicateseer.beholdersvariationsmod.BeholdersVariations;

import net.minecraft.block.Block;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SandBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Blocks 
{
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, BeholdersVariations.MODID);
	
	//0.1.0
	//Quartz Sand
	public static final RegistryObject<Block> SILICA_SAND = BLOCKS.register("silica_sand", 
			() -> new SandBlock(14866662, 
			Block.Properties.create(Material.SAND, MaterialColor.QUARTZ).hardnessAndResistance(0.5F).sound(SoundType.SAND)));
	//Quartz Sandstone
	public static final RegistryObject<Block> SILICASTONE = BLOCKS.register("silicastone", 
			() -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> SILICASTONE_SLAB = BLOCKS.register("silicastone_slab", 
			() -> new SlabBlock(Block.Properties.from(SILICASTONE.get())));
	public static final RegistryObject<Block> SILICASTONE_STAIRS = BLOCKS.register("silicastone_stairs", 
			() -> new StairsBlock(() -> SILICASTONE.get().getDefaultState(), Block.Properties.from(SILICASTONE.get())));
	//Quartz Smooth Sandstone
	public static final RegistryObject<Block> SMOOTH_SILICASTONE = BLOCKS.register("smooth_silicastone", 
			() -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(2.0F, 6.0F)));
	public static final RegistryObject<Block> SMOOTH_SILICASTONE_SLAB = BLOCKS.register("smooth_silicastone_slab", 
			() -> new SlabBlock(Block.Properties.from(SMOOTH_SILICASTONE.get())));
	public static final RegistryObject<Block> SMOOTH_SILICASTONE_STAIRS = BLOCKS.register("smooth_silicastone_stairs", 
			() -> new StairsBlock(() -> SMOOTH_SILICASTONE.get().getDefaultState(), Block.Properties.from(SMOOTH_SILICASTONE.get())));
	//Quartz Cut Sandstone
	public static final RegistryObject<Block> CUT_SILICASTONE = BLOCKS.register("cut_silicastone", 
			() -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> CUT_SILICASTONE_SLAB = BLOCKS.register("cut_silicastone_slab", 
			() -> new SlabBlock(Block.Properties.from(CUT_SILICASTONE.get())));
	//Quartz Chiseled Sandstone Ghast
	public static final RegistryObject<Block> CHISELED_SILICASTONE = BLOCKS.register("chiseled_silicastone", 
			() -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.QUARTZ).hardnessAndResistance(0.8F)));
	
	//Soulsand Sandstone
	public static final RegistryObject<Block> SOULSANDSTONE = BLOCKS.register("soulsandstone", 
			() -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.BROWN).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> SOULSANDSTONE_SLAB = BLOCKS.register("soulsandstone_slab", 
			() -> new SlabBlock(Block.Properties.from(SOULSANDSTONE.get())));
	public static final RegistryObject<Block> SOULSANDSTONE_STAIRS = BLOCKS.register("soulsandstone_stairs", 
			() -> new StairsBlock(() -> SOULSANDSTONE.get().getDefaultState(), Block.Properties.from(SOULSANDSTONE.get())));
	//Soulsand Smooth Sandstone
	public static final RegistryObject<Block> SMOOTH_SOULSANDSTONE = BLOCKS.register("smooth_soulsandstone", 
			() -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.BROWN).hardnessAndResistance(2.0F, 6.0F)));
	public static final RegistryObject<Block> SMOOTH_SOULSANDSTONE_SLAB = BLOCKS.register("smooth_soulsandstone_slab", 
			() -> new SlabBlock(Block.Properties.from(SMOOTH_SOULSANDSTONE.get())));
	public static final RegistryObject<Block> SMOOTH_SOULSANDSTONE_STAIRS = BLOCKS.register("smooth_soulsandstone_stairs", 
			() -> new StairsBlock(() -> SMOOTH_SOULSANDSTONE.get().getDefaultState(), Block.Properties.from(SMOOTH_SOULSANDSTONE.get())));
	//Soulsand Cut Sandstone
	public static final RegistryObject<Block> CUT_SOULSANDSTONE = BLOCKS.register("cut_soulsandstone", 
			() -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.BROWN).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> CUT_SOULSANDSTONE_SLAB = BLOCKS.register("cut_soulsandstone_slab", 
			() -> new SlabBlock(Block.Properties.from(CUT_SOULSANDSTONE.get())));
	//Soulsand Chiseled Sandstone Wither Skeleton
	public static final RegistryObject<Block> CHISELED_SOULSANDSTONE = BLOCKS.register("chiseled_soulsandstone", 
			() -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.BROWN).hardnessAndResistance(0.8F)));
	//Soulsand Quartz
	public static final RegistryObject<Block> VITRIC_SOULSANDSTONE = BLOCKS.register("vitric_soulsandstone", 
			() -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.BROWN).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> VITRIC_SOULSANDSTONE_SLAB = BLOCKS.register("vitric_soulsandstone_slab", 
			() -> new SlabBlock(Block.Properties.from(VITRIC_SOULSANDSTONE.get())));
	public static final RegistryObject<Block> VITRIC_SOULSANDSTONE_STAIRS = BLOCKS.register("vitric_soulsandstone_stairs", 
			() -> new StairsBlock(() -> VITRIC_SOULSANDSTONE.get().getDefaultState(), Block.Properties.from(VITRIC_SOULSANDSTONE.get())));
	//Soulsand Smooth Quartz
	public static final RegistryObject<Block> SMOOTH_VITRIC_SOULSANDSTONE = BLOCKS.register("smooth_vitric_soulsandstone", 
			() -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.BROWN).hardnessAndResistance(2.0F, 6.0F)));
	public static final RegistryObject<Block> SMOOTH_VITRIC_SOULSANDSTONE_SLAB = BLOCKS.register("smooth_vitric_soulsandstone_slab", 
			() -> new SlabBlock(Block.Properties.from(SMOOTH_VITRIC_SOULSANDSTONE.get())));
	public static final RegistryObject<Block> SMOOTH_VITRIC_SOULSANDSTONE_STAIRS = BLOCKS.register("smooth_vitric_soulsandstone_stairs", 
			() -> new StairsBlock(() -> SMOOTH_VITRIC_SOULSANDSTONE.get().getDefaultState(), Block.Properties.from(SMOOTH_VITRIC_SOULSANDSTONE.get())));
	//Soulsand Quartz Pillar
	public static final RegistryObject<Block> VITRIC_SOULSANDSTONE_PILLAR = BLOCKS.register("vitric_soulsandstone_pillar",
			() -> new RotatedPillarBlock(Block.Properties.create(Material.ROCK, MaterialColor.BROWN).hardnessAndResistance(0.8F)));
	//Soulsand Chiseled Quartz
	public static final RegistryObject<Block> CHISELED_VITRIC_SOULSANDSTONE = BLOCKS.register("chiseled_vitric_soulsandstone", 
			() -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.BROWN).hardnessAndResistance(0.8F)));
	
	//Sandstone Quartz
	public static final RegistryObject<Block> VITRIC_SANDSTONE = BLOCKS.register("vitric_sandstone", 
			() -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> VITRIC_SANDSTONE_SLAB = BLOCKS.register("vitric_sandstone_slab", 
			() -> new SlabBlock(Block.Properties.from(VITRIC_SANDSTONE.get())));
	public static final RegistryObject<Block> VITRIC_SANDSTONE_STAIRS = BLOCKS.register("vitric_sandstone_stairs", 
			() -> new StairsBlock(() -> VITRIC_SANDSTONE.get().getDefaultState(), Block.Properties.from(VITRIC_SANDSTONE.get())));
	//Sandstone Smooth Quartz
	public static final RegistryObject<Block> SMOOTH_VITRIC_SANDSTONE = BLOCKS.register("smooth_vitric_sandstone", 
			() -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(2.0F, 6.0F)));
	public static final RegistryObject<Block> SMOOTH_VITRIC_SANDSTONE_SLAB = BLOCKS.register("smooth_vitric_sandstone_slab", 
			() -> new SlabBlock(Block.Properties.from(SMOOTH_VITRIC_SANDSTONE.get())));
	public static final RegistryObject<Block> SMOOTH_VITRIC_SANDSTONE_STAIRS = BLOCKS.register("smooth_vitric_sandstone_stairs", 
			() -> new StairsBlock(() -> SMOOTH_VITRIC_SANDSTONE.get().getDefaultState(), Block.Properties.from(SMOOTH_VITRIC_SANDSTONE.get())));
	//Sandstone Quartz Pillar
	public static final RegistryObject<Block> VITRIC_SANDSTONE_PILLAR = BLOCKS.register("vitric_sandstone_pillar",
			() -> new RotatedPillarBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(0.8F)));
	//Sandstone Chiseled Quartz
	public static final RegistryObject<Block> CHISELED_VITRIC_SANDSTONE = BLOCKS.register("chiseled_vitric_sandstone", 
			() -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(0.8F)));
	
	//Red Sandstone Quartz
	public static final RegistryObject<Block> VITRIC_RED_SANDSTONE = BLOCKS.register("vitric_red_sandstone", 
			() -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.ADOBE).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> VITRIC_RED_SANDSTONE_SLAB = BLOCKS.register("vitric_red_sandstone_slab", 
			() -> new SlabBlock(Block.Properties.from(VITRIC_RED_SANDSTONE.get())));
	public static final RegistryObject<Block> VITRIC_RED_SANDSTONE_STAIRS = BLOCKS.register("vitric_red_sandstone_stairs", 
			() -> new StairsBlock(() -> VITRIC_RED_SANDSTONE.get().getDefaultState(), Block.Properties.from(VITRIC_RED_SANDSTONE.get())));
	//Red Sandstone Smooth Quartz
	public static final RegistryObject<Block> SMOOTH_VITRIC_RED_SANDSTONE = BLOCKS.register("smooth_vitric_red_sandstone", 
			() -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.ADOBE).hardnessAndResistance(2.0F, 6.0F)));
	public static final RegistryObject<Block> SMOOTH_VITRIC_RED_SANDSTONE_SLAB = BLOCKS.register("smooth_vitric_red_sandstone_slab", 
			() -> new SlabBlock(Block.Properties.from(SMOOTH_VITRIC_RED_SANDSTONE.get())));
	public static final RegistryObject<Block> SMOOTH_VITRIC_RED_SANDSTONE_STAIRS = BLOCKS.register("smooth_vitric_red_sandstone_stairs", 
			() -> new StairsBlock(() -> SMOOTH_VITRIC_RED_SANDSTONE.get().getDefaultState(), Block.Properties.from(SMOOTH_VITRIC_RED_SANDSTONE.get())));
	//Red Sandstone Quartz Pillar
	public static final RegistryObject<Block> VITRIC_RED_SANDSTONE_PILLAR = BLOCKS.register("vitric_red_sandstone_pillar",
			() -> new RotatedPillarBlock(Block.Properties.create(Material.ROCK, MaterialColor.ADOBE).hardnessAndResistance(0.8F)));
	//Red Sandstone Chiseled Quartz
	public static final RegistryObject<Block> CHISELED_VITRIC_RED_SANDSTONE = BLOCKS.register("chiseled_vitric_red_sandstone", 
			() -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.ADOBE).hardnessAndResistance(0.8F)));
	
	//0.2.0
	//Prismarine Sand
	public static final RegistryObject<Block> PRISMARINE_SAND = BLOCKS.register("prismarine_sand", 
			() -> new SandBlock(6200996, 
			Block.Properties.create(Material.SAND, MaterialColor.CYAN).hardnessAndResistance(0.5F).sound(SoundType.SAND)));
	
	//Prismarine Quartz
	public static final RegistryObject<Block> PRISM_QUARTZ = BLOCKS.register("prism_quartz", 
			() -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(0.8F).lightValue(11)));
	public static final RegistryObject<Block> PRISM_QUARTZ_SLAB = BLOCKS.register("prism_quartz_slab", 
			() -> new SlabBlock(Block.Properties.from(PRISM_QUARTZ.get())));
	public static final RegistryObject<Block> PRISM_QUARTZ_STAIRS = BLOCKS.register("prism_quartz_stairs", 
			() -> new StairsBlock(() -> PRISM_QUARTZ.get().getDefaultState(), Block.Properties.from(PRISM_QUARTZ.get())));
	//Prismarine Smooth Quartz
	public static final RegistryObject<Block> SMOOTH_PRISM_QUARTZ = BLOCKS.register("smooth_prism_quartz", 
			() -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(2.0F, 6.0F).lightValue(11)));
	public static final RegistryObject<Block> SMOOTH_PRISM_QUARTZ_SLAB = BLOCKS.register("smooth_prism_quartz_slab", 
			() -> new SlabBlock(Block.Properties.from(SMOOTH_PRISM_QUARTZ.get())));
	public static final RegistryObject<Block> SMOOTH_PRISM_QUARTZ_STAIRS = BLOCKS.register("smooth_prism_quartz_stairs", 
			() -> new StairsBlock(() -> SMOOTH_PRISM_QUARTZ.get().getDefaultState(), Block.Properties.from(SMOOTH_PRISM_QUARTZ.get())));
	//Prismarine Quartz Pillar
	public static final RegistryObject<Block> PRISM_QUARTZ_PILLAR = BLOCKS.register("prism_quartz_pillar",
			() -> new RotatedPillarBlock(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(0.8F).lightValue(11)));
	//Prismarine Chiseled Quartz
	public static final RegistryObject<Block> CHISELED_PRISM_QUARTZ = BLOCKS.register("chiseled_prism_quartz", 
			() -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.SAND).hardnessAndResistance(0.8F).lightValue(11)));
	
	/*//Prismarine Bricks Sandstone (prismarine_sandstone)
	public static final RegistryObject<Block> PRISMARINE_SANDSTONE = BLOCKS.register("prismarine_sandstone", 
			() -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIAMOND).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> PRISMARINE_SANDSTONE_SLAB = BLOCKS.register("prismarine_sandstone_slab", 
			() -> new SlabBlock(Block.Properties.from(PRISMARINE_SANDSTONE.get())));
	public static final RegistryObject<Block> PRISMARINE_SANDSTONE_STAIRS = BLOCKS.register("prismarine_sandstone_stairs", 
			() -> new StairsBlock(() -> PRISMARINE_SANDSTONE.get().getDefaultState(), Block.Properties.from(PRISMARINE_SANDSTONE.get())));
	//Prismarine Bricks Smooth Sandstone
	public static final RegistryObject<Block> SMOOTH_PRISMARINE_SANDSTONE = BLOCKS.register("smooth_prismarine_sandstone", 
			() -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIAMOND).hardnessAndResistance(2.0F, 6.0F)));
	public static final RegistryObject<Block> SMOOTH_PRISMARINE_SANDSTONE_SLAB = BLOCKS.register("smooth_prismarine_sandstone_slab", 
			() -> new SlabBlock(Block.Properties.from(SMOOTH_PRISMARINE_SANDSTONE.get())));
	public static final RegistryObject<Block> SMOOTH_PRISMARINE_SANDSTONE_STAIRS = BLOCKS.register("smooth_prismarine_sandstone_stairs", 
			() -> new StairsBlock(() -> SMOOTH_PRISMARINE_SANDSTONE.get().getDefaultState(), Block.Properties.from(SMOOTH_PRISMARINE_SANDSTONE.get())));
	//Prismarine Bricks Cut Sandstone
	public static final RegistryObject<Block> CUT_PRISMARINE_SANDSTONE = BLOCKS.register("cut_prismarine_sandstone", 
			() -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIAMOND).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> CUT_PRISMARINE_SANDSTONE_SLAB = BLOCKS.register("cut_prismarine_sandstone_slab", 
			() -> new SlabBlock(Block.Properties.from(CUT_PRISMARINE_SANDSTONE.get())));
	//Prismarine Bricks Chiseled Sandstone Guardian
	public static final RegistryObject<Block> CHISELED_PRISMARINE_SANDSTONE = BLOCKS.register("chiseled_prismarine_sandstone", 
			() -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIAMOND).hardnessAndResistance(0.8F)));
	*/
	//Prismarine Bricks Quartz (vitric_prismarine)
	public static final RegistryObject<Block> VITRIC_PRISMARINE = BLOCKS.register("vitric_prismarine", 
			() -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIAMOND).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> VITRIC_PRISMARINE_SLAB = BLOCKS.register("vitric_prismarine_slab", 
			() -> new SlabBlock(Block.Properties.from(VITRIC_PRISMARINE.get())));
	public static final RegistryObject<Block> VITRIC_PRISMARINE_STAIRS = BLOCKS.register("vitric_prismarine_stairs", 
			() -> new StairsBlock(() -> VITRIC_PRISMARINE.get().getDefaultState(), Block.Properties.from(VITRIC_PRISMARINE.get())));
	//Prismarine Bricks Smooth Quartz
	public static final RegistryObject<Block> SMOOTH_VITRIC_PRISMARINE = BLOCKS.register("smooth_vitric_prismarine", 
			() -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIAMOND).hardnessAndResistance(2.0F, 6.0F)));
	public static final RegistryObject<Block> SMOOTH_VITRIC_PRISMARINE_SLAB = BLOCKS.register("smooth_vitric_prismarine_slab", 
			() -> new SlabBlock(Block.Properties.from(SMOOTH_VITRIC_PRISMARINE.get())));
	public static final RegistryObject<Block> SMOOTH_VITRIC_PRISMARINE_STAIRS = BLOCKS.register("smooth_vitric_prismarine_stairs", 
			() -> new StairsBlock(() -> SMOOTH_VITRIC_PRISMARINE.get().getDefaultState(), Block.Properties.from(SMOOTH_VITRIC_PRISMARINE.get())));
	//Prismarine Bricks Quartz Pillar
	public static final RegistryObject<Block> VITRIC_PRISMARINE_PILLAR = BLOCKS.register("vitric_prismarine_pillar",
			() -> new RotatedPillarBlock(Block.Properties.create(Material.ROCK, MaterialColor.DIAMOND).hardnessAndResistance(0.8F)));
	//Prismarine Bricks Chiseled Quartz
	public static final RegistryObject<Block> CHISELED_VITRIC_PRISMARINE = BLOCKS.register("chiseled_vitric_prismarine", 
			() -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIAMOND).hardnessAndResistance(0.8F)));
	
	
	/*//Dark Prismarine Sandstone (dark_prismarine_sandstone)
	public static final RegistryObject<Block> DARK_PRISMARINE_SANDSTONE = BLOCKS.register("dark_prismarine_sandstone", 
			() -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIAMOND).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> DARK_PRISMARINE_SANDSTONE_SLAB = BLOCKS.register("dark_prismarine_sandstone_slab", 
			() -> new SlabBlock(Block.Properties.from(DARK_PRISMARINE_SANDSTONE.get())));
	public static final RegistryObject<Block> DARK_PRISMARINE_SANDSTONE_STAIRS = BLOCKS.register("dark_prismarine_sandstone_stairs", 
			() -> new StairsBlock(() -> DARK_PRISMARINE_SANDSTONE.get().getDefaultState(), Block.Properties.from(DARK_PRISMARINE_SANDSTONE.get())));
	//Dark Prismarine Smooth Sandstone
	public static final RegistryObject<Block> SMOOTH_DARK_PRISMARINE_SANDSTONE = BLOCKS.register("smooth_dark_prismarine_sandstone", 
			() -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIAMOND).hardnessAndResistance(2.0F, 6.0F)));
	public static final RegistryObject<Block> SMOOTH_DARK_PRISMARINE_SANDSTONE_SLAB = BLOCKS.register("smooth_dark_prismarine_sandstone_slab", 
			() -> new SlabBlock(Block.Properties.from(SMOOTH_DARK_PRISMARINE_SANDSTONE.get())));
	public static final RegistryObject<Block> SMOOTH_DARK_PRISMARINE_SANDSTONE_STAIRS = BLOCKS.register("smooth_dark_prismarine_sandstone_stairs", 
			() -> new StairsBlock(() -> SMOOTH_DARK_PRISMARINE_SANDSTONE.get().getDefaultState(), Block.Properties.from(SMOOTH_DARK_PRISMARINE_SANDSTONE.get())));
	//Dark Prismarine Cut Sandstone
	public static final RegistryObject<Block> CUT_DARK_PRISMARINE_SANDSTONE = BLOCKS.register("cut_dark_prismarine_sandstone", 
			() -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIAMOND).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> CUT_DARK_PRISMARINE_SANDSTONE_SLAB = BLOCKS.register("cut_dark_prismarine_sandstone_slab", 
			() -> new SlabBlock(Block.Properties.from(CUT_DARK_PRISMARINE_SANDSTONE.get())));
	//Dark Prismarine Chiseled Sandstone Shulker
	public static final RegistryObject<Block> CHISELED_DARK_PRISMARINE_SANDSTONE = BLOCKS.register("chiseled_dark_prismarine_sandstone", 
			() -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIAMOND).hardnessAndResistance(0.8F)));
	*/
	//Dark Prismarine Quartz (vitric_dark_prismarine)
	public static final RegistryObject<Block> VITRIC_DARK_PRISMARINE = BLOCKS.register("vitric_dark_prismarine", 
			() -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIAMOND).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> VITRIC_DARK_PRISMARINE_SLAB = BLOCKS.register("vitric_dark_prismarine_slab", 
			() -> new SlabBlock(Block.Properties.from(VITRIC_DARK_PRISMARINE.get())));
	public static final RegistryObject<Block> VITRIC_DARK_PRISMARINE_STAIRS = BLOCKS.register("vitric_dark_prismarine_stairs", 
			() -> new StairsBlock(() -> VITRIC_DARK_PRISMARINE.get().getDefaultState(), Block.Properties.from(VITRIC_DARK_PRISMARINE.get())));
	//Dark Prismarine Smooth Quartz
	public static final RegistryObject<Block> SMOOTH_VITRIC_DARK_PRISMARINE = BLOCKS.register("smooth_vitric_dark_prismarine", 
			() -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIAMOND).hardnessAndResistance(2.0F, 6.0F)));
	public static final RegistryObject<Block> SMOOTH_VITRIC_DARK_PRISMARINE_SLAB = BLOCKS.register("smooth_vitric_dark_prismarine_slab", 
			() -> new SlabBlock(Block.Properties.from(SMOOTH_VITRIC_DARK_PRISMARINE.get())));
	public static final RegistryObject<Block> SMOOTH_VITRIC_DARK_PRISMARINE_STAIRS = BLOCKS.register("smooth_vitric_dark_prismarine_stairs", 
			() -> new StairsBlock(() -> SMOOTH_VITRIC_DARK_PRISMARINE.get().getDefaultState(), Block.Properties.from(SMOOTH_VITRIC_DARK_PRISMARINE.get())));
	//Dark Prismarine Quartz Pillar
	public static final RegistryObject<Block> VITRIC_DARK_PRISMARINE_PILLAR = BLOCKS.register("vitric_dark_prismarine_pillar",
			() -> new RotatedPillarBlock(Block.Properties.create(Material.ROCK, MaterialColor.DIAMOND).hardnessAndResistance(0.8F)));
	//Dark Prismarine Chiseled Quartz
	public static final RegistryObject<Block> CHISELED_VITRIC_DARK_PRISMARINE = BLOCKS.register("chiseled_vitric_dark_prismarine", 
			() -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIAMOND).hardnessAndResistance(0.8F)));
	
	//Prismarine Bricks Dark Prismarine (dark_prismarine_bricks)
	public static final RegistryObject<Block> DARK_PRISMARINE_BRICKS = BLOCKS.register("dark_prismarine_bricks", 
			() -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIAMOND).hardnessAndResistance(1.5F, 6.0F)));
	public static final RegistryObject<Block> DARK_PRISMARINE_BRICK_SLAB = BLOCKS.register("dark_prismarine_brick_slab", 
			() -> new SlabBlock(Block.Properties.from(DARK_PRISMARINE_BRICKS.get())));
	public static final RegistryObject<Block> DARK_PRISMARINE_BRICK_STAIRS = BLOCKS.register("dark_prismarine_brick_stairs", 
			() -> new StairsBlock(() -> DARK_PRISMARINE_BRICKS.get().getDefaultState(), Block.Properties.from(DARK_PRISMARINE_BRICKS.get())));
	//Dark Prismarine Prismarine Bricks (prismarine_tiling)
	public static final RegistryObject<Block> PRISMARINE_TILING = BLOCKS.register("prismarine_tiling", 
			() -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIAMOND).hardnessAndResistance(1.5F, 6.0F)));
	public static final RegistryObject<Block> PRISMARINE_TILING_SLAB = BLOCKS.register("prismarine_tiling_slab", 
			() -> new SlabBlock(Block.Properties.from(PRISMARINE_TILING.get())));
	public static final RegistryObject<Block> PRISMARINE_TILING_STAIRS = BLOCKS.register("prismarine_tiling_stairs", 
			() -> new StairsBlock(() -> PRISMARINE_TILING.get().getDefaultState(), Block.Properties.from(PRISMARINE_TILING.get())));
	
	//Quartz Prismarine Bricks (quartz_angular_bricks)
	//Quartz Dark Prismarine (quartz_tiling)
	
	//Sandstone Prismarine Bricks
	//Sandstone Dark Prismarine
	
	//Red Sandstone Prismarine Bricks
	//Red Sandstone Dark Prismarine
	
	//Soulsand Prismarine Bricks
	//Soulsand Dark Prismarine
}