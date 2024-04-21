import java.util.Scanner;
class Pro8{

		//Array without duplicate

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		System.out.println("Enter first array elements");
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Array without duplicate");
		for(int i=0;i<n;i++){
	
			boolean isDuplicate=true;
			for(int j=i+1;j<n;j++){
				
				if(arr[i]==arr[j]){
				
					isDuplicate=false;
					break;
				}
			}
			if(isDuplicate){
				
				System.out.println(arr[i]);
			}
		}
	
	}
}