import java.util.Scanner;
class Pro5{

	public static void main(String[] args){


		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	
		int[][] matrix1=new int[n][n];
		int[][] matrix2=new int[n][n];
		

		System.out.println("Enter Matrix 1");
		for(int i=0;i<n;i++){

			for(int j=0;j<n;j++){
				matrix1[i][j]=sc.nextInt();
			}
		}


		System.out.println("Enter Matrix 2");
		for(int i=0;i<n;i++){

			for(int j=0;j<n;j++){
				matrix2[i][j]=sc.nextInt();
			}
		}


		
		for(int i=0;i<n;i++){

			for(int j=0;j<n;j++){
				if(matrix1[i][j]!=matrix2[i][j]){
					System.out.println("Unequal");
					return;
				}
			}
		}

		System.out.println("Equal");
	}
}