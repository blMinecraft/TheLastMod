package com.binglan.upandaway.items;

import java.util.List;

import javax.annotation.Nullable;

import com.binglan.upandaway.UpAndAway;
import com.binglan.upandaway.util.UpAndAwayInfo;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class NBSword extends ItemAxe{
	
	public NBSword(Item.ToolMaterial material) {
		
		super(material, 999999999, 9999);
		setRegistryName(UpAndAwayInfo.MOD_ID, "wocao_nb");
		setUnlocalizedName("wocao_nb");
		setCreativeTab(UpAndAway.UPANDAWAY_TAB);
	}
	
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		
		if(stack.getItem() instanceof NBSword);
			tooltip.add("WoCao! It's very NB!");
}

}
