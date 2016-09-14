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
		System.out.println("My monster has " + Gorgonzola.getAntennaCount() + " antennas");
		System.out.println(Gorgonzola.getEyeCount() + " eyes");
		System.out.println("doesn't have a belly button");
		System.out.println(Gorgonzola.getArmCount() + " arms");
		System.out.println("and " + Gorgonzola.getNoseCount() + " noses");
	}
}
