package by.it_academy.task1.forCleaning.washerAndVacuum;

import by.it_academy.task1.forCleaning.ForCleaning;

public class VacuumCleaner extends ForCleaning {
    private double powerOfPump;

    public VacuumCleaner(double powerConsumption, boolean frequencyOfUse, double a, double b, double c, double noseLevel, double powerOfPump) {
        super(powerConsumption, frequencyOfUse, a, b, c, noseLevel);
        this.powerOfPump = powerOfPump;
    }

    public double getPowerOfPump() {
        return powerOfPump;
    }

    public void setPowerOfPump(double powerOfPump) {
        this.powerOfPump = powerOfPump;
    }
}
