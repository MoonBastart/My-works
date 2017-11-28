package by.itAcademy.Task3;

import by.itAcademy.Task3.Figures.Circle;
import by.itAcademy.Task3.Figures.Rectangle;
import by.itAcademy.Task3.Figures.Square;
import by.itAcademy.Task3.Figures.Triangle;

import java.util.Scanner;

public class Account {
    public static void main(String[] arg) {

        System.out.println("Please, enter: \n\"1\", if you want to see the square of Circle" +
                "\n\"2\", if you want to see the square of Triangle" +
                "\n\"3\", if you want to see the square of Square" +
                "\n\"4\", if you want to see the square of Rectangle");

        Figure figure = null;

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        switch (input) {
            case 1: {
                figure = new Circle(8);
                break;
            }
            case 2: {
                figure = new Triangle(7, 12);
                break;
            }
            case 3: {
                figure = new Square(6);
                break;
            }
            case 4: {
                figure = new Rectangle(5, 9);
                break;
            }
            default: {
                System.out.println("The figure is not found!");
            }
        }
        printSqr(figure);
    }

    public static void printSqr(Figure figure) {

    System.out.println("The square of your figure is - " + figure.getSqr());

    }
}
