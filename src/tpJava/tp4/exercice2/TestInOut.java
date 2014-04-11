package tpJava.tp4.exercice2;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestInOut {

	public static void main(String[] args) {
		long t1;
		long t2;
		File image= new File("pano.jpg");
		FileInputStream fis;
		BufferedInputStream bis;
		
		try {
			fis= new FileInputStream(image);
			System.out.println("Ouverture OK");

			t1 = System.currentTimeMillis();
			while(fis.read() != -1){};
			t2 = System.currentTimeMillis();
			System.out.println("Temps de lecture : " + (t2-t1));
			// Temps de lecture : 14672
			
			fis.close();
			
			/*-------------------*/
			
			fis= new FileInputStream(image);
			bis = new BufferedInputStream(fis);
			System.out.println("Tampon OK");
			
			t1 = System.currentTimeMillis();
			while(bis.read() != -1){};
			t2 = System.currentTimeMillis();
			System.out.println("Temps de lecture : " + (t2-t1));
			// Temps de lecture : 218
			
			bis.close();
			fis.close();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
