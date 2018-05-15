package FactoryAndCompositePattern;

public class Test {
    public static void main(String[] args) throws InterruptedException
    {
        //
        String[] tankNames = {"light", "medium","heavy"};
        String randomTankName;
        Tank randomTank = null;

        TankDivision_Composite tankDivision = new TankDivision_Composite();
        tankDivision.setName("Tank division 1");

        //Creates 5 random tanks
        for(int i = 0; i < 5; i++)
        {
            randomTankName = tankNames[(int)(Math.random() *3)];
            randomTank = TankFactory.createTank(randomTankName);
            tankDivision.add(randomTank);
            System.out.println("--------------------------------"); //Console visibility
            Thread.sleep(1000); //Slow down console
        }

        tankDivision.shoot();
        System.out.println("--------------------------------"); //Console visibility

        tankDivision.drive(25);

        System.out.println("--------------------------------"); //Console visibility

        tankDivision.shoot();

        randomTank.drive(100);





    }
}
