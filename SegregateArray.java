public class SegregateArray {
	public static void main(String[] args){
		int[] array = {1,0,1,0,1,0};
		int[] segregatedArray = segregateArray(array);
		printArray(segregatedArray);
	}
	public static int[] segregateArray(int[] array){
		int[] newArray = new int[array.length];
		int index1 = 0;
		int index2 = newArray.length - 1;
		for(int i = 0; i < array.length; i++){
			if(array[i] == 0){
				newArray[index1++] = array[i];
			}
			else {
				newArray[index2--] = array[i];
			}
		}
		return newArray;
	}
	public static void printArray(int[] segregatedArray){
		for(int elem : segregatedArray){
			System.out.print(elem + " ");
		}
	}
}
