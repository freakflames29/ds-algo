import java.util.*;
public class ANGTRICH
{
  String trisolve(int a,int b,int c)
  {
    if((a+b+c==180) && a!=0 && b!=0 && c!=0)
    {
      return "YES";
    }
    else
    {
      return "NO";
    }
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    ANGTRICH ob=new ANGTRICH();
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    System.out.println(ob.trisolve(a,b,c));
  }
}
// time complexity = O(1)
// space complexity = O(1)
