import java.util.Scanner;
public class AlternateElements {
	public static void main(String[] args){
		int[] array = {4,1,2,3,7,0,5,6,9};
		Scanner scanner = new Scanner(System.in);
		int startIndex = scanner.nextInt();
		switch(startIndex){
			case 0:
				if(array.length % 2 == 0){
					for(int i = startIndex; i < array.length - 1; i += 2){
						System.out.print(array[i] + " ");
					}
				}
				else {
					for(int i = startIndex; i < array.length; i += 2){
						System.out.print(array[i] + " ");
					}
				}
				break;
			case 1:
				if(array.length % 2 == 0){
					for(int i = startIndex; i < array.length; i += 2){
						System.out.print(array[i] + " ");
					}
				}
				else {
					for(int i = startIndex; i < array.length - 1; i += 2){
						System.out.print(array[i] + " ");
					}
				}
				break;
		}
	}
}
