package org.ObserverPattern;

import org.ObserverPattern.Observable.IphoneObservableImpl;
import org.ObserverPattern.Observable.StocksObservable;
import org.ObserverPattern.Observer.EmailObserverImpl;
import org.ObserverPattern.Observer.NotificationAlertObserver;

public class Stock
{
    public static void main(String[] args)
    {
        StocksObservable iphoneStockObservable=new IphoneObservableImpl();

        NotificationAlertObserver emailObserver =new EmailObserverImpl("devendunegi06@gmail.com",iphoneStockObservable);
        NotificationAlertObserver emailObserverSecond =new EmailObserverImpl("devendunegi07@gmail.com",iphoneStockObservable);
        NotificationAlertObserver emailObserverThird =new EmailObserverImpl("devendunegi08@gmail.com",iphoneStockObservable);

        iphoneStockObservable.add(emailObserver);
        iphoneStockObservable.add(emailObserverSecond);
        iphoneStockObservable.add(emailObserverThird);

        iphoneStockObservable.setStockCount(100);



    }
}
