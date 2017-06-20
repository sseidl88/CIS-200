/**
 * <Proj4>
 * <Samuel Seidl / Lab Section Thursdays 4 / Atef Khan>
 *
 * <This program deals the user a random poker hand and displays what they got with that hand i.e. full house, straight, ect.>
*/ 
import java.util.*;	
import java.util.Random;

public class proj4{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		
		char answer;
		int validAnswer = 1;
		int temp = 0;
		int duplicate = 0;
		int player1Score = 0;
		int player2Score = 0;
		
				
		//deals with the random numbers	
			Random	rand = new Random();
			
			int [] value = new int [5];
			int [] suit = new int [5];
			
			int [] value2 = new int [5];
			int [] suit2 = new int [5];
		
	//deals with the hard coded numbers	
		
		// Royal Flush 
 // int[] value = {10, 12, 14, 13, 11}; 
  //int[] suit = {1,1,1,1,1};

// Straight Flush 
  //int[] value = {9, 7, 8, 6, 5}; 
  //int[] suit = {1,1,1,1,1};

// 4 of kind 
 // int[] value = {9, 7, 9, 9, 9}; 
  //int[] suit = {1,2,3,4,1};

// Full House 
 // int[] value = {9, 7, 9, 7, 9}; 
  //int[] suit = {1,2,3,4,1};

// Flush 
  //int[] value = {9, 9, 8, 6, 5}; 
  //int[] suit = {1,1,1,1,1};

// Straight 
  //int[] value = {9, 7, 8, 6, 5}; 
  //int[] suit = {1,2,4,3,1};

// 3 of kind 
  //int[] value = {9, 7, 9, 2, 9}; 
  //int[] suit = {1,2,3,4,1};

// Two Pair 
//  int[] value = {9, 7, 9, 2, 7}; 
//int[] suit = {1,2,3,4,1};

// One Pair 
  //int[] value = {9, 7, 8, 2, 7}; 
  //int[] suit = {1,2,3,4,1};

// High Card (Ace) 
  //int[] value = {9, 7, 8, 14, 11}; 
  //int[] suit = {1,2,3,4,1};
		
		
		
