package April3;

import java.util.Scanner;

public class MatrixAdder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matA = new int[3][4];
		int[][] matB = new int[3][4];
		int[][] matRes = new int[3][4];
		int i,j=0,k,l=0;
//		int max = matRes[0][0];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements in matrix A:");
		for( i=0;i<=matA.length-1;i++) {
			for( j=0;j<=matA[i].length-1;j++) {
				matA[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		

		System.out.println("Enter the elements in matrix B:");
		for( k=0;k<=matB.length-1;k++) {
			for( l=0;l<=matB[k].length-1;l++) {
				matB[k][l] = sc.nextInt();
			}
			System.out.println();
		}
		
		for(int m=0;m<=matRes.length-1;m++) {
			for(int n=0;n<=matRes[m].length-1;n++) {
				matRes[m][n] = matA[m][n]+matB[m][n];
				System.out.print(matRes[m][n]+" ");
			}
			System.out.println();
		}
		
		int max = matRes[0][0];
		for(int a=0;a<=matRes.length-1;a++) {
			for(int b=0;b<=matRes[a].length-1;b++) {
				if(max < matRes[a][b]) {
					max = matRes[a][b];
				}
			}
			
		}
		System.out.println(max);
		

	}

}
