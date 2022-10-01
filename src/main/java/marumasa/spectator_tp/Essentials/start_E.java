package marumasa.spectator_tp.Essentials;

import marumasa.spectator_tp.minecraft;
import marumasa.spectator_tp.tp.cooldown;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;

public class start_E {
    public static boolean tp(Player sender, Player target, int cooldown, minecraft mc) {
        final GameMode mode = sender.getGameMode();
        sender.setGameMode(GameMode.SPECTATOR);
        new cooldown(sender, mode).runTaskTimer(mc, cooldown, cooldown);
        sender.teleport(target.getLocation());
        sender.setGameMode(GameMode.SPECTATOR);
        return true;
    }
}