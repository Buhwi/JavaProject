package q02;

public class TV {
	
	public String name;
	public int year;
	public int size;
	
	public TV(String name, int year, int size) {
		this.name = name;
		this.year = year;
		this.size = size;
	}
	
	public void show() {
		System.out.println(name + "에서 만든 " + year + "년 " + size + "인치 TV");
	}
}
