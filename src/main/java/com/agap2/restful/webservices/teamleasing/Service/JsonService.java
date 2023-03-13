package com.agap2.restful.webservices.teamleasing.Service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.w3c.dom.Node;
import org.w3c.dom.Element;


@Service
public class JsonService {

	public void mapJson(MultipartFile sourceFile) throws IOException {

		/*byte[] bytes = sourceFile.getBytes();
		File file = new File("jsonTmp.txt");

		FileOutputStream outputStream = new FileOutputStream(file);
		outputStream.write(bytes);
		outputStream.close();

		ObjectMapper mapper = new ObjectMapper();
		JsonNode jsonNode = mapper.readTree(file);
		String xmlString = new XmlMapper().writer().writeValueAsString(jsonNode);

		System.out.println(xmlString);
		mapXml(xmlString);*/

	}

	public void mapXml(String xmlString) {
/*
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(new InputSource(new StringReader(xmlString)));
			doc.getDocumentElement().normalize();

			System.out.println("Root element: " + doc.getDocumentElement().getNodeName());

			NodeList nList = doc.getElementsByTagName("person");

			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				System.out.println("\nCurrent Element: " + nNode.getNodeName());

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					System.out.println("Name : " + eElement.getElementsByTagName("name").item(0).getTextContent());
					System.out.println("Age : " + eElement.getElementsByTagName("age").item(0).getTextContent());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
*/
	}
}
