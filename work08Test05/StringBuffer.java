package work08Test05;
import java.util.StringTokenizer;

public class StringBuffer {
	private String temp;
	private String[] array1;
	private String[] array2;
	
	public StringBuffer(String temp) {
		this.temp = temp;
	}
	
	public String getTemp() {
		return this.temp;
	}
	
	public String buffer(String temp1, String temp2) {
		StringBuilder sb = new StringBuilder();
		StringTokenizer st1 = new StringTokenizer(temp1);
		StringTokenizer st2 = new StringTokenizer(temp2, "!");
		
		array1 = new String[st1.countTokens()];
		array2 = new String[2];
		array2[0] = "0";
		array2[1] = "1";
		
		
		int a = 0;
		while(st1.hasMoreTokens()) {
			array1[a] = st1.nextToken();
			a++;
		}
		
		a = 0;
		while(st2.hasMoreElements()) {
			array2[a] = st2.nextToken();
			a++;
		}
		if(array2[0].equals("0")) {
			return "nono";
		}
		else if(array2[1].equals("1")) {
			return "nono";
		}
		int b = 0;
		for(int i = 0; i < array1.length; i++) {
			if(array1[i].equals(array2[0])) {
				array1[i] = array2[1];
			}
			else {
				b++;
				if(b == array1.length) {
					return "no";
				}
			}
		}
		
		for(int i = 0; i < array1.length; i++) {
			sb.append(array1[i] + " ");
		}
		this.temp = sb.toString();
		return this.temp;
		
		
	}
}
