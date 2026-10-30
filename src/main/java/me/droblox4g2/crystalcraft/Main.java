package me.droblox4g2.crystalcraft;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;

public class Main implements ModInitializer {
	@Override
	public void onInitialize() {
		ModItems.initialize();
		ModBlocks.initialize();

		LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
			if (key.identifier().toString().equals("minecraft:chests/bastion_treasure")) {
				tableBuilder.withPool(
						net.minecraft.world.level.storage.loot.LootPool.lootPool()
								.add(
										net.minecraft.world.level.storage.loot.entries.LootItem.lootTableItem(ModItems.DOOM_CRYSTAL)
												.when(
														net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition.randomChance(0.10F)
												)
								)
								.setRolls(
										net.minecraft.world.level.storage.loot.providers.number.ConstantValue.exactly(1.0F)
								)
				);
			}
		});
	}
}