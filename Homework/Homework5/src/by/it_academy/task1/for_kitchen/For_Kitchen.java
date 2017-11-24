package by.it_academy.task1.for_kitchen;

import by.it_academy.task1.Appliances;

public class For_Kitchen extends Appliances {
    private boolean more20kg;

    public For_Kitchen(double powerConsumption, boolean frequencyOfUse, double a, double b, double c, boolean more20kg) {
        super(powerConsumption, frequencyOfUse, a, b, c);
        this.more20kg = more20kg;
    }

    public boolean isMore20kg() {
        return more20kg;
    }

    public void setMore20kg(boolean more20kg) {
        this.more20kg = more20kg;
    }
}
