import java.util.Scanner;

public class MoneyBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����� ���α׷�
		// 1. ���� ���
		// 2. ����
		// 3. ����
		// 4. �ܾ�
		// 5. ��ü ���� �ݾ�
		// 6. ��ü ���� �ݾ�
		final int MAX = 2;
				
		String date[] = new String[MAX];
		int inMoney[] = new int[MAX];
		int outMoney[] = new int[MAX];
		String list[] = new String[MAX];
		int balance = 0;
		int totalInMoney = 0;
		int totalOutMoney = 0;
		
		int select = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("-- ����� ���α׷� --");
			
			while(true) {
				System.out.println("------------------------");
				System.out.println("<< �޴� >>");
				System.out.println("1. ���� ��� ");
				System.out.println("2. ��ü ��� ");
				System.out.println("3. ���� ��� ");
				System.out.println("4. ���� ��� ");
				System.out.println("5. ���� ");
				System.out.print("����> ");
				select = scan.nextInt();
				
				if(select == 5) {
					System.out.println("���α׷��� �����մϴ�.");
						break;}
				
				switch(select) {
					case 1:
						for(int i = 0; i < MAX; i++) {
							System.out.println("--------------------------");
							
							scan.nextLine();
							System.out.println("��¥ : ");
							date[i] = scan.nextLine();
							
							System.out.println("���� �ݾ� : ");
							inMoney[i] = scan.nextInt();	
							totalInMoney += inMoney[i];
							
							System.out.println("���� �ݾ� : ");
							outMoney[i] = scan.nextInt();
							totalOutMoney += outMoney[i];
							
							System.out.println("���� : ");
							list[i] = scan.next();		
						}	
						balance = totalInMoney - totalOutMoney;
						break;
					case 2:
						System.out.println();
						for(int i = 0; i < MAX; i++) {
							System.out.println("--------------------------");
							System.out.println(" ��¥ : " + date[i]);
							System.out.println(" ���� : " + inMoney[i] + "��");
							System.out.println(" ���� : " + outMoney[i] + "��");
							System.out.println(" ���� : " + list[i]);
							System.out.println();
						}//1~MAX������ ������ ��ü ��µǾ� �ϹǷ� �迭�� ����
						System.out.println("--------------------------");
						System.out.println(" ��ü ���� �ݾ� : " + totalInMoney + "��");
						System.out.println(" ��ü ���� �ݾ� : " + totalOutMoney + "��");
						System.out.println(" ��ü �ܾ� : " + balance + "��");
						break;
					case 3:
						System.out.println();
						for(int i = 0; i < MAX; i++) {
							System.out.println("--------------------------");
							System.out.println(" ��¥ : " + date[i]);
							System.out.println(" ���� : " + inMoney[i] + "��");
							System.out.println(" �ܾ� : " + balance + "��");
							System.out.println(" ���� : " + list[i]);
							System.out.println();
						}
						System.out.println(" ��ü ���� �ݾ� : " + totalInMoney + "��");
						break;
					case 4:
						totalOutMoney = -(totalOutMoney);
						System.out.println();
						for(int i = 0; i < MAX; i++) {
							System.out.println("--------------------------");
							System.out.println(" ��¥ : " + date[i]);
							System.out.println(" ���� : " + (0 - outMoney[i]) + "��");
							System.out.println(" �ܾ� : " + balance + "��");
							System.out.println(" ���� : " + list[i]);
							System.out.println();
						}
						System.out.println(" ��ü ���� �ݾ� : " + totalOutMoney + "��");
						break;
					default://�߸��� �޴� �Է�
						System.out.println("�߸� �����̽��ϴ�.");
						break;						
				}
			}		
	}

}
