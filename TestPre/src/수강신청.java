
import java.util.Scanner;
class ���λ���
{
   static ���λ��� [] ������û�迭;
   String subject ;
   String score ;
   String professor ;
   String where ;
   
   public ���λ���(String subject , String score , String professor , String where)
   {
      this.subject = subject;
      this.score = score;
      this.professor = professor;
      this.where = where;
   }
   static void ��ȸ()
   {
      System.out.println("�߰��� ���� ��Ȳ ��ȸ");
      for(int i=0; i<������û�迭.length; i++)
      {
         System.out.print("<<<");
         System.out.print(������û�迭[i].subject + " ����" + " " + ������û�迭[i].score + " �� �̼��ϰ�, ��� �������� "  +������û�迭[i].professor + "�̸�, ������ " + ������û�迭[i].where + "�̴�.");
         System.out.print(">>>");

      }
   }
   static void run()
   {
      Scanner sc = new Scanner(System.in);
      while(true)
      {
         System.out.println("������û ���α׷�");
         System.out.println("���� : 1 // �Է� : 2 // ��ħ : 3");
         System.out.print("��ȣ�� �Է��Ͻÿ� >>> ");
         int number = sc.nextInt();
         
         if(number==1)
         {
            System.out.println("�Էµ� ������ ��ȸ�մϴ�.");
            ���λ���.��ȸ();
         }
         if(number==2)
         {
            System.out.print("�� ������ �����ʴϱ�? >>> ");
            int number1 = sc.nextInt();
            ������û�迭 = new ���λ��� [number1];
            for(int i=0; i<������û�迭.length; i++)
            {
               System.out.print("���ο� ������ �Է��մϴ�.");
               System.out.print("������ �Է��Ͻʽÿ� >>> ");
               String subject = sc.next();
               System.out.print("�̼������� �Է��Ͻʽÿ� >>> ");
               String score = sc.next();
               System.out.print("��米���� �Է��Ͻʽÿ� >>> ");
               String professor = sc.next();
               System.out.print("������Ҹ� �Է��Ͻʽÿ� >>> ");
               String where = sc.next();
            
               ������û�迭 [i] = new ���λ���(subject , score , professor , where);
            }
         }
         if(number==3)
         {
            break;
         }
         else
         {
            continue;
         }

      }   
   }
}
public class ������û {public static void main(String[] args) {���λ���.run();}}