package adventureGame;

public abstract class normalLoc extends location{
	normalLoc(player player, String name){
		super(player);
		this.name = name;
	}
	public normalLoc(adventureGame.player player) {
		super(player);
	}
	public  boolean getLocation() {
		return true;
	}

}
