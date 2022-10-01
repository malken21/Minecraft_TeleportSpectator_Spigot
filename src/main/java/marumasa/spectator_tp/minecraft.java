package marumasa.spectator_tp;

import com.earth2me.essentials.Essentials;
import marumasa.spectator_tp.Essentials.stp_E;
import marumasa.spectator_tp.tp.stp;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class minecraft extends JavaPlugin {

    @Override
    public void onEnable() {
        Config config = new Config(this);

        final PluginManager pluginManager = getServer().getPluginManager();
        if (pluginManager.isPluginEnabled("Essentials")) {
            Essentials essentials = (Essentials) pluginManager.getPlugin("Essentials");

            getCommand("stp").setExecutor(new stp_E(config, essentials, this));
        } else {
            getCommand("stp").setExecutor(new stp(config, this));
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
