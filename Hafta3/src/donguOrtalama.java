import java.util.Scanner;

public class donguOrtalama {

	public static void main(String[] args) {
		Scanner klavyeile= new Scanner(System.in);
		byte vN,fN, bN;
		vN=0;
		fN=0;
		short vnTop=0,fnTop=0, bnTop=0;
		short kisisayisi=0;
		do {
			//kisisayisi++;
			System.out.println("Vize Gir ");
			vN=klavyeile.nextByte();
			System.out.println("Final Gir ");
			fN=klavyeile.nextByte();
			
			if (vN==-1 || fN==-1) break;
			kisisayisi++;
			bN=(byte) ((vN+fN)/2);
			System.out.println("Basari Notu"+bN);
			vnTop=(short) (vnTop+vN);
			fnTop+=fN;
			bnTop=(short) (bnTop+bN);
			
			
		} while(vN!=-1&&fN!=-1);
		System.out.println("Vize"+vnTop);
		System.out.println("Final"+fnTop);
		System.out.println("Basari Notu"+bnTop);
		System.out.println("vize ortalama"+(vnTop/kisisayisi));
		System.out.println("final ortalama"+(fnTop/kisisayisi));
		System.out.println("basari ortalama"+(bnTop/kisisayisi));
		System.out.println("kisi sayisi"+kisisayisi);
		
		
		//2 tane -1 kontrolü var yanlış if onune yorum ve kapa ya da while true

	}


	}


