public class AvgArray {
	public static void main(String[] args) {
		int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println("The average of the elements of the array is: " + avgArray(array));
	}

	public static double avgArray(int[] array) {
		double sum = 0.0;
		for(int num : array){
			sum += num;
		}
		return sum / array.length;
	}
}

