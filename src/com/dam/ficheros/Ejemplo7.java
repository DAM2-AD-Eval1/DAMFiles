package com.dam.ficheros;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Ejemplo7 {

	public static void main(String[] args) throws ParserConfigurationException, TransformerException {
		
		//Creamos la factor�a para crear "creadores de documentos"
		DocumentBuilderFactory factoria = DocumentBuilderFactory.newInstance();
		//Creamos el DocumentBuilder
		DocumentBuilder db = factoria.newDocumentBuilder();
		//Crear el documento
		Document documento = db.newDocument();
		
		//A�adimos los distintos elementos al documento
		Element alumnos = documento.createElement("alumnos");
		documento.appendChild(alumnos);
		
		Element alumno = documento.createElement("alumno");
		alumnos.appendChild(alumno);
		
		Element dni = documento.createElement("dni");
		alumno.appendChild(dni);
		dni.setTextContent("11111111A");
		
		Element nombre = documento.createElement("nombre");
		alumno.appendChild(nombre);
		nombre.setTextContent("Jose");
		
		//Obtenemos el transformer para generar el documento XML a partir del DOM
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer = tf.newTransformer();
		
		DOMSource dom = new DOMSource(documento);
		StreamResult sr = new StreamResult(new File("D:\\PRUEBAS\\fich.xml"));
		
		transformer.transform(dom, sr);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
