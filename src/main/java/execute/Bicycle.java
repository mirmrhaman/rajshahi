package execute;

public class Bicycle {
    public int gear;
    public int speed;

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }
    public void applyBreak(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public void showData() {
        System.out.println("Number of gear are + " + gear
                            + "\n"
                            + "speed of bicycle is " + speed);
    }
}
