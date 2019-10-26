package demo1;

public class Dog extends Animal {
    private double tail;

    public Dog(String name, String color, double tail) {
        super(name, color);
        this.tail = tail;
    }

    public Dog(double tail) {
        this.tail = tail;
    }

    public double getTail() {
        return tail;
    }

    public void setTail(double tail) {
        this.tail = tail;
    }

    @Override
    public String getVoice() {
        //return super.getVoice();
        return "Jestem psem";
    }
}
