package work05;

public class ColorTV extends TV{
	private int color;
	public ColorTV(int size, int color, String level) {
		super(size, level);
		this.color = color;
	}
	public int getColor() {
		return this.color;
	}
	public void printProperty() {
		System.out.println(getSize() + "인치, " + this.color + " 가지 색상, " + getLevel() + "급 컬러 TV입니다.");
	}
}

