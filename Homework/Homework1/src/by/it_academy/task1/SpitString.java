package by.it_academy.task1;

public class SpitString {
    public static void main (String [] args) {

        String phrase = "Speak what you think";
        int length = phrase.length();
        System.out.println("Длина строки равна " + length);

        String path1 = phrase.substring(0, length / 2);
        String path2 = phrase.substring(length / 2, length);
        System.out.println(path1);
        System.out.println(path2);

    }
}
