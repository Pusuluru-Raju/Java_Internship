import java.util.*;
public class ExpenseTracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ExpenseDetails ob = new ExpenseDetails();
		char ch = 'y';
		while(ch=='y'||ch=='Y')
		{
			// asking user for what to do
			
			System.out.println("What do you want to do : \n1. Add / Addmore expenses \n2. Showexpenses \n3. Show CategoryWise\n4. stop/exit");
			int x = sc.nextInt();
			switch(x)
			{
			case 1:ob.addmore();break;                                           // calling addmore() method
			case 2 : ob.show();break;                                            // callig show() method
			case 3 : ob.categoryWise();break;                                    // calling categoryWise() method 
			case 4 : System.out.println("Do you want to continue or not ? y/n"); // asking for user to exit or not 
			         ch = sc.next().charAt(0);
			         if(ch=='n'||ch=='N')
			        	 System.exit(0);
			}
			
		}

	}

}

// class consisting of addmore(),show(),categorywise() methods 
 class ExpenseDetails 
{
	 Scanner sc = new Scanner(System.in);
	 String[] category = new String[50];     // category[] to read the types of categories(groceries , bills etc..)
	 String[] desc = new String[50];         // desc[] to read the short descriptions on spent amount
	 int[] amt = new int[50];                // amt[] to read the amount spent 
	 
	 int c=0;
	 int total =0;
	 
	 
	 // addmore() method to read the category , amount , description about the expense 
	 
	 public void addmore()
	 {
		 System.out.println("Enter the category : ");                // read the category items
		 String s   = sc.next();
		 category[c] = s.toUpperCase();
		 System.out.println("Enter the amount spent : ");            // read the amount
		 amt[c] = sc.nextInt();
		 total = total + amt[c];
		 sc.nextLine();
		 System.out.println("short sentence about monry expenditure on this thing : ");   // read the description
		 desc[c++] = sc.nextLine();
	 }
	 
	 // show() method to details of the amount spent on in tabular form
	public void show()
	{
		System.out.println("Category \t"+"Amount Spent\t"+"Description\t");
		for(int i=0;i<c;i++)
		{
			System.out.println(category[i]+"\t\t"+amt[i]+"\t\t"+desc[i]);
		}
		System.out.println("Total \t\t"+total+"\t\t----");
		
	}
	
	
	//categoryWise() method to print the details of amount spent on different items by category wise 
 	public void categoryWise()
	{
		int totalamt =0;
	  	
	  	TreeSet<String> hs = new TreeSet<String>(); // treeset ,to extract the unique ele's from category[] elements  
	  	for(int i=0;i<c;i++)
	  	{
	  		hs.add(category[i]);
	  	}
//	  	for(String sh : hs)                           // to print the unique categories in hashset
//	  		System.out.println(sh);
	  	String[] arr = new String[hs.size()];
	  	hs.toArray(arr);                              // converting treeset to array , so that treeset and category arrays can be compared
	  	
//	  	for(int i=0;i<hs.size();i++)
//	  		System.out.println(arr[i]);               // printing the unique elements of treeset 
	  	
		System.out.println("Category \t"+"Amount Spent\t"+"Description\t");

	  	for(int i=0;i<hs.size();i++)                  // comparing the unique elements with category ,
	  		                                          //  to add all amount of particular category type 
	  	{
	  		totalamt =0;
	  		for(int j=0;j<c;j++)
	  		{
	  			if(arr[i].equals(category[j]))
	  			{
	  				totalamt += amt[j];
	  			}
	  		}
	  		System.out.println(arr[i]+"\t\t"+totalamt+"\t\t"+"-----");
	  	}
//	  		
	  	
	}
}
