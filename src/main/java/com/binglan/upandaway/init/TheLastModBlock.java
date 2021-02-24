package com.binglan.upandaway.init;

import com.binglan.upandaway.blocks.WCNBBlock;
import com.binglan.upandaway.blocks.WCNBOre;
import com.binglan.upandaway.blocks.YSStone;
import com.binglan.upandaway.util.UpAndAwayInfo;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = UpAndAwayInfo.MOD_ID)
public class TheLastModBlock {
	
	public static final Block UPANDAWAY_BLOCK = new YSStone();
	public static final Block WOCAONB_ORE = new WCNBOre();
	public static final Block WOCAONB_BLOCK = new WCNBBlock();
	
	
	
	
	
	@SubscribeEvent
	public static void registerBlockEvent(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(
				UPANDAWAY_BLOCK,
				WOCAONB_ORE,
				WOCAONB_BLOCK
				);
		
	}
	
	@SubscribeEvent
	public static void registerItemEvent(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
				new ItemBlock(UPANDAWAY_BLOCK).setRegistryName("upandaway_block"),
				new ItemBlock(WOCAONB_ORE).setRegistryName("wocaonb_ore"),
				new ItemBlock(WOCAONB_BLOCK).setRegistryName("wocaonb_block")
				
				);
	}
	
	
	@SubscribeEvent
	public static void onModelReg(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(UPANDAWAY_BLOCK), 0, new ModelResourceLocation(UPANDAWAY_BLOCK.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(WOCAONB_ORE), 0, new ModelResourceLocation(WOCAONB_ORE.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(WOCAONB_BLOCK), 0, new ModelResourceLocation(WOCAONB_BLOCK.getRegistryName(), "inventory"));
	}


	
	

}
