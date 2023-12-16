import java.util.ArrayList;
import java.util.List;

public class Listeler1 {

	public static void main(String[] args) {
		List <String> meyvelistesi=new ArrayList<String>();
		
		System.out.println(meyvelistesi);
		
		meyvelistesi.add("Elma");
		
		meyvelistesi.add("Armut");
		
		System.out.println(meyvelistesi);
		
		meyvelistesi.add(1, "Kiraz");
		
		System.out.println(meyvelistesi);
		
		System.out.println(meyvelistesi.get(2));
		
		System.out.println("Muz listede mi?: "+meyvelistesi.contains("Muz"));
		System.out.println("Armut listede mi?: "+meyvelistesi.contains("Armut"));
		for (int i=0; i<meyvelistesi.size(); i++) {
			System.out.println(meyvelistesi.get(i));
		}
		System.out.println("------------------------");
		
		for (String meyce: meyvelistesi) {
			System.out.println(meyce);
		}
		meyvelistesi.remove(0);
		System.out.println(meyvelistesi);
		meyvelistesi.remove("Kiraz");
		System.out.println(meyvelistesi);
		meyvelistesi.clear();
		System.out.println(meyvelistesi);

	}

}
