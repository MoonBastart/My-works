package by.it_academy.task2;

import java.util.Scanner;

public class Conclusion {

    public static void main(String[] arg) {

        ATL put = new ATL(5, 2, 8); //изначальное кол-во купюр соответ. номинала лежащих в ATL (если ложить)
        ATL takeOff = new ATL(12, 4, 5); ///изначальное кол-во купюр соответ. номинала лежащих в ATL (для снятия)
        //можно использовать только один и менять исходные данные

        System.out.println("Enter:" +
                "\n     number \"1\" to add money" +
                "\n     number \"2\" to withdraw money" +
                "\n     any other number to exit");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        switch (input) {
            case 1: {
                putCash(put);
                break;
            }
            case 2: {
                takeOffCash(takeOff);
                break;
            }
            default: {
                System.out.println("The program closed! Goodbye, come again =)");
            }
        }
    }

    public static void putCash(ATL put) {

        System.out.println("\nWhat amount do you want to put? ");

        Scanner scanner = new Scanner(System.in);
        int sumPut = scanner.nextInt();

        int counter100new;
        int counter50new;
        int counter20new;

        boolean possible;

        if (sumPut % 10 != 0 || sumPut < put.den20 || sumPut == 30) {
            possible = false;
        } else {
            possible = true;
        }


        if (sumPut % put.den100 == 70 || sumPut % put.den100 == 90) {
            counter50new = put.getCounter50() + sumPut % put.den100 / put.den50;
            counter20new = put.getCounter20() + (sumPut % put.den100 - put.den50) / put.den20;
        } else {
            if (sumPut % put.den100 == put.den50) {
                counter50new = put.getCounter50() + 1;
                counter20new = put.getCounter20();
            } else {
                counter50new = put.getCounter50() + 0;
                counter20new = put.getCounter20() + (sumPut % put.den100) / put.den20;
            }
        }

            if (sumPut % put.den100 == 10 || sumPut % put.den100 == 30) {
                counter100new = put.getCounter100() + sumPut / put.den100 - 1;
                counter50new = put.getCounter50() + 1;
                counter20new = put.getCounter20() + (sumPut % put.den100 + put.den100 - put.den50) / put.den20;
            } else {
                counter100new = put.getCounter100() + sumPut / put.den100;
            }

            if (possible == false) {
                System.out.println("Wrong amount of money\n");
            } else {
                System.out.println("The ATM now has a number denominations:\n" +
                        "of 100 - " + counter100new + " notes\n" +
                        "of 50 - " + counter50new + " notes\n" +
                        "of 20 - " + counter20new + " notes\n\n");
            }
        }

    public static void takeOffCash(ATL takeOff) {
        System.out.println("\nWhat amount do you want to take off? ");

        Scanner scanner = new Scanner(System.in);
        int sumTakeOff = scanner.nextInt();

        int note100;
        int note50;
        int note20;

        int counter100new2;
        int counter50new2;
        int counter20new2;

        boolean possible2;

        if (sumTakeOff % 10 != 0 || sumTakeOff < takeOff.den20 || sumTakeOff == 30) {
            possible2 = false;
        } else {
            possible2 = true;
        }


        if (sumTakeOff % takeOff.den100 == 70 || sumTakeOff % takeOff.den100 == 90) {

            note50 = sumTakeOff % takeOff.den100 / takeOff.den50;
            counter50new2 = takeOff.getCounter50() - note50;

            note20 = (sumTakeOff % takeOff.den100 - takeOff.den50) / takeOff.den20;
            counter20new2 = takeOff.getCounter20() - note20;

        } else {

            if (sumTakeOff % takeOff.den100 == takeOff.den50) {

                note50 = 1;
                counter50new2 = takeOff.getCounter50() - note50;

                note20 = 0;
                counter20new2 = takeOff.getCounter20();

            } else {

                note50 = 0;
                counter50new2 = takeOff.getCounter50() - note50;

                note20 = (sumTakeOff % takeOff.den100) / takeOff.den20;
                counter20new2 = takeOff.getCounter20() - note20;

            }
        }

        if (sumTakeOff % takeOff.den100 == 10 || sumTakeOff % takeOff.den100 == 30) {

            note100 = sumTakeOff / takeOff.den100 - 1;
            counter100new2 = takeOff.getCounter100() - note100;

            note50 = 1;
            counter50new2 = takeOff.getCounter50() - note50;

            note20 = (sumTakeOff % takeOff.den100 + takeOff.den100 - takeOff.den50) / takeOff.den20;
            counter20new2 = takeOff.getCounter20() - note20;

        } else {

            note100 = sumTakeOff / takeOff.den100;
            counter100new2 = takeOff.getCounter100() - note100;
        }

        if (possible2 == false) {
            System.out.println("Wrong amount of money\n");
        } else {
            if (counter20new2 < 0 || counter50new2 < 0 || counter100new2 < 0) {
                System.out.println("Sorry, the ATM does not have the requested amount");
            } else {
                System.out.println("\nYou have received a number of denominations of the nominal:\n" +
                        "100 - " + note100 + "\n" +
                        "50 - " + note50 + "\n" +
                        "20 - " + note20);
            }
        }
    }
}
