
public class ThreeSum {

	public static void main(String[] args) {
		int num = 0;
		for(int i = 0; i < 100; i++) {
			if(i%3 == 0) {
				num += i;
				System.out.print(i);
				System.out.print("+");
			}
		}
		System.out.print("1~100까지 3의 배수의 합은 "+num);
	}
}