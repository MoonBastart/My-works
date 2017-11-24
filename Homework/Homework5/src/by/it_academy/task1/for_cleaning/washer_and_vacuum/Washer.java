package by.it_academy.task1.for_cleaning.washer_and_vacuum;

import by.it_academy.task1.for_cleaning.For_Cleaning;

public class Washer extends For_Cleaning {
    private double turnovers;

    public Washer(double powerConsumption, boolean frequencyOfUse, double a, double b, double c, double noseLevel, double turnovers) {
        super(powerConsumption, frequencyOfUse, a, b, c, noseLevel);
        this.turnovers = turnovers;
    }

    public double getTurnovers() {
        return turnovers;
    }

    public void setTurnovers(double turnovers) {
        this.turnovers = turnovers;
    }
}
