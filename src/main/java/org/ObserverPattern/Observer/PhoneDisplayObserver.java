package org.ObserverPattern.Observer;

public class PhoneDisplayObserver implements WeatherObserver
{
    public void update(float temperature,float humidity)
    {
        System.out.println("The updates temperature and humidity are "+temperature+" "+humidity);
    }
}
