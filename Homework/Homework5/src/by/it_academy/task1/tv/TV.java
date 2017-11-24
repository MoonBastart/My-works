package by.it_academy.task1.tv;

import by.it_academy.task1.Appliances;

public class TV extends Appliances {

    private double diagonal;
    private int year;
    private String manufacturer;

    public TV(double powerConsumption, boolean frequencyOfUse, double a, double b, double c, double diagonal, int year, String manufacturer) {
        super(powerConsumption, frequencyOfUse, a, b, c);
        this.diagonal = diagonal;
        this.year = year;
        this.manufacturer = manufacturer;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
