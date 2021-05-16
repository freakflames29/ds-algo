import java.util.*;
public class ISBOTH
{
  void isboth(int n)
  {
    if(n%5==0 && n%11==0)
    {
      System.out.println("BOTH");
    }
    else if(n%5==0 || n%11==0)
    {
      System.out.println("ONE");
    }
    else
    {
      System.out.println("NONE");
    }
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    ISBOTH ob=new ISBOTH();
    int n=sc.nextInt();
    ob.isboth(n);
  }
}
// time complexity = O(1)
// space complexity = O(1)
