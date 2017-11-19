package by.it_academy.task4;

public class Sequence {
    public static void main (String[] arg) {


        int k = 1234;
        if(k / 1000 + 1 == (k / 100) % 10 &&
                (k / 100) % 10 + 1 == (k / 10) % 100 % 10 &&
                (k / 10) % 100 % 10 + 1 == k % 1000 % 100 % 10) {
            System.out.println("Yes, these numbers form an increasing sequence");
        } else {
            System.out.println("No, these numbers do not form an increasing sequence");
        }


    }
}
