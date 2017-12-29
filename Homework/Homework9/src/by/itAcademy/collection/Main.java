package by.itAcademy.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {


        ArrayList<String> things = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int nothing = 1;
        while (nothing == 1) {
            System.out.println("Please, enter new string for array, or enter \"exit\" for stop:");
            String thing = scanner.next();
            boolean exit = thing.equals("exit");
            if (exit == false) {
                things.add(thing);
            } else {
                break;
            }
        }

        System.out.println("ArrayList before changing:" + things);

        System.out.print("ArrayList after changing: [");
        for(int i = 0; i < things.size() - 1; i++) {
            System.out.print(things.get(i).replace("a", "") + ", ");
        }
        System.out.println(things.get(things.size() - 1).replace("a", "") + "]");
    }
}
