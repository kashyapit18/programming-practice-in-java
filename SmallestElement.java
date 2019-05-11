public class SmallestElement {
	public static void main(String[] args){
		int[] array = {4,1,2,3,7,0,5,6,9,8};
		System.out.println("The largest of the elements of the array is " + findSmallest(array));
	}
	public static int findSmallest(int[] array){
		int min = array[0];
		for(int i = 1; i < array.length; i++){
			if(array[i] < min){
				min = array[i];
			}
		}
		return min;
	}
}
