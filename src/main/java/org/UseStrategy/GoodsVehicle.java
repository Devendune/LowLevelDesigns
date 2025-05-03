package org.UseStrategy;

import org.UseStrategy.Strategy.GoodsVehicleStrategy;
import org.example.SportsVehicle;

public class GoodsVehicle extends Vehicle
{
    public GoodsVehicle()
    {
        super(new GoodsVehicleStrategy());
    }

}
