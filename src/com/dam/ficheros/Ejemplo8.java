package com.dam.ficheros;

import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Ejemplo8 {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		FileInputStream ficheroXML = new FileInputStream("D:\\PRUEBAS\\fich.xml");
		
		DocumentBuilderFactory factoria = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = factoria.newDocumentBuilder();
		Document documento = db.parse(ficheroXML);
		
		NodeList nombres = documento.getElementsByTagName("nombre");
		NodeList dni = documento.getElementsByTagName("dni");
		
		for (int i = 0; i < nombres.getLength(); i++)
			//System.out.println("El nombre de la iteración " + i + " es: " + nombres.item(i).getTextContent() + 
			//		            " y tiene el DNI: " + dni.item(i).getTextContent());
			if (dni.item(i).getTextContent().equals("11111111A"))
				System.out.println(nombres.item(i).getTextContent());
		
	}

}
