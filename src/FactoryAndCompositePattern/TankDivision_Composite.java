package FactoryAndCompositePattern;


import java.util.ArrayList;
import java.util.List;

public class TankDivision_Composite implements TankInterface {
    List<Tank> tankDivision;
    private String name = null;

    public TankDivision_Composite(){
        tankDivision = new ArrayList<>();
    }


    public void add(Tank element) {
        tankDivision.add(element);
        System.out.println("Tank "+tankDivision.size()+" has been added to the division "+getDisivisionNameIfSet());
    }

    public void remove(Tank element) {
        tankDivision.remove(element);
    }

    @Override
    public void shoot()  {
        sleep();
        System.out.println(getDisivisionNameIfSet()+" FIRE!");
        sleep();
        tankDivision.forEach((element) -> {
            element.shoot();
        });
    }

    @Override
    public void drive(int distance) {
        sleep();
        System.out.println(getDisivisionNameIfSet()+" drive "+distance+" meters forward");
        sleep();
        tankDivision.forEach((element) -> {
            element.drive(distance);
        });
    }


    public String getDisivisionNameIfSet()
    {
        if(this.name!= null){
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
