package by.it_academy.task1.tv.with_3D.active_3D;

import by.it_academy.task1.tv.with_3D.With_3D;

public class Active_3D extends With_3D {
    private double powerGlasses;

    public Active_3D(double powerConsumption, boolean frequencyOfUse, double a, double b, double c, double diagonal, int year, String manufacturer, int quanityGlasses, double powerGlasses) {
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
