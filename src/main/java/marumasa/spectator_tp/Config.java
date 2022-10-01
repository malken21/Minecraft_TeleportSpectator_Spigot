package marumasa.spectator_tp;

import org.bukkit.configuration.file.FileConfiguration;

public class Config {
    public final int cooldown;
    public final String def;
    public final String TeleportBlock;

    public final String result;
    public final String result_cooldown;

    public Config(minecraft plugin) {
        plugin.saveDefaultConfig();
        FileConfiguration config = plugin.getConfig();

        cooldown = config.getInt("cooldown");
        def = config.getString("error.default");
        TeleportBlock = config.getString("error.teleportBlock");

        result = config.getString("result.teleport");
        result_cooldown = config.getString("result.cooldown");
    }
}
