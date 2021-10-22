import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Number{
   private static String [] numb = {"010-1234-5678","033-250-8703","010-9876-5432","010-7777-7777"};
   private static String [] name = {"����ö��", "¥�����", "��������", "�Ʒ�������"};
   public static String transform(String whatName){
      for(int i=0; i<name.length; i++){
         if(name[i].equals(whatName)){
            return numb[i];
         }
      }
   return null; // -> �� ���ϸ� �޼��� transform(String whatName) �� �����ٱ׾���
   }
   public void numb2(String newNum){
      ArrayList<String> list = new ArrayList<>(Arrays.asList(numb));
      list.add(newNum);
      numb = list.toArray(numb);
   }
   public void name2(String newName){
      ArrayList<String> list = new ArrayList<>(Arrays.asList(name));
      list.add(newName);
      numb = list.toArray(name);
   }
   public static void see(){
      System.out.println("���� ��ϵ� �̸� �� ��ȭ��ȣ�� ");
       System.out.print("< ");
       for(int i=0; i<name.length; i++){
          System.out.print(name[i]+" ");
       }
       System.out.println(">");
   }
}
public class telephone {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      Number a = new Number();
      while(true)
      {
         a.see();
         System.out.println("��ȸ�� �׸��νðڽ��ϱ�? \"Yes\" or \"No\"�� �Է¹ٶ��ϴ�. => ");
         String answer = sc.next();
         if(answer.equals("Yes") || answer.equals("yes")){
            break;
         }
         
         if(answer.equals("No") || answer.equals("no")){
            System.out.println("� ����� ��ȸ�Ͻðڽ��ϱ�?(�̸��Է�) ���� ���߰�ʹٸ� \"stop\"�� �Է¹ٶ��ϴ�. => ");
            String whatName = sc.next();
            if(whatName.equals("stop")){
               break;
            }
            String b = Number.transform(whatName);
            if(b==null){
               System.out.println(whatName + "��(��) ���� �����Դϴ�.");
               System.out.println("�߰��Ͻðڽ��ϱ�? \"Yes\" or \"No\"�� �Է¹ٶ��ϴ�. => ");
               String answer2 = sc.next();
               if(answer2.equals("No") || answer2.equals("NO")){
                  continue;
               }
               else{
                  Number c = new Number();
                  System.out.println("�߰��Ϸ��� �̸��� �ۼ����ֽʽÿ�.");
                  String newName = sc.next();
                  c.name2(newName);
                  System.out.println("�̸��� ���� ��ȭ��ȣ�� �Է����ֽÿ�.");
                  String newNum = sc.next();
                  c.numb2(newNum);
                  
                  System.out.println("�߰� �Ϸ�Ǿ����ϴ�.");
               } 
            }
            else{
               System.out.println(whatName + "�� ��ȭ��ȣ�� " + b + "�Դϴ�");
            }
         }
         else{
            System.out.println("��");
            continue;
         }
      } 
   }
}