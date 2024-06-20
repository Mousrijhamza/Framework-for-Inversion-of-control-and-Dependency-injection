
package mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}bean" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bean"
})
@XmlRootElement(name = "beans")
public class Beans {

    @XmlElement(name = "bean",required = true)
    protected List<Bean> bean;

    public List<Bean> getBean() {
        if (bean == null) {
            bean = new ArrayList<Bean>();
        }
        return this.bean;
    }
    public void setBeans(List<Bean> beans) {
        this.bean = beans;
    }

}
