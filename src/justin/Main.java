package justin;

public class Main {

    public static void main(String[] args) {
            Vehicle[] vehicles = new Vehicle[4];
            vehicles[0] = new Car();
            vehicles[1] = new Car();
            vehicles[2] = new Glider();
            vehicles[3] = new Moto();
            vehicles[2].fly("vent"); // TODO MARCHE PAS ALED


        Flyable[] flyables= {new Glider(),new Moto()};
        for (Flyable flyable:flyables)
            flyable.fly("vent");

        for (Vehicle vehicle : vehicles)
            System.out.println(vehicle.mMovementSpeed);
        vehicles[2].move(5, 0);

    }

}
