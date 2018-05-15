package FactoryAndCompositePattern;

public class HeavyTank extends Tank {


    public HeavyTank(){
        this.setDamage(50);
        this.setName("Heavy tank");
        this.setSpeed(15);
        this.displayTank();
    }



}
