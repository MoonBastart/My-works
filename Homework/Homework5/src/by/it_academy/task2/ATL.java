package by.it_academy.task2;

public class ATL {

    final int den20 = 20;
    final int den50 = 50;
    final int den100 = 100;

    private int counter100;
    private int counter50;
    private int counter20;

    public ATL(int counter100, int counter50, int counter20) {
        this.counter100 = counter100;
        this.counter50 = counter50;
        this.counter20 = counter20;
    }

    public int getDen20()
    {
        return den20;
    }

    public int getDen50() {
        return den50;
    }

    public int getDen100() {
        return den100;
    }

    public int getCounter100() {
        return counter100;
    }

    public void setCounter100(int counter100) {
        this.counter100 = counter100;
    }

    public int getCounter50() {
        return counter50;
    }

    public void setCounter50(int counter50) {
        this.counter50 = counter50;
    }

    public int getCounter20() {
        return counter20;
    }

    public void setCounter20(int counter20) {
        this.counter20 = counter20;
    }
}
