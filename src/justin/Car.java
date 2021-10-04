package justin;

public class Car extends Vehicle {
    public Car() {
        this.mMovementSpeed=180;
    }

    @Override
    public void move(int x, int y) {
        System.out.println("je me déplace en roulant en" + x + " " + y);
    }
}
