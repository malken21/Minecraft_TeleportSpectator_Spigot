package marumasa.spectator_tp;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;

import java.util.logging.Logger;

public class Event implements Listener {

    private final Config con;
    private static final Logger logger = Bukkit.getLogger();

    public Event(Config config) {
        con = config;
    }
}