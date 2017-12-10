package by.itAcademy.calculator;

public class MyExeptions extends Exception {

    private String russiaMessageMath;

    public MyExeptions(String russiaMessageMath) {
        this.russiaMessageMath = russiaMessageMath;
    }

    public String getRussiaMessageMath() {
        return russiaMessageMath;
    }
}
