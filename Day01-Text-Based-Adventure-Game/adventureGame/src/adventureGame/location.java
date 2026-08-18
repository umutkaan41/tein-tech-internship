package adventureGame;

import java.lang.reflect.AccessFlag.Location;
import java.util.Scanner;


public abstract class location {
	protected player player;
	protected String name;
	Scanner scanner = new Scanner(System.in);
	
	location(player player){
		this.player=player;
	}
	public abstract boolean getLocation();
	public player getPlayer() {
		return player;
	}
	public void setPlayer(player player) {
		this.player = player;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
