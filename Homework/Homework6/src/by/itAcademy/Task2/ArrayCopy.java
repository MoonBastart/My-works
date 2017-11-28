package by.itAcademy.Task2;

public class ArrayCopy {
    public static void main(String[] arg) {

        int[] justArray1 = new int[10];
        for(int i = 0; i < justArray1.length; i++){
            justArray1[i] = -17 + (int)(Math.random()*83);
        }

        int[] justArray2 = new int[20];
        for(int i = 0; i < justArray2.length; i++){
            justArray2[i] = -17 + (int)(Math.random()*83);
        }

        System.out.print("Array 1: [");
        for(int i = 0; i < justArray1.length - 1; i++) {
            System.out.print(justArray1[i] + ", ");
        }
        System.out.print(justArray1[justArray1.length - 1] + "]");

        System.out.print("\n\nArray 2: [");
        for(int i = 0; i < justArray2.length - 1; i++) {
            System.out.print(justArray2[i] + " ");
        }
        System.out.print(justArray2[justArray2.length - 1] + "]");

        System.out.print("\n\nArray 2 new: [");
        System.arraycopy(justArray1, 0, justArray2, justArray2.length/2 - justArray1.length/2,justArray1.length);
        for(int i = 0; i < justArray2.length - 1; i++) {
            System.out.print(justArray2[i] + " ");
        }
        System.out.print(justArray2[justArray2.length - 1] + "]");


    }
}
