
import java.util.ArrayList;
// import java.util.Comparator;

public class Box<T extends Fruits> {
    private ArrayList<T> box = new ArrayList<>();

    // public Box() {

    // }

    public float getWeight() {
        float weight = 0.0f;
        for (T o : box) {
            weight += o.getWeight();
        }
        return weight;
    }

    @SuppressWarnings("rawtypes")
    public boolean compare(Box anotherBox) {
        if (getWeight() == anotherBox.getWeight())
            return true;
        return false;
    }

    public void pourTo(Box<T> anotherBox) {
        anotherBox.box.addAll(box);
        box.clear();
    }

    public void addFruits(T fruit, int amount) {
        if (box.size() != 0) {
            if (fruit.getClass() == box.get(0).getClass()) {

                for (int i = 0; i < amount; i++) {
                    box.add(fruit);
                }
            }
        } else {
            for (int i = 0; i < amount; i++) {
                box.add(fruit);
        }
    }

    // public float compare(Box<T> anotherBox) {
    // try {
    // return this.getWeight().compareTo(anotherBox.getWeight());
    // } catch (Exception e) {
    // throw new UnsupportedOperationException("Unimplemented method 'compare'");
    // }
    // }
}
}