import java.util.Scanner;
class MultiplicationTable{

	
	public static void main(String[] args){

		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=10;i++){

			System.out.println(n+" X "+i+" = "+n*i);
		}
	}
}