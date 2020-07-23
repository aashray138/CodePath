package codepath.week8;

public class Convert2Dto1D {

	public static void main(String[] args) {
	
		int [][] arr = {{1,2},{2,3},{3,4},{4,5}};
		
		int rows = arr.length;
		int cols = arr[0].length;
		int dim = rows * cols;
		
		int [] val = convert(arr, dim, rows, cols);
		
		for (int v : val)
			System.out.println(v);
		

	}

	private static int[] convert(int[][] arr, int dim, int rows, int cols) {
		// TODO Auto-generated method stub
			int [] a = new int [dim];

			for ( int i = 0 ; i < rows ; i++) {
				for (int j =0 ; j < cols ; j++) {
					a [ i * cols + j] = arr [i][j];
				}
			}
		return a;
	}

}
