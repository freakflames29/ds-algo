import java.util.*;
public class TRIVALCH
{
  void validtri(int a,int b,int c)
  {
      if(a+b<=c || b+c<=a||c+a<=b)
    	{
    		System.out.println("NO");
    	}
  	else
    	{
    		System.out.println("YES");
    	}
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    TRIVALCH ob=new TRIVALCH();
    int a,b,c;
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    ob.validtri(a,b,c);
  }
}
// time complexity = O()
// space complexity = O()
