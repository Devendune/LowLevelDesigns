package org.UseStrategy;

import org.UseStrategy.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle
{
    SportsVehicle()
    {
        super(new SportsDriveStrategy());
    }
}
