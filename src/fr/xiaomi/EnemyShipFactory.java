package fr.xiaomi;

public class EnemyShipFactory {

	public EnemyShip makeEnemy(String newEnemy){
		
		if(newEnemy.equals("1")){
			return new UFOEnemyShip();
		} else if(newEnemy.equals("2")){
				return new RocketEnemyShip();
		} else if(newEnemy.equals("3")){
			return new BigUFOEnemyShip();
		} else {
			return null;
		}
	}
}
