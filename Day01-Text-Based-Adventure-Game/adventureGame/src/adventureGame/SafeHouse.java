package adventureGame;

public class SafeHouse extends normalLoc{
	SafeHouse(player player){
		super(player, "Güvenli Ev");
	}
	public boolean getLocation() {
		player.setHealthy(player.getrHealthy());
		System.out.println("Canınız yenilendi.");
		System.out.println("Şuan Güvenli Evdesiniz.");
		return true;
	}
	

}
