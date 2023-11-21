import java.util.*;
public class Guess_The_Number_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch = 'y';                           // initialed ch = y to play game 
		while(ch=='y'||ch=='Y')                     
		{
			GuessTheNumber(ch,sc);                   // calling GuessTheNumber function
			System.out.println("Do you want to play One more game ? y/n ");    // asking the player for one more game 
			ch = sc.next().charAt(0);
		}

	}
	public static void GuessTheNumber(char ch, Scanner sc )
	{
//		Scanner sc = new Scanner(System.in);
		int rand = (int) (Math.random() * (100-0)+0);     // generates random number from 0 to 100 inclusive 
//		System.out.println("Random number is "+rand);
		int guess_count=0;
		System.out.println("Guess the Number : ");         // asking the player enter the number
		int guess = sc.nextInt();
		int temp = (rand - guess);
		// System.out.println("Diff : "+temp);
		while(ch=='y'||ch=='Y')
		{
			
			if(guess == rand)    // if the guess is correct 
			{
				System.out.println("Your guess is correct !!!");
				System.out.println("You guessed the number in "+(guess_count+1)+" chances");   // printing no of choices taken by the player to guess the number
				break;
			}
			else             // if the guess is wrong
			{
				System.out.println("You guess is wrong !!!");
				if(temp <= -25)                                // if the guessed number is 25 more >  than random number 
				{
					System.out.println("It is too high !!!");
				}
				else if(temp >= 25 )
				{
					System.out.println("It is too low !!!");    // if the guessed number is 25 less < than random number 
				}
				else
				{
					System.out.println("You are near to it !!!");       // if the guessed number is not 25 less  !< and not 25 more !>25 
				}
				System.out.println("Do you want to continue the game or stop ? y/n"); // after wrong guess, asking the player to continue or not
				ch = sc.next().charAt(0);
				if(ch=='n' || ch=='N')
				{
					System.exit(0);
				}
			}
			System.out.println("Guess the Number : ");
			guess = sc.nextInt();
			temp = rand - guess;
			guess_count ++;
		}
//		return 0;
	}

}
