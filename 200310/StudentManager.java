import java.util.Scanner;

public class StudentManager {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �л� ���� ���α׷�
		// 1. �̸�
		// 2. �а�
		// 3. ����ó
		// 4. �й�
		// 5. ���
		final int MAX = 3;
		// final �� �̻� ������ �� ���ٴ� �ǹ��� ���. ��� - ������ ��
				
		String names[] = new String[MAX];
		String major[] = new String[MAX];
		String phone[] = new String[MAX];
		String sNumber[] = new String[MAX];
		float avg[] = new float[MAX];
		// final Max ���� �ϳ��� �ٲ������ν� �ٸ� �����鵵 �� ����ǹǷ� ����� ����Ѵ�.
		
		int select = 0;//�޴� �Է°� ���� ����
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("-- �л� ���� ���α׷� --");
		
		while(true) {
			System.out.println("<< �޴� >>");
			System.out.println("1. ���� �Է� ");// �Է� ó�� �޼ҵ�
			System.out.println("2. ���� ��� ");// ��� ó�� �޼ҵ�
			System.out.println("3. ���� ");
			System.out.print("����> ");
			select = scan.nextInt();
//			String selstr = scan.nextLine();
//			int select = Integer.parseInt(selstr);//parse - �ؼ��ϴ�. ���ڿ��� ���ڷ� �ؼ� �� �����ؼ� ���. ���ڿ� -> ����

			//���ڿ��� ������ ��
			//0�� �ƴ϶� select�� return�ϵ���
//			while(true) {
//				select = printMenu();
			
			
			//���� ó���� �޴� : ����
			if(select == 3) {
				System.out.println("�����մϴ�.");
				break;
			}
			
			switch(select) {
			case 1://�Է¸޴�
				//���� Ÿ��Ʋ ��� 
				System.out.println("�л� ���");
				for(int i = 0; i < MAX; i++) {
					System.out.println("-------------------");
					//scan.nextLine();//enter skip����
					System.out.print("�̸� : ");
					names[i] = scan.nextLine();
					System.out.print("�а� : ");
					major[i] = scan.nextLine();
					System.out.print("����ó : ");
					phone[i] = scan.nextLine();
					System.out.print("�й� : ");
					sNumber[i] = scan.nextLine();
					System.out.print("��� : ");
					//avg[i] = scan.nextFloat();
					String fStr = scan.nextLine();
					avg[i] = Float.parseFloat(fStr);
					//���ڿ� -> �Ǽ� ��ȯ�ϴ� ���
					//avg[i] = (������ �ڷ���).parseFloat(fStr);
				}
				//���ڶ�� 1, 2, 3 ���ε��� ���Ե�
				//Ű���忡 �ӽ÷� �����ϴ� ���۰� ����. ��� �ð��� ���� �ּ�
				//�������� �����. a~z, A~Z�� ����� �� ��. enter�� ������ �Է��� �����ٰ� ������
				//nextLine���� ���ڿ� �޴� �͵��� enter�� ���ڶ�� �ν��� ��
				//scan���� enter�� ������ �Է��� �����ٰ� �ν��� �ϱ� ������ ������ �߻���
				//���ڸ� �ް� ���ڸ� �ްԵǸ� enter�� ���Ƽ� �Է�ó���� ���� ����
				//=> enter�� ���ָ� ���� �ذ��(1.scan.nextLine(); 2.���ڿ��θ� ���δ� �Է� ����, ������ ��쿡�� ��ȯ����)
				break;
			case 2://��¸޴�
				System.out.println();
				for(int i = 0; i < MAX; i++) {
					System.out.println("-------------------");
					//scan.nextLine();//enter skip����
					System.out.print(" �̸� : " + names[i]);
					System.out.print(" �а� : " + major[i]);
					System.out.print(" ����ó : " + phone[i]);
					System.out.print(" �й� : " + sNumber);
					System.out.print(" ��� : " + avg[i]);
				}
				break;
			default://�߸��� �޴� �Է�
				System.out.println("�߸� �����̽��ϴ�.");
				break;
			}
		
	}
	
}//main method

	private static int printMenu() {
		// TODO Auto-generated method stub
		return 0;
	}

}//class
