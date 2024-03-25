package q04;

interface Device {
	void on();
	void off();
}

public class Test16 implements Device{
	public void on() {
		System.out.println("켜졌습니다.");
	}
	public void off() {
		System.out.println("종료합니다.");
	}
	public void watch() {
		System.out.println("방송중입니다.");
	}
	

	public static void main(String[] args) {
		Test16 myTV = new Test16();
		myTV.on();
		myTV.watch();
		myTV.off();

	}

}
