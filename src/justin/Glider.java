package justin;

public class Glider extends Vehicle implements Flyable {


    @Override
    public void move(int x, int y) {
        System.out.println("je me déplace en " + x + " " + y);
    }


    @Override
    public void fly(String energy) {
        System.out.println("je vole avec :"+energy);
    }

    @Override
    public void test() {
        System.out.println("mon test a moi");
    }
}
