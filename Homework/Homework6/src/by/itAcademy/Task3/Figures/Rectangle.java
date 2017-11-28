package by.itAcademy.Task3.Figures;

import by.itAcademy.Task3.Figure;

public class Rectangle extends Figure {

    private double a; //сторона прямоугольника
    private double b; //сторона прямоугольника

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getSqr() {
        return a * b;
    }
}
