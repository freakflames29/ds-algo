import java.util.*;
public class SUMEVOD
{
  void sum_evn_odd(int a[])
  {
    int odd=0;
    int even=0;
    for(int i=0;i<a.length;i++)
    {
      if(a[i]%2!=0)
      {
        odd+=a[i];
      }
      else
      {
        even+=a[i];
      }
    }
    System.out.println(odd+" "+even);
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    SUMEVOD ob=new SUMEVOD();
    int n=sc.nextInt();
    int a[]=new int[n*2];
    int k=1;
    for(int i=0;i<a.length;i++)
    {
      a[i]=k;
      k++;
    }
    ob.sum_evn_odd(a);
  }
}
// time complexity = O(n) linear time
// space complexity = O(1)
