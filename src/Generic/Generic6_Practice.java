package Generic;

class Box3<T> {
    private T ob;

    public void set(T o) {
        ob = o;
    }

    public T get() {
        return ob;
    }
}
public class Generic6_Practice {

    public static void main(String[] args) {
        Box3<Integer> box1 = new Box3<>();
        box1.set(99);   // 오토 박싱

        Box3<Integer> box2 = new Box3<>();
        box2.set(55);   // 오토 박싱

        System.out.println(box1.get() + " & " + box2.get()); // 99 & 55

        swapBox(box1, box2);
        System.out.println(box1.get() + " & " + box2.get()); // 55 & 99 (스왑된 결과)
    }

    public static <T> void swapBox(Box3<T> box1, Box3<T> box2) {
        T temp = box1.get();
        box1.set(box2.get());
        box2.set(temp);
    }
}
