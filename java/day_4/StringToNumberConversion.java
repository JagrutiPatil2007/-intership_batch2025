package day4.java;

public class StringToNumberConversion {
    public static void main(String[] args) {
        String intStr = "100";
        String doubleStr = "99.99";

        int intValue = Integer.parseInt(intStr);
        double doubleValue = Double.parseDouble(doubleStr);

        System.out.println("Converted int: " + intValue);
        System.out.println("Converted double: " + doubleValue);
    }
}
