import java.util.Scanner;
class 전화번호 {
	 String name, number;
	public 전화번호(String name, String number){
      this.name = name;
      this.number = number;
   }
   public String name1(){ return name;}
   public String number1(){ return number;}
}

public class 전화번호찾기 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      전화번호 [] myPhone = null;
     
      while(true){
         System.out.print("전화번호를 추가하시겠습니까? YES 아니면 NO 로 답변 바랍니다.");
         String answer1 = sc.next();
         if(answer1.equals("YES") || answer1.equals("Yes") || answer1.equals("yes")){
            while(true){
               System.out.println("몇 명을 추가하실건가요?");
               int a = sc.nextInt();
               myPhone = new 전화번호[a];
               
               for(int i=0; i<a; i++){
                  System.out.print("전화번호에 들어갈 추가 예정인 이름을 입력해주시오.");
                  String name = sc.next();
                  System.out.print("해당 이름에 대한 번호을 입력해주시오.");
                  String number = sc.next();
                  
                  myPhone[i] = new 전화번호(name, number);
               }
               
               System.out.println("추가 완료되었습니다.");
               break;
            }
            break;
         }
         if(answer1.equals("NO") || answer1.equals("No") || answer1.equals("no"))
         {
            System.out.println("작업을 멈추겠습니다. YES 아니면 NO 로 답변 바랍니다.");
            String answer2 = sc.next();
            if(answer2.equals("Yes") || answer2.equals("YES") || answer2.equals("yes")){
               break;
            }
            if(answer1.equals("NO") || answer1.equals("No") || answer1.equals("no")){
               continue;
            }
            else{
               System.out.println("뭐");
               break;
            }
         }
         else{
            System.out.println("뭐");
            break;
         }
      }
      
      for(int i=0; i<myPhone.length; i++){
         System.out.print("< ");
         System.out.print("전화번호는 " + myPhone[i].name + myPhone[i].number + "이다.");
         System.out.println(" >");
      }
      }
   }
