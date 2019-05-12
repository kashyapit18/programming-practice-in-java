public class MergeIntervals {
	public static void main(String[] args){
		int[][] array = {{1,4},{3,6},{7,8},{7,10},{9,12}};
		int size = array.length;
		for(int i = 0; i < size - 1; i++){
			int j = 0;
			if(array[i][j + 1] >= array[i + 1][j]){
				array[i][j + 1] = array[i + 1][j + 1];
			}
			else{
				continue;
			}
			for(int k = i + 2; k < size; k++){
				array[k-1][j] = array[k][j];
				array[k-1][j+1] = array[k][j+1];
			}
			size--;
			i--;
		}
		for(int i = 0; i < size; i++){
			for(int j = 0; j < array[i].length; j++){
				System.out.println(array[i][j] + " ");
			}
		}
	}
}
