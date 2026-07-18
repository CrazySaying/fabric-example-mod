package com.example.mixin;

import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class)
public class ExampleMixin {
	private static final Logger LOGGER = LoggerFactory.getLogger("example-mixin");

	@Inject(at = @At("HEAD"), method = "tickServer")
	private void onTickServer(CallbackInfo info) {
		LOGGER.info("Mixin injected into MinecraftServer.tickServer()!");
	}
}