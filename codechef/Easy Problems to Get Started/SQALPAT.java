import java.util.*;
public class SQALPAT
{
  void pat(int n)
  {
    int d=1;
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=5;j++)
      {
        if(i%2==1)
        {
          System.out.print(d+" ");
          d++;
        }
        else
        {
          d--;
          System.out.print(d+" ");
        }
      }
      d+=5;
      System.out.println();
    }
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    SQALPAT ob=new SQALPAT();
    int n=sc.nextInt();
    ob.pat(n);
  }
}
// time complexity = O(n*5)=>O(n) linear time
// space complexity = O(1)
