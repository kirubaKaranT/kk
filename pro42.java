import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int m=in.nextInt();
    
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=in.nextInt();
    }
    int min=arr[0];
    int max=arr[0];
    for(int i=0;i<n;i++){
     if(min>arr[i]){
       min=arr[i];
     }
     if(max<arr[i]){
       max=arr[i];
     }
    }
    if(m==1)
    System.out.print(min);
    else if(m==2)
    System.out.print(Math.max(arr[0],arr[arr.length-1]));
    else{
       System.out.print(max);}
  }
}
