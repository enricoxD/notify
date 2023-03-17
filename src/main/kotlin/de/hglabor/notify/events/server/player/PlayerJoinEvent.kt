package de.hglabor.notify.events.server.player

import de.hglabor.notify.mixins.server.MixinPlayerManager
import me.obsilabor.alert.Event
import net.minecraft.server.network.ServerPlayerEntity

/**
 * Called **after** a player joins.
 * @see MixinPlayerManager.onPlayerConnect
 */
class PlayerJoinEvent(val player: ServerPlayerEntity) : Event()