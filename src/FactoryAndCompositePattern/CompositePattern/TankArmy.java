package FactoryAndCompositePattern.CompositePattern;


import FactoryAndCompositePattern.FactoryPattern.TankFactory;
import FactoryAndCompositePattern.ObserverPattern.Observer;
import FactoryAndCompositePattern.Utility;

import java.util.ArrayList;
import java.util.List;


public class TankArmy implements TankInterface, Observer {
    private List<TankInterface> tankArmy;
    private String name = null;
    private Boolean armyAlive;

    public TankArmy(){
        tankArmy = new ArrayList<>();
        armyAlive = true;
    }

    //Composite add
    public void add(TankInterface element) {
        tankArmy.add(element);
        System.out.println(name + element.getName() + " was added to army");
    }

    //Composite
    public void remove(Tank element) {
        tankArmy.remove(element);
    }


    //Composite
    @Override
    public void shoot(TankInterface target) {
        if(this.armyAlive) Utility.printAndSleep(this.getName()+" FIRE!");

        tankArmy.forEach((element) -> {                                                                 printArmyName();
            element.shoot(target);                                                                      Utility.sleep();
        });
    }

    //Composite
    public void drive(int distance) {

        Utility.printAndSleep(this.getName()+" Army drive "+distance+" meters forward!");

        tankArmy.forEach((element) -> {                                                                 printArmyName();
            element.drive(distance);                                                                    Utility.sleep();
        });
    }

    //Composite
    @Override
    public void takeDamage(int damage) {

        if(this.isAlive()){
            //Random tank takes a hit
            int randomTank = (int)(Math.random() *tankArmy.size());
            TankInterface targetTank = tankArmy.get(randomTank);
                                                                                                        Utility.sleep();
                                                                                                        printArmyName();
            targetTank.takeDamage(damage);
        }
    }

    //Composite
    @Override
    public Boolean isAlive() {
        return armyAlive;
    }


    //Composite
    @Override
    public void switchWeapon(){
        tankArmy.forEach((tank) -> {
            tank.switchWeapon();
        });
    }

    //Observer
    @Override
    public void update(Tank tank) {
        this.remove(tank);
        Utility.printAndSleep(this.getName()+" has "+ tankArmy.size()+ " tanks left");
        if(tankArmy.isEmpty()){
            armyAlive = false;
        }
    }













    //IGNORE ALL FROM HERE

    //Used to add random tanks to this army
    public void addRandomTanksToArmy(int numberOfTanks){
        Tank randomTank = null;
        String[] tankNames = {"light", "medium","heavy"};
        String randomTankName;

        for(int i = 0; i < numberOfTanks; i++)
        {
            randomTankName = tankNames[(int)(Math.random() *3)];
            randomTank = (Tank) TankFactory.createTank(randomTankName);
            this.add(randomTank);
            randomTank.attach(this);
        }
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void printArmyName(){
        System.out.print(name+" ");
    }
}
