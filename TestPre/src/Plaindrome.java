import java.util.Scanner;
public class Plaindrome
{

   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in); 
      int number;
      int reversed = 0;
      int temp = 0;
      
      number = sc.nextInt();
      
      int origin_number = number;
      
      while(number>0)
      {
         temp = number % 10;
         number = (int)(number/10);
         reversed = reversed * 10 + temp;
      }
      if(origin_number == reversed){
         System.out.println("Yes");
      }
      else{
         System.out.println("Nope");
      }
   }
}