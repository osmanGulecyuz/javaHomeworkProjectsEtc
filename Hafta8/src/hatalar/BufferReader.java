package hatalar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {

	public static void main(String[] args) {
		String dosyaAdi="dosya3.txt";
		String satir;
		try {
			FileReader fileReader= new FileReader(dosyaAdi);
			
			BufferedReader bufferedReader=new BufferedReader(fileReader);
			while((satir=bufferedReader.readLine())!=null);{
				System.out.println(satir);	
			}
			bufferedReader.close();
			fileReader.close();
			
			
		} catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}


	}

}
