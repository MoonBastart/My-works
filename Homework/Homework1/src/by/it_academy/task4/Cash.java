package by.it_academy.task4;

public class Cash {
    public static void main (String[] arg) {


        short cash = 650;
        String result;
        switch (cash % 10) {
            case 0: result = cash + " рублей";
                break;
            case 1: result = cash + " рубль";
                break;
            case 2: result = cash + " рубля";
                break;
            case 3: result = cash + " рубля";
                break;
            case 4: result = cash + " рубля";
                break;
            case 5: result = cash + " рублей";
                break;
            case 6: result = cash + " рублей";
                break;
            case 7: result = cash + " рублей";
                break;
            case 8: result = cash + " рублей";
                break;
            case 9: result = cash + " рублей";
                break;

            default: result = "Mistake";
                break;
        }
        System.out.println(result);


    }
}
