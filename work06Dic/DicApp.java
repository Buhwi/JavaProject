package work06Dic;

public class DicApp {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("세종대왕", "자바");
		dic.put("이순신", "파이선");
		dic.put("이순신", "C++");
		
		System.out.println("이순신의 값은 " + dic.get("이순신"));
		System.out.println("세종대왕의 값은 " + dic.get("세종대왕"));
		dic.delete("이순신");
		System.out.println("이순신의 값은 " + dic.get("이순신"));
	}

}
