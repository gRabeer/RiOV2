public class Main {
    public static void main(String[] args) {
        Box<Orange> or = new Box<>();
        Box<Orange> or1 = new Box<>();
        Box<Apple> ap = new Box<>();
        Box<Apple> ap1 = new Box<>();
        or.addFruit(new Orange(), 10);
        or1.addFruit(new Orange(), 12);
        ap.addFruit(new Apple(), 8);
        ap1.addFruit(new Apple(), 4);
        System.out.println("Start weight all box");
        System.out.println("Box 1: " + or.getWeight());
        System.out.println("Box 2: " + or1.getWeight());
        System.out.println("Box 3: " + ap.getWeight());
        System.out.println("Box 4: " + ap1.getWeight());
        or.pourTo(or1);
        ap.pourTo(ap1);
        System.out.println("Weight box for drops: ");
        System.out.println("Box 1: " + or.getWeight());
        System.out.println("Box 2: " + or1.getWeight());
        System.out.println("Box 3: " + ap.getWeight());
        System.out.println("Box 4: " + ap1.getWeight());

    }
}


