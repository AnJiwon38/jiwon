
public class OperationTest07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// break, continue ��
		// �ܵ����� ����� �Ұ����� ���
		// break �����Ű�� �ܵ���
		// continue 

		// 1~100���� ¦���� ��
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 != 0) {
				continue;//Ȧ���� ��쿡�� sum += i �н���. continue ������ ������� skip�ϰ� �ݺ��϶�� �ǹ�
			}
			
			sum += i;
		}
		
		System.out.println(sum);
		
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 != 0) {
				break;//Ȧ���� ��쿡�� for�� �ݺ��� �������
			}
			
			sum += i;
		}
		
		System.out.println(sum);
	}

}
