package com.dam.ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo2 {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader(new File("D:\\PRUEBAS\\alumnos.txt"));
		
		int i = 0;
		while((i = fr.read()) != -1) {
			System.out.println("El número: " + i + " es el carácter:" + (char)i);
		}

	}

}
