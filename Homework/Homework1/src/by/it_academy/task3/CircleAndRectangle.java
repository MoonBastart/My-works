package by.it_academy.task3;

public class CircleAndRectangle {
    public static void main (String[] arg) {


        short a = 7;
        short b = 13;

        short r = 19;

        if (Math.sqrt(a * a + b * b) < r * 2) {
            System.out.println("Congratulate, the circle covers this rectangle");
        } else {
            System.out.println("Bad news, the circle does not cover this rectangle");
        }


    }
}
