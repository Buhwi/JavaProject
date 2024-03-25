package q04;

abstract class OddDetector{
	protected int n;
	public OddDetector(int n) {
		this.n = n;
	}
	public abstract boolean isOdd();
}


public class Test10 extends OddDetector {
	public Test10(int n) {
		super(n);
	}
	public boolean isOdd() {
		if(n%2 == 0) {
			return false;
		}
		else 
			return true;
	}


	public static void main(String[] args) {
		Test10 b = new Test10(10);
		System.out.println(b.isOdd());

	}

}

