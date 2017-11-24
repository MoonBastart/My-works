package by.it_academy.task1.for_cleaning;

import by.it_academy.task1.Appliances;

public class For_Cleaning extends Appliances {
    private double noseLevel;

    public For_Cleaning(double powerConsumption, boolean frequencyOfUse, double a, double b, double c, double noseLevel) {
        super(powerConsumption, frequencyOfUse, a, b, c);
        this.noseLevel = noseLevel;
    }

    public double getNoseLevel() {
        return noseLevel;
    }

    public void setNoseLevel(double noseLevel) {
        this.noseLevel = noseLevel;
    }
}
