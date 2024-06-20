package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class Property {

    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "ref", required = true)
    protected String ref;
    public String getId() {
        return id;
    }
    public void setId(String value) {
        this.id = value;
    }

    public String getRef() {
        return ref;
    }
    public void setRef(String value) {
        this.ref = value;
    }

}
