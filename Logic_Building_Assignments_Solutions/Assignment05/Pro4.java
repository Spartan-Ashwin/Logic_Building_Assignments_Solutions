import java.util.Scanner;
class Pro4{


	// Sum of Array

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		System.out.println("Enter array elements");
		int[] arr=new int[n];
		int sum=0;
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.println("Sum = "+sum);
	}
}