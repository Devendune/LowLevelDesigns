package org.UseStrategy.Strategy;

import org.UseStrategy.Vehicle;

public class GoodsVehicle extends Vehicle
{
    public GoodsVehicle()
    {
        super(new GoodsVehicleStrategy());
    }
}
