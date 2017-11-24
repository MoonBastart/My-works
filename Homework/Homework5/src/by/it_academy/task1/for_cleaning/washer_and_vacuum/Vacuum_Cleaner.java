package by.it_academy.task1.for_cleaning.washer_and_vacuum;

import by.it_academy.task1.for_cleaning.For_Cleaning;

public class Vacuum_Cleaner extends For_Cleaning {
    private double powerOfPump;

    public Vacuum_Cleaner(double powerConsumption, boolean frequencyOfUse, double a, double b, double c, double noseLevel, double powerOfPump) {
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
