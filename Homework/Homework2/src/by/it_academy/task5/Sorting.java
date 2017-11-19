package by.it_academy.task5;

import java.util.Arrays;
import java.util.Collections;

public class Sorting {
    public static void main (String[] arg) {


        Integer[] justArray5 = new Integer[10];
        for(int i = 0; i < justArray5.length; i++){
            justArray5[i] = -9 + (int)(Math.random()*17);
        }

        System.out.print("Normal array: [");

        for (int i = 0; i < justArray5.length - 1; i++) {
            System.out.print(justArray5[i] + ", ");
        }
        System.out.println(justArray5[justArray5.length - 1] + "]");


        System.out.print("Sorted: [");

        Arrays.sort(justArray5, Collections.reverseOrder());

        for(int i = 0; i <  justArray5.length - 1; i++) {
            System.out.print(justArray5[i] + ", ");
        }
        System.out.println(justArray5[justArray5.length - 1] + "]");


    }
}
