package bowwars;

import bowwars.commands.MainCommand;
import bowwars.listeners.AreaListener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private final AreaListener areaListener = new AreaListener(this);
    private final MainCommand mainCommand = new MainCommand(this);
    
    @Override
    public void onEnable() {
        this.getCommand("bowwars").setExecutor(mainCommand);
        this.getCommand("bowwars").setTabCompleter(mainCommand);
        this.getServer().getPluginManager().registerEvents(areaListener, this);
    }

    @Override
    public void onDisable() {
        
    }
    
}
