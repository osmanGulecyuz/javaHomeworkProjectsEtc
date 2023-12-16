package hatalar;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWriter {

	public static void main(String[] args) {
		String dosyaAdi="dosya2.txt";
		String yazilacakMetin="Okan Universitesi\nSelam";
		try(BufferedWriter writer=new BufferedWriter(new FileWriter(dosyaAdi))){
			writer.write(yazilacakMetin);
			writer.close();
		}catch (Exception e) {
			System.out.println("hata: "+e.getMessage());
		}finally {
			System.out.println("Program Bitti");
		}

	}

}
