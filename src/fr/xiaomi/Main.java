package fr.xiaomi;

import java.util.Scanner;

public class Main {

	public static void main(String[] arg0){
			
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		EnemyShip anEnemy = null;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Choose an enemy");
		
		doStuffEnemy(anEnemy);
	}
	
	
	public static void doStuffEnemy(EnemyShip anEnemy){
		anEnemy.displayEnemyShip();
		anEnemy.followHeroShip();
		anEnemy.enemyShots();
	}
}
