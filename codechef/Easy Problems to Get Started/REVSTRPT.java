import java.util.*;
public class REVSTRPT
{
  void star(int n)
  {
    for(int i=0;i<n;i++)
    {
      for(int j=i;j<n-1;j++)
      {
        System.out.print(" ");
      }
      for(int k=0;k<=i;k++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    REVSTRPT ob=new REVSTRPT();
    int n=sc.nextInt();
    ob.star(n);
  }
}
// time complexity = O(n^2)
// space complexity = O(1)
