import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class HashS {
    public static void main(String[] args) {

//        HashSet set = new HashSet();
        Set<Integer> s1 = new Set();
        System.out.println("Method ADD: ");
        System.out.println(s1.add(2));
        System.out.println(s1.add(2));
        System.out.println(s1.add(5));

        Random generator = new Random();
        for (int i = 0; i < 10; i++)
        {
            s1.add(generator.nextInt(0, 15));
        }

        System.out.println("Method PRINT: ");
        Iterator<Integer> pt = s1.iterator();
        while (pt.hasNext()) {
            System.out.print(pt.next() + " ");
        }
        System.out.println();
        System.out.println("Size: " + s1.size());

        System.out.println("isEmpty: " + s1.isEmpty());

        s1.clear();
        System.out.println("Size: " + s1.size());

        for (int i = 0; i < 10; i++)
        {
            s1.add(generator.nextInt(0, 100));
        }

        System.out.println("Size: " + s1.size());

        Iterator<Integer> pt1 = s1.iterator();
        while (pt1.hasNext()) {
            System.out.print(pt1.next() + " ");
        }

        System.out.println("");
        System.out.print("toString: " + s1.text());

    }
}
class Set<E> {
    private HashMap<E, Object> set = new HashMap<>();
    private static final Object FIN = new Object();
    public boolean add(E num) {
        return set.put(num, FIN) == null;
    }
    public boolean remove(E num) {
        return set.remove(num) == FIN;
    }
    public int size() {
        return set.size();
    }
    public boolean isEmpty() {
        return set.isEmpty();
    }
    public Iterator<E> iterator() {
        return set.keySet().iterator();
        }
    public void clear() {
        set.clear();
    }
    public Object clone() {
        return set.clone();
    }
    public String text() {
        return set.toString();
    }
}
