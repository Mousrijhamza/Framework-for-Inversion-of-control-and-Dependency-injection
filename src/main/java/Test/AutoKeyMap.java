package Test;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class AutoKeyMap<K, V> extends HashMap<K, V> {
    private final AtomicInteger keyGenerator;

    public AutoKeyMap() {
        super();
        this.keyGenerator = new AtomicInteger(0);
    }

    public K putAuto(V value) {
        K key = (K) Integer.valueOf(keyGenerator.incrementAndGet());
        super.put(key, value);
        return key;
    }

    public static void main(String[] args) {
        AutoKeyMap<Integer, String> autoKeyMap = new AutoKeyMap<>();
        autoKeyMap.putAuto("First Value");
        autoKeyMap.putAuto("Second Value");

        autoKeyMap.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));
    }
}
