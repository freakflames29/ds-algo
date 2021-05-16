import java.util.*;
public class  ADDNATRL
{
  //iterative solution
	long sum(long num)
	{
		long sum=0;
		for (long i=1;i<=num ;i++ )
		{
			sum+=i;
		}
		return sum;
	}
  // recursive solution
  long sum_recursive(long num)
  {
    if(num==0) //base case
    {
      return 0;
    }
    return num+sum_recursive(num-1);
  }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
  	long num=s.nextLong();
		ADDNATRL ob=new  ADDNATRL();
		System.out.println(ob.sum_recursive(num));

  }
}
// time complexity = O(n) linear time
// space complexity = O(1) but for recursive solution O(n)
