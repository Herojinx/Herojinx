import java.util.Scanner; 
	public class Ch2PQ5 {
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int a,b,c;
			System.out.println("���� 3�� �Է�>>");
			a=s.nextInt();
			b=s.nextInt();
			c=s.nextInt();
		if(a<b && b<c){
			System.out.print("�߰� ����"+b+"�Դϴ�.");
				} 
		if(b<a && a<c) {
			System.out.print("�߰� ����"+a+"�Դϴ�.");
				} 
		else {
			System.out.print("�߰� ����"+c+"�Դϴ�.");
			}
		s.close();
		}
	}
