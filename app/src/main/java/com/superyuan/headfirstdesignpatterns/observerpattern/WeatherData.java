package com.superyuan.headfirstdesignpatterns.observerpattern;

import java.util.ArrayList;

/**
 * subject 被观察者
 */
public class WeatherData implements Subject<Observer> {

    private ArrayList<Observer> observers;

    public int num1;
    public int num2;
    private boolean isChanged;

    public WeatherData() {
        observers = new ArrayList<>();
    }


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i > 0) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        if(isChanged){
            for (Observer observer : observers) {
                observer.update();
            }
            isChanged = false;
        }
    }

    /**
     *  主动标记是否需要通知各个观察者
     */
    public void setChanged(){
        isChanged = true;
    }
}
