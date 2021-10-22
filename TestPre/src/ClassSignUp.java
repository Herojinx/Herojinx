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
		return "����: "+course+" ����: "+score+" ��米��: "+course+"\n";
	}
}
public class ClassSignUp {
	public SignUp[] Array;
	Scanner scanner = new Scanner(System.in);
	public ClassSignUp() {
	}
		public void Input() {
		System.out.print("�� ��? >>");
		int num = scanner.nextInt();
		Array = new SignUp[num];
		for(int i = 0; i<Array.length;i++) {
			System.out.print("�������� >> ");
			String course = scanner.next();
			System.out.print("���� >> ");
			int score = scanner.nextInt();
			System.out.print("��米�� >> ");
			String name = scanner.next();
			Array[i] = new SignUp(course, score, name);
		}
	}

		public void View() {
			System.out.println("-----���� ����-----");
			System.out.println(Arrays.toString(Array));
			System.out.println("-----------------");
		}
		public void run() {	
		while(true) {
		System.out.println("<<�޴�>>");
		System.out.print("���ϴ� ��(�Է�: 1, ����:2, ��ħ:3) ");
		int menu = scanner.nextInt();
		switch(menu) {
		case 1: Input(); break;
		case 2: View(); break;
		case 3: System.out.print("���α׷� ����"); return;
		}
	}
}
	public static void main(String[] args) {
		ClassSignUp cs = new ClassSignUp();
		cs.run();
	}
}