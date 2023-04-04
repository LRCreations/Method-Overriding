public class Mobile {
    public void displayName() {
        System.out.println("Smart Mobile");
    }
}
class Samsung extends Mobile {
    @Override
    public void displayName() {
        System.out.println("Samsung Galaxy S23 Ultra");
        super.displayName();
    }
}
class Apple extends Samsung {
    @Override
    public void displayName() {
        System.out.println("Apple iPhone 14 Pro Max");
        super.displayName();
    }
}
class Run {
    public static void main(String[] args) {
        Samsung s = new Samsung();
        Apple a = new Apple();
        s.displayName();
        a.displayName();
    }
}