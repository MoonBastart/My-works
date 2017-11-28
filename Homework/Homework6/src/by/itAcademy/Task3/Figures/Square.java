package by.itAcademy.Task3.Figures;

import by.itAcademy.Task3.Figure;

public class Square extends Figure {

    private double a; //сторона

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double getSqr() {
        return Math.pow(a, 2);
    }
}
