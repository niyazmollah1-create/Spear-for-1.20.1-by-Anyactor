package com.anyactor.spear;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SpearMod implements ModInitializer {
    public static final String MOD_ID = "spear";
    public static final Item SPEAR = new SpearItem(new FabricItemSettings().maxCount(1).maxDamage(250));

    @Override
    public void onInitialize() {
        // Register the spear item
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spear"), SPEAR);

        // Register use event for custom mechanics (e.g., throw animation, particles)
        UseItemCallback.EVENT.register(new SpearUseCallback());
    }
}