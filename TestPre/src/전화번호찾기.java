import java.util.Scanner;
class ��ȭ��ȣ {
	 String name, number;
	public ��ȭ��ȣ(String name, String number){
      this.name = name;
      this.number = number;
   }
   public String name1(){ return name;}
   public String number1(){ return number;}
}

public class ��ȭ��ȣã�� {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      ��ȭ��ȣ [] myPhone = null;
     
      while(true){
         System.out.print("��ȭ��ȣ�� �߰��Ͻðڽ��ϱ�? YES �ƴϸ� NO �� �亯 �ٶ��ϴ�.");
         String answer1 = sc.next();
         if(answer1.equals("YES") || answer1.equals("Yes") || answer1.equals("yes")){
            while(true){
               System.out.println("�� ���� �߰��Ͻǰǰ���?");
               int a = sc.nextInt();
               myPhone = new ��ȭ��ȣ[a];
               
               for(int i=0; i<a; i++){
                  System.out.print("��ȭ��ȣ�� �� �߰� ������ �̸��� �Է����ֽÿ�.");
                  String name = sc.next();
                  System.out.print("�ش� �̸��� ���� ��ȣ�� �Է����ֽÿ�.");
                  String number = sc.next();
                  
                  myPhone[i] = new ��ȭ��ȣ(name, number);
               }
               
               System.out.println("�߰� �Ϸ�Ǿ����ϴ�.");
               break;
            }
            break;
         }
         if(answer1.equals("NO") || answer1.equals("No") || answer1.equals("no"))
         {
            System.out.println("�۾��� ���߰ڽ��ϴ�. YES �ƴϸ� NO �� �亯 �ٶ��ϴ�.");
            String answer2 = sc.next();
            if(answer2.equals("Yes") || answer2.equals("YES") || answer2.equals("yes")){
               break;
            }
            if(answer1.equals("NO") || answer1.equals("No") || answer1.equals("no")){
               continue;
            }
            else{
               System.out.println("��");
               break;
            }
         }
         else{
            System.out.println("��");
            break;
         }
      }
      
      for(int i=0; i<myPhone.length; i++){
         System.out.print("< ");
         System.out.print("��ȭ��ȣ�� " + myPhone[i].name + myPhone[i].number + "�̴�.");
         System.out.println(" >");
      }
      }
   }
