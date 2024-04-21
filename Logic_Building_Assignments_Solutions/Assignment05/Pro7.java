import java.util.Scanner;
class Pro7{

		//Common elements between array

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		System.out.println("Enter first array elements");
		int[] arr1=new int[n];
		for(int i=0;i<n;i++){
			arr1[i]=sc.nextInt();
		}

		System.out.println("Enter second array elements");
		int[] arr2=new int[n];
		for(int i=0;i<n;i++){
			arr2[i]=sc.nextInt();
		}

		System.out.println("Common Elements are");
	
		for(int i=0;i<n;i++){

			boolean isPresent=false;
			for(int j=0;j<n;j++){

				if(arr1[i]==arr2[j]){
					
					isPresent=true;
					arr2[j]=Integer.MIN_VALUE;
				}
			}
			if(isPresent){
				System.out.println(arr1[i]);
			}
		}


	}

}