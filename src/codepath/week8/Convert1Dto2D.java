package codepath.week8;

public class Convert1Dto2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		int [][] newArr =  convert(arr);
		
		for (int[] a : newArr){
			System.out.println(a);
		}
	}

	private static int[][] convert(int[] arr) {
		
		int array2d[][] = new int[5][3];

			int k = 0; 
		for(int i=0; i<5;i++)
		   for(int j=0;j<3;j++)
		       array2d[i][j] = arr[k];
					k++;
		
		return array2d;
}
}
