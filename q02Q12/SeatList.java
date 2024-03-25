package q02Q12;

public class SeatList {
	public String[] s = new String[10];
	public String[] a = new String[10];
	public String[] b = new String[10];
	
	public void Reset() {
		for (int i = 0; i < s.length; i++) {
			s[i] = "---";
			a[i] = "---";
			b[i] = "---";
		}
	
	}
}
