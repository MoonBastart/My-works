package by.it_academy.task1.audio;

import by.it_academy.task1.Appliances;

public class Audio extends Appliances {

    private double soundPower;

    public Audio(double powerConsumption, boolean frequencyOfUse, double a, double b, double c, double soundPower) {
        super(powerConsumption, frequencyOfUse, a, b, c);
        this.soundPower = soundPower;
    }

    public double getSoundPower() {
        return soundPower;
    }

    public void setSoundPower(double soundPower) {
        this.soundPower = soundPower;
    }
}
