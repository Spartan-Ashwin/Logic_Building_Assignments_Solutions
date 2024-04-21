import java.util.Scanner;
class Factorial{

		
	public static void main(String[] args){

	

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int fact=1;
		int count=1;
		while(count<=num){
			fact*=count;
			count++;
		}

		System.out.println("Factorial = "+fact);
	}
}