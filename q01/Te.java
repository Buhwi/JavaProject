package q01;
import java.util.*;

public class Te {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("a=3,b=5,c=6", ",=");
		int sum = 0;
		int n = 1;
		
		while(st.hasMoreElements()) {
			String token = st.nextToken();
			System.out.println(token);
			if(n%2 == 0) {
				sum += Integer.parseInt(token);
			}
			n ++;
		}
		System.out.println("합은 = " + sum);
		
		
		System.out.println((int)(Math.random()*155 + 101));
		
	}

}
