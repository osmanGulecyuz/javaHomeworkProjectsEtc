import java.util.Scanner;

public class notHesapWhile {

	public static void main(String[] args) {
		
		Scanner giris = new Scanner(System.in);
		byte vn=0, fn=0, bn;
		System.out.println("While döngüsü");
		while(vn!=-1 && fn!=-1) {
			
			System.out.println("Vize gir");
			vn=giris.nextByte();
			System.out.println("Final gir");
			fn=giris.nextByte();
			bn=(byte) ((vn+fn)/2);
			System.out.println("Basari Notun : "+bn);
			
		}

	}

}
