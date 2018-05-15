package FactoryAndCompositePattern;

public class Test {
    public static void main(String[] args) throws InterruptedException
    {
        //
        String[] tankNames = {"light","heavy"};
        String randomTankName;
        Tank randomTank = null;

        TankDivision_Composite tankDivision = new TankDivision_Composite("Tank division 1");

        //Creates 5 random tanks
        for(int i = 0; i < 5; i++)
        {
            randomTankName = tankNames[(int)(Math.random() *2)];
            randomTank = TankFactory.createTank(randomTankName);
            tankDivision.add(randomTank);
            Thread.sleep(1000);
        }


        tankDivision.shoot();
        tankDivision.drive(25);
        tankDivision.shoot();

        randomTank.drive(100);





    }
}
