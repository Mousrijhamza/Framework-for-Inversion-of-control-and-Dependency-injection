package Framework.Container.Factory;

import org.jdom2.JDOMException;

import java.io.IOException;

public interface AbstractPlugin {
    public void loadBean(String path) throws Exception;

}
