import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int matrix1[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        matrix1[i][j]=sc.nextInt();
      }
    }
   
    int sub[][]=new int[c][r];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        sub[j][i]=matrix1[i][j];
      }
    }
    
     for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        System.out.print(sub[i][j] + " ");
      }
       System.out.println();
    }
    
    
    
    
     
  }
}