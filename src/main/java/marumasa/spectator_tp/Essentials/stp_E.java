package marumasa.spectator_tp.Essentials;

import com.earth2me.essentials.Essentials;
import marumasa.spectator_tp.Config;
import marumasa.spectator_tp.minecraft;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public class stp_E implements CommandExecutor {
    private final Config con;
    private final minecraft mc;
    private final Essentials et;

    public stp_E(final Config config, Essentials essentials, minecraft minecraft) {
        con = config;
        mc = minecraft;
        et = essentials;
    }

    @Override
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {
        final Player senderPlayer = (Player) sender;
        if (args.length == 0) {
            senderPlayer.sendMessage(ChatColor.DARK_RED + con.def);
            return false;
        }
        List<Player> players = Bukkit.matchPlayer(args[0]);
        if (players.size() == 0) {
            senderPlayer.sendMessage(ChatColor.DARK_RED + con.def);
            return false;
        }
        Player targetPlayer = players.get(0);

        if (et.getUser(targetPlayer).isTeleportEnabled()) {
            return start_E.tp(senderPlayer, targetPlayer, con, mc);
        }
        //----プレイヤーがTP無効にしている-----//
        senderPlayer.sendMessage(String.format(ChatColor.DARK_RED + con.TeleportBlock, targetPlayer.getDisplayName()));
        return false;
    }
}
