package q02Q12;
import java.util.Scanner;

class Reserve {
	Scanner scanner = new Scanner(System.in);
	public String[][] list = new String[3][10];
	
	//좌석을 리셋 해주는 메소드
	public void Reset() {
		for (int i = 0; i < list.length; i++) {
			for(int j = 0; j < list[i].length; j++) {
				list[i][j] = "---";
			}
		}
		return;
	}
	
	//해당 좌석 출력 메소드
	public void Show(int seat) {
		switch(seat) {
		case 1:
			System.out.print("S>> ");
			break;
		case 2:
			System.out.print("A>> ");
			break;
		case 3:
			System.out.print("B>> ");
			break;
		}
		for(int i = 0; i < list[seat-1].length; i++) {
			System.out.print(list[seat-1][i] + " ");
		}
		System.out.println();
		return;
	}
	
	//만석인지 확인 해주는 메소드
	public boolean SeatMax(String[] list) {
		boolean a = false;
		for(int i = 0; i < list.length; i++) {
			if(list[i].equals("---")) {
				a = true;
			}
		}
		return a;
	}
	
	//이름 찾기 메소드
	public int Search(int seat, String name) {
		int num = 10;
		for(int i = 0; i < list[seat-1].length; i++) {
			if(list[seat-1][i].equals(name)) {
				num = i;
			}
		}
		return num;
	}
	
	//동명이인 찾기 메소드
	public int SearchName(int seat, String name) {
		int num = 0;
		for(int i = 0; i < list[seat-1].length; i++) {
			if(list[seat-1][i].equals(name)) {
				num += 1;
			}
		}
		return num;
	}
	
	//(1) 예약 메소드
	public void SeatReser() {
		int seat;
		int seatNum;
		boolean a;
		String name;
		
		while(true) {
			System.out.print("좌석 S:1, A:2, B:3 >>");
			seat = scanner.nextInt();
			try {
				Show(seat);
	        } catch (ArrayIndexOutOfBoundsException e) {
	        	System.out.println("다시 선택 해주세요 (1 ~ 3).");
	        	continue;
	        }
			
			a = SeatMax(list[seat-1]);
			if(a == false) {
				System.out.print("좌석의 자리가 가득 차 있습니다.다른 좌석을 선택해 주십시오.");
				continue;
			}
			break;
		}
		while(true) {
			System.out.print("이름>>");
			name = scanner.next();
			System.out.print("번호>>");
			seatNum = scanner.nextInt();
			
			if(seatNum < 1 || seatNum > 10) {
				System.out.println("잘못 입력하셨습니다. (1 ~ 10)");
				continue;
			}
			if(!list[seat-1][seatNum-1].equals("---")) {
				System.out.println("이미 예약된 좌석입니다.");
				continue;
			}
			list[seat-1][seatNum-1] = name;
			
			return;
		}
		
		
		
	}
	
	
	//(2) 조회 메소드
	public void SeatShow() {
		for(int i = 0; i < list.length; i++) {
			switch(i) {
			case 0: 
				System.out.print("S>> ");
				break;
			case 1: 
				System.out.print("A>> ");
				break;
			case 2: 
				System.out.print("B>> ");
				break;
			}
			for(int j = 0; j < list[i].length; j++) {
				System.out.print(list[i][j] + " ");
			}
			System.out.println();
		}
		return;
	}
	
	//(3) 예약 취소 메소드
	public void SeatCancle() {
		int seat;
		int seatNum;
		int num;
		int num1=0;
		String name;
		
		System.out.print("좌석 S:1, A:2, B:3 >>");
		seat = scanner.nextInt();
		Show(seat);
		
		//좌석에 취소할 좌석이 있는지 확인
		for(int i = 0; i < list[seat-1].length; i++) {
			if(list[seat-1][i].equals("---")) {
				num1 += 1;
			}
		}
		if(num1 == 10) {
			System.out.println("선택한 좌석에 예약된 자리가 없어 취소가 불가능합니다.");
			return;
		}
		
		
		System.out.print("이름>>");
		name = scanner.next();
		
		num = SearchName(seat, name);
		
		
		if(num > 1) {
			System.out.println("동명이인이 있습니다. 좌석번호를 입력 바랍니다.");
			seatNum = scanner.nextInt();
			if(list[seat-1][seatNum+1].equals("---")) {
				System.out.println("좌석번호를 다시 확인하여 취소해주시길 바랍니다.");
			}
			
			list[seat-1][seatNum+1] = "---";
			return;
		}
		
		
		
		seatNum = Search(seat, name);
		if(seatNum == 10) {
			System.out.println("예약자명이 없습니다. 다시 시도해주시길 바랍니다.");
		}
		
		list[seat-1][seatNum] = "---";
		
		return;
	}
	
}



public class Reservation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int scan;
		boolean a = true;
		Reserve reserve = new Reserve();
		reserve.Reset();
		
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		
		while(a) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			scan = scanner.nextInt();
			
			switch(scan) {
			case 1:
				reserve.SeatReser();
				break;
			case 2:
				reserve.SeatShow();
				break;
			case 3:
				reserve.SeatCancle();
				break;
			case 4:
				a = false;
				break;
			default:
                System.out.println("잘못 입력하셨습니다 (1 ~ 4).");
                continue;
			}
		}
	}
}
