// O(n+m) 으로 풀기
class Solution {
	public int countNegatives(int[][] grid) {
		int count = 0;

		int column = grid[0].length;
		int resultColumn = 0;
		int row = grid.length;
		int resultRow = row - 1;

		while(resultRow >= 0 && column > resultColumn){
			if (grid[resultRow][resultColumn] < 0) {
				count += (column - resultColumn);
				resultRow--;
			} else{
				resultColumn++;
			}
		}

		return count;
	}
}