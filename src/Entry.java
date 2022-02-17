
public class Entry <T> {
	
	int keyh;
	T value;
	Entry next;

	public Entry(int keyh, T value) {
		this.keyh = keyh;
		this.value = value;
		next = null;
	}
	
	public Entry() {
		next = null;
	}
	
	public int getkey() {
		return keyh;
	}
	
	public T getvalue() {
		return value;
	}

}
