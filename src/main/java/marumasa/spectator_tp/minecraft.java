package marumasa.spectator_tp;

import marumasa.spectator_tp.Essentials.stp_E;
import marumasa.spectator_tp.tp.stp;
import org.bukkit.plugin.java.JavaPlugin;

public final class minecraft extends JavaPlugin {

    @Override
    public void onEnable() {
        Config config = new Config(this);

        if (getServer().getPluginManager().isPluginEnabled("Essentials")) {
            getCommand("stp").setExecutor(new stp_E(config, this));
        } else {
            getCommand("stp").setExecutor(new stp(config, this));
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
