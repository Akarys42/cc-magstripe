package me.akarys.ccmagstripe;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CCMagstripeMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("ccmagstripe");

	public static final Block CARD_READER = new CardReaderBlock();

	@Override
	public void onInitialize() {
		Registry.register(Registry.BLOCK, new Identifier("ccmagstripe", "card_reader"), CARD_READER);
		Registry.register(Registry.ITEM, new Identifier("ccmagstripe", "card_reader"), new BlockItem(CARD_READER, new Item.Settings().group(ItemGroup.MISC)));
	}
}
