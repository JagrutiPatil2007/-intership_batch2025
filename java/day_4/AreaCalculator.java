package day4.java;

public class AreaCalculator {
    public static void main(String[] args) {
        float lengthFloat = 10.5f;
        float widthFloat = 7.2f;
        float areaFloat = lengthFloat * widthFloat;
        System.out.println("Area using float: " + areaFloat);

        double lengthDouble = 15.75;
        double widthDouble = 9.3;
        double areaDouble = lengthDouble * widthDouble;
        System.out.println("Area using double: " + areaDouble);
    }
}