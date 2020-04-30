class SumOfOdd
{
 public static void main(String[] args) 
 {
 	int sum=0,i;
 	for (i=1 ; i<=100 ; i++ ) 
 	{
 	 if(i%2!=0)
 	 {
      sum = sum + i;
 	 }	
 	}
 	System.out.println("Sum Of Odd" + sum);
 }
}