class Pro2{

	public static void main(String[] arsgs){

		int[] arr=new int[]{5,4,3,9,1,7,9};
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]>max){
				max=arr[i];
			}

			if(arr[i]<min){

				min=arr[i];
			}
		}

		
		System.out.println("Min = "+min);
		System.out.println("Max = "+max);
	}
}