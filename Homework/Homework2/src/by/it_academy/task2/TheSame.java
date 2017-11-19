package by.it_academy.task2;

public class TheSame {
    public static void main (String[] arg) {


        int[] justArray2 = new int[] {7, 26, 4, 3, 4, 17, 13, 7, 7, 4}; //works only for positive values

        System.out.print("Array: [");

        for (int i = 0; i < justArray2.length - 1; i++) {
            System.out.print(justArray2[i] + ", ");
        }
        System.out.println(justArray2[justArray2.length - 1] + "]");

        int max = justArray2[0];
        for (int i = 0; i < justArray2.length; i++) {
            if (max < justArray2[i])
                max = justArray2[i];
        }

        int[] counter = new int[max + 1];

        for (int i = 0; i < justArray2.length; i++) {
            counter[justArray2[i]]++;
        }

        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > 1) {
                System.out.println("[" + i + "] повторений [" + counter[i] + "]");
            }
        }


    }
}
