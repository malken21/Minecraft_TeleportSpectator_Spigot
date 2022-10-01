package marumasa.spectator_tp.tp;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class cooldown extends BukkitRunnable {

    private final GameMode GameMode;
    private final Player Player;
    private final String text;

    public cooldown(final Player sender, final String result, final GameMode mode) {
        GameMode = mode;
        Player = sender;
        text = result;
    }

    @Override
    public void run() {
        Player.setGameMode(GameMode);
        Player.sendMessage(text);
        this.cancel();
    }
}
