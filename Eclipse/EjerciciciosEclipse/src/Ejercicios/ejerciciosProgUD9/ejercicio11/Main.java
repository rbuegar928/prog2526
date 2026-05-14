package ejerciciosProgUD9.ejercicio11;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {

	public static void main(String[] args) {
        try {
        	File file = new File("record.txt");
            RandomAccessFile record = new RandomAccessFile("record.txt", "rw");
            record.writeBytes("Nivel:001");
            record.seek(6);
            record.writeBytes("005");
            record.writeBytes("666");
            System.out.println(file.getAbsolutePath());
            }catch(IOException e) {
            	e.printStackTrace();
            }
        }
	}



    