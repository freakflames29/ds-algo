import java.util.Scanner;
public class  FINDMELI
{
	int findme(int a[],int key)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		 FINDMELI ob=new  FINDMELI();
		Scanner s=new Scanner(System.in);
		int n;
		int key;
		n=s.nextInt();
		key=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println(ob.findme(a,key));
  }
}
// time complexity = O(n) linear time
// space complexity = O(1)
