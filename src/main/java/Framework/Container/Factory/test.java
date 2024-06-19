package Framework.Container.Factory;

import Framework.Container.Bean;
import org.jdom2.JDOMException;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class test {
    public static void main(String[] args) throws Exception {
        String path = "C:\\Users\\Hamza\\eclipse-workspace\\Exercices_TP\\SPRING_XML_ANNOTATION\\FrameWork_pour_IOC_et_DI\\src\\DTD\\config.xml";
        AbstractFactory factory=new FactoryImpl();
        AbstractPlugin plugin= factory.createMyBean();
        plugin.beanCreation(path);
        Bean bean =plugin.getBean();
        bean.beanIN();

    }



}
