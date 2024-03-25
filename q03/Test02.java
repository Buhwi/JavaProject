package q03;
import java.util.Scanner;

class Reservation {
	public String[] s = new String[10];
	public String[] a = new String[10];
	public String[] b = new String[10];
	private String name;
	private int num;
	
	public void Reset() {
		for (int i = 0; i < s.length; i++) {
			s[i] = "---";
			a[i] = "---";
			b[i] = "---";
		}
	}
	public void ShowList(String[] list) {
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}
	
	public String[] Set(String name, int num, String[] list) {
		list[num-1] = name;
		return list;
	}
	
	public boolean check(int num, String[] list) {
		if(list[num-1].equals("---")) {
			return true;	
		}
		return false;
		
	}
	
	public String[] Reserv(String[] list, int t) {
		int fin = 1;
		while(true) {
			if(t==1) {
				System.out.print("S>> ");
			}
			if(t==2) {
				System.out.print("A>> ");
			}
			if(t==3) {
				System.out.print("B>> ");
			}
			ShowList(list);
			
			System.out.println();
			System.out.print("이름>>");
			Scanner scan = new Scanner(System.in);
			name = scan.next();
			
			while(true) {
				System.out.print("번호>>");
				Scanner scan2 = new Scanner(System.in);
				num = scan2.nextInt();
				//예약하려던 자리에 자리가 없다면
				boolean v = check(num, list);
				if(v == false) {
					System.out.println("이미 예약이 된 좌석입니다.");
					System.out.println("다시 예약 번호를 입력해주십시오.");
					continue;
				}
				break;
				
			}
			
			
			if(num > 10) {
				Error();
				continue;
			}
			
			list = Set(name, num, list);
			
			if(fin == 1) break;
		}
		return list;
	}
	
	public void Show() {
		System.out.println();
		System.out.print("S>>");
		ShowList(s);
		
		System.out.print("\nA>>");
		ShowList(a);
		
		System.out.print("\nB>>");
		ShowList(b);
		
		System.out.println("\n<<<조회를 완료하였습니다.>>>");
		System.out.println();
	}
	
	public void Cancle() {
		boolean h;
		int chec = 0;
		int chec1 = 0;
		System.out.print("좌석 S:1, A:2, B:3>>");
		Scanner sc3 = new Scanner(System.in);
		Scanner sc4 = new Scanner(System.in);
		num = sc3.nextInt();
		
		if(num == 1) {
			for(int i = 0; i < s.length; i ++) {
				if(s[i] == "---") {
					chec += 1;
				}
			}
			if(chec == 10) {
				System.out.println("예약된 좌석이 없습니다.");
				return;
			}
			
			System.out.print("S>>");
			ShowList(s);
			while(true) {
				System.out.println();
				System.out.print("이름>>");
				name = sc4.next();
				
				for(int i = 0; i < s.length; i++) {
					if(s[i].equals(name)) {
						chec1 += 1;
					}
				}
				if (chec1 > 1) {
					System.out.print("동명이인이 있습니다. 좌석 번호를 입력 바랍니다.>>");
					int x;
					//좌석 번호를 잘못 입력했을때
					while(true) {
						Scanner sc5 = new Scanner(System.in);
						x = sc5.nextInt();
						if(s[x-1].equals(name)) {
							break;
						}
						else {
							System.out.println();
							System.out.println("좌석번호를 확인 해주시길 바랍니다.");
							System.out.print("좌석 번호를 입력 바랍니다.>>");
							continue;
						}
					}
					s[x-1] = "---";
					return;
				}
				
				
				h = Sear(s);
				if(h == true) break;
				else System.out.println("예약자 이름이 없습니다. 다시 입력 바랍니다.");
			}
			
			s = Search(s);
		}
		
		if(num == 2) {
			for(int i = 0; i < a.length; i ++) {
				if(a[i] == "---") {
					chec += 1;
				}
			}
			if(chec == 10) {
				System.out.println("예약된 좌석이 없습니다.");
				return;
			}
			
			System.out.print("A>>");
			ShowList(a);
			while(true) {
				System.out.println();
				System.out.print("이름>>");
				name = sc4.next();
				
				for(int i = 0; i < a.length; i++) {
					if(a[i].equals(name)) {
						chec1 += 1;
					}
				}
				if (chec1 > 1) {
					System.out.print("동명이인이 있습니다. 좌석 번호를 입력 바랍니다.>>");
					int x;
					while(true) {
						Scanner sc5 = new Scanner(System.in);
						x = sc5.nextInt();
						if(a[x-1].equals(name)) {
							break;
						}
						else {
							System.out.println();
							System.out.println("좌석번호를 확인 해주시길 바랍니다.");
							System.out.print("좌석 번호를 입력 바랍니다.>>");
							continue;
						}
					}
					a[x-1] = "---";
					return;
				}
				
				h = Sear(a);
				if(h == true) break;
				else System.out.println("예약자 이름이 없습니다. 다시 입력 바랍니다.");
			}
			
			a = Search(a);
		}
		
		if(num == 3) {
			for(int i = 0; i < b.length; i ++) {
				if(b[i] == "---") {
					chec += 1;
				}
			}
			if(chec == 10) {
				System.out.println("예약된 좌석이 없습니다.");
				return;
			}
			
			System.out.print("B>>");
			ShowList(b);
			while(true) {
				System.out.println();
				System.out.print("이름>>");
				name = sc4.next();
				
				for(int i = 0; i < b.length; i++) {
					if(b[i].equals(name)) {
						chec1 += 1;
					}
				}
				if (chec1 > 1) {
					System.out.print("동명이인이 있습니다. 좌석 번호를 입력 바랍니다.>>");
					int x;
					while(true) {
						Scanner sc5 = new Scanner(System.in);
						x = sc5.nextInt();
						if(b[x-1].equals(name)) {
							break;
						}
						else {
							System.out.println();
							System.out.println("좌석번호를 확인 해주시길 바랍니다.");
							System.out.print("좌석 번호를 입력 바랍니다.>>");
							continue;
						}
					}
					
					b[x-1] = "---";
					return;
				}
				
				h = Sear(b);
				if(h == true) break;
				else System.out.println("예약자 이름이 없습니다. 다시 입력 바랍니다.");
			}
			
			b = Search(b);
		}
		
	}
	public String[] Search(String[] list) {
		for (int i = 0; i < list.length; i++) {
			if(list[i].equals(name)) {
				list[i] = "---";
			}
		}
		return list;
	}
	
