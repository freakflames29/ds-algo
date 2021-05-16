 import java.util.*;
 public class EXTRICHK
 {
   int tri(int a,int b,int c)
   {
      if(a+b<=c || b+c<=a || a+c<=b)
      	{
      		return -1;
      	}
    	else if( a==b && b==c )
      	{
      		return 1;
      	}
    	else if(a==b || a==c || b==c)
      	{
      		return 2;
      	}
    	else
      	{
      		return 3;
      	}
   }
   public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     EXTRICHK ob=new EXTRICHK();
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();
     System.out.println(ob.tri(a,b,c));
   }
 }
 // time complexity = O(1)
 // space complexity = O(1)
