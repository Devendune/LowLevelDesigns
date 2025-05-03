package org.example;

public class PassengerVehicle extends Vehicle
{
    @Override
    public void drive()
    {
        System.out.println("Passenger having own implementation");
    }
}
