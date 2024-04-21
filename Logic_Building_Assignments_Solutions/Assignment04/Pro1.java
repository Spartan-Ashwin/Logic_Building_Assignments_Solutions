class Pro1{

		public static void main(String[] args){

		//Program to find average of numbers;
		int[] arr=new int[]{5,4,3,9,1,7,9};
		double sum=0;
		double size=arr.length;
		double avg=0;
		for(int i=0;i<arr.length;i++){

			sum+=arr[i];
		}

		System.out.println("Average of Array = "+(sum/size));
	}
}