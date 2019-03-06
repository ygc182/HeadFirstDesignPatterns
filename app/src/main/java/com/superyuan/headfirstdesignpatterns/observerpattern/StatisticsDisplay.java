package com.superyuan.headfirstdesignpatterns.observerpattern;

public class StatisticsDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;

    public StatisticsDisplay (WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("StatisticsDisplay display num1: " + weatherData.num1 + ", num2: " + weatherData.num2);
    }

    @Override
    public void update() {
        display();
    }
}
