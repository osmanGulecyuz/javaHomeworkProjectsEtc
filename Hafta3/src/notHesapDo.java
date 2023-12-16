import java.util.Scanner;

public class notHesapDo {

	public static void main(String[] args) {
		Scanner klavyeile= new Scanner(System.in);
		byte vN,fN, bN;
		vN=0;
		fN=0;
		
		do {
			System.out.println("Vize Gir ");
			vN=klavyeile.nextByte();
			System.out.println("Final Gir ");
			
			
			fN=klavyeile.nextByte();
			//if (vN==-1 || fN==-1) break;
			bN=(byte) ((vN+fN)/2);
			System.out.println("Basari Notu"+bN);
		} while(vN!=-1&&fN!=-1);
		
		
		//2 tane -1 kontrolü var yanlış if onune yorum ve kapa ya da while true

	}

}
