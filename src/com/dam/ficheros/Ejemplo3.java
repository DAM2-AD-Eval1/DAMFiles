package com.dam.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo3 {

	public static void main(String[] args) throws IOException {
		
		//Lectura con buffer
		BufferedReader br = new BufferedReader(new FileReader("D:\\PRUEBAS\\alumnos.txt"));
		
		/* Forma equivalente de escribir la l�nea anterior
		String ruta = "D:\\PRUEBAS\\alumnos.txt";
		FileReader fr = new FileReader(ruta);
		BufferedReader br2 = new BufferedReader(fr);
		*/
		
		String linea;
		while ((linea = br.readLine()) != null) {
			System.out.println(linea);
		}
		
		br.close();	
		
		//Escritura con buffer
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\PRUEBAS\\EscrituraDAM.txt", true));
		
		String nuevaLinea = "\rL�nea nueva en el fichero";
		bw.write(nuevaLinea);
		
		bw.flush();
		
		bw.close();
		
		
		
		
		
		
		
		
		

	}

}
