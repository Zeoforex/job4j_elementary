package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float in1 = 180;
        float expected = 2;
        float expected1 = 3;
        float euro = Converter.rubleToEuro(in);
        boolean passed = expected == euro;
        float dollar = Converter.rubleToDollar(in1);
        boolean passed1 = expected1 == dollar;
        System.out.println("140 rubles are 2. Test result : " + passed);
        System.out.println("260 rubles are 3. Test result : " + passed1);
    }
}