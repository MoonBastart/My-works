package by.it_academy.task3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Inversion {
    public static void main (String[] arg) {


        int [] justArray3 = new int[10];

        justArray3[0] = 4;
        justArray3[1] = 2;
        justArray3[2] = 7;
        justArray3[3] = 9;
        justArray3[4] = 11;
        justArray3[5] = 8;
        justArray3[6] = 3;
        justArray3[7] = 1;
        justArray3[8] = -5;
        justArray3[9] = 18;

        System.out.print("Normal array: [");

        for (int i = 0; i < justArray3.length - 1; i++) {
            System.out.print(justArray3[i] + ", ");
        }
        System.out.println(justArray3[justArray3.length - 1] + "]");


        for (int i = 0; justArray3.length/2 > i; i++) {
            int tmp = justArray3[i];
            justArray3[i] = justArray3[justArray3.length - i - 1];
            justArray3[justArray3.length - i - 1] = tmp;
        }
        System.out.print("Altered array: ");
        System.out.println(Arrays.toString(justArray3));


    }
}
