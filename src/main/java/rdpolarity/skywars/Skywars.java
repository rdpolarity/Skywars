package rdpolarity.skywars;

import co.aikar.commands.BukkitCommandManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.annotation.plugin.Description;
import org.bukkit.plugin.java.annotation.plugin.Plugin;
import org.bukkit.plugin.java.annotation.plugin.author.Author;

@Plugin(name="Skywars", version = "1.0")
@Description("A Simple Skywars Plugin")
@Author("RDPolarity")
public final class Skywars extends JavaPlugin {
    @Override
    public void onEnable() {
        BukkitCommandManager manager = new BukkitCommandManager(this);
        manager.registerCommand(new InfoCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
