
import java.util.Scanner;
class 세부사항
{
   static 세부사항 [] 수강신청배열;
   String subject ;
   String score ;
   String professor ;
   String where ;
   
   public 세부사항(String subject , String score , String professor , String where)
   {
      this.subject = subject;
      this.score = score;
      this.professor = professor;
      this.where = where;
   }
   static void 조회()
   {
      System.out.println("추가된 과목 현황 조회");
      for(int i=0; i<수강신청배열.length; i++)
      {
         System.out.print("<<<");
         System.out.print(수강신청배열[i].subject + " 과목" + " " + 수강신청배열[i].score + " 점 이수하고, 담당 교수님은 "  +수강신청배열[i].professor + "이며, 교실은 " + 수강신청배열[i].where + "이다.");
         System.out.print(">>>");

      }
   }
   static void run()
   {
      Scanner sc = new Scanner(System.in);
      while(true)
      {
         System.out.println("수강신청 프로그램");
         System.out.println("보기 : 1 // 입력 : 2 // 마침 : 3");
         System.out.print("번호를 입력하시오 >>> ");
         int number = sc.nextInt();
         
         if(number==1)
         {
            System.out.println("입력된 과목을 조회합니다.");
            세부사항.조회();
         }
         if(number==2)
         {
            System.out.print("몇 과목을 들으십니까? >>> ");
            int number1 = sc.nextInt();
            수강신청배열 = new 세부사항 [number1];
            for(int i=0; i<수강신청배열.length; i++)
            {
               System.out.print("새로운 과목을 입력합니다.");
               System.out.print("과목을 입력하십시오 >>> ");
               String subject = sc.next();
               System.out.print("이수학점을 입력하십시오 >>> ");
               String score = sc.next();
               System.out.print("담당교수를 입력하십시오 >>> ");
               String professor = sc.next();
               System.out.print("수강장소를 입력하십시오 >>> ");
               String where = sc.next();
            
               수강신청배열 [i] = new 세부사항(subject , score , professor , where);
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
public class 수강신청 {public static void main(String[] args) {세부사항.run();}}