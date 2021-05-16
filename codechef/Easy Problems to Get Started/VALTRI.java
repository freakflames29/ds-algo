import java.util.*;
public class VALTRI
{
  void solve(int n)
  {
    if(n%5 ==0 || n%6==0)
    {
      System.out.println("YES");
    }
    else
    {
      System.out.println("NO");
    }
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     VALTRI ob=new  VALTRI();
     int n=sc.nextInt();
     ob.solve(n);
  }
}
// time complexity = O(n) constant time
// space complexity = O(1)
