package by.it_academy.task2;

public class Pages {

    public static void main (String[] arg) {

        int quantityPages = 0;
        quantityPages = Pages(250);
        System.out.println("Need " + quantityPages + " pages");


   }



   public static int Pages(int quantityNews) {

        int qPages;
        if (quantityNews % 10 == 0) {
            qPages = quantityNews / 10;
        } else {
            qPages = quantityNews / 10 + 1;
        }

        return qPages;
   }
}
