package com.sakalti.petobject.item;

import com.sakalti.petobject.entity.EntityRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class LumeiItems {
    public static final Item LUMEI_SPAWN_EGG = new SpawnEggItem(
        EntityRegistry.LUMEI,
        0x222222,  // 黒に近い本体色
        0xffcc00,  // 明るい黄ランタンの色
        new Itepackage com.sakalti.petobject;

import com.sakalti.petobject.entity.EntityRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSpawnEggs {
    public static final Item LUMEI_SPAWN_EGG = new SpawnEggItem(
        EntityRegistry.LUMEI,
        0x222222,  // ベースカラー
        0xffcc00,  // スポットカラー
        new Item.Settings().group(ItemGroup.MISC)
    );

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("petobject", "lumei_spawn_egg"), LUMEI_SPAWN_EGG);
    }
}
