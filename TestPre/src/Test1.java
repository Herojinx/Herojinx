import java.util.Scanner;
class Array{
   Array [] array;
   String first;
   String second;
   
   public Array(String first , String second){
      this.first = first;
      this.second = second;
   }
   
   public void Card() {
	   String card[] = {"Ace","1","2","3","4","5","6","7","8",
			   "9","10","Jack","Queen","King"};
	   int rank [] = {1,13,12,11,10,9,8,7,6,5,4,3,2};
	   for(int i=0;i<card.length; i++) {
           if(card[i].equals(first)) {
              System.out.println(card[i]+"의 점수는 "+rank[i]);
              break;
           }
	   }
	
	   
   }
   void run(){
      Scanner scanner = new Scanner(System.in);
      System.out.print("첫번째 카드 : ");
      String first = scanner.next();
      System.out.print("두번째 카드 : ");
      String second = scanner.next();
      Card();
      
   }
}
public class Test1 {
   public static void main(String[] args) {
      Array k = new Array();
      k.run();
   }
}