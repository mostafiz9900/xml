package beSkilled;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class ex {

    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("Company");
            doc.appendChild(rootElement);

            //staff element 
            Element staff = doc.createElement("Staff");
            rootElement.appendChild(staff);

            //set attribute to staff element
            Attr attr = doc.createAttribute("id");
            attr.setValue("1");
            staff.setAttributeNode(attr);

//           Attr attr2=doc.createAttribute("name");
//            attr.setValue("2");
//           staff.setAttributeNode(attr2);
            //firstname elements
            Element firstname = doc.createElement("firstname");
            firstname.appendChild(doc.createTextNode("Mostafizur"));
            staff.appendChild(firstname);

            //lastname elements
            Element lastname = doc.createElement("firstname");
            lastname.appendChild(doc.createTextNode("Rahman"));
            staff.appendChild(lastname);

            //nickname elements
            Element nickname = doc.createElement("nickname");
            nickname.appendChild(doc.createTextNode("MR"));
            staff.appendChild(nickname);

            //salary elements
            Element salary = doc.createElement("salary");
            salary.appendChild(doc.createTextNode("25000"));
            staff.appendChild(salary);

            //write the content into xml file
            TransformerFactory transFromFactory = TransformerFactory.newInstance();
            Transformer trsnsFormer = transFromFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("D:\\My_Git\\xml\\xml_read\\src\\beSkilled\\comp.xml"));
            //output to console for testing
            //streamResult result=new StreamResult(System.out)
            trsnsFormer.transform(source, result);
            System.out.println("file saved!");
        } catch (Exception e) {
        }
    }
}
