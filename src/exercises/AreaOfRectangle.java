package exercises;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        System.out.println("\n***** Numeric Types ******\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of your Rectangle: ");
        int length = input.nextInt();
        System.out.println("Please enter  the width of your Rectangle: ");
        int width = input.nextInt();
        System.out.println("The Area of Rectangle for the given length  and width is "+ length * width);
    }
}
