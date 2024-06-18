package Test;

import Framework.Container.Bean;

import java.util.Map;

public class Test_Bean {
    public static void main(String[] args) {
        Integer i=2;
        Integer i2=2;
        Integer i3=2;
        Integer i4=2;
        Bean bean=Bean.getBean();
        bean.addBean(i);
        bean.addBean(i2);
        bean.addBean(i3);
        bean.addBean(i4);
        bean.beanIN();
    }
}
