package work05;

public class IPTV extends ColorTV{
	private String ip;
	public IPTV(int size, int color, String level, String ip) {
		super(size, color, level);
		this.ip = ip;
	}
	public String getIp() {
		return this.ip;
	}
	public void printProperty() {
		System.out.print("나의 IPTV는 " + this.ip + "는 ");
		super.printProperty();
	}
}
