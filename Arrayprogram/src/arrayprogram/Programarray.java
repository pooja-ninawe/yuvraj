package arrayprogram;

import java.util.Arrays;

public class Programarray 
{
public static void main(String[] args)
{
  	
  
  int a[]= {23,40,4,16,71,34,85,31,78,};

  
  
  int b=a.length;
  Arrays.sort(a);
  System.out.println(" asending order");
  for(int i=0;i<b;i++) 
  {
	  System.out.println(a[i]);
  }
  System.out.println("desending order");
  for(int j=8;j>=0;j--) {
	  System.out.println(a[j]);
  }

}
}