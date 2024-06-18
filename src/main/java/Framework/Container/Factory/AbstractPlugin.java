package Framework.Container.Factory;

import org.jdom2.JDOMException;

import java.io.IOException;

public interface AbstractPlugin {
    public void beanCreation() throws IOException, JDOMException;

}
