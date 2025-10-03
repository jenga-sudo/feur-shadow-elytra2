package com.example.feurshadowelytra;

import net.minecraft.world.item.ElytraItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class ShadowElytraItem extends ElytraItem {
  private final ResourceLocation texture;

  public ShadowElytraItem(Item.Properties props, ResourceLocation texture) {
    super(props);
    this.texture = texture;
  }

  public ResourceLocation getTexture() {
    return texture;
  }
}