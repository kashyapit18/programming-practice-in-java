public class LargestElement {
	public static void main(String[] args){
		int[] array = {4,1,2,3,7,0,5,6,9,8};
		System.out.println("The largest of the elements of the array is " + findLargest(array));
	}
	public static int findLargest(int[] array){
		int max = array[0];
		for(int i = 1; i < array.length; i++){
			if(array[i] > max){
				max = array[i];
			}
		}
		return max;
	}

}
