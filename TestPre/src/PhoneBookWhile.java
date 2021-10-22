import java.util.Scanner;
class Phone {
	private String name, tel;
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getName() {	return name;}
	public String getTel() {	return tel;}
}

public class PhoneBookWhile {
	private Phone[] pArray;
	private Scanner scanner;
	public PhoneBookWhile() {
		scanner = new Scanner(System.in);
	}
	public String search(String name) {
		for(Phone p : pArray) {
			if (p.getName().equals(name))
				return p.getTel();
		}
		return null;
	}
	public void run() {
		System.out.print("�ο��� >> ");
		int n = scanner.nextInt();
		pArray = new Phone[n];
		for (int i=0; i<n; i++) {
			System.out.print("�̸��� ��ȭ��ȣ ��ĭ���� �Է�>>");
			String name = scanner.next();
			String tel = scanner.next();
			pArray[i] = new Phone(name,tel);
		}
		System.out.println("������ �Ǿ����ϴ�");
		while(true) {
			System.out.print("�˻��� �̸�>> ");
			String name = scanner.next();
			if(name.equals("�׸�"))
				break;
			String tel = search(name);
			if(tel == null)
				System.out.println(name+"�� �����ϴ�.");
			else 
				System.out.println(name+"�� ��ȣ�� "+ tel+"�Դϴ�");
		}
		scanner.close();
	}
	public static void main(String[] args) {
		PhoneBookWhile pb = new PhoneBookWhile();
		pb.run();
	}
}
