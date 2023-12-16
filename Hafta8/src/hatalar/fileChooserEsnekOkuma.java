package hatalar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

public class fileChooserEsnekOkuma {

	public static void main(String[] args) {
		JFileChooser fileChooser= new JFileChooser();
		int  secim=fileChooser.showOpenDialog(null);
		
		if(secim==JFileChooser.APPROVE_OPTION) {
			File dosyaAdi=fileChooser.getSelectedFile();
			System.out.println("Secilem Dosya Adi"+dosyaAdi);
			File klasorAdi=fileChooser.getCurrentDirectory();
			System.out.println("Secilem Klasor Adi"+klasorAdi);
			
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
			
			
		}else System.out.println("Dosya Seçilemedi");

	}

}
