package by.itAcademy.forCreateFile;

import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] arg) {
        try(FileReader reader = new FileReader("C:\\Users\\Bastart\\Desktop\\Private project\\My-works\\Homework\\Homework7\\ForData.txt") {
            int c;
            while((c = reader.read()) != -1) {
                System.out.print((char)c);
            }
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
