package Framework.Container;

import javax.crypto.KeyGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Bean extends HashMap<Integer, Object>{
    private static final Bean instance ;
    private static Map<Integer, Object> mapBeans;
    private final AtomicInteger autoKey= new AtomicInteger(0);

    static {
        instance = new Bean();
    }
    private Bean(){
        mapBeans=new HashMap<>();

    }

    public static Bean getBean(){
        return instance;
    }

    public void addBean(Object object){
        Integer i1= (Integer)autoKey.getAndIncrement();
        mapBeans.put(i1, object);

    }


    public void beanIN() {
        for (Map.Entry<Integer, Object> m : mapBeans.entrySet()) {
            System.out.println("Key : " + m.getKey() + ", Value : " + m.getValue());
        }
    }

    public Map<Integer, Object> getMapBeans() {
        return mapBeans;
    }
}

