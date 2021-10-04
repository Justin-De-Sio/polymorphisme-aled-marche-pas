package justin;

@FunctionalInterface
interface Flyable {
    void fly(String energy);

    default void test() {
        System.out.println("test par defaut");
    }
}
