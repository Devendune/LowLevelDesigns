package org.ObserverPattern;

import org.ObserverPattern.Observer.PhoneDisplayObserver;
import org.ObserverPattern.Subject.WeatherStation;

public class Stock
{
    public static void main(String[] args)
    {
        WeatherStation weatherStation=new WeatherStation();
        weatherStation.addObserver(new PhoneDisplayObserver());
        weatherStation.setWeather(25,50);
    }
}
