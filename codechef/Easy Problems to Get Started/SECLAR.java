import java.util.*;
public class SECLAR
{
  int seclar(int a,int b,int c)
  {
    if(a>b && a<c)
    {
        return a;
    }
    else if(b>a && b<c)
    {
      return b;
    }
    else
    {
      return c;
    }
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    SECLAR ob=new SECLAR();
    int a,b,c;
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    System.out.println(ob.seclar(a,b,c));

  }
}
// time complexity = O(n) linear time
// space complexity = O(1)
