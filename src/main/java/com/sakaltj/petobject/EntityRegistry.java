package com.sakalti.petobject;

import com.sakalti.petobject.entity.LumeiEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EntityRegistry {
    public static final EntityType<LumeiEntity> LUMEI = Registry.register(
        Registry.ENTITY_TYPE,
        new Identifier("petobject", "lumei"),
        FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, LumeiEntity::new)
            .dimensions(EntityDimensions.fixed(0.6f, 1.4f))
            .build()
    );

    public static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(LUMEI, LumeiEntity.createAttributes());
    }
}
