package converter;

interface Converter {
    double getConvertedValue(double baseValue);
}

class CelsiusConverter implements Converter {
    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue;
    }
}

class KelvinConverter implements Converter {

    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue + 273.15;
    }
}

class FahrenheitConverter implements Converter {
    @Override
    public double getConvertedValue(double baseValue) {
        return 1.8 * baseValue + 32;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Создайте интерфейс Converter для конвертации из градусов по Цельсию в Кельвины \n" +
                "и Фаренгейты. Должен быть реализован метод getConvertedValue, который и делает \n" +
                "конвертацию (значения приведенные в примере - температура 21,5 градусов).\n");
        double temperature = 21.5;
        final int N = 3;
        Converter convert[] = new Converter[N];
        convert[0] = new CelsiusConverter();
        convert[1] = new KelvinConverter();
        convert[2] = new FahrenheitConverter();
        for (Converter c : convert) {
            System.out.printf("t = %.1f%n", c.getConvertedValue(temperature));
        }
    }
}

