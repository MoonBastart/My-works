package by.it_academy.task2;

import jdk.nashorn.internal.ir.annotations.Ignore;

public class TheSame {
    public static void main (String[] arg) {


        float[] justArray2 = new float[] {5, 26, 5, 3, 2, 87, 13, 5, 7, 2};

        boolean notFound = false;
        boolean copy = false;

        for (int i = 0; i < justArray2.length; i++) {
            int counter = 0;

            for (int j = 0; j < justArray2.length; j++) {
                if (justArray2[i] == justArray2[j]) {
                    counter++;
                    if (i > j) {
                        copy = true;
                        break;
                    }
                }
            }
            if (counter > 1 && copy == false) {
                notFound = true;
                System.out.println("[" + justArray2[i] + "] - is repeated " + counter + " times");
            }
            counter = 0;
            copy = false;
        }

        if (notFound == false) {
            System.out.println("Coincidences do not found");
        }


    }
}
