package net.lordimass.events;

import com.hypixel.hytale.server.core.Message;
import com.hypixel.hytale.server.core.entity.entities.Player;
import com.hypixel.hytale.server.core.event.events.player.PlayerReadyEvent;

/**
 * An example game event, the methods of which can be triggered by registered event listeners. <hr>
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
public class ExampleEvent {

  /**
   * Sends a message in chat welcoming the player who triggered the event.
   *
   * @param event A <code>PlayerReadyEvent</code> event.
   */
  public static void onPlayerReady(PlayerReadyEvent event) {
    Player player = event.getPlayer();
    player.sendMessage(Message.raw("Welcome " + player.getDisplayName()));
  }
}
