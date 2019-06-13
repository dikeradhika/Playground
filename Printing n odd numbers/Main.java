import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
        Scanner in=new Scanner(System.in);
      int n=in.nextInt();
     
     int i,c;
      c=n;
      for(i=1;i<=n;i++)
      {
       
          System.out.println(2*i-1);
        c=c-1;
       
      }
     
        
      
	}
}