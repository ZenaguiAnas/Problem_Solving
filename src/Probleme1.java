
public class Probleme1 {

	public static void main(String[] args) {

			HashtableArray<String> hs = new HashtableArray<>(5);
			hs.insertElement(3, "Anas");
			hs.insertElement(7, "Huh");
			hs.insertElement(5, "Rach");
			
			hs.getElement(7);
			System.out.println(hs.getElement(1));

	}

}
