public class SortArray {
	public static void main(String[] args){
		int[] array = {1,0,1,0,1,1};
		int[] sortedArray = findSorted(array);
		printSortedArray(sortedArray);
	}
	public static int[] findSorted(int[] array){
		int start = 0;
		int end = array.length - 1;
		while(start < end){
			if(array[start] == 0 && array[end] == 0){
				start++;
			}
			else if(array[start] == 0 && array[end] == 1){
				start++;
				end--;
			}
			else if(array[start] == 1 && array[end] == 0) {
				int temp;
				temp = array[start];
				array[start] = array[end];
				array[end] = temp;
				start++;
				end--;
			}
			else {
				end--;
			}

		}
		return array;
	}
	public static void printSortedArray(int[] reversedArray){
		for(int i = 0; i < reversedArray.length; i++){
			System.out.print(reversedArray[i] + " ");
		}
	}
}
