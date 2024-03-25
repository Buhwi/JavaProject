package work04;

public class ColorTV extends TV {
	int color;
	
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	void printProperty() {
		System.out.println(getSize() + "인치 " + color + "컬러");
	}
}
