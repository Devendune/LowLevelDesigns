package org.UseStrategy.Strategy;

import org.UseStrategy.GoodsVehicle;
import org.UseStrategy.Vehicle;

public class GoodsVehicleStrategy implements DriveStrategy
{

    @Override
    public void drive() {
        System.out.println("Goods Vehicle Strategy implementation being here");
    }
}
