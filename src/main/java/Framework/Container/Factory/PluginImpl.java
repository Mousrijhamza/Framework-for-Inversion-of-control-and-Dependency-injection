package Framework.Container.Factory;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class PluginImpl implements AbstractPlugin {

    @Override
    public void beanCreation() throws IOException, JDOMException {
        // traitement de Xml.config

        //1er je dois naviguer vers le config.Xml et extraire les classes des beans
        //c'est possible avec Jdom Api java pour manipuler le Config.XML
        //importer l'essentiel avec maven (SAX parseur)
        //allons y

        SAXBuilder sb = new SAXBuilder();
        Document document = sb.build(new File("C:/Users/Hamza/eclipse-workspace/Exercices_TP/SPRING_XML_ANNOTATION/FrameWork_pour_IOC_et_DI/src/main/java/Framework/Container/Factory/config.xml"));

        Element racine = document.getRootElement();
        List<Element> children = racine.getChildren("bean");

        System.out.println("Affichage des éléments:");
        for (Element e : children) {
            /* Afficher les attributs de l'élément bean */
            System.out.println("Bean id: " + e.getAttributeValue("id"));
            System.out.println("Bean classe: " + e.getAttributeValue("classe"));
            List<Element> properties = e.getChildren("property");
            for (Element property : properties) {
                System.out.println("Property id: " + property.getAttributeValue("id"));
                System.out.println("Property ref: " + property.getAttributeValue("ref"));
            }
        }
    }
}
