package Framework.Container.Factory;

import Framework.Container.Bean;
import org.jdom2.JDOMException;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public interface AbstractPlugin {
    public void beanCreation(String path) throws Exception;

    Bean getBean();
}
