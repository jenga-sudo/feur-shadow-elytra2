package com.example.feurshadowelytra;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(FeurShadowElytra.MODID)
public class FeurShadowElytra {
    public static final String MODID = "feur_shadow_elytra";

    public FeurShadowElytra() {
        RegistryInit.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}