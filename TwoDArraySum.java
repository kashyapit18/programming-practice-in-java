public class TwoDArraySum {
	public static void main(String[] args){
		int row = 2;
		int col = 5;
		int num = 0;
		int[][] array = new int[2][5];
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				array[i][j] = num++;
			}
		}
		System.out.println("The sum of the elements of the 2D array is " + sumArray(array));
	}
	public static int sumArray(int[][] array){
		int sum = 0;
		for (int[] oneDArray: array) {
			for (int num: oneDArray) {
				sum += num;
			}
		}
		return sum;
	}
}
