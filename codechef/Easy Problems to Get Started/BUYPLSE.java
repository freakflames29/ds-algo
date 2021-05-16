import java.util.*;
public class BUYPLSE
{
  void solve(int a,int b,int x,int y)
  {
    System.out.println((a*x)+(b*y));
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    BUYPLSE ob = new BUYPLSE();
    int a,b,x,y;
    a=sc.nextInt();
    b=sc.nextInt();
    x=sc.nextInt();
    y=sc.nextInt();
    ob.solve(a,b,x,y);
  }
}
// time compexity = O(n) linear time
// space compexity = O(1)
