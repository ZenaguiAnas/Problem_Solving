package KeyPhraseProblemHashTableAmazon;

import java.util.ArrayList;
import java.util.HashMap;

public class KeyPhraseHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String texte = "Hello everyone we will discuss in this lesson Corona about incredibly important topic in this time that is Corona Virus this virus which became among us in everywhere ";
			
			ArrayList<String> arraylistExclu = new ArrayList<>();
			arraylistExclu.add("we");
			arraylistExclu.add("in");
			arraylistExclu.add("this");
			arraylistExclu.add("about");
			arraylistExclu.add("that");
			arraylistExclu.add("is");
			arraylistExclu.add("us");
			
			HashMap<String,Integer> hashmap = new HashMap<>();
			
			String[] textSp= texte.split(" ");
			System.out.println(textSp+"\n");
			

			for (String words : textSp) {
				if(arraylistExclu.contains(words)) {
					continue;
				}
				String key = words.trim().toLowerCase();
				if(hashmap.get(key) == null) {
					hashmap.put(key, 1);
				}
				else {
					int frequence = hashmap.get(key)+1;
					hashmap.put(key, frequence);
				}
			}
			
			for( String words1 : hashmap.keySet()) {
				String key = words1.trim().toLowerCase();
				System.out.println(key + ":"+ hashmap.get(key));
			}
			
			
			
	}
	

}
