package by.it_academy.task1.audio.type_audio;

import by.it_academy.task1.audio.Audio;

public class Not_Portable extends Audio {

    private double blockPower;

    public Not_Portable(double powerConsumption, boolean frequencyOfUse, double a, double b, double c, double soundPower, double blockPower) {
        super(powerConsumption, frequencyOfUse, a, b, c, soundPower);
        this.blockPower = blockPower;
    }

    public double getBlockPower() {
        return blockPower;
    }

    public void setBlockPower(double blockPower) {
        this.blockPower = blockPower;
    }
}
