package by.it_academy.task1;

public class Appliances {

    private double powerConsumption;
    private boolean frequencyOfUse;
    private double size;

    //size
    private double a;
    private double b;
    private double c;

    public Appliances(double powerConsumption, boolean frequencyOfUse, double a, double b, double c) {
        this.powerConsumption = powerConsumption;
        this.frequencyOfUse = frequencyOfUse;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public boolean isFrequencyOfUse() {
        return frequencyOfUse;
    }

    public void setFrequencyOfUse(boolean frequencyOfUse) {
        this.frequencyOfUse = frequencyOfUse;
    }

    public double getSize() {
        return size = a * b * c;
    }

    public void setSize(double size) {
        this.size = a * b * c;
    }
}
