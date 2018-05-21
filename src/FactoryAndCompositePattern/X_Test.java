package FactoryAndCompositePattern;

import FactoryAndCompositePattern.CompositePattern.TankArmy;

public class X_Test {



    public static void main(String[] args) throws InterruptedException
    {
        TankArmy firstArmy = new TankArmy();
        firstArmy.setName("(FRIENDLY)");
        firstArmy.addRandomTanksToArmy(2);

                                                                            System.out.println("---------------------");

        TankArmy secondArmy = new TankArmy();
        secondArmy.setName("(ENEMY)");
        secondArmy.addRandomTanksToArmy(2);
                                                                            System.out.println("---------------------");

        X_Battleground bg = new X_Battleground(firstArmy, secondArmy);
        bg.beginTheWar();

    }



}
