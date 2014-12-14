package fr.xiaomi;

public abstract class EnemyShip {

	private String name;
	private int damage;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	public void followHeroShip(){
		System.out.println(getName() + " follows the hero");
	}
	
	public void displayEnemyShip(){
		System.out.println(getName() + " is on the screen");
	}
	
	public void enemyShots(){
		System.out.println("enemy shots and does " + getDamage());
	}
	
}
