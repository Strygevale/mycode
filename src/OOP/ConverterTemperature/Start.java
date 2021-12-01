package OOP.ConverterTemperature;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        System.out.println("Введите температуру ");
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        System.out.println("t = " + new CelsiusConvert().getConvertedValue(temp));
        System.out.println("t = " + new KelvinConvert().getConvertedValue(temp));
        System.out.println("t = " + new FahrenheitConvert().getConvertedValue(temp));
    }
}
