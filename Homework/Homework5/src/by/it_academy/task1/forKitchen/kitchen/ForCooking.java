package by.it_academy.task1.forKitchen.kitchen;

import by.it_academy.task1.forKitchen.ForKitchen;

public class ForCooking extends ForKitchen {
    private double maxTemperature;

    public ForCooking(double powerConsumption, boolean frequencyOfUse, double a, double b, double c, boolean more20kg, double maxTemperature) {
        super(powerConsumption, frequencyOfUse, a, b, c, more20kg);
        this.maxTemperature = maxTemperature;
    }

    public double getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(double maxTemperature) {
        this.maxTemperature = maxTemperature;
    }
}
