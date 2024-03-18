
public class Program {
    public static void main(String[] args) {
        Box<Orange> or = new Box<>();
        Box<Orange> or1 = new Box<>();
        Box<Apple> ap = new Box<>();
        Box<Apple> ap1 = new Box<>();
        Box<Fruits> test = new Box<>();
        or.addFruits(new Orange(), 10);
        or1.addFruits(new Orange(), 13);
        ap.addFruits(new Apple(), 5);
        ap1.addFruits(new Apple(), 7);
        test.addFruits(new Orange(), 9);
        test.addFruits(new Apple(), 5);
        System.out.println("Box 1: " + or.getWeight());
        System.out.println("Box 2: " + or1.getWeight());
        System.out.println("Box 3: " + ap.getWeight());
        System.out.println("Box 4: " + ap1.getWeight());
        System.out.println("Box test: " + test.getWeight());
        System.out.println("'e' - compare(): ");
        System.out.println("Box 1 equals box 3: " + or.compare(ap));
        System.out.println("Box 2 equals box 4: " + or1.compare(ap1));
        or.pourTo(or1);
        ap.pourTo(ap1);
        System.out.println("'d' - getWeight(): ");
        System.out.println("Box 1: " + or.getWeight());
        System.out.println("Box 2: " + or1.getWeight());
        System.out.println("Box 3: " + ap.getWeight());
        System.out.println("Box 4: " + ap1.getWeight());
    }
    
}
