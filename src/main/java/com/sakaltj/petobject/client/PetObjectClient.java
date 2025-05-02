package com.sakalti.petobject.client;

import com.sakalti.petobject.client.model.LumeiModel;
import com.sakalti.petobject.client.renderer.LumeiRenderer;
import com.sakalti.petobject.EntityRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.EntityRendererRegistry;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.model.ModelLoader;

public class PetObjectClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(EntityRegistry.LUMEI, LumeiRenderer::new);
        EntityModelLayer lumeiLayer = LumeiModel.LAYER_LOCATION;
        EntityModelLayers.register(lumeiLayer, LumeiModel::getTexturedModelData);
    }
}
