package marumasa.spectator_tp.tp;

import marumasa.spectator_tp.Config;
import marumasa.spectator_tp.minecraft;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public class stp implements CommandExecutor {
    private final Config con;
    private final minecraft mc;

    public stp(final Config config, minecraft minecraft) {
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
        return start.tp(senderPlayer, targetPlayer, con.cooldown, mc);
    }
}
