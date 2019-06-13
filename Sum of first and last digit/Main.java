import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
       Scanner in= new Scanner(System.in);
      int n=in.nextInt();
      int t,last_digit,first_digit;
      int sum=0;
      t=n;
      last_digit=n%10;
      first_digit=n;
      while(n>10)
      {
        n=n/10;
      }
    first_digit=n;
      sum=first_digit+last_digit;
      System.out.println(sum);


	}
}