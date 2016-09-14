package monster.model;

public class MarshmallowMonster
{
	
	private String name;
	private double antennaCount;
	private int eyeCount;
	private boolean hasBellyButton;
	private int armCount;
	private int noseCount;
	
	public MarshmallowMonster()
	{
		this.name = "Terrence";
		this.antennaCount = 0;
		this.eyeCount = -53425;
		this.hasBellyButton = false;
		this.armCount = -34;
		this.noseCount = -563635;
	}
	
	public MarshmallowMonster(String name, 
							  double antennaCount, 
							  int eyeCount, 
							  boolean hasBellyButton, 
							  int armCount, 
							  int noseCount)
	{
		this.name = name;
		this.antennaCount = antennaCount;
		this.eyeCount = eyeCount;
		this.hasBellyButton = hasBellyButton;
		this.armCount = armCount;
		this.noseCount = noseCount;
	}
}
