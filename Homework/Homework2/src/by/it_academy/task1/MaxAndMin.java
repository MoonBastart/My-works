package by.it_academy.task1;

public class MaxAndMin {
    public static void main (String[] arg) {


        //Test
        //int[] justArray = {1, 6, -4, -3, 4, 17, 13, 81, 5, 2};
        //int[] justArray = {8, 26, 21, 0, -54, 47, 9, 18, -7, 33};
        //int[] justArray = {-7, 15, -1, 21, 2, 12, 11, 19, -8, 4};


        int[] justArray1 = new int[10];
        for(int i = 0; i < justArray1.length; i++){
            justArray1[i] = -17 + (int)(Math.random()*83);
        }

        System.out.print("Normal array: [");

        for (int i = 0; i < justArray1.length - 1; i++) {
            System.out.print(justArray1[i] + ", ");
        }
        System.out.println(justArray1[justArray1.length - 1] + "]");

        int minNumber = justArray1[0];

        for (int i = 0; i < justArray1.length; i++) {
            if (minNumber > justArray1[i])
                minNumber = justArray1[i];
        }

        System.out.println("The minimum value of array is " + minNumber);

        //minNumber = 0;

        for (int i = 0; i < justArray1.length; i++) {
            if (minNumber == justArray1[i])
                justArray1[i] = 0;
        }


        int maxNumber = justArray1[0];

        for (int i = 0; i < justArray1.length; i++) {
            if (maxNumber < justArray1[i])
                maxNumber = justArray1[i];
        }

        System.out.println("The maximum value of array is " + maxNumber);

        //maxNumber = 99;

        for (int i = 0; i < justArray1.length; i++) {
            if (maxNumber == justArray1[i])
                justArray1[i] = 99;
        }


        System.out.print("Altered array: ");
        System.out.print("[");
        for (int i = 0; i < justArray1.length - 1; i++) {
            System.out.print(justArray1[i] + ", ");
        }
        System.out.print(justArray1[9]);
        System.out.println("]");


    }
}
