package by.itAcademy.date;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {

        Student[] studentArray = new Student[3];

        Scanner scanner = new Scanner(System.in);

        SimpleDateFormat pattern = new SimpleDateFormat("dd.MM.yyyy");

        Student student1 = new Student();

        System.out.println("Enter information of student 1");

        surname();
        student1.setSurname(scanner.next());
        name();
        student1.setName(scanner.next());
        birth();
        String birthD1 = scanner.next();
        Date date1;

        try {
            date1 = pattern.parse(birthD1);
            student1.setBirth(date1);
        } catch (Exception e) {
            error();
        }

        Student student2 = new Student();

        System.out.println("\nEnter information of student 2");

        surname();
        student2.setSurname(scanner.next());
        name();
        student2.setName(scanner.next());
        birth();
        String birthD2 = scanner.next();
        Date date2;

        try {
            date2 = pattern.parse(birthD2);
            student2.setBirth(date2);
        } catch (Exception e) {
            error();
        }

        Student student3 = new Student();

        System.out.println("\nEnter information of student 3");

        surname();
        student3.setSurname(scanner.next());
        name();
        student3.setName(scanner.next());
        birth();
        String birthD3 = scanner.next();
        Date date3;

        try {
            date3 = pattern.parse(birthD3);
            student1.setBirth(date3);
        } catch (Exception e) {
            error();
        }

        studentArray[0] = student1;
        studentArray[1] = student2;
        studentArray[2] = student3;

        GregorianCalendar calendar = new GregorianCalendar();

        int[] month = new int[studentArray.length];
        int[] year = new int[studentArray.length];

        for (int i = 0; i < studentArray.length; i++) {
            if (calendar.get(Calendar.DAY_OF_MONTH) < studentArray[i].getBirth().getDate()) {
                if (calendar.get(Calendar.MONTH) <= studentArray[i].getBirth().getMonth()) {
                    month[i] = calendar.get(Calendar.MONTH) - 1 + 12 - studentArray[i].getBirth().getMonth();
                    year[i] = calendar.get(Calendar.YEAR) - 1 - (studentArray[i].getBirth().getYear() + 1900);
                } else {
                    month[i] = calendar.get(Calendar.MONTH) - 1 - studentArray[i].getBirth().getMonth();
                    year[i] = calendar.get(Calendar.YEAR) - (studentArray[i].getBirth().getYear() + 1900);
                }
            } else {
                if (calendar.get(GregorianCalendar.MONTH) < studentArray[i].getBirth().getMonth()) {
                    month[i] = calendar.get(Calendar.MONTH) + 12 - studentArray[i].getBirth().getMonth();
                    year[i] = calendar.get(Calendar.YEAR) - 1 - (studentArray[i].getBirth().getYear() + 1900);
                } else {
                    month[i] = calendar.get(Calendar.MONTH) - studentArray[i].getBirth().getMonth();
                    year[i] = calendar.get(Calendar.YEAR) - (studentArray[i].getBirth().getYear() + 1900);
                }
            }
        }
        System.out.println(year[0] + " " + year[1] + " " + year[2]);



        }



    public static void name() {
        System.out.print("Enter name of student: ");
    }

    public static void surname() {
        System.out.print("Enter surname of student: ");
    }

    public static void birth() {
        System.out.print("Enter date of birth in the format \"dd.MM.yyyy\": ");
    }

    public static void error() {
        System.out.println("The format is wrong!");
    }
}
