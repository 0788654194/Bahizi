public class GradeChecker{
  public static void main(String[] args){
   int grade = 58;

   if (grade >= 80 ){
     System.out.print("Grade A");
   }
   else if(grade >= 60){
     System.out.print("Grade B");
   }
   else if(grade >= 40){
     System.out.print("Grade C");
   }
   else if(grade >= 0){
     System.out.print("FAIL");
   }
   else{
     System.out.print("Invalid Input");

   }
  
  }

}