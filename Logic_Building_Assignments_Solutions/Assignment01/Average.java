import java.util.Scanner;
public class Average{

	public static void main(String[] args){

		
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int sum=num1+num2;
		float avg=(sum)/2.0f;
		System .out.println("Avg = "+avg);
	}
}