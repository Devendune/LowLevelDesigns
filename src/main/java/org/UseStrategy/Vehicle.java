package org.UseStrategy;
import org.UseStrategy.Strategy.DriveStrategy;

public class Vehicle implements DriveStrategy
{
    DriveStrategy driveObj;

    Vehicle(DriveStrategy driveObj)
    {
        this.driveObj=driveObj;
    }

    @Override
    public void drive()
    {
        driveObj.drive();
    }
}
