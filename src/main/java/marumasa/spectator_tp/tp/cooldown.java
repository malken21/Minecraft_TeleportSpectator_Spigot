package marumasa.spectator_tp.tp;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class cooldown extends BukkitRunnable {

    private final GameMode GameMode;
    private final Player Player;

    public cooldown(Player sender, final GameMode mode) {
        GameMode = mode;
        Player = sender;
    }

    @Override
    public void run() {
        Player.setGameMode(GameMode);
        this.cancel();
    }
}
