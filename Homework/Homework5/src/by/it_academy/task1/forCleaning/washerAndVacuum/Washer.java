package by.it_academy.task1.forCleaning.washerAndVacuum;

import by.it_academy.task1.forCleaning.ForCleaning;

public class Washer extends ForCleaning {
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
