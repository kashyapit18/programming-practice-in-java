public class MaximaInArray {
	public static void main(String[] args){
		int[] array = {4,1,2,3,7,0,5,6,9,8};
		printMaximas(array);
	}
	public static void printMaximas(int[] array){
		int max = array[array.length - 1];
		System.out.print(max + " ");
		for(int i = array.length - 2; i >= 0; i--){
			if(array[i] > max){
				System.out.print(array[i] + " ");
				max = array[i];
			}
		}
	}
}
