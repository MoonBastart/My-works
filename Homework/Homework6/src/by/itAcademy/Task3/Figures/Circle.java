package by.itAcademy.Task3.Figures;

import by.itAcademy.Task3.Figure;

public class Circle extends Figure {

    private double r; //радиус

    public Circle(double r) {
        this.r = r;
    }

    public double getSqr() {
        return 2 * Math.PI * Math.pow(r, 2);
    }
}
