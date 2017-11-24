package by.it_academy.task1.for_kitchen.kitchen;

import by.it_academy.task1.for_kitchen.For_Kitchen;

public class For_Cooking extends For_Kitchen {
    private double maxTemperature;

    public For_Cooking(double powerConsumption, boolean frequencyOfUse, double a, double b, double c, boolean more20kg, double maxTemperature) {
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
