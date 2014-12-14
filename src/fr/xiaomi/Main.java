package fr.xiaomi;

import java.util.Scanner;

public class Main {

	public static void main(String[] arg0){
			
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		EnemyShip anEnemy = null;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Choose an enemy (1/2/3)");
		
		if(input.hasNextInt()){
			int choice = input.nextInt();
			anEnemy = shipFactory.makeEnemy(choice);
		}
		
		doStuffEnemy(anEnemy);
	}
	
	
	public static void doStuffEnemy(EnemyShip anEnemy){
		anEnemy.displayEnemyShip();
		anEnemy.followHeroShip();
		anEnemy.enemyShots();
	}
}
