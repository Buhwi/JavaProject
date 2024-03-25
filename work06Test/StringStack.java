package work06Test;

public class StringStack implements Stack{
	private int length;
	private int capacity;
	private ArrayList arrayList;
	private int i = 0;
	
	
	public StringStack(int length) {
		this.capacity = length;
		this.length = length;
		arrayList = new ArrayList(length);
		
	}
	
	public int length() {
		if(i > length) {
			return 0;
		}
		return length - i;
	}

	public int capacity() {
		return capacity;
	}

	public String pop() {
		return arrayList.pop();
	}

	public boolean push(String val) {
		if(i >= length) {
			return false;
		}
		
		arrayList.push(val, i);
		i = i + 1;
		return true;
	}
	public void show() {
		for(int n = this.length - 1; n > -1; n = n -1) {
			System.out.print(arrayList.show(n) + " ");
		}
	}

}
