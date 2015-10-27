package com.tixon.backtothefutureexchange;

/**
 * Created by Tixon
 */
public class Exchange {
    //значения массивов - сколько рублей дают за конкретную валюту
    private double[] dollars, pounds;
    //индекс массива с определённым годом (см. res/values/currencies.xml)
    private int yearIndex;

    public Exchange(String[] dollars, String[] pounds) {
        this.dollars = stringToDoubleArray(dollars);
        this.pounds = stringToDoubleArray(pounds);
    }

    //задаёт индекс массива для выбора определённого года
    //из табло выбора временного интервала
    public void setYearIndex(int i) {
        this.yearIndex = i;
    }

    //методы преобразования валют
    public double rublesFromDollars(double currency) {
        return dollars[yearIndex] * currency;
    }

    public double rublesFromPounds(double currency) {
        return pounds[yearIndex] * currency;
    }

    public double dollarsFromRubles(double currency) {
        return (1/dollars[yearIndex]) * currency;
    }

    public double poundsFromRubles(double currency) {
        return pounds[yearIndex] * (1 / currency);
    }

    //доллар - рубль - фунт
    public double poundsFromDollars(double currency) {
        double rubles = rublesFromDollars(currency);
        return poundsFromRubles(rubles);
    }

    //фунт - рубль - доллар
    public double dollarsFromPounds(double currency) {
        double rubles = rublesFromPounds(currency);
        return dollarsFromRubles(rubles);
    }

    private double[] stringToDoubleArray(String[] stringArray) {
        double[] array = new double[stringArray.length];
        for(int i = 0; i < stringArray.length; i++) {
            array[i] = Double.parseDouble(stringArray[i]);
        }
        return array;
    }
}
