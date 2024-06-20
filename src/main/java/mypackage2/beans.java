package mypackage2;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "beans")
public class beans {
    private List<bean> beanList;

    @XmlElement(name = "bean")
    public List<bean> getBean() {
        return beanList;
    }

    public void setBean(List<bean> beanList) {
        this.beanList = beanList;
    }
}