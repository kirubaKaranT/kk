import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    
    int c=1;
    while(n>0)
    {
    if(n%2==1)
    {System.out.print(c);
    System.exit(0);
    }
    n=n>>1;
    c++;

    }

  }
}
