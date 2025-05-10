package org.ObserverPattern.Observer;

import org.ObserverPattern.Observable.StocksObservable;

public class EmailObserverImpl implements NotificationAlertObserver
{
    String emailId;
    StocksObservable observable;

    public EmailObserverImpl(String emailId,StocksObservable observable)
    {
        this.emailId=emailId;
        this.observable=observable;
    }

    @Override
    public void update()
    {
        sendEmail("The product is in stock hurry up!!!");
    }

    public void sendEmail(String msg)
    {
        System.out.println("The email body message is "+msg+" and is sent to email id "+emailId);
    }
}
