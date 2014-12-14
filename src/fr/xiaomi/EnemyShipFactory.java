package fr.xiaomi;

public class EnemyShipFactory {

	public EnemyShip makeEnemy(int choice){
		
		if(choice == 1){
			return new UFOEnemyShip();
		} else if(choice == 2 ){
				return new RocketEnemyShip();
		} else if(choice == 3){
			return new BigUFOEnemyShip();
		} else {
			return null;
		}
	}
}
