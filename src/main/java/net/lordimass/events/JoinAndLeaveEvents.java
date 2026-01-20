package net.lordimass.events;

import com.hypixel.hytale.server.core.Message;
import com.hypixel.hytale.server.core.entity.entities.Player;
import com.hypixel.hytale.server.core.event.events.player.PlayerConnectEvent;
import com.hypixel.hytale.server.core.event.events.player.PlayerDisconnectEvent;
import com.hypixel.hytale.server.core.event.events.player.PlayerReadyEvent;
import com.hypixel.hytale.server.core.universe.PlayerRef;

import java.awt.*;

/**
 * Events triggered by players joining and leaving the game <hr>
 *
 * <h2>Example</h2>
 *
 * <p>Registering the <code>onPlayerReady</code> to the built-in <code>PlayerReadyEvent</code>.
 *
 * <pre>{@code
 * JavaPlugin.getEventRegistry().registerGlobal(
 *   PlayerReadyEvent.class,
 *   ExampleEvent::onPlayerReady
 * );
 * }</pre>
 */
public class JoinAndLeaveEvents {

  /**
   * Sends a message in chat notifying that the player who triggered the event has joined the game
   *
   * @param event A <code>PlayerReadyEvent</code> event.
   */
  public static void onPlayerConnect(PlayerConnectEvent event) {
    PlayerRef player = event.getPlayerRef();
    player.sendMessage(
        Message.raw(player.getUsername() + " has joined the game.").color(Color.YELLOW).italic(true));
  }

  /**
   * Sends a message in chat notifying that the player who triggered the event has left the game.
   *
   * @param event A <code>PlayerReadyEvent</code> event.
   */
  public static void onPlayerDisconnect(PlayerDisconnectEvent event) {
    PlayerRef player = event.getPlayerRef();
    player.sendMessage(Message.raw(player.getUsername() + " has left the game.").color(Color.YELLOW).italic(true));
  }
}
