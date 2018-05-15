package FactoryAndCompositePattern;

public class MediumTank extends Tank{


    public MediumTank(){
        this.setDamage(20);
        this.setName("Medium tank");
        this.setSpeed(50);
        this.displayTank();
    }

}
