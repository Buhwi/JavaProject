package q01;

public class T {
	public static void main(String args[]) {
		String a = "Hello";
		String b = "Hello";
		String c = "Java";
		String d = new String("Hello");
		String e = new String("Java");
		String f = new String("Java");
		
		if(a == b)
			System.out.println("b");
		if(a == c)
			System.out.println("c");
		if(a == d)
			System.out.println("d");
		if(a == e)
			System.out.println("e");
		if(a == f)
			System.out.println("f");
		
		if(f.equals(a))
			System.out.println("a");

		if(f.equals(b))
			System.out.println("b");

		if(f.equals(c))
			System.out.println("c");

		if(f.equals(d))
			System.out.println("d");

		if(f.equals(e))
			System.out.println("e");

	
		
	}
}
