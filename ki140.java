import java.util.*;
import java.util.regex.*;
public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String n=in.next();
    if(Pattern.matches("[a|b]*",n))
  System.out.print("yes");
  else
  System.out.print("no");
  }
}
