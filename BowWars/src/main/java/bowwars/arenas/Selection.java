package bowwars.arenas;

import org.bukkit.Location;

public class Selection {
	
	private final Location mincoord;
	private final Location maxcoord;
	
	private Selection (Location mincoord, Location maxcoord){
		this.mincoord = mincoord;
		this.maxcoord = maxcoord;		
	}
	
	public Location getMin(){
		return mincoord;
	}
	
	public Location getMax(){
		return maxcoord;
	}
}
