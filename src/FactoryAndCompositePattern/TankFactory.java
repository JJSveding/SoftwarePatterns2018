package FactoryAndCompositePattern;

public class TankFactory {

    public TankFactory() {
       /*
        There's no need to construct this class, since all
        methods are static.
         */
    }

    public static Tank createTank(String typeOfTank) {

        if (typeOfTank.equalsIgnoreCase("heavy")) {

            return new HeavyTank();
        } else if (typeOfTank.equalsIgnoreCase("light")) {
            return new LightTank();
        } else //Should be unreachable
        {
            return null;
        }

    }
}