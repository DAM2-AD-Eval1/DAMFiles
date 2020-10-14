package com.dam.ficheros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ejemplo6 {

	public static void main(String[] args) throws IOException {
		
		//Crear un directorio
		Files.createDirectory(Paths.get("D:\\PRUEBAS\\DAM2020"));
		//Crear un fichero
		Files.createFile(Paths.get("D:\\PRUEBAS\\DAM2020\\fichero.txt"));
		//Copia de fichero
		Files.copy(Paths.get("D:\\PRUEBAS\\DAM2020\\fichero.txt"),
				   Paths.get("D:\\PRUEBAS\\DAM2020\\fichero2.txt"));
		//Borrar un fichero
		Files.delete(Paths.get("D:\\PRUEBAS\\DAM2020\\fichero.txt"));
		

	}

}
