package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster Gorgonzola;
	private Scanner keyboardInput;
	
	public MonsterController()
	{
		Gorgonzola = new MarshmallowMonster("Gorgonzola", 6.0, 4, false, 0, 4); 
		keyboardInput = new Scanner(System.in);
	}	
	                                                               
	
	public void start()
	{
		System.out.println("Here is my monster: " + Gorgonzola);
		System.out.println("My monster has " + Gorgonzola.getAntennaCount() + " antennas");
		System.out.println(Gorgonzola.getEyeCount() + " eyes");
		System.out.println("doesn't have a belly button");
		System.out.println(Gorgonzola.getArmCount() + " arms");
		System.out.println("and " + Gorgonzola.getNoseCount() + " noses");
		
		System.out.println("Do you want to change his name?");
		String answer = keyboardInput.nextLine();
			if(answer.equalsIgnoreCase("yes"))
		{
			System.out.println("Really? Alright, what should my name be?");
			String newName = keyboardInput.nextLine();
			Gorgonzola.setName(newName);
		}
			if(answer.equalsIgnoreCase("no"))
			{
				System.out.println("Thanks! I like his name.");
			}
			else
			{
				System.out.println("What?");
			}
				System.out.println(Gorgonzola);
				
		System.out.println(Gorgonzola.getName() + " has always wondered what it's like to have a belly button.. should we give him one?");
		String answerBellyButton = keyboardInput.nextLine();
			if(answerBellyButton.equalsIgnoreCase("yes"))
		{
				System.out.println("Cool! I bet he will like it.");
				Gorgonzola.setHasBellyButton (true);
		}
			if(answerBellyButton.equalsIgnoreCase("no"))
			{
				System.out.println("That's alright, he's used to not having one.");
			}
			if(Gorgonzola.getHasBellyButton() == true)
			{
				System.out.println(Gorgonzola.getName() + " now has a belly button!");
			}
			else
			{
				System.out.println(Gorgonzola.getName() + " still doesn't have a belly button.");
			}
	}
}
