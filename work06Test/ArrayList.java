package work06Test;

public class ArrayList {
	private String[] arrayList;
	private int length;
	private int i;
	
	public ArrayList(int length) {
		arrayList = new String[length];
	}
	public void push(String val, int i) {
		arrayList[i] = val;
		this.i = i;
		if(length < this.i) {
			this.i = 0;
		}
		
		
	}
	public String pop() {
		return arrayList[i];
	}
	public String show(int n) {
		return arrayList[n];
	}
	
}
