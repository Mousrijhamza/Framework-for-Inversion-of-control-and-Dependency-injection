
package mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "property"
})
@XmlRootElement(name = "bean")
public class Bean {
    @XmlElement(name="property")
    protected List<Property> property;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "classe", required = true)
    protected String classe;


    public List<Property> getProperty() {
        if (property == null) {
            property = new ArrayList<Property>();
        }
        return this.property;
    }
    public String getId() {
        return id;
    }
    public void setId(String value) {
        this.id = value;
    }
    public String getClasse() {
        return classe;
    }
    public void setClasse(String value) {
        this.classe = value;
    }
}

