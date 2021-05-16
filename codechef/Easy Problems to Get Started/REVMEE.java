import java.util.*;
public class REVMEE
{
  void print_rev(int a[],int n)
  {
    int start=0;
    int end=n;
    if(start<=end)
    {
      int temp=a[start];
      a[start]=a[end];
      a[end]=temp;
      start++;
      end--;
    }
    for(int i=0;i<=n;i++)
    {
      System.out.print(a[i]+" ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    REVMEE ob=new REVMEE();
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    ob.print_rev(a,n-1);
  }
}
// time complexity = O(n) linear time
// space complexity = O(1)  
