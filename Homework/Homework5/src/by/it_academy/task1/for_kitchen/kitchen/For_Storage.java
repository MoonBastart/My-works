package by.it_academy.task1.for_kitchen.kitchen;

import by.it_academy.task1.for_kitchen.For_Kitchen;

public class For_Storage extends For_Kitchen {
    private double minTemperature;

    public For_Storage(double powerConsumption, boolean frequencyOfUse, double a, double b, double c, boolean more20kg, double minTemperature) {
        super(powerConsumption, frequencyOfUse, a, b, c, more20kg);
        this.minTemperature = minTemperature;
    }

    public double getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(double minTemperature) {
        this.minTemperature = minTemperature;
    }
}
