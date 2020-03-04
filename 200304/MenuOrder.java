import java.util.Scanner;

public class MenuOrder {

	public static void main(String[] args) {
		//메뉴판 주문하기 프로그램		
		
		Scanner scan = new Scanner(System.in);
		String a = "한식", b = "중식", c = "분식";
		String a1 = "된장찌개", a2 ="비빔밥", a3 = "냉면";	
		String b1 = "자장면", b2 = "짬뽕", b3 = "탕수육";		
		String c1 = "떡볶이", c2 = "쫄면", c3 = "라면";		
		int a1p = 15000, a2p = 8000, a3p = 12000;		
		int b1p = 14000, b2p = 7000, b3p = 11000;		
		int c1p = 13000, c2p = 6000, c3p = 10000;
		//한식, 중식, 분식의 메뉴와 가격 변수 설정		
		
		
		System.out.println("============메뉴판============");
		System.out.println("종류를 고르세요.");
		System.out.println("1." + a + " 2." + b + " 3." + c );
		System.out.println("============================");
		//한식, 분식, 중식 입력받기
		
		int num = scan.nextInt();
		
		switch(num){
			case 1:
				System.out.println("============" + a + "메뉴===========");
				System.out.println("1." + a1 + " 2." + a2 + " 3." + a3);
				System.out.println("============================");
				num = scan.nextInt();
				switch(num) {
				case 1: 
					System.out.printf(a1 + "은 " + "%,d원입니다.", a1p);
					break;
				case 2: 
					System.out.printf(a2 + "은 " + "%,d원입니다.", a2p);
					break;
				case 3: 
					System.out.printf(a3 + "은 " + "%,d원입니다.", a3p);
					break;	
				}
				break;
				//1 입력시 한식의 종류를 고를 수 있고, 선택한 한식 메뉴의 가격 출력.
				
			case 2:
				System.out.println("============" + b + "메뉴===========");
				System.out.println("1." + b1 + " 2." + b2 + " 3." + b3);
				System.out.println("============================");
				num = scan.nextInt();
				switch(num) {
				case 1: 
					System.out.printf(b1 + "은 " + "%,d원입니다.", b1p);
					break;
				case 2: 
					System.out.printf(b2 + "은 " + "%,d원입니다.", b2p);
					break;
				case 3: 
					System.out.printf(b3 + "은 " + "%,d원입니다.", b3p);
					break;	
				}
				break;
				//2 입력시 중식의 종류를 고를 수 있고, 선택한 중식 메뉴의 가격 출력.
			case 3:
				System.out.println("============" + c + "메뉴===========");
				System.out.println("1." + c1 + " 2." + c2 + " 3." + c3);
				System.out.println("============================");
				num = scan.nextInt();
				switch(num) {
				case 1: 
					System.out.printf(c1 + "은 " + "%,d원입니다.", c1p);
					break;
				case 2: 
					System.out.printf(c2 + "은 " + "%,d원입니다.", c2p);
					break;
				case 3: 
					System.out.printf(c3 + "은 " + "%,d원입니다.", c3p);
					break;	
				}
				break;
				//3 입력시 분식의 종류를 고를 수 있고, 선택한 분식 메뉴의 가격 출력.
		}
		
	}

}
