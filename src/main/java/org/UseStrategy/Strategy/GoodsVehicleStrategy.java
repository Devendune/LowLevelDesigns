package org.UseStrategy.Strategy;

public class GoodsVehicleStrategy implements DriveStrategy
{
    @Override
    public void drive() {
        System.out.println("Goods Vehicle Strategy implementation used here");
    }
}
