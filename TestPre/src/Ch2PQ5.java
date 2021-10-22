import java.util.Scanner; 
	public class Ch2PQ5 {
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int a,b,c;
			System.out.println("정수 3개 입력>>");
			a=s.nextInt();
			b=s.nextInt();
			c=s.nextInt();
		if(a<b && b<c){
			System.out.print("중간 값은"+b+"입니다.");
				} 
		if(b<a && a<c) {
			System.out.print("중간 값은"+a+"입니다.");
				} 
		else {
			System.out.print("중간 값은"+c+"입니다.");
			}
		s.close();
		}
	}
