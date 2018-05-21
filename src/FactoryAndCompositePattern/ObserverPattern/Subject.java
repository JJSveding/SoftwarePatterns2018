package FactoryAndCompositePattern.ObserverPattern;

public interface Subject {

    public void attach(Observer o); //Subscribe
    public void detach(Observer o); //Unsubcribe
    public void notifyObservers();
}
