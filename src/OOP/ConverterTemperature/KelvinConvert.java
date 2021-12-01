package OOP.ConverterTemperature;

public class KelvinConvert implements Converter{
    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue + 273.15;
    }
}
