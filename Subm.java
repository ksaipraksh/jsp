public class Subm
{
	public static void main(String[] args) 
	{
		int rows,cols;
		int a[][] = {{2,2,2},{2,2,2},{2,2,2}};
		int b[][] = {{1,1,1},{1,1,1},{1,1,1}};
		rows = a.length;
		cols = a[0].length;

		int diff[][] = new int[rows][cols];

		for (int i=0;i<rows ;i++ ) 
		{
			for (int j=0;j<cols ;j++ ) 
			{
				diff[i][j] = a[i][j]-b[i][j];
				System.out.print(diff[i][j]+" ");
				
			}
			System.out.println();
		}
	}
}