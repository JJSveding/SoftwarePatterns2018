package FactoryAndCompositePattern;


import java.util.ArrayList;
import java.util.List;

public class TankDivision_Composite implements Tank {
    List<Tank> tankDivision;
    private String name = null;

    public TankDivision_Composite(){
        tankDivision = new ArrayList<>();
    }

    //Method overloading
    public TankDivision_Composite(String name){
        tankDivision = new ArrayList<>();
        this.name = name;
    }

    public void add(Tank element) {
        tankDivision.add(element);
    }

    public void remove(Tank element) {
        tankDivision.remove(element);
    }

    @Override
    public void shoot()  {
        System.out.println(getDisivisionNameIfSet(name)+" FIRE!");
        sleep();
        tankDivision.forEach((element) -> {
            element.shoot();
        });
    }

    @Override
    public void drive(int distance) {
        System.out.println(getDisivisionNameIfSet(name)+" drive "+distance+" meters forward");
        sleep();
        tankDivision.forEach((element) -> {
            element.drive(distance);
        });
    }


    public String getDisivisionNameIfSet(String name)
    {
        if(name!= null){
            return this.name;
        }

        return "Division with no name";
    }


    public void sleep(){
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            //Nothing
        }
    }
}
