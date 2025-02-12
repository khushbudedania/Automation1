package sept.Practice_Program;

public class P11 {
    public static void main(String[] args) {
        String unit = "km";
        float value = 10f;

        switch (unit)
        {
            case "km":
                System.out.printf("%f km is equal to = " + value * 1000 + "m",value);
                break;
            case "m":
                System.out.printf("%f m is equal to = " + value / 1000 + "km",value);
                break;
            case "f":
                System.out.printf("%f f is equal to = " + ((value-32) * 5/9) + "c",value);
                break;
            case "c":
                System.out.printf("%f c is equal to = " + (value*9/5)+32 + "f",value);
                break;
        }

    }
}
//Write a program that converts between different units
// (e.g., kilometers to miles, Celsius to Fahrenheit) based on user selection using a switch statement.
//Input. -
//choice - 1 - km → m, km → 1km
//choice - 2 - f → c, f → c