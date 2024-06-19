package Framework.Container.Factory;

import Framework.Container.Bean;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class PluginImpl implements AbstractPlugin {


    private Bean bean;

    public Bean getBean() {
        return bean;
    }
    @Override
    public void beanCreation(String path) throws Exception {
        // Traitement de Xml.config
        // 1er je dois naviguer vers le config.Xml et extraire les classes des beans
        // c'est possible avec Jdom Api java pour manipuler le Config.XML
        // importer l'essentiel avec maven (SAX parseur)
        // allons y
        bean = Bean.getBean();
        SAXBuilder sb = new SAXBuilder(); // Api java simple pour le parseur xml
        Document document = sb.build(new File(path));

        Element racine = document.getRootElement();
        List<Element> children = racine.getChildren("bean");

        List<Element> result=getBeansfromConfigXml(children);
        for (Element e : children) {
                 /* Afficher les attributs de l'élément bean */
                 System.out.print("Bean : " + e.getAttributeValue("id"));
                 System.out.print(" " + e.getAttributeValue("classe"));
                 System.out.println(" ");
        }

        // Afficha pour la classe test
        // System.out.println("Affichage des éléments:");
        // for (Element e : children) {
        //     /* Afficher les attributs de l'élément bean */
        //     System.out.print("Bean : " + e.getAttributeValue("id"));
        //     System.out.print(" " + e.getAttributeValue("classe"));
        //     System.out.println(" ");
        //     List<Element> properties = e.getChildren("property");
        //     for (Element property : properties) {
        //         System.out.print("Property.java : " + property.getAttributeValue("id"));
        //         System.out.print(" " + property.getAttributeValue("ref"));
        //         System.out.println(" ");
        //     }
        // }

        // Mettre les beans dans conteneur de notre framework
        // La gestion des beans et l'injection de dependances

        // List<Element> properties = getBeansfromConfigXml(children);
        // if (properties != null) {
        //     for (Element property : properties) {
        //         if (property.) {
        //             // ...
        //         }
        //     }
        // }
    }

    private List<Element> getBeansfromConfigXml(List<Element> children) throws Exception {
        List<Element> properties = null;
        for (Element e : children) {
            /* Afficher les attributs de l'élément bean */
            System.out.print("Bean : " + e.getAttributeValue("id"));
            System.out.print(" " + e.getAttributeValue("classe"));
            System.out.println(" ");
            // Ici vient le rôle de JAXB

            Class<?> beanClass = Class.forName(e.getAttributeValue("classe"));
            Object beanInstance = beanClass.getDeclaredConstructor().newInstance();
            bean.addBean(beanInstance);

            properties = e.getChildren("property");
        }
        return properties;
    }
}
