package com.binglan.upandaway.blocks;

import com.binglan.upandaway.UpAndAway;
import com.binglan.upandaway.util.UpAndAwayInfo;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class YSStone extends Block{
	
	public YSStone() {
		
		super(Material.ROCK);
		setRegistryName(UpAndAwayInfo.MOD_ID, "upandaway_block");
		setUnlocalizedName("upandaway_block");
		setCreativeTab(UpAndAway.UPANDAWAY_TAB);
		setResistance(10.0f);
		
	}

	
}
