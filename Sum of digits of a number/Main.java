import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
        int t,d;
      int sum=0;
       t=n;
      while(n>0)
      {
        d=n%10;
        sum=sum+d;
        n=n/10;
      }
      System.out.println(sum);
	}
}