		System.out.println("** Welcome to the 2017 Las Vegas Poker Festival! **(Application developed by Samuel Seidl"); 

		
		
		
	do{
		
			System.out.println("Shuffling cards...");
			System.out.println("Dealing the Cards...");
			
		//	int rank[] = {2,3,4,5,6,7,8,9,10,11,12,13,14};
			int suitSet[] = {1,2,3,4};
			//clubs = 0
			//hearts = 1
			//diamonds = 2
			//spades = 3
//random needs to be commented out for hard code to work
	
			do{
					duplicate = 1;
					//gets the rank of the hand 
						for(int i = 0;i < value.length; i++){
							//get random value from array rank
							temp =rand.nextInt(13) + 2 ;
							value[i]=temp;
							Arrays.sort(value);
						}
						
						for(int i = 0;i < suit.length; i++){
							//get random value from array suit
							temp =rand.nextInt(suitSet.length-1);
							suit[i]=temp;
						
						}
						
						for (int k = 0; k < value.length; k++){
							for (int j = 0; j < value.length; j++){
								if (k != j ){
									if ((value[k] == value[j])&&(suit[k] == suit[j])){
										duplicate = 0;
									} else if ((value[0] ==0) || (value[1] ==0) || (value[2] ==0) || (value[3] ==0) || (value[4] ==0)){
										duplicate = 0;
									}
								}
							}
						}
					} while (duplicate == 0);
			
//end of area that needs to be commented out
			Arrays.sort(value);
			
			/*	System.out.println(temp);
				System.out.println("The rank of the hand is...");
				System.out.println(Arrays.toString(value));	 


				System.out.println("The suit of the hand is...");
				System.out.println(Arrays.toString(suit));	 
		

				System.out.println("Here are your five cards...");
				
			*/
				
					for (int j = 0; j < value.length; j++){
				if (value[j] == 11){
					System.out.print("\tJack of ");
				}else if (value[j] == 12){
					System.out.print("\tQueen of ");
				}else if (value[j] == 13){
					System.out.print("\tKing of ");
				}else if (value[j] == 14){
					System.out.print("\tAce of ");
				}else {
					System.out.print("\t" + value[j] + " of ");
				}
				
				if (suit[j] == 0){
					System.out.println("Clubs");
				}else if(suit[j] == 1){
					System.out.println("Hearts");
				}else if(suit[j] == 2){
					System.out.println("Diamonds");
				}else if(suit[j] == 3){
					System.out.println("Spades");
				}else{
					System.out.println("Clubs");
				}
			}
		//starting to look at what the player got 
				System.out.print("");
			if (((value[0] + 1) == value[1]) && ((value[1] + 1) == value[2]) && ((value[2] + 1) == value[3]) && ((value[3] + 1) == value[4])){
					if ((value[0] == 10) && (value[1] == 11) && (value[2] == 12) && (value[3] ==13) && (value[4] == 14)){
					System.out.println("You were dealt a Royal Flush");
					player1Score = 9;
					}else if (((suit[0] == suit[1]) && (suit[1] == suit[2]) && (suit[2] == suit[3]))){
						System.out.println("You were dealt a Straight Flush");
						player1Score= 8;
					}else {
						System.out.println("You were dealt a Straight");
						player1Score = 4;
					}
			} else if (((suit[0] == suit[1]) && (suit[1] == suit[2]) && (suit[2] == suit[3]))){
				if ((value[0] == 10) && (value[1] == 11) && (value[2] == 12) && (value[3] ==13) && (value[4] == 14)){
					System.out.println("You were dealt a Royal Flush");
					player1Score = 9;
				}else {
					System.out.println("You were dealt a Flush");
					player1Score = 5;
				}
			} else if ((((value[0] == value[1]))&&(((value[2] == value[3]))&&((value[3] == value[4]))))||(((value[3] == value[4]))&&(((value[0] == value[1]))&&((value[1] == value[2]))))){
				System.out.println("You were dealt a Full House");
				player1Score = 6;
			}else if (((value[0] == value[1]) && (value[1] == value[2]) && (value[2] == value[3])) || ((value[1] == value[2]) && (value[2] == value[3])&& ((value[3]) == value[4]))){
				System.out.println("You were dealt a Four of a kind");
				player1Score = 7;
			}else if (((value[0] == value[1]) && (value[1] == value[2])||((value[1] == value[2]) && (value[2] == value[3])||((value[2] == value[3]) && (value[3] == value[4]))))){
				System.out.println("You were dealt a Three of a kind");
				player1Score = 3;
			}else if ((((value[0] == value[1]))&&((value[2] == value[3])))||(((value[1] == value[2]))&&((value[3] == value[4])))){
				System.out.println("You were dealt a two pair");
				player1Score = 2;
			}else if (((value[0] == value[1])||((value[1] == value[2]))||((value[2] == value[3]))||((value[3] == value[4])))){
				System.out.println("You were dealt a pair");
				player1Score = 1;
			}else if ((((value[0] == value[1]))&&((value[2] == value[3])))||(((value[1] == value[2]))&&((value[3] == value[4])))){
				System.out.println("You were dealt a two pair");
				player1Score = 2;
			}else if ((((value[0] == value[1]))&&(((value[2] == value[3]))&&((value[3] == value[4]))))||(((value[3] == value[4]))&&(((value[0] == value[1]))&&((value[1] == value[2]))))){
				System.out.println("You were dealt a Full House");
				player1Score = 6;
			}else {
				if (value[4] == 14){
					System.out.println("High card is a(n) Ace");
					player1Score = 0;
				}else if (value[4] == 13){
					System.out.println("High card is a(n) King");
					player1Score = 0;
				}else if (value[4] == 12){
					System.out.println("High card is a(n) Queen");
					player1Score = 0;
				}else if (value[4] == 11){
					System.out.println("High card is a(n) Jack");
					player1Score = 0;
				}else {
					System.out.println("High card is a(n)" + value[4]);
					player1Score = 0;
				}
					
				
			}


			
			
//start of player 2 code
			System.out.println("");
			System.out.println("Player 2's cards are...");
			do{
					duplicate = 1;
					//gets the rank of the hand 
						for(int i = 0;i < value2.length; i++){
							//get random value from array rank
							temp =rand.nextInt(13) + 2 ;
							value2[i]=temp;
							Arrays.sort(value2);
						}
						
						for(int i = 0;i < suit2.length; i++){
							//get random value from array suit
							temp =rand.nextInt(suitSet.length-1);
							suit2[i]=temp;
						
						}
						
						for (int k = 0; k < value2.length; k++){
							for (int j = 0; j < value2.length; j++){
								if (k != j ){
									if ((value2[k] == value2[j])&&(suit2[k] == suit2[j])){
										duplicate = 0;
									} else if ((value2[0] ==0) || (value2[1] ==0) || (value2[2] ==0) || (value2[3] ==0) || (value2[4] ==0)){
										duplicate = 0;
									}
								}
							}
						}
					} while (duplicate == 0);
			
//end of area that needs to be commented out
			Arrays.sort(value2);
			
			/*	System.out.println(temp);
				System.out.println("The rank of the hand is...");
				System.out.println(Arrays.toString(value));	 


				System.out.println("The suit of the hand is...");
				System.out.println(Arrays.toString(suit));	 
		

				System.out.println("Here are your five cards...");
				
			*/
				
					for (int j = 0; j < value2.length; j++){
				if (value2[j] == 11){
					System.out.print("\tJack of ");
				}else if (value2[j] == 12){
					System.out.print("\tQueen of ");
				}else if (value2[j] == 13){
					System.out.print("\tKing of ");
				}else if (value2[j] == 14){
					System.out.print("\tAce of ");
				}else {
					System.out.print("\t" + value2[j] + " of ");
				}
				
				if (suit2[j] == 0){
					System.out.println("Clubs");
				}else if(suit2[j] == 1){
					System.out.println("Hearts");
				}else if(suit2[j] == 2){
					System.out.println("Diamonds");
				}else if(suit2[j] == 3){
					System.out.println("Spades");
				}else{
					System.out.println("Clubs");
				}
			}
		//starting to look at what the player got 
				System.out.print("");
			if (((value2[0] + 1) == value2[1]) && ((value2[1] + 1) == value2[2]) && ((value2[2] + 1) == value2[3]) && ((value2[3] + 1) == value[4])){
					if ((value2[0] == 10) && (value2[1] == 11) && (value2[2] == 12) && (value2[3] ==13) && (value2[4] == 14)){
					System.out.println("Player 2 was dealt a Royal Flush");
					player2Score = 9;
					}else if (((suit2[0] == suit2[1]) && (suit2[1] == suit2[2]) && (suit2[2] == suit2[3]))){
						System.out.println("Player 2 was dealt a Straight Flush");
						player2Score= 8;
					}else {
						System.out.println("Player 2 was dealt a Straight");
						player2Score = 4;
					}
			} else if (((suit2[0] == suit2[1]) && (suit2[1] == suit2[2]) && (suit2[2] == suit2[3]))){
				if ((value2[0] == 10) && (value2[1] == 11) && (value2[2] == 12) && (value2[3] ==13) && (value2[4] == 14)){
					System.out.println("Player 2 was dealt a Royal Flush");
					player2Score = 9;
				}else {
					System.out.println("Player 2 was dealt a Flush");
					player2Score = 5;
				}
			} else if ((((value2[0] == value2[1]))&&(((value2[2] == value2[3]))&&((value2[3] == value2[4]))))||(((value2[3] == value2[4]))&&(((value2[0] == value2[1]))&&((value2[1] == value2[2]))))){
				System.out.println("Player 2 was dealt a Full House");
				player1Score = 6;
			}else if (((value2[0] == value2[1]) && (value2[1] == value2[2]) && (value2[2] == value2[3])) || ((value2[1] == value2[2]) && (value2[2] == value2[3])&& ((value2[3]) == value2[4]))){
				System.out.println("Player 2 was dealt a Four of a kind");
				player2Score = 7;
			}else if (((value2[0] == value2[1]) && (value2[1] == value2[2])||((value2[1] == value2[2]) && (value2[2] == value2[3])||((value2[2] == value2[3]) && (value2[3] == value2[4]))))){
				System.out.println("Player 2 was dealt a Three of a kind");
				player2Score = 3;
			}else if ((((value2[0] == value2[1]))&&((value2[2] == value2[3])))||(((value2[1] == value2[2]))&&((value2[3] == value2[4])))){
				System.out.println("Player 2 was dealt a two pair");
				player2Score = 2;
			}else if (((value2[0] == value2[1])||((value2[1] == value2[2]))||((value2[2] == value2[3]))||((value2[3] == value2[4])))){
				System.out.println("Player 2 was dealt a pair");
				player2Score = 1;
			}else if ((((value2[0] == value2[1]))&&((value2[2] == value2[3])))||(((value2[1] == value2[2]))&&((value2[3] == value2[4])))){
				System.out.println("Player 2 was dealt a two pair");
				player2Score = 2;
			}else if ((((value2[0] == value2[1]))&&(((value2[2] == value2[3]))&&((value2[3] == value2[4]))))||(((value2[3] == value2[4]))&&(((value2[0] == value2[1]))&&((value2[1] == value2[2]))))){
				System.out.println(" Player 2 was dealt a Full House");
				player2Score = 6;
			}else {
				if (value2[4] == 14){
					System.out.println("High card is a(n) Ace");
					player2Score = 0;
				}else if (value2[4] == 13){
					System.out.println("High card is a(n) King");
					player2Score = 0;
				}else if (value2[4] == 12){
					System.out.println("High card is a(n) Queen");
					player2Score = 0;
				}else if (value2[4] == 11){
					System.out.println("High card is a(n) Jack");
					player2Score = 0;
				}else {
					System.out.println("High card is a(n) " + value2[4]);
					player2Score = 0;
				}
					
				
			}
//end of player 2 code
			
			
		//	System.out.println(player1Score);
		//	System.out.println(player2Score);
			
			
			if (player1Score > player2Score){
				System.out.println("You Win!");
			} else if (player2Score > player1Score){
				System.out.println("Player 2 wins");
			}else if ((player1Score == 0) && (player2Score ==0)){
				if (value[4] > value2[4]){
					System.out.println("You Win!");
				} else if ((value[4] < value2[4])){
				System.out.println("Player 2 wins");
				
				}else if ((value[4] == value2[4])){
					System.out.println("Tie");
				}
			
			}else if (player1Score == player2Score){
				System.out.println("Tie");
			}
		
			
			
			
			
			
			
			
			
			
		System.out.println("");

			
		do{
			System.out.println("Play Again (Y or N)?");
			answer =  (s.nextLine()).charAt(0);
			if ((answer == 'Y') || (answer == 'y')){
				validAnswer = 1;
			}else if ((answer == 'N') || (answer == 'n')){
				System.exit(0);
			}else{
					System.out.print("Please enter a 'Y' or 'N' only");
					validAnswer = 0;
			}
		}while(validAnswer == 0);

	}while((answer == 'Y') || (answer == 'y'));
	}//end of class
}//end of class