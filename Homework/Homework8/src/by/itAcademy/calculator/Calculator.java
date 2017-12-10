package by.itAcademy.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number " +
                "\n\"1\" if you want to get amount of two numbers" +
                "\n\"2\" if you want to get difference of two numbers" +
                "\n\"3\" if you want to get product of two numbers" +
                "\n\"4\" if you want to get quotient of two numbers" +
                "\n\"any other\" if you want to close calculator");

        int input = scanner.nextInt();
        switch (input) {

            case 1: {
                try {
                    amount();
                } catch (InputMismatchException e) {
                    errorInput();
                }
                break;
            }

            case 2: {
                try {
                    difference();
                } catch (InputMismatchException e) {
                    errorInput();
                }
                break;
            }

            case 3: {
                try {
                    product();
                } catch (InputMismatchException e) {
                    errorInput();
                }
                break;
            }

            case 4: {
                try {
                    quotient();
                } catch (MyExeptions e) {
                    System.out.println(e.getRussiaMessageMath());
                } catch (InputMismatchException e) {
                    errorInput();
                }
                break;
            }

            default: {
                System.out.println("The calculator is closing!");
                break;
            }
        }
    }


    public static void number1() {
        System.out.print("Enter number 1: ");
    }

    public static void number2() {
        System.out.print("Enter number 2: ");
    }

    public static void errorInput() {
        System.out.println("Ошибка ввода, используйте только цифры! Это Вам не записная книжка!" +
                "\nПри вводе дробных значений, нужно целое число отделять не \".\", а \",\"!");
    }

    public static void amount() {
        Scanner scanner = new Scanner(System.in);
        number1();
        double number1 = scanner.nextDouble();
        number2();
        double number2 = scanner.nextDouble();
        double result = number1 + number2;
        System.out.print("The result of quotient your numbers is " + result);
    }

    public static void difference() {
        Scanner scanner = new Scanner(System.in);
        number1();
        double number1 = scanner.nextDouble();
        number2();
        double number2 = scanner.nextDouble();
        double result = number1 - number2;
        System.out.print("The result of difference your numbers is " + result);
    }

    public static void product() {
        Scanner scanner = new Scanner(System.in);
        number1();
        double number1 = scanner.nextDouble();
        number2();
        double number2 = scanner.nextDouble();
        double result = number1 * number2;
        System.out.print("The result of product your numbers is " + result);
    }


    public static void quotient() throws MyExeptions {
        Scanner scanner = new Scanner(System.in);
        number1();
        double number1 = scanner.nextDouble();
        number2();
        double number2 = scanner.nextDouble();
        if (number2 == 0) {
            throw new MyExeptions("На 0 делить нельзя!");
        }
        double result = number1 / number2;
        System.out.print("The result of quotient your numbers is " + result);
    }
}