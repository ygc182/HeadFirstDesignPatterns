package com.superyuan.headfirstdesignpatterns.observerpattern;

public interface Subject<T> {
    void registerObserver(T observer);
    void unregisterObserver(T observer);
    void notifyObservers();

}
