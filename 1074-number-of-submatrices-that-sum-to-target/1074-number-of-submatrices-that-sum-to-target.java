class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
	var count = 0;
	var cols = matrix[0].length;
	Arrays.stream(matrix)
		  .forEach(row -> Arrays.parallelPrefix(row, Integer::sum));
	

	for (var col1 = 0; col1 < cols; col1++)
		for (var col2 = col1; col2 < cols; col2++) {
			var sumToFrequency = new HashMap<>(Map.of(0, 1));
			var currentSum = 0;

			for (var row : matrix) {
				currentSum += row[col2];
				if (col1 > 0)
					currentSum -= row[col1 - 1];
				count += sumToFrequency.getOrDefault(currentSum - target, 0);
				sumToFrequency.compute(currentSum, (sum, freq) -> freq == null ? 1 : ++freq);
			}
		}
	return count;
}
}