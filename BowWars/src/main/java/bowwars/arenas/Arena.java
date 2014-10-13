package bowwars.arenas;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.bukkit.Location;

public class Arena {
	
	public enum ArenaState{
		WAITING, COUNTDOWN, STARTED, RESETTING
	}
	
	private final Selection selection = null;
	private final Map<Teams, List<UUID>> players = new HashMap<>();
	private final Map<Teams, List<Location>> spawns = new HashMap<>();

	public Map<Teams, List<UUID>> getPlayer(){
		return players;	
	}
	
	public Map<Teams, List<Location>> getSpawns(){
		return spawns;
	}
	
	public Selection getArenaBorder(){
		return selection;
	}
}
 