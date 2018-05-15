package FactoryAndCompositePattern;

public class LightTank extends Tank {


    public LightTank(){
        this.setDamage(10);
        this.setName("Light tank");
        this.setSpeed(100);
        this.displayTank();
    }
}
