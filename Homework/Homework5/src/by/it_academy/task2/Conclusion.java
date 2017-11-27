package by.it_academy.task2;

import java.util.Scanner;

public class Conclusion {

    public static void main(String[] arg) {

        int den20 = 20;
        int den50 = 50;
        int den100 = 100;

        int counter100;
        int counter50;
        int counter20;

        System.out.println("Enter the sum received: ");

        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();


        if(sum % den100 == 70 || sum % den100 == 90) {
            counter50 = sum % den100 / den50;
            counter20 = (sum % den100 - den50) / den20;
        } else {
            counter50 = 0;
            counter20 = (sum % den100) / den20;
        }

        if(sum % den100 == 10 || sum % den100 == 30) {
            counter100 = sum / den100 - 1;
            counter50 = 1;
            counter20 = (sum % den100 + den100 - den50) / den20;
        } else {
            counter100 = sum / den100;
        }

        if(sum % 10 != 0 || sum < den20 || sum == 30) {
            System.out.println("Wrong amount of money");
        } else {
            System.out.println("You will receive the amount " + sum + " in the following denominations:\n" +
                    "of 100 - " + counter100 + " notes\n" +
                    "of 50 - " + counter50 + " notes\n" +
                    "of 20 - " + counter20 + " notes");
        }



    }

}
