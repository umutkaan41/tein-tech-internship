package adventureGame;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;



public class player {
   private int damage,healthy,money,rHealthy;
   private String name,Cname;
   private Inventory inv;
   Scanner scanner = new Scanner(System.in);
   public player(String name) {
	
	this.name = name;
	this.inv = new Inventory();
}
   public void selectCha() {
	   switch (chaMenu()) {
	   case 1:
		   initPlayer("Samuray", 5, 21, 15);
		   break;
	   case 2:
		   initPlayer("Okçu", 7, 10, 20);
		   break;
	   case 3:
		   initPlayer("Şovalye", 8, 24, 5);

		   break ;
		   default:
			   initPlayer("Samuray", 15, 21, 5);
			   break;
			   
	}
	   System.out.println("Karakter : "+ getCname()+" ,Hasar: "+getDamage()+" ,Sağlık : "+getHealthy()+" ,Para : "+getMoney());
	
   }
   public int chaMenu() {
	   System.out.println("Lütfen bir karakter seçiniz:");
	   System.out.println("1-Samuray, Hasar:5, Sağlık:21,Para:15");
	   System.out.println("2-Okçu, Hasar:7, Sağlık:18,Para:20");
	   System.out.println("3-Şovalye, Hasar:8, Sağlık:24,Para:5");
	   System.out.println("Seçiminiz:");
	   int chaID = scanner.nextInt();
	   
	   while(chaID<1 || chaID >3) {
		   System.out.println("Lütfen geçerli bir karakter seçiniz.");
		   chaID = scanner.nextInt();
		   
	   }
	   
	   return chaID;

   }
   
   public int getTotalDamage() {
	   return this.getDamage()+ this.getInv().getDamage();
   }
   
   
   public void initPlayer(String cName, int dmg, int hlthy, int mny) {
	   setCname(cName);
	   setDamage(dmg);
	   setHealthy(hlthy);
	   setMoney(mny);
	   setrHealthy(hlthy);
   }
   
   
   public int getDamage() {
	return damage;
   }
   public void setDamage(int damage) {
	this.damage = damage;
   }
   public int getHealthy() {
	return healthy;
   }
   public void setHealthy(int healthy) {
	this.healthy = healthy;
   }
   public int getMoney() {
	return money;
   }
   public void setMoney(int money) {
	this.money = money;
   }
   public String getName() {
	return name;
   }
   public void setName(String name) {
	this.name = name;
   }
   public String getCname() {
	return Cname;
   }
   public void setCname(String cname) {
	Cname = cname;
   }
   public Inventory getInv() {
	return inv;
   }
   public void setInv(Inventory inv) {
	this.inv = inv;
   }
   public int getrHealthy() {
	return rHealthy;
   }
   public void setrHealthy(int rHealthy) {
	this.rHealthy = rHealthy;
   }
 
}
