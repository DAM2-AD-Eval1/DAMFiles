package com.dam.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Ejemplo5 {

	public static void main(String[] args) throws IOException {
		
		//Lectura de un fichero de texto empleando NIO.2
		Path origen = Paths.get("D:\\PRUEBAS\\alumnos.txt");
		Path destino = Paths.get("D:\\PRUEBAS\\alumnosCopia.txt");
		
		BufferedReader br = Files.newBufferedReader(origen);
		BufferedWriter bw = Files.newBufferedWriter(destino);
		
		Stream<String> lineas = br.lines();
		
		//lineas.forEach(System.out::println);
		lineas.forEach(l -> {
			try {
				bw.write(l + "\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		bw.flush();
		
		br.close();
		bw.close();
		

	}

}
