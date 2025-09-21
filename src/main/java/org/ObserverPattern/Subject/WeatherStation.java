package org.ObserverPattern.Subject;

import org.ObserverPattern.Observer.WeatherObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation
{
    private final List<WeatherObserver> observerList=new ArrayList<>();
    private float temperature;
    private float humidity;

    public void addObserver(WeatherObserver observer)
    {
        observerList.add(observer);
    }
    public void remove(WeatherObserver observer)
    {
        observerList.remove(observer);
    }

    public void notifyObservers()
    {
        for(WeatherObserver observer:observerList)
        {
            observer.update(temperature,humidity);
        }
    }

    public void setWeather(float temperature,float humidity) {
        this.temperature = temperature;
        this.humidity=humidity;
        notifyObservers();
    }


}
