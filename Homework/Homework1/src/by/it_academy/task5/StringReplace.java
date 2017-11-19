package by.it_academy.task5;

public class StringReplace {
    public static void main (String[] arg) {


        String something = "?##?###??####";
        String something1 = something.replace("#", "");
        String something2 = something1.replace("????", "HELLO");
        System.out.println(something2);


    }
}
