package work07;

public class SoundableTest {
	private static void printSound(Soundable s) {
		System.out.println(s.sound());
	}
	
	public static void main(String args[]) {
		printSound(new Cat());
		printSound(new Dog());
	}
}
