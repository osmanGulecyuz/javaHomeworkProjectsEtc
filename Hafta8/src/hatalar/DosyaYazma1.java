package hatalar;

import java.io.FileWriter;
import java.io.IOException;

public class DosyaYazma1 {

	public static void main(String[] args) {
		String dosyaAdi="dosya1.txt";
		String yazilacakMetin="Okan Universitesi";
		FileWriter fileWriter =null;
		try {
			fileWriter= new FileWriter(dosyaAdi);
			fileWriter.write(yazilacakMetin);
			fileWriter.close();
		} catch (IOException e) {
			
			System.out.println("Yazma yapılamadı");
		}finally {
			System.out.println("Dosyaya Yazıldı");
		}
		

	}

}
