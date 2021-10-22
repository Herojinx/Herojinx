import java.util.Scanner;
import java.util.Arrays;

class SignUp{
	String course, name;
	int score;
	public SignUp(String course, int score, String name) {
		this.course = course; this.name = name; this.score = score;
	}
	public String course(){return course;}
	public String name() {return name;}
	public int score() {return score;}	
	public String toString() {
		return "과목: "+course+" 학점: "+score+" 담당교수: "+course+"\n";
	}
}
public class ClassSignUp {
	public SignUp[] Array;
	Scanner scanner = new Scanner(System.in);
	public ClassSignUp() {
	}
		public void Input() {
		System.out.print("몇 개? >>");
		int num = scanner.nextInt();
		Array = new SignUp[num];
		for(int i = 0; i<Array.length;i++) {
			System.out.print("수강과목 >> ");
			String course = scanner.next();
			System.out.print("학점 >> ");
			int score = scanner.nextInt();
			System.out.print("담당교수 >> ");
			String name = scanner.next();
			Array[i] = new SignUp(course, score, name);
		}
	}

		public void View() {
			System.out.println("-----과목 열람-----");
			System.out.println(Arrays.toString(Array));
			System.out.println("-----------------");
		}
		public void run() {	
		while(true) {
		System.out.println("<<메뉴>>");
		System.out.print("원하는 것(입력: 1, 보기:2, 마침:3) ");
		int menu = scanner.nextInt();
		switch(menu) {
		case 1: Input(); break;
		case 2: View(); break;
		case 3: System.out.print("프로그램 종료"); return;
		}
	}
}
	public static void main(String[] args) {
		ClassSignUp cs = new ClassSignUp();
		cs.run();
	}
}