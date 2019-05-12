public class OverlapIntervals {
	private static class ArraySize{
		int size;
	}
	public static void main(String[] args){
		int[][] array = {{1,4},{3,6},{7,8},{7,10},{9,12}};
		ArraySize arraySize = new ArraySize();
		arraySize.size = array.length;
		int[][] overlappedArray = findOverlappedArray(array, arraySize);
		printOverlappedArray(overlappedArray, arraySize);
	}
	public static int[][] findOverlappedArray(int[][] array, ArraySize arraySize){
		for(int i = 0; i < arraySize.size - 1; i++){
			int j = 0;
			if(array[i][j + 1] >= array[i + 1][j]){
				array[i][j + 1] = array[i + 1][j + 1];
			}
			else{
				continue;
			}
			for(int k = i + 2; k < arraySize.size; k++){
				array[k-1][j] = array[k][j];
				array[k-1][j+1] = array[k][j+1];
			}
			arraySize.size--;
			i--;
		}
		return array;
	}
	public static void printOverlappedArray(int[][] overlappedArray, ArraySize arraySize){
		for(int i = 0; i < arraySize.size; i++){
			for(int j = 0; j < overlappedArray[i].length; j++){
				System.out.print(overlappedArray[i][j] + " ");
			}
			System.out.println();
		}
	}
}
