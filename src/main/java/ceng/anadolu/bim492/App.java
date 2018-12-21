package ceng.anadolu.bim492;

public class App {

    public static void main(String[] args) {

        // Create the factory object
        EnemyShipFactory shipFactory = new EnemyShipFactory();

        // Enemy ship object
        EnemyShip theEnemy = shipFactory.makeEnemyShip("U");
        if (theEnemy != null) {

            doStuffEnemy(theEnemy);

        } else {
            System.out.print("Please enter U or R");
        }

    }

    // Executes methods of the super class
    public static void doStuffEnemy(EnemyShip anEnemyShip) {

        anEnemyShip.displayEnemyShip();

        anEnemyShip.followHeroShip();

        anEnemyShip.enemyShipShoots();

    }

}
