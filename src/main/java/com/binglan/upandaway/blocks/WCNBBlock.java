package com.binglan.upandaway.blocks;

import com.binglan.upandaway.UpAndAway;
import com.binglan.upandaway.util.UpAndAwayInfo;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class WCNBBlock extends Block{
	
public WCNBBlock() {
		
		super(Material.ROCK);
		setRegistryName(UpAndAwayInfo.MOD_ID, "wocaonb_block");
		setUnlocalizedName("wocaonb_block");
		setCreativeTab(UpAndAway.UPANDAWAY_TAB);
		setResistance(10.0f);
		setSoundType(SoundType.STONE);
		setHardness(4.0f);
		setHarvestLevel("pickaxe", 1);
		setLightLevel(15);
		
		
		}

}
