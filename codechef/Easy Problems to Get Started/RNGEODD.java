import java.util.*;
public class RNGEODD
{
  void range(int l,int h)
  {
    ArrayList <Integer> tmparr = new ArrayList <Integer> ();
    for(int i=l;i<=h;i++)
    {
      if(i%2!=0)
      {
        tmparr.add(i);
      }
    }
    for(int j=0;j<tmparr.size();j++)
    {
      System.out.print(tmparr.get(j)+" ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    RNGEODD ob=new RNGEODD();
    int l,h;
    l=sc.nextInt();
    h=sc.nextInt();
    ob.range(l,h);
  }
}
// time compexity : O(n) linear time
// space compexity : O(1) 
