package mypackage2;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "bean")
public class bean {
    private int id;
    private String classe;
    private List<property> properties;

    @XmlAttribute(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlAttribute(name = "classe")
    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    @XmlElement(name = "property")
    public List<property> getProperty() {
        return properties;
    }

    public void setProperty(List<property> properties) {
        this.properties = properties;
    }
}