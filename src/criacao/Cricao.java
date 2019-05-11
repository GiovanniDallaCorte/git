package criacao;

import java.util.Scanner;

public class Cricao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int[][] mat = new int[n][t];
		
		for (int i=0; i<n; i++) {
			for(int j=0;j<t;j++ ) {
			mat[i][j]  = sc.nextInt();
		}
		}
		int num = sc.nextInt();
		for (int i=0; i<mat.length; i++) {
			for(int j=0;j<mat.length;j++ ) {
				if (num == mat[i][j]) {
					System.out.printf("POSITION %d , %d\n ", i, j );
				}
			}
		         }
		int arm = 0;
		int arm1 = 0;
		for (int i=0; i<mat.length; i++) {
			for(int j=0;j<mat.length;j++ ) {
				if (num == mat[i][j]) { 
					arm = i;
					arm1 = j;
					
				}
			}
		}	
			
		if (arm1 - 1 < 0) {
			System.out.printf("NULL\n");
		}else {
			 System.out.printf("POSITION ESQ %d , %d\n ", arm, arm1 -1 );
		}
		
	if (arm1 + 1 < 0) {
		System.out.printf("NULL\n");
		}else {
			 System.out.printf("POSITION DIR %d , %d\n ", arm, arm1 + 1 );
		}
	if (arm - 1 < 0) {
		System.out.printf("NULL\n");
		}else {
			 System.out.printf("POSITION CIM %d , %d\n ", arm - 1, arm1  );
		}
	if (arm + 1 < 0) {
		System.out.printf("NULL\n");
		}else {
			 System.out.printf("POSITION BAIXO %d , %d\n ", arm + 1, arm1  );
		}         
		sc.close();
		}
                     


}


	


