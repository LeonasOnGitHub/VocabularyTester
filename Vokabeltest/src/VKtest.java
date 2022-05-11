import java.util.ArrayList;
import java.util.Scanner;
public class VKtest {
  
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println();       
    System.out.println("Gib immer zu erst das Wort und dann Die übersetzung ein");
    System.out.println("Wenn du Fertig bist gib P ein");
    System.out.println();
    ArrayList<String> wort = new ArrayList<String>();
    ArrayList<String> wort2 = new ArrayList<String>();
    
    for (int i=0 ;-1<i ;i++ ) {
    	String a=sc.next();
    	if (a.equals("P")) {
    		break;
    	}
    	String b=sc.next();
      wort.add(a);
      wort2.add(b);
      System.out.println();
    } // end of for
    System.out.println();
    System.out.println();
    for (int x=0 ;x+1>x ;x++ ) {
      int h = (int) (Math.random() *wort.size());
      int r = (int) (Math.random() *2);
      if (r>0) {
      System.out.println(" " +wort.get(h));
      System.out.println(" Lousung:");
      String q=sc.next();
      System.out.println(" " +wort2.get(h));
      System.out.println();
      }else {
   	  System.out.println(" " +wort2.get(h)); 
   	  System.out.println(" Lousung:");
   	  String q=sc.next();
      System.out.println(" " +wort.get(h));
      System.out.println();
      }
      } // end of for
  } // end of main

} // end of class VokabelTester
