
public class OperationTest04{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������");
		
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				System.out.printf("%d*%d=%2d ", j, i, i*j);
			}
			System.out.println();
		}//for��
		System.out.println();
		
		int i = 0;
		while(i<9) {
			i++;
			int j = 1;
			while(j<9) {
				j++;
				System.out.printf("%d*%d=%2d ", j, i, i*j);
			}
			System.out.println();	
		}//while�� ��
	}
}


