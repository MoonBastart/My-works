package by.it_academy.task1.audio.memory_Audio;

public class For_Portable extends Memory {
    private double itself; //встроенная память
    private double flash; //флэшка
    private double operational; //оперативная память

    public For_Portable(double itself, double flash, double operational) {
        this.itself = itself;
        this.flash = flash;
        this.operational = operational;
    }

    public double getItself() {
        return itself;
    }

    public void setItself(double itself) {
        this.itself = itself;
    }

    public double getFlash() {
        return flash;
    }

    public void setFlash(double flash) {
        this.flash = flash;
    }

    public double getOperational() {
        return operational;
    }

    public void setOperational(double operational) {
        this.operational = operational;
    }

    public double getMemory() {
        return itself + flash - operational;
    }
}
