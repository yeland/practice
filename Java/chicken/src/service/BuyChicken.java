package service;

import model.Chick;
import model.Chicken;
import model.Cock;
import model.Hen;

public class BuyChicken {
    public void buyChicken() {
        Chicken cock = new Cock();
        Chicken hen = new Hen();
        Chicken chick = new Chick();
        for (int i = 0; i <= 100 / cock.getPrice(); i++) {
            for (int j = 0; j <= 100 / hen.getPrice(); j++) {
                int k = 100 - i - j;
                if (i * cock.getPrice() + j * hen.getPrice() + k * chick.getPrice() == 100.00) {
                    System.out.println("买" + i + "只公鸡，" + j + "只母鸡，" + k + "只小鸡");
                }
            }
        }
    }
}
