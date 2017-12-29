package by.itAcademy.forCreateFile;

import java.io.FileWriter;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("C:\\Users\\Bastart\\Desktop\\Private project\\My-works\\Homework\\Homework7\\justText.txt", false)) {
            // запись всей строки
            String text = "This is just text of the file!";
            writer.write(text);
            writer.flush();
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}

