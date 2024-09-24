package sept.exe_23092024;

public class Task15_convert_between_units {
    public static void main(String[] args) {

        double value=96;
        String unit ="km";

        switch(unit){

            case "Km": {

                System.out.println(value + " km is equal to " + (value * 1000) + " m");
                break;
            }
            case "m":
            {
                System.out.println(value + " m is equal to " + (value/1000) +" Km");
                break;
            }
            case "f":
            {
                System.out.println(value + " F is equal to " + ((value-32) * 5/9) +" °C");
                break;
            }
            case "c":
            {
                System.out.println(value + "°C is equal to " + ((value*9/5) + 32) +"F" );
                break;
            }
        }
    }
}
//Write a program that converts between different units
// (e.g., kilometers to miles, Celsius to Fahrenheit) based on user selection using a switch statement.
//Input. -
//choice - 1 - km → m, km → 1km
//choice - 2 - f → c, f → c
