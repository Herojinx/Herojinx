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
		System.out.print("인원수 >> ");
		int n = scanner.nextInt();
		pArray = new Phone[n];
		for (int i=0; i<n; i++) {
			System.out.print("이름과 전화번호 빈칸없이 입력>>");
			String name = scanner.next();
			String tel = scanner.next();
			pArray[i] = new Phone(name,tel);
		}
		System.out.println("저장이 되었습니다");
		while(true) {
			System.out.print("검색할 이름>> ");
			String name = scanner.next();
			if(name.equals("그만"))
				break;
			String tel = search(name);
			if(tel == null)
				System.out.println(name+"은 없습니다.");
			else 
				System.out.println(name+"의 번호는 "+ tel+"입니다");
		}
		scanner.close();
	}
	public static void main(String[] args) {
		PhoneBookWhile pb = new PhoneBookWhile();
		pb.run();
	}
}
