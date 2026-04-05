package April3;

public class MatAddPriyaQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matA = {{1,2,3,4},{5,6,7,8},{9,1,2,3}};
		int[][] matB = {{4,3,2,1},{8,7,6,5},{3,2,1,0}};
		int[][] matRes=new int[3][4];
		
		for(int i=0;i<=matRes.length-1;i++) {
			for(int j=0;j<=matRes[i].length-1;j++) {
				matRes[i][j]=matA[i][j]+matB[i][j];
				System.out.print(matRes[i][j]+" ");
			}
			System.out.println();
		}
		int mazEle = matRes[0][0];
		for(int i=0;i<=matRes.length-1;i++) {
			for(int j=0;j<=matRes[i].length-1;j++) {
				if(matRes[i][j]>mazEle) {
					mazEle= matRes[i][j];
				}
			}
		}
		System.out.println("Maximum lement:"+ mazEle);
	}

}
