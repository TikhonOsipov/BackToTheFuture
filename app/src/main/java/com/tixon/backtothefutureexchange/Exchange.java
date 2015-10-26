package com.tixon.backtothefutureexchange;

/**
 * Created by Tixon
 */
public class Exchange {
    //значения массивов - сколько рублей дают за конкретную валюту
    private double[] dollars, pounds;
    //индекс массива с определённым годом (см. res/values/currencies.xml)
    private int yearIndex;

    public Exchange(double[] dollars, double[] pounds) {
        this.dollars = dollars;
        this.pounds = pounds;
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
        return dollars[yearIndex] * (1 / currency);
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
}
