package execute;

public class MountainBike extends Bicycle{
    public int seatHeight;

    public MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    public void setHeight(int newHeight) {
        seatHeight = newHeight;
    }

    public void printData() {
        super.showData();
        System.out.println("Seat height is: " + seatHeight);
    }
}
        // Finished at 2:05:37