
public class HashtableArray <T> {

	int size;
	Entry [] arrayHash;
	
	public HashtableArray(int size) {
		this.size = size;
		arrayHash = new Entry[this.size];
		for(int i=0; i<size; i++) {
			arrayHash[i]= new Entry();
		}
	}
	
		int gethash(int key) {
			return key%size;
		}
		
		<T> void insertElement(int key, T value) {
			int HashIndex = key%size;
			Entry arrayvalue = arrayHash[HashIndex];
			Entry newitem = new Entry(key, value);
			newitem.next = arrayvalue.next;
			arrayvalue.next = newitem;
		}
		
		public T getElement(int key) {
			T value = null;
			int HashIndex = gethash(key);
			Entry arrayvalue = arrayHash[HashIndex];
			while(arrayvalue != null){
			if(key == arrayvalue.getkey()) 
				 {
					value =(T) arrayvalue.getvalue();
					break;
			}
			arrayvalue = arrayvalue.next;
			}
			return value;
		}
		
		
		
		
		
		
		
	}


