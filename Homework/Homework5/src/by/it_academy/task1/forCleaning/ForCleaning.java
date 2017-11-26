package by.it_academy.task1.forCleaning;

import by.it_academy.task1.Appliances;

public class ForCleaning extends Appliances {
    private double noseLevel;

    public ForCleaning(double powerConsumption, boolean frequencyOfUse, double a, double b, double c, double noseLevel) {
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
