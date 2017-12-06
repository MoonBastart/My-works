package by.itAcademy.Task1.atl;

import by.itAcademy.Task1.ATL;
import by.itAcademy.Task1.atl.metod.NameAndProducer;
import by.itAcademy.Task1.atl.metod.Put;
import by.itAcademy.Task1.atl.metod.TakeOff;

public class BelarusBank extends ATL implements Put, TakeOff, NameAndProducer {

    private int counter100;
    private int counter50;
    private int counter20;

    private int counter100new;
    private int counter50new;
    private int counter20new;

    boolean possible;

    public BelarusBank(int counter100, int counter50, int counter20) {
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

    public void takeOffCash(int sumTakeOff) {

        int note20;
        int note50;
        int note100;

        if (sumTakeOff % 10 != 0 || sumTakeOff < super.getDen20() || sumTakeOff == 30) {
            possible = false;
        } else {
            possible = true;
        }


        if (sumTakeOff % super.getDen100() == 70 || sumTakeOff % super.getDen100() == 90) {

            note50 = sumTakeOff % super.getDen100() / super.getDen50();
            counter50new = counter50 - note50;

            note20 = (sumTakeOff % super.getDen100() - super.getDen50()) / super.getDen20();
            counter20new = counter20 - note20;

        } else {

            if (sumTakeOff % super.getDen100() == super.getDen50()) {

                note50 = 1;
                counter50new = counter50 - note50;

                note20 = 0;
                counter20new = counter20;

            } else {

                note50 = 0;
                counter50new = counter50 - note50;

                note20 = (sumTakeOff % super.getDen100()) / super.getDen20();
                counter20new = counter20 - note20;

            }
        }

        if (sumTakeOff % super.getDen100() == 10 || sumTakeOff % super.getDen100() == 30) {

            note100 = sumTakeOff / super.getDen100() - 1;
            counter100new = counter100 - note100;

            note50 = 1;
            counter50new = counter50 - note50;

            note20 = (sumTakeOff % super.getDen100() + super.getDen100() - super.getDen50()) / super.getDen20();
            counter20new = counter20 - note20;

        } else {

            note100 = sumTakeOff / super.getDen100();
            counter100new = counter100 - note100;
        }

        if (possible == false) {
            System.out.println("Wrong amount of money\n");
        } else {
            if (counter20new < 0 || counter50new < 0 || counter100new < 0) {
                System.out.println("Sorry, the ATM does not have the requested amount");
            } else {
                System.out.println("You have received a number of denominations of the nominal:\n" +
                        "100 - " + note100 + "\n" +
                        "50 - " + note50 + "\n" +
                        "20 - " + note20 + "\nThe commission is " + Math.round(sumTakeOff * commission()));
            }
        }

    }


    public double commission() {
        return 0.03;
    }

    public void name() {
        String name = "BelarusBank";
        System.out.println("The name of bank is " + "\"" + name + "\"");
    }

    public void producer() {
        String producer = "Riddle steel";
        System.out.println("The name of producer is " + "\"" + producer + "\"");
    }
}
