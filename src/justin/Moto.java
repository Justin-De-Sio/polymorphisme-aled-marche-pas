package justin;

public  class Moto extends Vehicle implements Flyable{
    public Moto() {
        this.mMovementSpeed=250;
    }

    @Override
    public void move(int x, int y) {
        System.out.println("roule vite en"+ x+ " "+y);
    }

    @Override
    public void fly(String energy) {
        System.out.println("wtf to the moon");
    }
}
