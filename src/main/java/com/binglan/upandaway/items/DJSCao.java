package com.binglan.upandaway.items;

import java.util.List;

import javax.annotation.Nullable;

import com.binglan.upandaway.UpAndAway;
import com.binglan.upandaway.util.UpAndAwayInfo;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class DJSCao extends ItemSword{

	public DJSCao(Item.ToolMaterial material) {
		
		super(material);
		setRegistryName(UpAndAwayInfo.MOD_ID, "dongjuns_cao");
		setUnlocalizedName("dongjuns_cao");
		setCreativeTab(UpAndAway.UPANDAWAY_TAB);
		
		
	}
		
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
			
			if(stack.getItem() instanceof DJSCao);
				tooltip.add("All right!");
	}
}


