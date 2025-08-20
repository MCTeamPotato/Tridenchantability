package me.kall.tridenchantability.mixin;

import me.kall.tridenchantability.config.TridentConfig;
import net.minecraft.server.commands.ReloadCommand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ReloadCommand.class)
public abstract class ReloadCommandMixin {
    @Inject(method = "reloadPacks", at = @At("TAIL"))
    private static void reloadConfig(CallbackInfo ci) {
        TridentConfig.init();
    }
}
