import java.util.*;
public class DIFACTRS
{
  void solve(int n)
  {
    int cnt=0;
    ArrayList<Integer> tmparray=new ArrayList<Integer>();
    for(int i=1;i<=n;i++)
    {
      if(n%i==0)
      {
        tmparray.add(i);
        cnt++;
      }
    }
    System.out.println(cnt);
    for(int j=0;j<tmparray.size();j++)
    {
      System.out.print(tmparray.get(j)+" ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    DIFACTRS ob=new DIFACTRS();
    int n=sc.nextInt();
    ob.solve(n);
  }
}
// time complexity = O(n) linear time
// space complexity = O(1) 
