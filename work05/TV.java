package work05;

public class TV {
	private int size;
	private String level;
	
	public TV(int size, String level) {
		this.size = size;
		this.level = level;
	}
	
	protected int getSize() {
		return size;
	}
	protected String getLevel() {
		return level;
	}
	
}
