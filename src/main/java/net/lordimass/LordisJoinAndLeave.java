package net.lordimass;

import com.hypixel.hytale.server.core.event.events.player.PlayerConnectEvent;
import com.hypixel.hytale.server.core.event.events.player.PlayerDisconnectEvent;
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import javax.annotation.Nonnull;
import net.lordimass.events.JoinAndLeaveEvents;

/** Main class for a Hytale Java plugin. */
@SuppressWarnings("unused")
public class LordisJoinAndLeave extends JavaPlugin {

  /**
   * Create a new instance of this plugin.
   *
   * @param init Data to pass to the JavaPlugin initialiser.
   */
  public LordisJoinAndLeave(@Nonnull JavaPluginInit init) {
    super(init);
  }

  /** Set up the plugin. */
  @Override
  protected void setup() {
    // Register connect and disconnect events to functions to send join and leave messages.
    this.getEventRegistry().registerGlobal(PlayerConnectEvent.class, JoinAndLeaveEvents::onPlayerConnect);
    this.getEventRegistry().registerGlobal(PlayerDisconnectEvent.class, JoinAndLeaveEvents::onPlayerDisconnect);
  }
}
