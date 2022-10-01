package marumasa.spectator_tp.Essentials;

import marumasa.spectator_tp.Config;
import marumasa.spectator_tp.minecraft;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public class stp_E implements CommandExecutor {
    private final Config con;
    private final minecraft mc;

    public stp_E(final Config config, minecraft minecraft) {
        con = config;
        mc = minecraft;
    }

    @Override
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {
        if (args.length == 0) return false;
        List<Player> players = Bukkit.matchPlayer(args[0]);
        if (players.size() == 0) return false;
        Player targetPlayer = players.get(0);
        final Player senderPlayer = (Player) sender;
        return start_E.tp(senderPlayer, targetPlayer, con.cooldown, mc);
    }
}
