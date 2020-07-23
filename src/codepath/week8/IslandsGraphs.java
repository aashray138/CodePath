package codepath.week8;

public class IslandsGraphs {

	public static void main(String[] args) {
		int [][] world = { { 1, 1, 0, 0 ,0},
						   { 1, 1, 0, 0 ,0},
						   { 1, 1, 0, 1 ,0}	,
						   { 1, 0, 0, 0 ,1}	
							};

		// The idea is to traverse through the entire matrix and find out all the adjacent 1's
		// that make up the island
		int count = 0; 
		for (int  i =0 ; i < world.length; i++) {
			for (int j =0; j < world[0].length ;j++) {
				if (world[i][j] == 1) 				
				count += dfs (world,i ,j);
			}
		}
		
		System.out.println(count);
		
	}

	private static int dfs(int[][] world, int i, int j) {
	
		if (world == null || i < 0 || j < 0 || i >= world.length || j >= world[0].length 
				|| world[i][j] == 0) {
			return 0;
		} 

		world [i][j] = 0;
		dfs (world, i+1,j);
		dfs (world, i-1,j);
		dfs (world, i,j+1);
		dfs (world, i,j-1);
		
		return 1;
	}

}
