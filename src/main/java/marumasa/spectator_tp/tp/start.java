package marumasa.spectator_tp.tp;

import marumasa.spectator_tp.minecraft;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;

public class start {
    public static boolean tp(Player sender, Player target, int cooldown, minecraft mc) {
        final GameMode mode = sender.getGameMode();
        sender.setGameMode(GameMode.SPECTATOR);

        new cooldown(sender, mode).runTaskTimer(mc, cooldown, cooldown);

        sender.teleport(target.getLocation());
        return true;
    }
}
