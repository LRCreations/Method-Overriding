public class Human {
    void run() {
        System.out.println("Human can eat!");
    }
}
class LR extends Human {
    void run() {
        System.out.println("LR can eat!");
    }
    public static void main(String[] args) {
        LR l = new LR();
        l.run();
    }
}
