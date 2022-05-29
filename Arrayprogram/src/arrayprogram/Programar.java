package arrayprogram;

public class Programar
{
  public static void main(String[] args)
  {
	int n=6;
	  int arr[]= {5,3,7,8,4,8,6};
	System.out.println("before sort");
	for(int i=0;i<=n;i++) 
	{
		System.out.println(arr[i]);
	}
 System.out.println("after sort");
     for(int i=0;i<n;i++) 
     {
	 for(int j=i;j<n;j++) 
	  {
		if(arr[i]<arr[j]) 
		{
			int temp=arr[i];
			arr[i]=arr[j];
		   arr[j]=temp;
		}
	  }
	  }
		for(int i=0;i<n;i++) 
		{
		System.out.println(arr[i]);
		}System.out.println(arr[n]);
	 }
	 }
 
  

