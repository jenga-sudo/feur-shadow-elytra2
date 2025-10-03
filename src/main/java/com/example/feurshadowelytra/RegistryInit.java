package com.example.feurshadowelytra;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
public class RegistryInit {
  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FeurShadowElytra.MODID);
  private static Item.Properties wingProps() { return new Item.Properties().stacksTo(1).durability(432); }
  public static final RegistryObject<Item> ANGEL_WINGS = ITEMS.register("angel_wings", () -> new ShadowElytraItem(wingProps(), new ResourceLocation("feur_elytra_wings:textures/entities/wing14.png")));
  public static final RegistryObject<Item> BLACK_DRAGON_WINGS = ITEMS.register("black_dragon_wings", () -> new ShadowElytraItem(wingProps(), new ResourceLocation("feur_elytra_wings:textures/entities/wing1bd.png")));
  public static final RegistryObject<Item> FAIRY_WINGS = ITEMS.register("fairy_wings", () -> new ShadowElytraItem(wingProps(), new ResourceLocation("feur_elytra_wings:textures/entities/wing12.png")));
  public static final RegistryObject<Item> FIRE_WINGS = ITEMS.register("fire_wings", () -> new ShadowElytraItem(wingProps(), new ResourceLocation("feur_elytra_wings:textures/entities/wing11.png")));
  public static final RegistryObject<Item> FLOWERING_WINGS = ITEMS.register("flowering_wings", () -> new ShadowElytraItem(wingProps(), new ResourceLocation("feur_elytra_wings:textures/entities/wing6.png")));
  public static final RegistryObject<Item> LEAF_WINGS = ITEMS.register("leaf_wings", () -> new ShadowElytraItem(wingProps(), new ResourceLocation("feur_elytra_wings:textures/entities/wing7.png")));
  public static final RegistryObject<Item> LIGHT_WINGS = ITEMS.register("light_wings", () -> new ShadowElytraItem(wingProps(), new ResourceLocation("feur_elytra_wings:textures/entities/wing13.png")));
  public static final RegistryObject<Item> OWL_WINGS = ITEMS.register("owl_wings", () -> new ShadowElytraItem(wingProps(), new ResourceLocation("feur_elytra_wings:textures/entities/wing9.png")));
  public static final RegistryObject<Item> PARROT_WINGS = ITEMS.register("parrot_wings", () -> new ShadowElytraItem(wingProps(), new ResourceLocation("feur_elytra_wings:textures/entities/wing8.png")));
  public static final RegistryObject<Item> PHOENIX_WINGS = ITEMS.register("phoenix_wings", () -> new ShadowElytraItem(wingProps(), new ResourceLocation("feur_elytra_wings:textures/entities/wing16.png")));
  public static final RegistryObject<Item> PRINCESS_WINGS = ITEMS.register("princess_wings", () -> new ShadowElytraItem(wingProps(), new ResourceLocation("feur_elytra_wings:textures/entities/wing122.png")));
  public static final RegistryObject<Item> RAINBOW_WINGS = ITEMS.register("rainbow_wings", () -> new ShadowElytraItem(wingProps(), new ResourceLocation("feur_elytra_wings:textures/entities/wing999.png")));
  public static final RegistryObject<Item> RIVER_WINGS = ITEMS.register("river_wings", () -> new ShadowElytraItem(wingProps(), new ResourceLocation("feur_elytra_wings:textures/entities/wing5.png")));
  public static final RegistryObject<Item> STEAM_WINGS = ITEMS.register("steam_wings", () -> new ShadowElytraItem(wingProps(), new ResourceLocation("feur_elytra_wings:textures/entities/wing4.png")));
  public static final RegistryObject<Item> WESTERN_WINGS = ITEMS.register("western_wings", () -> new ShadowElytraItem(wingProps(), new ResourceLocation("feur_elytra_wings:textures/entities/wing3.png")));
  public static final RegistryObject<Item> WHITE_DRAGON_WINGS = ITEMS.register("white_dragon_wings", () -> new ShadowElytraItem(wingProps(), new ResourceLocation("feur_elytra_wings:textures/entities/wing10.png")));
}