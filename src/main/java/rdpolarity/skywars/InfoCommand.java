package rdpolarity.skywars;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Default;
import co.aikar.commands.annotation.Subcommand;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.annotation.command.Command;

@CommandAlias("skywars|sw")
@Command(
        name = "InfoCommand",
        desc = "provides info about plugin",
        aliases = { "skywars", "sw" },
        usage = "/<command>"
)
public class InfoCommand extends BaseCommand {
    @Default
    public static void onExecute(Player player) {
        player.sendMessage("This is info!");
    }

    @Subcommand("new")
    public static void onNew(Player player) {
        player.sendMessage("Creating new skywars game!");
    }
}
