package marumasa.spectator_tp;

import org.bukkit.configuration.file.FileConfiguration;

public class Config {
    public final int cooldown;

    public Config(minecraft plugin) {
        plugin.saveDefaultConfig();
        FileConfiguration config = plugin.getConfig();

        cooldown = config.getInt("cooldown");
    }
}
