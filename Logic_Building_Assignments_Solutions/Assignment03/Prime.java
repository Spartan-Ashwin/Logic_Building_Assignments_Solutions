import java.util.Scanner;

class Prime{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		boolean isPrime=true;
		if(num==1){
			isPrime=false;
		}	

		for(int i=2;i*i<=num;i++){

			if(num%i==0){
				isPrime=false;
				break;
			}
		}

		if(isPrime){
			System.out.println("Number is prime");
		}else{
			System.out.println("Number is not prime");	
		}
	}
}