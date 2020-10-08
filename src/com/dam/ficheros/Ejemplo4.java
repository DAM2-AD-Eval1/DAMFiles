package com.dam.ficheros;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejemplo4 {

	public static void main(String[] args) throws IOException {
		
		//Defino el tamaño del buffer: 32K
		final int TAMANHO = 32*1024;
		
		//Definir el buffer con el tamaño necesario
		byte[] buffer = new byte[TAMANHO];
		
		//Para saber cuántos bytes se leyeron en cada iteración
		int cantidadLeida = 0;
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\PRUEBAS\\documento.pdf"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\PRUEBAS\\docCopia.pdf"));
		
		//Se escriben tantos bytes como nos devuelva la variable cantidadLeida
		//que coincide con TAMANHO en todas las iteraciones menos la última (en el caso de que el fichero no
		//sea múltiplo de TAMANHO)
		while ((cantidadLeida = bis.read(buffer, 0, TAMANHO)) != -1)
			bos.write(buffer, 0, cantidadLeida);

		bos.flush();
		
		bis.close();
		bos.close();
			
			
			
			
			
			
			
	}

}
