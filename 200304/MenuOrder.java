import java.util.Scanner;

public class MenuOrder {

	public static void main(String[] args) {
		//�޴��� �ֹ��ϱ� ���α׷�		
		
		Scanner scan = new Scanner(System.in);
		String a = "�ѽ�", b = "�߽�", c = "�н�";
		String a1 = "�����", a2 ="�����", a3 = "�ø�";	
		String b1 = "�����", b2 = "«��", b3 = "������";		
		String c1 = "������", c2 = "�̸�", c3 = "���";		
		int a1p = 15000, a2p = 8000, a3p = 12000;		
		int b1p = 14000, b2p = 7000, b3p = 11000;		
		int c1p = 13000, c2p = 6000, c3p = 10000;
		//�ѽ�, �߽�, �н��� �޴��� ���� ���� ����		
		
		
		System.out.println("============�޴���============");
		System.out.println("������ ������.");
		System.out.println("1." + a + " 2." + b + " 3." + c );
		System.out.println("============================");
		//�ѽ�, �н�, �߽� �Է¹ޱ�
		
		int num = scan.nextInt();
		
		switch(num){
			case 1:
				System.out.println("============" + a + "�޴�===========");
				System.out.println("1." + a1 + " 2." + a2 + " 3." + a3);
				System.out.println("============================");
				num = scan.nextInt();
				switch(num) {
				case 1: 
					System.out.printf(a1 + "�� " + "%,d���Դϴ�.", a1p);
					break;
				case 2: 
					System.out.printf(a2 + "�� " + "%,d���Դϴ�.", a2p);
					break;
				case 3: 
					System.out.printf(a3 + "�� " + "%,d���Դϴ�.", a3p);
					break;	
				}
				break;
				//1 �Է½� �ѽ��� ������ �� �� �ְ�, ������ �ѽ� �޴��� ���� ���.
				
			case 2:
				System.out.println("============" + b + "�޴�===========");
				System.out.println("1." + b1 + " 2." + b2 + " 3." + b3);
				System.out.println("============================");
				num = scan.nextInt();
				switch(num) {
				case 1: 
					System.out.printf(b1 + "�� " + "%,d���Դϴ�.", b1p);
					break;
				case 2: 
					System.out.printf(b2 + "�� " + "%,d���Դϴ�.", b2p);
					break;
				case 3: 
					System.out.printf(b3 + "�� " + "%,d���Դϴ�.", b3p);
					break;	
				}
				break;
				//2 �Է½� �߽��� ������ �� �� �ְ�, ������ �߽� �޴��� ���� ���.
			case 3:
				System.out.println("============" + c + "�޴�===========");
				System.out.println("1." + c1 + " 2." + c2 + " 3." + c3);
				System.out.println("============================");
				num = scan.nextInt();
				switch(num) {
				case 1: 
					System.out.printf(c1 + "�� " + "%,d���Դϴ�.", c1p);
					break;
				case 2: 
					System.out.printf(c2 + "�� " + "%,d���Դϴ�.", c2p);
					break;
				case 3: 
					System.out.printf(c3 + "�� " + "%,d���Դϴ�.", c3p);
					break;	
				}
				break;
				//3 �Է½� �н��� ������ �� �� �ְ�, ������ �н� �޴��� ���� ���.
		}
		
	}

}
