import java.util.Scanner;

public class Recursion_keypad_combination {
  public static String [] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
  
  public static void printComb(String str, int idx, String combination) {
	 
	  if(idx==str.length()) {
		  System.out.println(combination);
		  return;
	  }
	  
	  char currChar = str.charAt(idx);
	  String map = keypad[currChar-'0'];
	  
	  for(int i=0;i<map.length();i++) {
		printComb(str,idx+1,combination+map.charAt(i));  
	  }
	  
  }
  
  public static void main(String[]args) {
	  Scanner sc =new Scanner(System.in);
	  System.out.println("Enter keypad combination number");
	  String str = sc.nextLine();
	  printComb(str,0,"");
  }
}

