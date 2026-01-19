package net.lordimass.commands;

import com.hypixel.hytale.server.core.Message;
import com.hypixel.hytale.server.core.command.system.AbstractCommand;
import com.hypixel.hytale.server.core.command.system.CommandContext;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/** An example command class. Adds a new command to the game which sends a basic message to chat. */
public class ExampleCommand extends AbstractCommand {

  /**
   * Initialise the command in game.
   *
   * @param name The name of the command, used to execute the command.
   * @param description A description to tie to the command. Shown to users in game.
   */
  public ExampleCommand(String name, String description) {
    super(name, description);
  }

  /**
   * Execute the command.
   *
   * @param context Context provided by the executor of the command.
   * @return A completable future with void return type.
   */
  @Nullable
  @Override
  protected CompletableFuture<Void> execute(@Nonnull CommandContext context) {
    context.sendMessage(Message.raw("Hello from ExampleCommand!"));
    return CompletableFuture.completedFuture(null);
  }
}
