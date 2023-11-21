import java.util.Scanner;
public class Simple_Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2;
    char ch = 'y';
		//int result = 0;
    while(ch=='y' || ch=='Y')
      {
		System.out.println("Enter the first number :");                                  // reading 1st num
		num1 = sc.nextInt();
		System.out.println("Enter the second number :");                                 // reading 2nd num
		num2 = sc.nextInt();
		System.out.println("Enter the operation to be performed (+,-,*,/,%)");           //reading the operation
		String operation; 
		operation = sc.next();
		calculate(num1,num2,operation);                                                  // calliing the calculator() function
      System.out.println("Do you want to perform another operation ? y/n ");
        ch = sc.next().charAt(0);
      }
		sc.close();
		
	}
	public static void calculate(int num1,int num2,String operation)
	{
		int result = 0;
		try {
		    
		
		if(operation.equals("+"))
		{
			result = num1 + num2 ;
			System.out.println(result);
		}
		else if(operation.equals("-"))
		{
			result = num1 - num2 ;
			System.out.println(result);
		}
		else if(operation.equals("*"))
		{
			result = num1 * num2 ;
			System.out.println(result);
		}
		else if(operation.equals("/"))
		{
			result = num1 / num2 ;
			System.out.println(result);
			
		}
		else if(operation.equals("%"))
		{
		    result = num1 % num2;
		    System.out.println(result);
		}
		else
		{
			System.out.println("Invalid Opeartion");
		}
		
		}
		catch(Exception e) {
		    System.out.println(e);                           // exception throws if any 
		    
		}
		
		
	}
	

}
