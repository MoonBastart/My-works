package by.it_academy.task1.tv.with3D;

import by.it_academy.task1.tv.TV;

public class With3D extends TV {
    private int quanityGlasses;

    public With3D(double powerConsumption, boolean frequencyOfUse, double a, double b, double c, double diagonal, int year, String manufacturer, int quanityGlasses) {
        super(powerConsumption, frequencyOfUse, a, b, c, diagonal, year, manufacturer);
        this.quanityGlasses = quanityGlasses;
    }

    public int getQuanityGlasses() {
        return quanityGlasses;
    }

    public void setQuanityGlasses(int quanityGlasses) {
        this.quanityGlasses = quanityGlasses;
    }
}
