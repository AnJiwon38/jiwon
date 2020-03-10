import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int allDay = 0, startDay = 0, endDay = 0;
		int year = 0, month = 0;

		System.out.println("�⵵�� �Է��ϼ���. ");
		year = scan.nextInt();

		System.out.println("���� �Է��ϼ���. ");
		month = scan.nextInt();

		for (int i = 1; i < year; i++) {//�Է��� �⵵���� �۳������ ���� �ʿ������� i < year�� ���
			allDay += 365;
			//1�� ���������� 365�� ������
			if ((((i % 4) == 0) && (i % 100) != 0) || ((i % 400) == 0)) {
				//if������ year�� �ƴ� i�� ���ִ� ������ for������ 1����� �Է��� year������ ���� �����ִ� �����̱� ����.
				//i�� �ƴ� year�� ����� ��� 1~year������ ���� Ȯ���� �ƴ� �Է¹��� year�� ���� ������ Ȯ���ϰ� �ȴ�.
				allDay++;
				//������ ��� 2���� 28�Ͽ��� 29���� �Ǿ� �Ϸ簡 �� �����ϹǷ� 1�� ������
			}
		}

		for (int j = 1; j < month; j++) {//�Է��� �ź��� ���� �ޱ����� ���� �ʿ��ϹǷ� j < month�� ���
			if ((j == 4) || (j == 6) || (j == 9) || (j == 11)) {//30�ϱ��� �ִ� ������ ��
				allDay += 30;
			} else if (j == 2) {//29�ϱ����� 2�� ã��
				if ((((year % 4) == 0) && (year % 100) != 0) || ((year % 400) == 0)) {
					//j�� ���� �ǹ��ϱ� ������ ������ Ȯ���ϱ� ���ؼ��� �Է��� year���� ���ؾ��Ѵ�.
					allDay += 29;
				} else {
					allDay += 28;
				}
			} else {//2, 4, 6, 9, 11 �̿��� ���� 31�ϱ���
				allDay += 31;
			}
		}

		startDay = allDay % 7;//�ش� ���� ���� ��¥�� �˾��ֱ� ���� ������ allDay�� 7�� ������ ������ ���� startDay�� ����

		
		
		//���� ������ ��¥ ���ϱ�(28, 29, 30, 31)
		if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
			endDay = 30;
		} else if (month == 2) {
			if ((((month % 4) == 0) && (month % 100) != 0) || ((month % 400) == 0)) {
				endDay = 29;
			} else {
				endDay = 28;
			}
		} else {
			endDay = 31;
		}
		
		
		
		
		System.out.printf("%d��\t\t\t\t\t\t%d��%n", year, month);
		System.out.printf("===============================================%n");
		System.out.printf("��\t��\tȭ\t��\t��\t��\t��%n");
		System.out.printf("===============================================%n");
		
		
		
		int cnt = 0;
		//7�ϸ��� �� �ٲ��ֱ� ���ؼ� cnt ������ 0���� �ʱ�ȭ����
		
		
		for(int l = 0; l <= startDay; l++) {
			if(startDay == 6)//startDay�� 6�̸� ������ ���� �ʾƵ� �ǹǷ� break�� ����ؼ� for���� �������´�.
				break;
			System.out.print("\t");
			cnt++;
		}
				for(int m = 1; m <= endDay; m++) {//1���� endDay���� ���ڸ� �Է�����
					System.out.printf("%2d", m);
					cnt++;
					if(cnt % 7 == 0) {//cnt�� 7�� �Էµ��� �� ���� �ٲ���
						System.out.println();
					}
					else {
						System.out.printf("\t");//cnt�� 7�� �Էµ����ʾ��� ���� ������ �־���
				}
		}
	}
}