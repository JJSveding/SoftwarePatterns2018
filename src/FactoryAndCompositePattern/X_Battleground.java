package FactoryAndCompositePattern;


import FactoryAndCompositePattern.CompositePattern.TankArmy;

public class X_Battleground {
    TankArmy firstArmy;
    TankArmy secondArmy;

    public X_Battleground(TankArmy firstArmy, TankArmy secondArmy){
        this.firstArmy = firstArmy;
        this.secondArmy = secondArmy;
    }




    public void beginTheWar(){

        firstArmy.drive(500);

        System.out.println("--Battle has begun--");
        Utility.printSeperator();

        while(firstArmy.isAlive() && secondArmy.isAlive())
        {
            sleep();
            firstArmy.shoot(secondArmy);
            firstArmy.switchWeapon();

            secondArmy.shoot(firstArmy);
            secondArmy.switchWeapon();
        }
        System.out.println("--Battle has ended--");


        if(firstArmy.isAlive()){
            System.out.println(firstArmy.getName()+ " is victorious");
        }
        else if(secondArmy.isAlive())
        {
            System.out.println(secondArmy.getName()+ " is victorious");
        }
    }


    public void sleep(){
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            //Nothing
        }
    }

}
