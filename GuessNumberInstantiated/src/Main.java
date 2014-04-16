import java.util.Scanner;
public class Main {
	public static void main(String [] args){
		System.out.printf("Welcome to the guess a number game, please type in a number to set an upper bound.\n");		
		Scanner input = new Scanner(System.in);
		RandomNumber randomNumber = new RandomNumber();
		int high = input.nextInt();
		System.out.printf("Upper bound set to %d.\n", high);
		int game = randomNumber.GetANumber(high);
		System.out.printf("Guess the number between 1 and %d.\n", high);
		int user = input.nextInt();		
		if (user == game){
			System.out.printf("Congratulations, the number %d is the correct choice. You have won the game.\n", user);		
			}		
		else if (user < game){			
			System.out.printf("Sorry but the number %d is too low, the correct number is %d, please try again by restarting program", user , game);		
			}		
		else if (user > game){			
			System.out.printf("Sorry but the number %d is too high, the correct number is %d, please try again by restarting program", user , game);			
			}	
		}
	} 