import java.util.Scanner;
 
class Division {
  public static void main(String[] args) {
 
  int a, b, result;
 
  Scanner input = new Scanner(System.in);
  System.out.println("Input two integers");
 
  a = input.nextInt();
  b = input.nextInt();
  try{
	  
	  result = a / b;
	  System.out.println("Result = " + result);
  }catch(Exception e){
	  e.printStackTrace();
	  System.out.println("Cannot divide by 0 ");
  }finally {
	    System.out.println("finally block will execute.");
  }
 
 
  input.close();
  }
}