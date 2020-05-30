package com.example.sharingapp;

import java.util.ArrayList;

/**
 * Superclass of Item,ItemList,Contact,ContactList(Subject)
 */
public class Observable {
    private ArrayList<Observer> observers = null;
    public Observable()
    {
        this.observers = new ArrayList<Observer>();
    }
    //Notify observers when need to update any changes to model
    public void notifyObservers()
    {
        for(Observer observer : this.observers)
        {
            observer.update();
        }
    }
    //Adding observer
    public void addObserver(Observer observer)
    {
        this.observers.add(observer);
    }
    //Removing observer
    public void removeObserver(Observer observer)
    {
        if(observers.contains(observer)){
            this.observers.remove(observer);
        }
    }
}
