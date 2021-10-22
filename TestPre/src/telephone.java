import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Number{
   private static String [] numb = {"010-1234-5678","033-250-8703","010-9876-5432","010-7777-7777"};
   private static String [] name = {"옆집철수", "짜장면집", "옆집영희", "아랫집초코"};
   public static String transform(String whatName){
      for(int i=0; i<name.length; i++){
         if(name[i].equals(whatName)){
            return numb[i];
         }
      }
   return null; // -> 얘 안하면 메서드 transform(String whatName) 에 빨간줄그어짐
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
      System.out.println("현재 등록된 이름 및 전화번호는 ");
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
         System.out.println("조회를 그만두시겠습니까? \"Yes\" or \"No\"를 입력바랍니다. => ");
         String answer = sc.next();
         if(answer.equals("Yes") || answer.equals("yes")){
            break;
         }
         
         if(answer.equals("No") || answer.equals("no")){
            System.out.println("어떤 사람을 조회하시겠습니까?(이름입력) 또한 멈추고싶다면 \"stop\"을 입력바랍니다. => ");
            String whatName = sc.next();
            if(whatName.equals("stop")){
               break;
            }
            String b = Number.transform(whatName);
            if(b==null){
               System.out.println(whatName + "는(은) 없는 정보입니다.");
               System.out.println("추가하시겠습니까? \"Yes\" or \"No\"를 입력바랍니다. => ");
               String answer2 = sc.next();
               if(answer2.equals("No") || answer2.equals("NO")){
                  continue;
               }
               else{
                  Number c = new Number();
                  System.out.println("추가하려는 이름을 작성해주십시오.");
                  String newName = sc.next();
                  c.name2(newName);
                  System.out.println("이름에 대한 전화번호를 입력해주시오.");
                  String newNum = sc.next();
                  c.numb2(newNum);
                  
                  System.out.println("추가 완료되었습니다.");
               } 
            }
            else{
               System.out.println(whatName + "의 전화번호는 " + b + "입니다");
            }
         }
         else{
            System.out.println("뭐");
            continue;
         }
      } 
   }
}