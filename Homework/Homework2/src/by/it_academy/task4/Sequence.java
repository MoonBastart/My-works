package by.it_academy.task4;

public class Sequence {
    public static void main (String[] arg) {


        Integer number = 123456789;
        String newNumber = number.toString();
        char [] finalNumber = newNumber.toCharArray();
        boolean found = false;
        for (int i = 0; i < finalNumber.length - 1; i++) {
                if (finalNumber[i] + 1 != finalNumber[i + 1]) {
                    found = true;
                    System.out.println("No, these numbers do not form an increasing sequence");
                    break;
                }
            }
        if (found != true) {
            System.out.println("Yes, these numbers form an increasing sequence");
        }

    }
}
