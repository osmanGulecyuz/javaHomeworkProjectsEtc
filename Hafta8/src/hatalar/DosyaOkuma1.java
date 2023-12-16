package hatalar;

import java.io.FileReader;

public class DosyaOkuma1 {

	public static void main(String[] args) {
		String dosyaAdi="dosya2.txt";
		int karakter;
		try {
			FileReader fileReader=new FileReader(dosyaAdi);
			while((karakter=fileReader.read())!=-1) {
				System.out.print((char)karakter);
			}
			fileReader.close();
		}catch (Exception e) {
			System.out.println("hata: "+e.getMessage());
		}

	}

}
