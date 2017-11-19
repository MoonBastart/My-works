package by.it_academy.task1;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrays {
    public static void main (String[] arg) {

        even();

    }


    public static void enter () {

        n();
        int[] array = new int[10];
        System.out.println("Enter values: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print("\"value\" " + array[i] + " | ");
        }
    }



    public static void theFirst () {

        //The first method

        n();
        int[] array = new int[10];
        System.out.println("Enter values: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print("\"value\" " + array[i] + " | ");
        }
            for (int i = 0; i < array.length; i++) {
                int min = array[i];
                int min_i = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] < min) {
                        min = array[j];
                        min_i = j;
                    }
                }

                if (i != min_i) {
                    int tmp = array[i];
                    array[i] = array[min_i];
                    array[min_i] = tmp;
                }
            }
            m();
        for (int i = 0; i < array.length; i++) {
            System.out.print("\"value\" " + array[i] + " | ");
        }
        }



    public static void theSecond () {

        //The second method

        n();
        int[] array = new int[10];
        System.out.println("Enter values: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print("\"value\" " + array[i] + " | ");
        }
            for (int i = array.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (array[j] > array[j + 1]) {
                        int tmp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = tmp;
                    }
                }
            }
            m();
        for (int i = 0; i < array.length; i++) {
            System.out.print("\"value\" " + array[i] + " | ");
        }
        }



    public static void theThird () {

        //The third method

        n();
        int[] array = new int[10];
        System.out.println("Enter values: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print("\"value\" " + array[i] + " | ");
        }
            Arrays.sort(array);
        m();
        for (int i = 0; i < array.length; i++) {
            System.out.print("\"value\" " + array[i] + " | ");
        }
        }



    public static void even() {

        n();
        int[] array = new int[10];
        System.out.println("Enter values: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print("\"value\" " + array[i] + " | ");
        }
        m();
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    System.out.print("\"value\" " + array[i] + " | ");
                }
            }
        }



    public static void n () {
        System.out.print("\n\n");
    }



    public static void m () {
        System.out.print("\n");
    }
    }

