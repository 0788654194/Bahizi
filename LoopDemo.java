public class LoopDemo{
  public static void main(String[] args){
	//For loop
	System.out.print("For loop");
	System.out.print("\n");
    for (int i=1; i <= 5; i++){
       System.out.print(i);
    }
	System.out.print("\n");
	//While loop
	System.out.print("While loop");
	System.out.print("\n");
    int y = 1;
    while(y <= 5){
       System.out.print(y);
       y++;
    }

	System.out.print("\n");
	//do while loop
	System.out.print("Do while loop");
	System.out.print("\n");
    int z = 1;
    do{
      System.out.print(z);
      z++;
    }
    while(z <= 5);
 }
}