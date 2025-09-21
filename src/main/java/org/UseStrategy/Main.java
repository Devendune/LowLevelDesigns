package org.UseStrategy;

import org.UseStrategy.Strategy.DriveStrategy;
import org.UseStrategy.Strategy.GoodsVehicle;
import org.UseStrategy.Strategy.GoodsVehicleStrategy;

public class Main
{
    public static void main(String[] args)
    {
        DriveStrategy driveStrategy=new GoodsVehicleStrategy();
        GoodsVehicle vehicle=new GoodsVehicle();
        vehicle.drive();
    }
}
