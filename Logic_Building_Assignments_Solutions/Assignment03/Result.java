import java.util.Scanner;
class Result{
	
	public static void main(String[] args){

	
		Scanner sc=new Scanner(System.in);
		int result=sc.nextInt();
		if(result>40){
			System.out.println("Passed");
		}else{
			System.out.println("Failed");
		}
	}
}