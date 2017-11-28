package by.itAcademy.Task3.Figures;

import by.itAcademy.Task3.Figure;

public class Triangle extends Figure {

    private double h; //высота
    private double b; //основание

    public Triangle(double h, double b) {
        this.h = h;
        this.b = b;
    }

    @Override
    public double getSqr() {
        return 0.5 * h * b;
    }
}
