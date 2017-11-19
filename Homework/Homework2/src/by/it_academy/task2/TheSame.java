package by.it_academy.task2;

import jdk.nashorn.internal.ir.annotations.Ignore;

public class TheSame {
    public static void main (String[] arg) {


        float[] justArray2 = new float[] {7, 26, 4, 3, 12, 17, 13, 8, 7, 4};

        for (int i = 0; i < justArray2.length; i++) {
            int counter = 0;
            for (int j = i; j < justArray2.length; j++) {
                if (justArray2[i] == justArray2[j]) {
                    counter++;
                }
            }
            if (counter > 1) {
                System.out.println("[" + justArray2[i] + "] - is repeated " + counter + " times");
            }
        }


    }
}
