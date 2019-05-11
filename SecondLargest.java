public class SecondLargest {
	public static void main(String[] args){
		int[] array = {4,1,1,3,7,7,5,8,8};
		array = sortArray(array);
		System.out.println("The second largest of the elements in the array is " + findSecondLargest(array));
	}
	public static int[] sortArray(int[] array){
		for(int i = 0; i < array.length - 1; i++){
			for(int j = 0; j < array.length - (i + 1); j++){
				if(array[j + 1] > array[j]){
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}
	public static int findSecondLargest(int[] array){
		int largest = array[0];
		int secondLargest = array[1];
		for(int i = 1; i < array.length; i++){
			if(array[i] == largest){
				continue;
			}
			else{
				secondLargest = array[i];
				break;
			}
		}
		return secondLargest;
	}
}
