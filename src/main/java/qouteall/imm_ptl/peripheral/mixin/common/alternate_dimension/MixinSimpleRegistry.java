package qouteall.imm_ptl.peripheral.mixin.common.alternate_dimension;

import qouteall.imm_ptl.core.ducks.IESimpleRegistry;
import net.minecraft.util.registry.SimpleRegistry;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(SimpleRegistry.class)
public class MixinSimpleRegistry implements IESimpleRegistry {
    
}
