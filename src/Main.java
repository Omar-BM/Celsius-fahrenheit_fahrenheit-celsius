import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        byte option = 3;

        while (option != 0) {
            Scanner lecture = new Scanner(System.in);
            System.out.println("Temperature converter");
            System.out.println("1-fahrenheit to celsius" + "\n2-celsius to fahrenheit");
            option = lecture.nextByte();
            if (option == 1) {
                float fahToCelsius;
                System.out.println("Type the temperature in fahrenheit ");
                fahToCelsius = lecture.nextFloat();
                fahToCelsius = (fahToCelsius - 32f) * 5f / 9f;
                System.out.println("Temperature in celsius is equal to " + fahToCelsius);
                System.out.println();
            } else if (option == 2) {
                float celsiusToFah;
                System.out.println("Type the temperature in celsius");
                celsiusToFah = lecture.nextFloat();
                celsiusToFah = (celsiusToFah * 9f / 5f) + 32f;
                System.out.println("Temperature in fahrenheit is equal to " + celsiusToFah);
                System.out.println();

            }
        }
    }
}