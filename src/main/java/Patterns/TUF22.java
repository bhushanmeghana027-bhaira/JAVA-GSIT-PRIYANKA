package Patterns;

public class TUF22 {
	public static void main(String[] args) {
		int n = 3;
		int size = 2 * n - 1;

		for(int i = 1; i <= size; i++) {
		    for(int j = 1; j <= size; j++) {

		        int top = i;
		        int left = j;
		        int bottom = size - i + 1;
		        int right = size - j + 1;

		        int min = Math.min(Math.min(top, bottom), Math.min(left, right));

		        int val = n - min + 1;

		        System.out.print(val + " ");
		    }
		    System.out.println();
		}
	}
}
