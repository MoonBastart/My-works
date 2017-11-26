package by.it_academy.task1.forKitchen.kitchen;

import by.it_academy.task1.forKitchen.ForKitchen;

public class ForStorage extends ForKitchen {
    private double minTemperature;

    public ForStorage(double powerConsumption, boolean frequencyOfUse, double a, double b, double c, boolean more20kg, double minTemperature) {
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
