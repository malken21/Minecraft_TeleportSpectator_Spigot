package marumasa.spectator_tp.Essentials;

import marumasa.spectator_tp.Config;
import marumasa.spectator_tp.minecraft;
import marumasa.spectator_tp.tp.cooldown;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;

public class start_E {
    public static boolean tp(Player sender, Player target, Config config, minecraft mc) {
        final GameMode mode = sender.getGameMode();
        sender.setGameMode(GameMode.SPECTATOR);
        new cooldown(sender, config.result_cooldown, mode).runTaskTimer(mc, config.cooldown, config.cooldown);
        sender.teleport(target.getLocation());
        sender.setGameMode(GameMode.SPECTATOR);
        sender.sendMessage(String.format(config.result, target.getDisplayName()));
        return true;
    }
}