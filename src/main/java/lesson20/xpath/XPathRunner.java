package lesson20.xpath;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class XPathRunner {
    public static void main(String[] args) throws Exception{
        try(InputStream inputStream = XPathRunner.class.getResourceAsStream("/test.xml")){
            Document xmlDocument = getXML(inputStream);
            XPath xPath = XPathFactory.newInstance().newXPath();
            double avg = (Double) xPath.compile("sum(//Employee/Position/salary) div count(//Employee/Position/salary)").evaluate(xmlDocument, XPathConstants.NUMBER);
            System.out.println("Среднее значение заработной платы: " + avg);
            List<String> s = getEmployeeWithHighSalary(xmlDocument, xPath, (int) avg);
            System.out.println("Сотрудники, у которых зарплата превышает среднее значение: " + s);
        }
    }

    private static List<String> getEmployeeWithHighSalary(Document doc, XPath xpath, int medium) {
        List<String> list = new ArrayList<>();
        try {
            XPathExpression xPathExpression = xpath.compile(
                    "/Employees/Employee/Position[salary>" + medium + "]/ancestor::Employee/Name/text()"
            );
            NodeList nodeList = (NodeList) xPathExpression.evaluate(doc, XPathConstants.NODESET);
            for (int i = 0; i < nodeList.getLength(); i++)
                list.add(nodeList.item(i).getNodeValue());
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        return list;
    }

    private static Document getXML(InputStream inputStream) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = builderFactory.newDocumentBuilder();
        return builder.parse(inputStream);
    }
}