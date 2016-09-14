package monster.controller;

import monster.model.MarshmallowMonster;

public class MonsterController
{
	private MarshmallowMonster Gorgonzola;
	
	public MonsterController()
	{
		Gorgonzola = new MarshmallowMonster("Gorgonzola", 6.0, 4, false, 0, 4); 
	}	
	public void start()
	{
		System.out.println("Here is my monster: " + Gorgonzola);
	}
}
