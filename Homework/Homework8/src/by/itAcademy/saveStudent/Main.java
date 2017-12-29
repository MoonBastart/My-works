package by.itAcademy.saveStudent;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String[] arg) {

        try(FileReader reader = new FileReader("C:\\Users\\Bastart\\Desktop\\Private project\\My-works\\Homework\\Homework8\\Students.txt"))
        {
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());

            List<Student> studentList = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            int inputMain = 1;
            while(inputMain == 1) {
                //Считываете с клавиатуры
                System.out.println("Enter 1 for create new student or some other for exit program: ");
                int input = scanner.nextInt();
                if (input == 1) {
                    System.out.println("Enter name: ");
                    String name = scanner.next();
                    System.out.println("Enter age: ");
                    int age = scanner.nextInt();
                    Student student = new Student(name, age);
                    studentList.add(student);
                } else {
                    System.out.println("Program closing!");
                    break;
                }
            }
            try(FileWriter writer = new FileWriter("C:\\Users\\Bastart\\Desktop\\Private project\\My-works\\Homework\\Homework8\\Students.txt", false))
            {
                writer.write("List of students:\n");
                int count = 0;
                for(Student student: studentList) {
                    count = count + 1;
                    writer.write("\nStudent " + count);
                    writer.write("\nname of student is " + student.getName());
                    writer.write("\nage of student is " + student.getAge());
                    writer.write("\n___________");
                }
                writer.flush();
            }
            catch(IOException ex){

                System.out.println(ex.getMessage());
            }
        }


    }
}
