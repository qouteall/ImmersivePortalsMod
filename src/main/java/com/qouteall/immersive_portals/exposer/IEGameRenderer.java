package com.qouteall.immersive_portals.exposer;

import net.minecraft.client.render.BackgroundRenderer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.LightmapTextureManager;

public interface IEGameRenderer {
    void applyCameraTransformations_(float float_1);
    
    LightmapTextureManager getLightmapTextureManager();
    
    void setLightmapTextureManager(LightmapTextureManager manager);
    
    BackgroundRenderer getBackgroundRenderer();
    
    void setBackgroundRenderer(BackgroundRenderer backgroundRenderer);
    
    Camera getCamera();
}
