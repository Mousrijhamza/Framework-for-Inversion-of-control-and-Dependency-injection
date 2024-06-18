package Test;
import org.jdom2.*;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import java.io.IOException;

public class App1 {
    public static void main(String[] args) throws IOException {
        Element racine=new Element("Personne");
        Document document=new Document(racine);
        Element child=new Element("Etudiant");
        Element sub_child=new Element("nom");
        sub_child.setText("Kati");
        Attribute attribute=new Attribute("classe", "P2");
        child.addContent(sub_child);
        child.setAttribute(attribute);
        racine.addContent(child);


        XMLOutputter outputter=new XMLOutputter(Format.getPrettyFormat());
        outputter.output(document, System.out);


    }
}