	public boolean Sear(String[] list) {
		boolean h = false;
		for(int i = 0; i < list.length; i++) {
			if(list[i].equals(name)){
				h = true;
			}
		}
		return h;
	}
	
	public void Error() {
		System.out.println("올바른 내용을 작성하세요.");
		System.out.println();
	}
}



public class Test02 {

	public static void main(String[] args) {
		int num1;
		int num2;
		
		//reset
		Reservation list = new Reservation();
		list.Reset();
		
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		
		while(true) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			Scanner sc = new Scanner(System.in);
			Scanner sc1 = new Scanner(System.in);
			num1 = sc.nextInt();
			
			if(num1 == 4) break;
			
			else if (num1 == 1) {
				System.out.print("좌석구분 S(1), A(2), B(3)>>");
				num2 = sc1.nextInt();
				int i=0;
				boolean x = false;
				if(num2 == 1) {
					while(true) {
						if(list.s[i] == "---") {
							x = true;
						}
						i+=1;
						
						if(i == 10) {
							break;
						}
					}
					if(x == false) {
						System.out.println("S좌석의 자리가 없습니다. 다시 예약해주시길 바랍니다.");
						continue;
					}
					
					list.s = list.Reserv(list.s, num2);
				}
				else if(num2 == 2) {
					while(true) {
						if(list.a[i] == "---") {
							x = true;
						}
						i+=1;
						
						if(i == 10) {
							break;
						}
					}
					if(x == false) {
						System.out.println("A좌석의 자리가 없습니다. 다시 예약해주시길 바랍니다.");
						continue;
					}
					list.a = list.Reserv(list.a, num2);
				}
				else if(num2 == 3) {
					
					while(true) {
						if(list.b[i] == "---") {
							x = true;
						}
						i+=1;
						
						if(i == 10) {
							break;
						}
					}
					
					if(x == false) {
						System.out.println("B좌석의 자리가 없습니다. 다시 예약해주시길 바랍니다.");
						continue;
					}
					list.b = list.Reserv(list.b, num2);
				}
				else {
					list.Error();
					continue;
				}
			}
			else if(num1 == 2) {
				list.Show();
			}
			else if(num1 == 3) {
				list.Cancle();
			}
			else {
				list.Error();
				continue;
			}	
		}
	}
}
