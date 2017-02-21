
public class problem81 {
	public static void main(String[] args) {
		
		int[][] matrix = new int[4][4];

		int largestRow = 0;
		
		int large = -1;
		
		for (int x = 0; x < matrix.length; x++) {
			int rowCount = 0;
			
			for (int i = 0; i < matrix[x].length; i++) {
				matrix[x][i] = (int)(Math.random() * 2); // 0 and 1
				rowCount += matrix[x][i];
			}
			if (rowCount > large) {
				largestRow = x;
				large = rowCount;
			}
		}

		int largestColumn = 0;
		
		large = -1;
		
		for (int j = 0; j < matrix[0].length; j++) {
			int columnCount = 0;
			
			for (int k = 0; k < matrix.length; k++) {
				columnCount += matrix[k][j];
			}
			if (columnCount > large) {
				large = columnCount;
				largestColumn = j;
			}
		}
		for (int m = 0; m < matrix.length; m++) {
			
			for (int n = 0; n < matrix[m].length; n++) {
				System.out.printf("%d", matrix[m][n]);
			}
		}
		System.out.println("The largest row index is: " + largestRow);
		
		System.out.println("The largest column index is: " + largestColumn);

	}

}

