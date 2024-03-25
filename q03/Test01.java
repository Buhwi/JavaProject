package q03;
import java.util.Scanner;

class Math {
	public int a;
	public int b;
}
class Add extends Math{
	public void SetValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int Calculate() {
		return (a + b);
	}
}
class Sub extends Math{
	public void SetValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int Calculate() {
		return (a - b);
	}
}
class Mul extends Math{
	public void SetValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int Calculate() {
		return (a * b);
	}
}
class Div extends Math{
	public void SetValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int Calculate() {
		return (a / b);
	}
}
public class Test01 {

	public static void main(String[] args) {
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>>");
		
		int result = 0;
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		String c = sc.next();
		
		switch(c) {
		case "+" :
			add.SetValue(num1, num2);
			result = add.Calculate();
			break;
		case "-" :
			sub.SetValue(num1, num2);
			result = sub.Calculate();
			break;
		case "*" :
			mul.SetValue(num1, num2);
			result = mul.Calculate();
			break;
		case "/" :
			div.SetValue(num1, num2);
			result = div.Calculate();
			break;
			
		default :
			System.out.println("연산자를 확인 해주시길 바랍니다.");
			break;
		}
		System.out.println(result);	
		sc.close();
	}
}