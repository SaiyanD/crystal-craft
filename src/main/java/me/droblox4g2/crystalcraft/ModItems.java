package me.droblox4g2.crystalcraft;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

public class ModItems {

    public static final ResourceKey<Item> DOOM_CRYSTAL_ID =
            ResourceKey.create(
                    Registries.ITEM,
                    Identifier.fromNamespaceAndPath("crystal-craft", "doom_crystal")
            );

    public static final Item DOOM_CRYSTAL = Registry.register(
            BuiltInRegistries.ITEM,
            DOOM_CRYSTAL_ID,
            new Item(new Item.Properties().setId(DOOM_CRYSTAL_ID))
    );

    public static void initialize() {
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS)
                .register(creativeTab -> creativeTab.accept(DOOM_CRYSTAL));
    }
}