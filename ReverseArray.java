public class ReverseArray {
	public static void main(String[] args){
		int[] array = {1,2,3,4,5,6,7,8,9,0};
		int[] reversedArray = findReverse(array);
		printReversedArray(reversedArray);
	}
	public static int[] findReverse(int[] array){
		int start = 0;
		int end = array.length - 1;
		while(start < end){
			int temp;
			temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
		return array;
	}
	public static void printReversedArray(int[] reversedArray){
		for(int i = 0; i < reversedArray.length; i++){
			System.out.print(reversedArray[i] + " ");
		}
	}
}
