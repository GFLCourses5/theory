package com.example.demo.factory1;

public class BusDeliveryService implements DeliveryService {
    @Override
    public void delivery() {
        System.out.println("Deliver by bus");
    }
}
