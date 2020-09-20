package RubDuck;

public class Duck {
    private int number;

    Duck(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return ""+number;
    }
}
