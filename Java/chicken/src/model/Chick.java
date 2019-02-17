package model;

public class Chick extends Chicken {
    @Override
    public double getPrice() {
        return 1 / 3.0;
    }
}
