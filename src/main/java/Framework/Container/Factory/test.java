package Framework.Container.Factory;

import org.jdom2.JDOMException;

import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException, JDOMException {
        AbstractFactory factory=new FactoryImpl();
        AbstractPlugin plugin= factory.createMyBean();
        plugin.beanCreation();
    }



}
