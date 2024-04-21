import java.util.Scanner;
public class Calculator {
	

		public static void main(String[] args){


			Scanner sc=new Scanner(System.in);
			System.out.println("Simple Calculator");
			System.out.println("");
			System.out.println("--------------------");
			
			int num1,num2;
			System.out.println("Enter First Number:\t");
			System.out.println();
			num1=sc.nextInt();
			System.out.println("Enter Second Number:\t");
			num2=sc.nextInt();
			System.out.println();
			System.out.println("1 Addition");
			System.out.println("2 Subtraction");
			System.out.println("3 Multiplication");
			System.out.println("4 Division");
			int choice;
			System.out.println("Enter Your Choice:\t");
			choice=sc.nextInt();

		
			switch(choice){

				case 1->System.out.println("Result :"+num1+" + "+num2+" = "+(num1+num2));
				case 2->System.out.println("Result :"+num1+" - "+num2+" = "+(num1-num2));
				case 3->System.out.println("Result :"+num1+" * "+num2+" = "+(num1*num2));
				case 4->System.out.println("Result :"+num1+" / "+num2+" = "+(num1/num2));
				default->System.out.println("Invalid");
			}

		}
	}
