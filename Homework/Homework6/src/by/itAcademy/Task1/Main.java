package by.itAcademy.Task1;

import by.itAcademy.Task1.atl.BelarusBank;
import by.itAcademy.Task1.atl.TinkovBank;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {

        System.out.println("What ATL do you want to use? \nEnter: " +
                "\n\"1\" if you want to use BelarusBank" +
                "\n\"2\" if you want to use TinkovBank" +
                "\n\"any other number\" for exit");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        switch (input) {
            case 1: {
                BelarusBank bb = new BelarusBank(12,4,6);
                bb.name();
                bb.producer();
                System.out.println("Thank you for choosing BelarusBank, enter 1 for to put cash or 2 for to take off: ");
                int input2 = scanner.nextInt();
                switch (input2) {
                    case 1: {
                        System.out.println("What amount do you want to put? ");
                        bb.putCash(scanner.nextInt());
                        break;
                    }
                    case 2: {
                        System.out.println("What amount do you want to take off? ");
                        bb.takeOffCash(scanner.nextInt());
                        break;
                    }
                    default: {
                        System.out.println("Incorrect entry of 1 or 2 only!");
                    }

                }
                break;
            }
            case 2: {
                TinkovBank tb = new TinkovBank(7,5,4);
                tb.name();
                tb.producer();
                System.out.println("Thank you for choosing TinkovBank, you can only to put cash! What amount do you want to put? ");
                tb.putCash(scanner.nextInt());
                break;
            }
            default: {
                System.out.println("Thank you, come again!");
                break;
            }
        }





    }
}
