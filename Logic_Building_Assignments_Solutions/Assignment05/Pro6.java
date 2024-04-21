import java.util.Scanner;
class Pro6{

		// Reverse Array

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		System.out.println("Enter array elements");
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}

		int i=0;
		int j=n-1;
		while(i<j){
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		

		System.out.println("Reverse Array is");
		
		for(int ii:arr){

			System.out.print(ii+" ");
		}

	}

}