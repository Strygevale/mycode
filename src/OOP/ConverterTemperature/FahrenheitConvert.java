package OOP.ConverterTemperature;

public class FahrenheitConvert implements Converter{
    @Override
    public double getConvertedValue(double baseValue) {
        return 1.8 * baseValue + 32;
    }
}
