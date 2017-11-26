package by.it_academy.task1.tv.with3D.active3D;

import by.it_academy.task1.tv.with3D.With3D;

public class Active3D extends With3D {
    private double powerGlasses;

    public Active3D(double powerConsumption, boolean frequencyOfUse, double a, double b, double c, double diagonal, int year, String manufacturer, int quanityGlasses, double powerGlasses) {
        super(powerConsumption, frequencyOfUse, a, b, c, diagonal, year, manufacturer, quanityGlasses);
        this.powerGlasses = powerGlasses;
    }

    public double getPowerGlasses() {
        return powerGlasses;
    }

    public void setPowerGlasses(double powerGlasses) {
        this.powerGlasses = powerGlasses;
    }
}
