// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
// Surface Area: 600
// Volume: 1000
import java.util.Scanner;
public class Cuboid {
    public static void main(String[] args) {
        System.out.println("Enter three integer");
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        double volume = (num1*num2*num3);
        double surface = 2*((num1*num2)+(num1*num3)+(num2*num3));
        System.out.println("volume: " + volume + "\nsurface: " + surface);
    }
}
