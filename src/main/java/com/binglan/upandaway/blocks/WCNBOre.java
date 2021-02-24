package com.binglan.upandaway.blocks;

import java.util.Random;

import com.binglan.upandaway.UpAndAway;
import com.binglan.upandaway.init.TheLastModItem;
import com.binglan.upandaway.util.UpAndAwayInfo;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class WCNBOre extends Block{
	
public WCNBOre() {
		
		super(Material.ROCK);
		setRegistryName(UpAndAwayInfo.MOD_ID, "wocaonb_ore");
		setUnlocalizedName("wocaonb_ore");
		setCreativeTab(UpAndAway.UPANDAWAY_TAB);
		setResistance(7.0f);
		setSoundType(SoundType.STONE);
		setHardness(5.0f);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(10);
		
		
		}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		
		return TheLastModItem.WOCAONB;
	}
	
	@Override
	public int quantityDropped(Random rand) {
		
		int min = 1;
		int max = 2;
		return rand.nextInt(max)+min;
	}


}
