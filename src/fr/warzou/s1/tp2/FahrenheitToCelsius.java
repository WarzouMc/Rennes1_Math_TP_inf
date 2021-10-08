package fr.warzou.s1.tp2;

public class FahrenheitToCelsius {

    public static void main(String[] args) {
        for (int i = 250; i > -21; i -= 10)
            System.out.println("celsius : '" + i + "' / fahrenheit : '" + toCelsius(i) + "'");
    }

    private static double toCelsius(double fahrenheit) {
        return (5.0 / 9.0) * fahrenheit - 160.0 / 9.0;
    }

}
