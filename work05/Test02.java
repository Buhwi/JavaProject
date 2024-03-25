package work05;

public class Test02 {
	public static void main(String args[]) {
		IPTV iptv = new IPTV(32, 10000, "UHD", "192.168.0.5");
		
		iptv.printProperty();
	}
}
