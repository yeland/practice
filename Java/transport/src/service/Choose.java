package service;

import model.*;

public class Choose {
    public void chooseTransport(int price) {
        Transport driving = new Driving();
        Transport bus = new Bus();
        Transport train = new Train();
        Transport airplane = new Airplane();
        if(price >= driving.getPrice()){
            System.out.println("driving");
        }
        if(price >= bus.getPrice()){
            System.out.println("bus");
        }
        if(price >= train.getPrice()){
            System.out.println("train");
        }
        if(price >= airplane.getPrice()){
            System.out.println("airplane");
        }
    }
}
