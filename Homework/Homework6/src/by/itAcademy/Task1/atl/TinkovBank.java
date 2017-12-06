package by.itAcademy.Task1.atl;

import by.itAcademy.Task1.ATL;

public class TinkovBank extends ATL {

    private int counter100;
    private int counter50;
    private int counter20;

    private int counter100new;
    private int counter50new;
    private int counter20new;

    boolean possible;

    public TinkovBank(int counter100, int counter50, int counter20) {
        this.counter100 = counter100;
        this.counter50 = counter50;
        this.counter20 = counter20;
    }

    public void putCash(int sumPut) {

        if (sumPut % 10 != 0 || sumPut < super.getDen20() || sumPut == 30) {
            possible = false;
        } else {
            possible = true;
        }

        if (sumPut % super.getDen100() == 70 || sumPut % super.getDen100() == 90) {
            counter50new = counter50 + sumPut % super.getDen100() / super.getDen50();
            counter20new = counter20 + (sumPut % super.getDen100() - super.getDen50()) / super.getDen20();
        } else {
            if (sumPut % super.getDen100() == super.getDen50()) {
                counter50new = counter50 + 1;
                counter20new = counter20;
            } else {
                counter50new = counter50 + 0;
                counter20new = counter20 + (sumPut % super.getDen100()) / super.getDen20();
            }
        }

        if (sumPut % super.getDen100() == 10 || sumPut % super.getDen100() == 30) {
            counter100new = counter100 + sumPut / super.getDen100() - 1;
            counter50new = counter50 + 1;
            counter20new = counter20 + (sumPut % super.getDen100() + super.getDen100() - super.getDen50()) / super.getDen20();
        } else {
            counter100new = counter100 + sumPut / super.getDen100();
        }

        if (possible == false) {
            System.out.println("Wrong amount of money\n");
        } else {
            System.out.println("The ATM now has a number denominations:\n" +
                    "of 100 - " + counter100new + " notes\n" +
                    "of 50 - " + counter50new + " notes\n" +
                    "of 20 - " + counter20new + " notes\n" +
                    "The commission is " + Math.round(sumPut * commission()));
        }

    }

    public double commission() {
        return 0.10;
    }

    public void name() {
        String name = "TinkovBank";
        System.out.println("The name of bank is " + "\"" + name + "\"");
    }

    public void producer() {
        String producer = "Soft iron";
        System.out.println("The name of producer is " + "\"" + producer + "\"");
    }

}
