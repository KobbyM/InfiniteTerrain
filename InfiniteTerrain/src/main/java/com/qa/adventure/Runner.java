package com.qa.adventure;
import java.util.Random;
import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		
		
		Random rand = new Random();
		int locationX = 4, locationY = 4; //MAXIMUM LOCATION YOU CAN BE GENERERATED --you are able to go past this value
		int treasureX = 2, treasureY = 3;
		int swamp = 100;

		
		System.out.println("Grey foggy clouds float oppressively close to you, \r\n" + 
				"reflected in the murky grey water which reaches up your shins.\r\n" + 
				"Some black plants barely poke out of the shallow water.\r\n" + 
				"Try \"north\", \"south\", \"east\", or \"west\"\r\n" + 
				"You notice a small watch-like device in your left hand.  \r\n" + 
				"It has hands like a watch, but the hands don't seem to tell time\r\n" + 
				"");
		
		System.out.println("--------------------------- \n");

		
		//RANDOM LOCATION GENERATION
		rand.nextInt(locationX);
		rand.nextInt(locationY);
		
		Walking: //LABEL
		while (swamp == 100) {
			
			// USER INPUT
			String direction = UserInput.input(); 
			
			if ((locationX == treasureX) && (locationY == treasureY)) {
				System.out.println("You see a box sitting on the plain. It’s filled with treasure! You win! The end.");
				break;
			// NORTH MOVEMENT
			} else if (direction.contains("north")) {
				System.out.println("The dial reads " + "'" + (locationX - treasureX) + "," + (locationY - treasureY) + "'" + "m"); 
				locationY++;
				System.out.println("Current location is " + locationX + "," + locationY);
				continue Walking;
			// SOUTH MOVEMENT
			} else if (direction.contains("south")) {	
				System.out.println("The dial reads " + "'" + (locationX - treasureX) + "," + (locationY - treasureY) + "'" + "m"); 
				locationY--;
				System.out.println("Current location is " + locationX + "," + locationY);
				continue Walking;
			// EAST MOVEMENT
			} else if (direction.contains("east")) {
				System.out.println("The dial reads " + "'" + (locationX - treasureX) + "," + (locationY - treasureY) + "'" + "m"); 
				locationX++;
				System.out.println("Current location is " + locationX + "," + locationY);
				continue Walking;
			// WEST MOVEMENT
			} else if (direction.contains("west")) {
				System.out.println("The dial reads " + "'" + (locationX - treasureX) + "," + (locationY - treasureY) + "'" + "m"); 
				locationX--;
				System.out.println("Current location is " + locationX + "," + locationY);
				continue Walking;
			} else 
				System.out.println("Please enter something actually on the compass");
				System.out.println("Current location is " + locationX + "," + locationY);
				continue Walking;
		}
	}

}
