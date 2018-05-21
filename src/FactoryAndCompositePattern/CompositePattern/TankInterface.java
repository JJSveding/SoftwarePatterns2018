package FactoryAndCompositePattern.CompositePattern;

public interface TankInterface {
    public void shoot(TankInterface target);
    public void drive(int distance);
    public void takeDamage(int damage);
    public Boolean isAlive();
    public void switchWeapon();
    public String getName();

}
