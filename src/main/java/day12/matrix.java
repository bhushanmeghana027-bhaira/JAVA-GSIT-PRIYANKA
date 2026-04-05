package day12;

public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] marks= {{99,98,97},{89,88,87},{79,78,77},{69,68,67}};
		for(int i=0;i<=marks.length-1;i++) {
			for(int j=0;j<=marks[i].length-1;j++) {
				System.out.print(marks[i][j]+" ");
				System.out.println();
			}
		}

	}

}
