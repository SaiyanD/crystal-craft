package me.droblox4g2.crystalcraft;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ModBlocks {

    public static final ResourceKey<Block> DOOM_GENERATOR_ID =
            ResourceKey.create(
                    Registries.BLOCK,
                    Identifier.fromNamespaceAndPath("crystal-craft", "doom_generator")
            );

    public static final Block DOOM_GENERATOR = Registry.register(
            BuiltInRegistries.BLOCK,
            DOOM_GENERATOR_ID,
            new Block(BlockBehaviour.Properties.of().setId(DOOM_GENERATOR_ID))
    );

    public static final ResourceKey<Item> DOOM_GENERATOR_ITEM_ID =
            ResourceKey.create(
                    Registries.ITEM,
                    Identifier.fromNamespaceAndPath("crystal-craft", "doom_generator")
            );

    public static final BlockItem DOOM_GENERATOR_ITEM = Registry.register(
            BuiltInRegistries.ITEM,
            DOOM_GENERATOR_ITEM_ID,
            new BlockItem(
                    DOOM_GENERATOR,
                    new Item.Properties()
                            .useBlockDescriptionPrefix()
                            .setId(DOOM_GENERATOR_ITEM_ID)
            )
    );

    public static void initialize() {
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS)
                .register(creativeTab -> creativeTab.accept(DOOM_GENERATOR.asItem()));
    }
}