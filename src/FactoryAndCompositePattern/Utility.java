package FactoryAndCompositePattern;

public class Utility {


    public static void printAndSleep(String print){
        System.out.println(print);
        printSeperator();
        sleep();

    }

    // IGNORE
    // Used for sleep the program for a little bit
    public static void sleep(){
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            //Nothing
        }
    }

    public static void printSeperator(){
        System.out.println("---------------------");
    }
}
