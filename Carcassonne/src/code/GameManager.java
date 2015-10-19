
package code;

import java.util.Scanner;
import code.Deck;
public class GameManager {
	



public static void players(String[] args){
Scanner scanner= new Scanner(System.in);	
System.out.print("Enter the ammount of players");
//ask for the amount of players 
int players= scanner.nextInt();
//players input as an Int
if(players < 2){
	System.out.print("Sorry, not enough players to play");
	scanner.next();
}

if(players > 5){
	System.out.print("Sorry, too many players to play");
	scanner.next();
}
if(players > 2 && players < 5){
	System.out.print("Alright, lets Start! Now who goes first");
	scanner.next();
}
}



public static void main(String[] args){
	//enter player names
	for (int i=0; i<args.length; i++) {
		System.out.println("The player order is"+args[i]+"/");
	//print player order
	}
	
	
			
/*/			Scanner scanner= new Scanner(System.in);
System.out.print("Enter your name:");
//ask for their name
String username= scanner.next();
//name input as string
System.out.print("Enter your age:");
//ask for age (play oldest to youngest)
int age= scanner.nextInt();
//age input as int
System.out.println(String.format("%s,  your age is %d",username,age));
scanner.next();
/*/
}
}
