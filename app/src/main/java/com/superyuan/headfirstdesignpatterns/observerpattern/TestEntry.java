package com.superyuan.headfirstdesignpatterns.observerpattern;

public class TestEntry {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.notifyObservers();
        weatherData.num1 = 5;
        weatherData.num2 = 10;
        weatherData.setChanged();
        weatherData.notifyObservers();
    }
}
