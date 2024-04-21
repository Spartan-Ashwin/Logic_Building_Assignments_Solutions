import java.util.Scanner;
class Pro5{

		// Second largest elments in array

		
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		System.out.println("Enter array elements");
		int[] arr=new int[n];
		int secondMax=arr[0];
		int max=arr[0];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			if(arr[i]>max){
				secondMax=max;
				max=arr[i];
			}
			else if(arr[i]>secondMax){
				secondMax=arr[i];
			}
		}
		
		System.out.println("Second Max Element = "+secondMax);

	}
}