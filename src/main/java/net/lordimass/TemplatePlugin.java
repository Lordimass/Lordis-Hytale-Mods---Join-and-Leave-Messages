package net.lordimass;

import com.hypixel.hytale.server.core.event.events.player.PlayerReadyEvent;
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import javax.annotation.Nonnull;
import net.lordimass.commands.ExampleCommand;
import net.lordimass.events.ExampleEvent;

/** Main class for a Hytale Java plugin. */
@SuppressWarnings("unused")
public class TemplatePlugin extends JavaPlugin {

  /**
   * Create a new instance of this plugin.
   *
   * @param init Data to pass to the JavaPlugin initialiser.
   */
  public TemplatePlugin(@Nonnull JavaPluginInit init) {
    super(init);
  }

  /** Set up the plugin. */
  @Override
  protected void setup() {
    this.getCommandRegistry().registerCommand(new ExampleCommand("example", "An example command"));
    this.getEventRegistry().registerGlobal(PlayerReadyEvent.class, ExampleEvent::onPlayerReady);
  }
}
