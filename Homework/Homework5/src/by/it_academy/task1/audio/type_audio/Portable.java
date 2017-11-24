package by.it_academy.task1.audio.type_audio;

import by.it_academy.task1.audio.Audio;

public class Portable extends Audio {

    private double amountOfAutonomus;

    public Portable(double powerConsumption, boolean frequencyOfUse, double a, double b, double c, double soundPower, double amountOfAutonomus) {
        super(powerConsumption, frequencyOfUse, a, b, c, soundPower);
        this.amountOfAutonomus = amountOfAutonomus;
    }

    public double getAmountOfAutonomus() {
        return amountOfAutonomus;
    }

    public void setAmountOfAutonomus(double amountOfAutonomus) {
        this.amountOfAutonomus = amountOfAutonomus;
    }
}
